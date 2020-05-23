package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestingLevel extends js.Object {
  var bulletAlignment: js.UndefOr[String] = js.undefined
  var glyphFormat: js.UndefOr[String] = js.undefined
  var glyphSymbol: js.UndefOr[String] = js.undefined
  var glyphType: js.UndefOr[String] = js.undefined
  var indentFirstLine: js.UndefOr[Dimension] = js.undefined
  var indentStart: js.UndefOr[Dimension] = js.undefined
  var startNumber: js.UndefOr[Double] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object NestingLevel {
  @scala.inline
  def apply(
    bulletAlignment: String = null,
    glyphFormat: String = null,
    glyphSymbol: String = null,
    glyphType: String = null,
    indentFirstLine: Dimension = null,
    indentStart: Dimension = null,
    startNumber: js.UndefOr[Double] = js.undefined,
    textStyle: TextStyle = null
  ): NestingLevel = {
    val __obj = js.Dynamic.literal()
    if (bulletAlignment != null) __obj.updateDynamic("bulletAlignment")(bulletAlignment.asInstanceOf[js.Any])
    if (glyphFormat != null) __obj.updateDynamic("glyphFormat")(glyphFormat.asInstanceOf[js.Any])
    if (glyphSymbol != null) __obj.updateDynamic("glyphSymbol")(glyphSymbol.asInstanceOf[js.Any])
    if (glyphType != null) __obj.updateDynamic("glyphType")(glyphType.asInstanceOf[js.Any])
    if (indentFirstLine != null) __obj.updateDynamic("indentFirstLine")(indentFirstLine.asInstanceOf[js.Any])
    if (indentStart != null) __obj.updateDynamic("indentStart")(indentStart.asInstanceOf[js.Any])
    if (!js.isUndefined(startNumber)) __obj.updateDynamic("startNumber")(startNumber.get.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestingLevel]
  }
}

