package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroupValueMetadata extends js.Object {
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[ExtendedValue] = js.undefined
}

object PivotGroupValueMetadata {
  @scala.inline
  def apply(collapsed: js.UndefOr[Boolean] = js.undefined, value: ExtendedValue = null): PivotGroupValueMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGroupValueMetadata]
  }
}

