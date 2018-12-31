package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedsResource extends js.Object {
  def custombatch(request: gapiDotClientDotContentLib.Anon_PrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[DatafeedsCustomBatchResponse]
  /** Deletes a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def delete(request: gapiDotClientDotContentLib.Anon_DatafeedId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Retrieves a datafeed configuration from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: gapiDotClientDotContentLib.Anon_DatafeedIdPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
  /** Registers a datafeed configuration with your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def insert(request: gapiDotClientDotContentLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
  /** Lists the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[DatafeedsListResponse]
  /**
    * Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. This method supports
    * patch semantics.
    */
  def patch(request: gapiDotClientDotContentLib.Anon_DatafeedId): gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
  /** Updates a datafeed configuration of your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def update(request: gapiDotClientDotContentLib.Anon_DatafeedId): gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
}

