package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView
  extends extjsLib.ExtNs.viewNs.ITable

object IView {
  @scala.inline
  def apply(
    ITable: extjsLib.ExtNs.viewNs.ITable = null,
    autoScroll: js.UndefOr[scala.Boolean] = js.undefined,
    stripeRows: js.UndefOr[scala.Boolean] = js.undefined
  ): IView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITable)
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll)
    if (!js.isUndefined(stripeRows)) __obj.updateDynamic("stripeRows")(stripeRows)
    __obj.asInstanceOf[IView]
  }
}

