package typings.gapiDotClientDotFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotFirebasedynamiclinks.Anon_Accesstoken
import typings.gapiDotClientDotFirebasedynamiclinks.Anon_AccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V1Resource extends js.Object {
  /**
    * Fetches analytics stats of a short Dynamic Link for a given
    * duration. Metrics include number of clicks, redirects, installs,
    * app first opens, and app reopens.
    */
  def getLinkStats(request: Anon_AccesstokenAlt): Request[DynamicLinkStats]
  /** Get iOS strong/weak-match info for post-install attribution. */
  def installAttribution(request: Anon_Accesstoken): Request[GetIosPostInstallAttributionResponse]
}

object V1Resource {
  @scala.inline
  def apply(
    getLinkStats: Anon_AccesstokenAlt => Request[DynamicLinkStats],
    installAttribution: Anon_Accesstoken => Request[GetIosPostInstallAttributionResponse]
  ): V1Resource = {
    val __obj = js.Dynamic.literal(getLinkStats = js.Any.fromFunction1(getLinkStats), installAttribution = js.Any.fromFunction1(installAttribution))
  
    __obj.asInstanceOf[V1Resource]
  }
}

