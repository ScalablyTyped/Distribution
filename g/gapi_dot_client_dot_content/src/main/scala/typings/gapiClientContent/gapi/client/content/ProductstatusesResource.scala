package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.FieldsIncludeAttributes
import typings.gapiClientContent.anon.IncludeAttributes
import typings.gapiClientContent.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductstatusesResource extends js.Object {
  /** Gets the statuses of multiple products in a single request. This method can only be called for non-multi-client accounts. */
  def custombatch(request: IncludeAttributes): Request[ProductstatusesCustomBatchResponse] = js.native
  /** Gets the status of a product from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: FieldsIncludeAttributes): Request[ProductStatus] = js.native
  /** Lists the statuses of the products in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: PageToken): Request[ProductstatusesListResponse] = js.native
}

object ProductstatusesResource {
  @scala.inline
  def apply(
    custombatch: IncludeAttributes => Request[ProductstatusesCustomBatchResponse],
    get: FieldsIncludeAttributes => Request[ProductStatus],
    list: PageToken => Request[ProductstatusesListResponse]
  ): ProductstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ProductstatusesResource]
  }
  @scala.inline
  implicit class ProductstatusesResourceOps[Self <: ProductstatusesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustombatch(value: IncludeAttributes => Request[ProductstatusesCustomBatchResponse]): Self = this.set("custombatch", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: FieldsIncludeAttributes => Request[ProductStatus]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PageToken => Request[ProductstatusesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

