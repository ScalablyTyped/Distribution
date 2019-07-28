package typings.extjs.ExtNs.gridNs

import typings.extjs.ExtNs.viewNs.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends ITable

object IView {
  @scala.inline
  def apply(
    ITable: ITable = null,
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    stripeRows: js.UndefOr[Boolean] = js.undefined
  ): IView = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITable)
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll)
    if (!js.isUndefined(stripeRows)) __obj.updateDynamic("stripeRows")(stripeRows)
    __obj.asInstanceOf[IView]
  }
}

