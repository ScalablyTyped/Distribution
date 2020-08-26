package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import typings.gapiClient.gapi.client.Request
import typings.gapiClientFirebasedynamiclinks.anon.Accesstoken
import typings.gapiClientFirebasedynamiclinks.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V1Resource extends js.Object {
  /**
    * Fetches analytics stats of a short Dynamic Link for a given
    * duration. Metrics include number of clicks, redirects, installs,
    * app first opens, and app reopens.
    */
  def getLinkStats(request: Alt): Request[DynamicLinkStats] = js.native
  /** Get iOS strong/weak-match info for post-install attribution. */
  def installAttribution(request: Accesstoken): Request[GetIosPostInstallAttributionResponse] = js.native
}

object V1Resource {
  @scala.inline
  def apply(
    getLinkStats: Alt => Request[DynamicLinkStats],
    installAttribution: Accesstoken => Request[GetIosPostInstallAttributionResponse]
  ): V1Resource = {
    val __obj = js.Dynamic.literal(getLinkStats = js.Any.fromFunction1(getLinkStats), installAttribution = js.Any.fromFunction1(installAttribution))
    __obj.asInstanceOf[V1Resource]
  }
  @scala.inline
  implicit class V1ResourceOps[Self <: V1Resource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetLinkStats(value: Alt => Request[DynamicLinkStats]): Self = this.set("getLinkStats", js.Any.fromFunction1(value))
    @scala.inline
    def setInstallAttribution(value: Accesstoken => Request[GetIosPostInstallAttributionResponse]): Self = this.set("installAttribution", js.Any.fromFunction1(value))
  }
  
}

