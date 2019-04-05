package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NestingLevel extends js.Object {
  var bulletAlignment: js.UndefOr[java.lang.String] = js.undefined
  var glyphFormat: js.UndefOr[java.lang.String] = js.undefined
  var glyphSymbol: js.UndefOr[java.lang.String] = js.undefined
  var glyphType: js.UndefOr[java.lang.String] = js.undefined
  var indentFirstLine: js.UndefOr[Dimension] = js.undefined
  var indentStart: js.UndefOr[Dimension] = js.undefined
  var startNumber: js.UndefOr[scala.Double] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object NestingLevel {
  @scala.inline
  def apply(
    bulletAlignment: java.lang.String = null,
    glyphFormat: java.lang.String = null,
    glyphSymbol: java.lang.String = null,
    glyphType: java.lang.String = null,
    indentFirstLine: Dimension = null,
    indentStart: Dimension = null,
    startNumber: scala.Int | scala.Double = null,
    textStyle: TextStyle = null
  ): NestingLevel = {
    val __obj = js.Dynamic.literal()
    if (bulletAlignment != null) __obj.updateDynamic("bulletAlignment")(bulletAlignment)
    if (glyphFormat != null) __obj.updateDynamic("glyphFormat")(glyphFormat)
    if (glyphSymbol != null) __obj.updateDynamic("glyphSymbol")(glyphSymbol)
    if (glyphType != null) __obj.updateDynamic("glyphType")(glyphType)
    if (indentFirstLine != null) __obj.updateDynamic("indentFirstLine")(indentFirstLine)
    if (indentStart != null) __obj.updateDynamic("indentStart")(indentStart)
    if (startNumber != null) __obj.updateDynamic("startNumber")(startNumber.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[NestingLevel]
  }
}

