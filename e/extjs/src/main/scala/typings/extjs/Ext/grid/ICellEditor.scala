package typings.extjs.Ext.grid

import typings.extjs.Ext.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellEditor extends IEditor

object ICellEditor {
  @scala.inline
  def apply(IEditor: IEditor = null): ICellEditor = {
    val __obj = js.Dynamic.literal()
    if (IEditor != null) js.Dynamic.global.Object.assign(__obj, IEditor)
    __obj.asInstanceOf[ICellEditor]
  }
}

