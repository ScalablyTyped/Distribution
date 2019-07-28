package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProperties extends js.Object {
  var dashStyle: js.UndefOr[String] = js.undefined
  var endArrow: js.UndefOr[String] = js.undefined
  var endConnection: js.UndefOr[LineConnection] = js.undefined
  var lineFill: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.LineFill] = js.undefined
  var link: js.UndefOr[typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Link] = js.undefined
  var startArrow: js.UndefOr[String] = js.undefined
  var startConnection: js.UndefOr[LineConnection] = js.undefined
  var weight: js.UndefOr[Dimension] = js.undefined
}

object LineProperties {
  @scala.inline
  def apply(
    dashStyle: String = null,
    endArrow: String = null,
    endConnection: LineConnection = null,
    lineFill: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.LineFill = null,
    link: typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs.SchemaNs.Link = null,
    startArrow: String = null,
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

