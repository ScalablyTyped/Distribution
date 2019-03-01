package typings
package gapiDotClientDotAdexchangesellerLib.gapiNs.clientNs.adexchangesellerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** List the metadata for the metrics available to this AdExchange account. */
  def list(request: gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
}

object MetricsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdexchangesellerLib.Anon_AccountIdAltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
    ]
  ): MetricsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[MetricsResource]
  }
}

