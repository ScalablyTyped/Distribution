package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsResource extends js.Object {
  def custombatch(request: gapiDotClientDotContentLib.Anon_AltDryRun): gapiDotClientLib.gapiNs.clientNs.Request[DatafeedsCustomBatchResponse]
  /** Deletes a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: gapiDotClientDotContentLib.Anon_AltDatafeedId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: gapiDotClientDotContentLib.Anon_AltDatafeedIdFields): gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
  /** Registers a datafeed configuration with your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def insert(request: gapiDotClientDotContentLib.Anon_AltDryRunFields): gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
  /** Lists the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[DatafeedsListResponse]
  /**
    * Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. This method supports
    * patch semantics.
    */
  def patch(request: gapiDotClientDotContentLib.Anon_AltDatafeedId): gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
  /** Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def update(request: gapiDotClientDotContentLib.Anon_AltDatafeedId): gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
}

object DatafeedsResource {
  @scala.inline
  def apply(
    custombatch: gapiDotClientDotContentLib.Anon_AltDryRun => gapiDotClientLib.gapiNs.clientNs.Request[DatafeedsCustomBatchResponse],
    delete: gapiDotClientDotContentLib.Anon_AltDatafeedId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotContentLib.Anon_AltDatafeedIdFields => gapiDotClientLib.gapiNs.clientNs.Request[Datafeed],
    insert: gapiDotClientDotContentLib.Anon_AltDryRunFields => gapiDotClientLib.gapiNs.clientNs.Request[Datafeed],
    list: gapiDotClientDotContentLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[DatafeedsListResponse],
    patch: gapiDotClientDotContentLib.Anon_AltDatafeedId => gapiDotClientLib.gapiNs.clientNs.Request[Datafeed],
    update: gapiDotClientDotContentLib.Anon_AltDatafeedId => gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
  ): DatafeedsResource = {
    val __obj = js.Dynamic.literal(custombatch = js.Any.fromFunction1(custombatch), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[DatafeedsResource]
  }
}

