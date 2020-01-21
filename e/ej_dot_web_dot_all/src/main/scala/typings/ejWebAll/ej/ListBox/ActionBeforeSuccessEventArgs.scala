package typings.ejWebAll.ej.ListBox

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
  var model: js.UndefOr[Model] = js.undefined
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
    model: Model = null,
    request: js.Any = null,
    result: js.Array[_] = null,
    `type`: String = null,
    xhr: js.Any = null
  ): ActionBeforeSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (actual != null) __obj.updateDynamic("actual")(actual.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBeforeSuccessEventArgs]
  }
}

