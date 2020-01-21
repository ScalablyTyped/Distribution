package typings.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelEventArgs extends js.Object {
  /** Canceled FileList Object.
    */
  var fileStatus: js.UndefOr[js.Any] = js.undefined
  /** returns the Uploadbox model
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CancelEventArgs {
  @scala.inline
  def apply(fileStatus: js.Any = null, model: js.Any = null, `type`: String = null): CancelEventArgs = {
    val __obj = js.Dynamic.literal()
    if (fileStatus != null) __obj.updateDynamic("fileStatus")(fileStatus.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelEventArgs]
  }
}

