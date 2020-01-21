package typings.gapiClientContent.gapi.client.content

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientContent.AnonAltDatafeedId
import typings.gapiClientContent.AnonAltDatafeedIdFields
import typings.gapiClientContent.AnonAltDryRun
import typings.gapiClientContent.AnonAltDryRunFields
import typings.gapiClientContent.AnonAltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsResource extends js.Object {
  def custombatch(request: AnonAltDryRun): Request_[DatafeedsCustomBatchResponse]
  /** Deletes a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: AnonAltDatafeedId): Request_[Unit]
  /** Retrieves a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: AnonAltDatafeedIdFields): Request_[Datafeed]
  /** Registers a datafeed configuration with your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def insert(request: AnonAltDryRunFields): Request_[Datafeed]
  /** Lists the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: AnonAltFields): Request_[DatafeedsListResponse]
  /**
    * Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. This method supports
    * patch semantics.
    */
  def patch(request: AnonAltDatafeedId): Request_[Datafeed]
  /** Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def update(request: AnonAltDatafeedId): Request_[Datafeed]
}

object DatafeedsResource {
  @scala.inline
  def apply(
    custombatch: AnonAltDryRun => Request_[DatafeedsCustomBatchResponse],
    delete: AnonAltDatafeedId => Request_[Unit],
    get: AnonAltDatafeedIdFields => Request_[Datafeed],
    insert: AnonAltDryRunFields => Request_[Datafeed],
    list: AnonAltFields => Request_[DatafeedsListResponse],
    patch: AnonAltDatafeedId => Request_[Datafeed],
    update: AnonAltDatafeedId => Request_[Datafeed]
  ): DatafeedsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DatafeedsResource]
  }
}

