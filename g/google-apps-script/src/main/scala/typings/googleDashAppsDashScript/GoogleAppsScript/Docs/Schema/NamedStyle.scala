package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedStyle extends js.Object {
  var namedStyleType: js.UndefOr[String] = js.undefined
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.undefined
  var textStyle: js.UndefOr[TextStyle] = js.undefined
}

object NamedStyle {
  @scala.inline
  def apply(namedStyleType: String = null, paragraphStyle: ParagraphStyle = null, textStyle: TextStyle = null): NamedStyle = {
    val __obj = js.Dynamic.literal()
    if (namedStyleType != null) __obj.updateDynamic("namedStyleType")(namedStyleType)
    if (paragraphStyle != null) __obj.updateDynamic("paragraphStyle")(paragraphStyle)
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle)
    __obj.asInstanceOf[NamedStyle]
  }
}

