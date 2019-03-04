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
    custombatch: js.Function1[
      gapiDotClientDotContentLib.Anon_AltDryRun, 
      gapiDotClientLib.gapiNs.clientNs.Request[DatafeedsCustomBatchResponse]
    ],
    delete: js.Function1[
      gapiDotClientDotContentLib.Anon_AltDatafeedId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotContentLib.Anon_AltDatafeedIdFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
    ],
    insert: js.Function1[
      gapiDotClientDotContentLib.Anon_AltDryRunFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
    ],
    list: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DatafeedsListResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotContentLib.Anon_AltDatafeedId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
    ],
    update: js.Function1[
      gapiDotClientDotContentLib.Anon_AltDatafeedId, 
      gapiDotClientLib.gapiNs.clientNs.Request[Datafeed]
    ]
  ): DatafeedsResource = {
    val __obj = js.Dynamic.literal(custombatch = custombatch, delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[DatafeedsResource]
  }
}

