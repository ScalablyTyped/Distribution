package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Desktop related attributes to the Dynamic Link.
  */
@js.native
trait Schema$DesktopInfo extends js.Object {
  /**
    * Link to open on desktop.
    */
  var desktopFallbackLink: js.UndefOr[String] = js.native
}

object Schema$DesktopInfo {
  @scala.inline
  def apply(desktopFallbackLink: String = null): Schema$DesktopInfo = {
    val __obj = js.Dynamic.literal()
    if (desktopFallbackLink != null) __obj.updateDynamic("desktopFallbackLink")(desktopFallbackLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DesktopInfo]
  }
}

