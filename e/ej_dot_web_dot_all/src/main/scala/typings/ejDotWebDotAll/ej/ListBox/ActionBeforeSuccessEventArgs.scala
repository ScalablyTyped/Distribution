package typings.ejDotWebDotAll.ej.ListBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBeforeSuccessEventArgs extends js.Object {
  /** List of actual object.
    */
  var actual: js.UndefOr[js.Any] = js.undefined
  /** Set this option to true to cancel the event.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Instance of the listbox model object.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.ListBox.Model] = js.undefined
  /** Object of ListBox widget which contains DataManager arguments
    */
  var request: js.UndefOr[js.Any] = js.undefined
  /** List of array object
    */
  var result: js.UndefOr[js.Array[_]] = js.undefined
  /** Name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** ExecuteQuery object of DataManager
    */
  var xhr: js.UndefOr[js.Any] = js.undefined
}

object ActionBeforeSuccessEventArgs {
  @scala.inline
  def apply(
    actual: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.ListBox.Model = null,
    request: js.Any = null,
    result: js.Array[_] = null,
    `type`: String = null,
    xhr: js.Any = null
  ): ActionBeforeSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (actual != null) __obj.updateDynamic("actual")(actual)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (request != null) __obj.updateDynamic("request")(request)
    if (result != null) __obj.updateDynamic("result")(result)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (xhr != null) __obj.updateDynamic("xhr")(xhr)
    __obj.asInstanceOf[ActionBeforeSuccessEventArgs]
  }
}

