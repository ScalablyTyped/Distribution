package typings.extjs.Ext.grid

import typings.extjs.Ext.view.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IView extends ITable

object IView {
  @scala.inline
  def apply(ITable: ITable = null): IView = {
    val __obj = js.Dynamic.literal()
    if (ITable != null) js.Dynamic.global.Object.assign(__obj, ITable)
    __obj.asInstanceOf[IView]
  }
}

