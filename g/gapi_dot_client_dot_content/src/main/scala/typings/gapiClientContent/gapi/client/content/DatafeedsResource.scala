package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request
import typings.gapiClientContent.anon.DatafeedId
import typings.gapiClientContent.anon.DryRun
import typings.gapiClientContent.anon.MaxResults
import typings.gapiClientContent.anon.MerchantId
import typings.gapiClientContent.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedsResource extends js.Object {
  def custombatch(request: DryRun): Request[DatafeedsCustomBatchResponse] = js.native
  /** Deletes a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: DatafeedId): Request[Unit] = js.native
  /** Retrieves a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: PrettyPrint): Request[Datafeed] = js.native
  /** Registers a datafeed configuration with your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def insert(request: MerchantId): Request[Datafeed] = js.native
  /** Lists the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: MaxResults): Request[DatafeedsListResponse] = js.native
  /**
    * Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. This method supports
    * patch semantics.
    */
  def patch(request: DatafeedId): Request[Datafeed] = js.native
  /** Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def update(request: DatafeedId): Request[Datafeed] = js.native
}

object DatafeedsResource {
  @scala.inline
  def apply(
    custombatch: DryRun => Request[DatafeedsCustomBatchResponse],
    delete: DatafeedId => Request[Unit],
    get: PrettyPrint => Request[Datafeed],
    insert: MerchantId => Request[Datafeed],
    list: MaxResults => Request[DatafeedsListResponse],
    patch: DatafeedId => Request[Datafeed],
    update: DatafeedId => Request[Datafeed]
  ): DatafeedsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[DatafeedsResource]
  }
  @scala.inline
  implicit class DatafeedsResourceOps[Self <: DatafeedsResource] (val x: Self) extends AnyVal {
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
    def setCustombatch(value: DryRun => Request[DatafeedsCustomBatchResponse]): Self = this.set("custombatch", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: DatafeedId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: PrettyPrint => Request[Datafeed]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: MerchantId => Request[Datafeed]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[DatafeedsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: DatafeedId => Request[Datafeed]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: DatafeedId => Request[Datafeed]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

