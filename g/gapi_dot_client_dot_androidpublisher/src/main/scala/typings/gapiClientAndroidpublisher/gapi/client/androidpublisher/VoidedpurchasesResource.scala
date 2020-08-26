package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidpublisher.anon.EndTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoidedpurchasesResource extends js.Object {
  /** Lists the purchases that were cancelled, refunded or charged-back. */
  def list(request: EndTime): Request[VoidedPurchasesListResponse] = js.native
}

object VoidedpurchasesResource {
  @scala.inline
  def apply(list: EndTime => Request[VoidedPurchasesListResponse]): VoidedpurchasesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VoidedpurchasesResource]
  }
  @scala.inline
  implicit class VoidedpurchasesResourceOps[Self <: VoidedpurchasesResource] (val x: Self) extends AnyVal {
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
    def setList(value: EndTime => Request[VoidedPurchasesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

