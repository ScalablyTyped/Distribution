package typings
package gapiDotClientDotWebmastersLib.gapiNs.clientNs.webmastersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WmxSite extends js.Object {
  /** The user's permission level for the site. */
  var permissionLevel: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the site. */
  var siteUrl: js.UndefOr[java.lang.String] = js.undefined
}

object WmxSite {
  @scala.inline
  def apply(permissionLevel: java.lang.String = null, siteUrl: java.lang.String = null): WmxSite = {
    val __obj = js.Dynamic.literal()
    if (permissionLevel != null) __obj.updateDynamic("permissionLevel")(permissionLevel)
    if (siteUrl != null) __obj.updateDynamic("siteUrl")(siteUrl)
    __obj.asInstanceOf[WmxSite]
  }
}

