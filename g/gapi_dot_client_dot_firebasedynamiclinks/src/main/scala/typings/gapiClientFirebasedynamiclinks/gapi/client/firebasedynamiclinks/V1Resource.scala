package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientFirebasedynamiclinks.AnonAccesstoken
import typings.gapiClientFirebasedynamiclinks.AnonAccesstokenAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V1Resource extends js.Object {
  /**
    * Fetches analytics stats of a short Dynamic Link for a given
    * duration. Metrics include number of clicks, redirects, installs,
    * app first opens, and app reopens.
    */
  def getLinkStats(request: AnonAccesstokenAlt): Request_[DynamicLinkStats]
  /** Get iOS strong/weak-match info for post-install attribution. */
  def installAttribution(request: AnonAccesstoken): Request_[GetIosPostInstallAttributionResponse]
}

object V1Resource {
  @scala.inline
  def apply(
    getLinkStats: AnonAccesstokenAlt => Request_[DynamicLinkStats],
    installAttribution: AnonAccesstoken => Request_[GetIosPostInstallAttributionResponse]
  ): V1Resource = {
    val __obj = js.Dynamic.literal(getLinkStats = js.Any.fromFunction1(getLinkStats), installAttribution = js.Any.fromFunction1(installAttribution))
  
    __obj.asInstanceOf[V1Resource]
  }
}

