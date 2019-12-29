package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineProperties extends js.Object {
  var dashStyle: js.UndefOr[String] = js.undefined
  var endArrow: js.UndefOr[String] = js.undefined
  var endConnection: js.UndefOr[LineConnection] = js.undefined
  var lineFill: js.UndefOr[LineFill] = js.undefined
  var link: js.UndefOr[Link] = js.undefined
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
    lineFill: LineFill = null,
    link: Link = null,
    startArrow: String = null,
    startConnection: LineConnection = null,
    weight: Dimension = null
  ): LineProperties = {
    val __obj = js.Dynamic.literal()
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (endArrow != null) __obj.updateDynamic("endArrow")(endArrow.asInstanceOf[js.Any])
    if (endConnection != null) __obj.updateDynamic("endConnection")(endConnection.asInstanceOf[js.Any])
    if (lineFill != null) __obj.updateDynamic("lineFill")(lineFill.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (startArrow != null) __obj.updateDynamic("startArrow")(startArrow.asInstanceOf[js.Any])
    if (startConnection != null) __obj.updateDynamic("startConnection")(startConnection.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProperties]
  }
}

