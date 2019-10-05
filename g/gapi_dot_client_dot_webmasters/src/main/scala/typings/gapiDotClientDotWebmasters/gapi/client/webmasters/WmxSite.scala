package typings.gapiDotClientDotWebmasters.gapi.client.webmasters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WmxSite extends js.Object {
  /** The user's permission level for the site. */
  var permissionLevel: js.UndefOr[String] = js.undefined
  /** The URL of the site. */
  var siteUrl: js.UndefOr[String] = js.undefined
}

object WmxSite {
  @scala.inline
  def apply(permissionLevel: String = null, siteUrl: String = null): WmxSite = {
    val __obj = js.Dynamic.literal()
    if (permissionLevel != null) __obj.updateDynamic("permissionLevel")(permissionLevel)
    if (siteUrl != null) __obj.updateDynamic("siteUrl")(siteUrl)
    __obj.asInstanceOf[WmxSite]
  }
}

