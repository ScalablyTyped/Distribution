package typings.ejDotWebDotAll.ejNs.DropDownTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlurEventArgs extends js.Object {
  /** If the event has to be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** DropDownTreeView model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Event name
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BlurEventArgs {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, model: js.Any = null, `type`: String = null): BlurEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BlurEventArgs]
  }
}

