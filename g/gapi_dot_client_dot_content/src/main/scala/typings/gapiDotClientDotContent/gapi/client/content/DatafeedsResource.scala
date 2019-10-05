package typings.gapiDotClientDotContent.gapi.client.content

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotContent.Anon_AltDatafeedId
import typings.gapiDotClientDotContent.Anon_AltDatafeedIdFields
import typings.gapiDotClientDotContent.Anon_AltDryRun
import typings.gapiDotClientDotContent.Anon_AltDryRunFields
import typings.gapiDotClientDotContent.Anon_AltFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsResource extends js.Object {
  def custombatch(request: Anon_AltDryRun): Request[DatafeedsCustomBatchResponse]
  /** Deletes a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: Anon_AltDatafeedId): Request[Unit]
  /** Retrieves a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: Anon_AltDatafeedIdFields): Request[Datafeed]
  /** Registers a datafeed configuration with your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def insert(request: Anon_AltDryRunFields): Request[Datafeed]
  /** Lists the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: Anon_AltFields): Request[DatafeedsListResponse]
  /**
    * Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. This method supports
    * patch semantics.
    */
  def patch(request: Anon_AltDatafeedId): Request[Datafeed]
  /** Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def update(request: Anon_AltDatafeedId): Request[Datafeed]
}

object DatafeedsResource {
  @scala.inline
  def apply(
    custombatch: Anon_AltDryRun => Request[DatafeedsCustomBatchResponse],
    delete: Anon_AltDatafeedId => Request[Unit],
    get: Anon_AltDatafeedIdFields => Request[Datafeed],
    insert: Anon_AltDryRunFields => Request[Datafeed],
    list: Anon_AltFields => Request[DatafeedsListResponse],
    patch: Anon_AltDatafeedId => Request[Datafeed],
    update: Anon_AltDatafeedId => Request[Datafeed]
  ): DatafeedsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DatafeedsResource]
  }
}

