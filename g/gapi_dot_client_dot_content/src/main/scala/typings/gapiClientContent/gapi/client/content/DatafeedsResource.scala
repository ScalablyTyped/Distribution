package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonDatafeedId
import typings.gapiClientContent.AnonDryRun
import typings.gapiClientContent.AnonMaxResults
import typings.gapiClientContent.AnonMerchantId
import typings.gapiClientContent.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsResource extends js.Object {
  def custombatch(request: AnonDryRun): Request_[DatafeedsCustomBatchResponse]
  /** Deletes a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: AnonDatafeedId): Request_[Unit]
  /** Retrieves a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonPrettyPrint): Request_[Datafeed]
  /** Registers a datafeed configuration with your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def insert(request: AnonMerchantId): Request_[Datafeed]
  /** Lists the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonMaxResults): Request_[DatafeedsListResponse]
  /**
    * Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. This method supports
    * patch semantics.
    */
  def patch(request: AnonDatafeedId): Request_[Datafeed]
  /** Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def update(request: AnonDatafeedId): Request_[Datafeed]
}

object DatafeedsResource {
  @scala.inline
  def apply(
    custombatch: AnonDryRun => Request_[DatafeedsCustomBatchResponse],
    delete: AnonDatafeedId => Request_[Unit],
    get: AnonPrettyPrint => Request_[Datafeed],
    insert: AnonMerchantId => Request_[Datafeed],
    list: AnonMaxResults => Request_[DatafeedsListResponse],
    patch: AnonDatafeedId => Request_[Datafeed],
    update: AnonDatafeedId => Request_[Datafeed]
  ): DatafeedsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DatafeedsResource]
  }
}

