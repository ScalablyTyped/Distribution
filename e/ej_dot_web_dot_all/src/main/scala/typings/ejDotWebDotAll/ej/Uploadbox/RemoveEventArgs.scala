package typings.ejDotWebDotAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveEventArgs extends js.Object {
  /** returns the file details of the file object
    */
  var fileStatus: js.UndefOr[js.Any] = js.undefined
  /** returns the Uploadbox model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object RemoveEventArgs {
  @scala.inline
  def apply(fileStatus: js.Any = null, model: js.Any = null, `type`: String = null): RemoveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (fileStatus != null) __obj.updateDynamic("fileStatus")(fileStatus)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RemoveEventArgs]
  }
}

