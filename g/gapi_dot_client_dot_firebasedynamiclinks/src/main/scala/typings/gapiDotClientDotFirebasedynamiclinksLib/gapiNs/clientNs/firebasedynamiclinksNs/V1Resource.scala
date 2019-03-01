package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V1Resource extends js.Object {
  /**
    * Fetches analytics stats of a short Dynamic Link for a given
    * duration. Metrics include number of clicks, redirects, installs,
    * app first opens, and app reopens.
    */
  def getLinkStats(request: gapiDotClientDotFirebasedynamiclinksLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[DynamicLinkStats]
  /** Get iOS strong/weak-match info for post-install attribution. */
  def installAttribution(request: gapiDotClientDotFirebasedynamiclinksLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[GetIosPostInstallAttributionResponse]
}

object V1Resource {
  @scala.inline
  def apply(
    getLinkStats: js.Function1[
      gapiDotClientDotFirebasedynamiclinksLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[DynamicLinkStats]
    ],
    installAttribution: js.Function1[
      gapiDotClientDotFirebasedynamiclinksLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[GetIosPostInstallAttributionResponse]
    ]
  ): V1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLinkStats")(getLinkStats)
    __obj.updateDynamic("installAttribution")(installAttribution)
    __obj.asInstanceOf[V1Resource]
  }
}

