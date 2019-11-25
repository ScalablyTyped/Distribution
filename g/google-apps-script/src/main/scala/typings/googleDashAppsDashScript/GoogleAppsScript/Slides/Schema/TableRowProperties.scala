package typings.googleDashAppsDashScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableRowProperties extends js.Object {
  var minRowHeight: js.UndefOr[Dimension] = js.undefined
}

object TableRowProperties {
  @scala.inline
  def apply(minRowHeight: Dimension = null): TableRowProperties = {
    val __obj = js.Dynamic.literal()
    if (minRowHeight != null) __obj.updateDynamic("minRowHeight")(minRowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRowProperties]
  }
}

