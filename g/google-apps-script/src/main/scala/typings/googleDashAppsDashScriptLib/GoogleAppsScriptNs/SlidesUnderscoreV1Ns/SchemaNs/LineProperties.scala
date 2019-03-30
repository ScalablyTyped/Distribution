package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProperties extends js.Object {
  var dashStyle: js.UndefOr[java.lang.String] = js.undefined
  var endArrow: js.UndefOr[java.lang.String] = js.undefined
  var endConnection: js.UndefOr[LineConnection] = js.undefined
  var lineFill: js.UndefOr[LineFill] = js.undefined
  var link: js.UndefOr[Link] = js.undefined
  var startArrow: js.UndefOr[java.lang.String] = js.undefined
  var startConnection: js.UndefOr[LineConnection] = js.undefined
  var weight: js.UndefOr[Dimension] = js.undefined
}

object LineProperties {
  @scala.inline
  def apply(
    dashStyle: java.lang.String = null,
    endArrow: java.lang.String = null,
    endConnection: LineConnection = null,
    lineFill: LineFill = null,
    link: Link = null,
    startArrow: java.lang.String = null,
    startConnection: LineConnection = null,
    weight: Dimension = null
  ): LineProperties = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle)
    if (endArrow != null) __obj.updateDynamic("endArrow")(endArrow)
    if (endConnection != null) __obj.updateDynamic("endConnection")(endConnection)
    if (lineFill != null) __obj.updateDynamic("lineFill")(lineFill)
    if (link != null) __obj.updateDynamic("link")(link)
    if (startArrow != null) __obj.updateDynamic("startArrow")(startArrow)
    if (startConnection != null) __obj.updateDynamic("startConnection")(startConnection)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[LineProperties]
  }
}

