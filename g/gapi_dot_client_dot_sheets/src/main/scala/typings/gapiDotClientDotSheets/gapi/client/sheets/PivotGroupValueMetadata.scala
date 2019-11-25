package typings.gapiDotClientDotSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGroupValueMetadata extends js.Object {
  /** True if the data corresponding to the value is collapsed. */
  var collapsed: js.UndefOr[Boolean] = js.undefined
  /**
    * The calculated value the metadata corresponds to.
    * (Note that formulaValue is not valid,
    * because the values will be calculated.)
    */
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

