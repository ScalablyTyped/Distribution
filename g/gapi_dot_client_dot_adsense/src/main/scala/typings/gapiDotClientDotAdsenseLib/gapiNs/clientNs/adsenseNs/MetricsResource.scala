package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsResource extends js.Object {
  /** List the metadata for the metrics available to this AdSense account. */
  def list(request: gapiDotClientDotAdsenseLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
}

object MetricsResource {
  @scala.inline
  def apply(
    list: js.Function1[
      gapiDotClientDotAdsenseLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Metadata]
    ]
  ): MetricsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.asInstanceOf[MetricsResource]
  }
}

