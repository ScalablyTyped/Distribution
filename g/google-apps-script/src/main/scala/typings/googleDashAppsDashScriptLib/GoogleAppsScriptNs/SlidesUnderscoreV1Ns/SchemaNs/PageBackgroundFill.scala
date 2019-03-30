package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageBackgroundFill extends js.Object {
  var propertyState: js.UndefOr[java.lang.String] = js.undefined
  var solidFill: js.UndefOr[SolidFill] = js.undefined
  var stretchedPictureFill: js.UndefOr[StretchedPictureFill] = js.undefined
}

object PageBackgroundFill {
  @scala.inline
  def apply(
    propertyState: java.lang.String = null,
    solidFill: SolidFill = null,
    stretchedPictureFill: StretchedPictureFill = null
  ): PageBackgroundFill = {
    val __obj = js.Dynamic.literal()
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState)
    if (solidFill != null) __obj.updateDynamic("solidFill")(solidFill)
    if (stretchedPictureFill != null) __obj.updateDynamic("stretchedPictureFill")(stretchedPictureFill)
    __obj.asInstanceOf[PageBackgroundFill]
  }
}

