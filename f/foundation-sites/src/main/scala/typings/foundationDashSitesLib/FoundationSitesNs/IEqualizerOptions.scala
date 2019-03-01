package typings
package foundationDashSitesLib.FoundationSitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEqualizerOptions extends js.Object {
  var equalizeByRow: js.UndefOr[scala.Boolean] = js.undefined
  var equalizeOn: js.UndefOr[java.lang.String] = js.undefined
  var equalizeOnStack: js.UndefOr[scala.Boolean] = js.undefined
}

object IEqualizerOptions {
  @scala.inline
  def apply(
    equalizeByRow: js.UndefOr[scala.Boolean] = js.undefined,
    equalizeOn: java.lang.String = null,
    equalizeOnStack: js.UndefOr[scala.Boolean] = js.undefined
  ): IEqualizerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(equalizeByRow)) __obj.updateDynamic("equalizeByRow")(equalizeByRow)
    if (equalizeOn != null) __obj.updateDynamic("equalizeOn")(equalizeOn)
    if (!js.isUndefined(equalizeOnStack)) __obj.updateDynamic("equalizeOnStack")(equalizeOnStack)
    __obj.asInstanceOf[IEqualizerOptions]
  }
}

