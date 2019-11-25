package typings.foundationDashSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEqualizerOptions extends js.Object {
  var equalizeByRow: js.UndefOr[Boolean] = js.undefined
  var equalizeOn: js.UndefOr[String] = js.undefined
  var equalizeOnStack: js.UndefOr[Boolean] = js.undefined
}

object IEqualizerOptions {
  @scala.inline
  def apply(
    equalizeByRow: js.UndefOr[Boolean] = js.undefined,
    equalizeOn: String = null,
    equalizeOnStack: js.UndefOr[Boolean] = js.undefined
  ): IEqualizerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(equalizeByRow)) __obj.updateDynamic("equalizeByRow")(equalizeByRow.asInstanceOf[js.Any])
    if (equalizeOn != null) __obj.updateDynamic("equalizeOn")(equalizeOn.asInstanceOf[js.Any])
    if (!js.isUndefined(equalizeOnStack)) __obj.updateDynamic("equalizeOnStack")(equalizeOnStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEqualizerOptions]
  }
}

