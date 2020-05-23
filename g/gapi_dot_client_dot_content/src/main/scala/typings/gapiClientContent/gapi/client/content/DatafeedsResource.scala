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

trait DatafeedsResource extends js.Object {
  def custombatch(request: DryRun): Request[DatafeedsCustomBatchResponse]
  /** Deletes a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: DatafeedId): Request[Unit]
  /** Retrieves a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: PrettyPrint): Request[Datafeed]
  /** Registers a datafeed configuration with your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def insert(request: MerchantId): Request[Datafeed]
  /** Lists the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: MaxResults): Request[DatafeedsListResponse]
  /**
    * Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. This method supports
    * patch semantics.
    */
  def patch(request: DatafeedId): Request[Datafeed]
  /** Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def update(request: DatafeedId): Request[Datafeed]
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
}

