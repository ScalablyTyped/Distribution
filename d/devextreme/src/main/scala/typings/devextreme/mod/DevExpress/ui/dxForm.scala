package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxForm extends Widget {
  /** Gets a button's instance. */
  def getButton(name: String): js.UndefOr[dxButton] = js.native
  /** Gets an editor instance. Takes effect only if the form item is visible. */
  def getEditor(dataField: String): js.UndefOr[Editor] = js.native
  /** Gets a form item's configuration. */
  def itemOption(id: String): js.Any = js.native
  /** Updates the value of a single item option. */
  def itemOption(id: String, option: String, value: js.Any): Unit = js.native
  /** Updates the values of several item options. */
  def itemOption(id: String, options: js.Any): Unit = js.native
  /** Resets the editor's value to undefined. */
  def resetValues(): Unit = js.native
  /** Updates a formData field and the corresponding editor. */
  def updateData(dataField: String, value: js.Any): Unit = js.native
  /** Merges the passed `data` object with formData. Matching properties in formData are overwritten and new properties added. */
  def updateData(data: js.Any): Unit = js.native
  /** Updates the dimensions of the widget contents. */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /** Validates the values of all editors on the form against the list of the validation rules specified for each form item. */
  def validate(): dxValidationGroupResult = js.native
}

