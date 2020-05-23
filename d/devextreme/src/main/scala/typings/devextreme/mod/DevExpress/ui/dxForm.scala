package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxForm extends Widget {
  /** @name dxForm.getButton(name) */
  def getButton(name: String): js.UndefOr[dxButton] = js.native
  /** @name dxForm.getEditor(dataField) */
  def getEditor(dataField: String): js.UndefOr[Editor] = js.native
  /** @name dxForm.itemOption(id) */
  def itemOption(id: String): js.Any = js.native
  /** @name dxForm.itemOption(id, option, value) */
  def itemOption(id: String, option: String, value: js.Any): Unit = js.native
  /** @name dxForm.itemOption(id, options) */
  def itemOption(id: String, options: js.Any): Unit = js.native
  /** @name dxForm.resetValues() */
  def resetValues(): Unit = js.native
  /** @name dxForm.updateData(dataField, value) */
  def updateData(dataField: String, value: js.Any): Unit = js.native
  /** @name dxForm.updateData(data) */
  def updateData(data: js.Any): Unit = js.native
  /** @name dxForm.updateDimensions() */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** @name dxForm.validate() */
  def validate(): dxValidationGroupResult = js.native
}

