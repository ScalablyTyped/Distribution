package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionalColor extends js.Object {
  var opaqueColor: js.UndefOr[OpaqueColor] = js.undefined
}

object OptionalColor {
  @scala.inline
  def apply(opaqueColor: OpaqueColor = null): OptionalColor = {
    val __obj = js.Dynamic.literal()
    if (opaqueColor != null) __obj.updateDynamic("opaqueColor")(opaqueColor)
    __obj.asInstanceOf[OptionalColor]
  }
}

