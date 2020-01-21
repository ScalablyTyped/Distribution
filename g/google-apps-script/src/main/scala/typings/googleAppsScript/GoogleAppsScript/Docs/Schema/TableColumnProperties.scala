package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumnProperties extends js.Object {
  var width: js.UndefOr[Dimension] = js.undefined
  var widthType: js.UndefOr[String] = js.undefined
}

object TableColumnProperties {
  @scala.inline
  def apply(width: Dimension = null, widthType: String = null): TableColumnProperties = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (widthType != null) __obj.updateDynamic("widthType")(widthType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnProperties]
  }
}

