package typings.ejDotWebDotAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeBatchSaveEventArgs extends js.Object {
  /** Returns the changed record object.
    */
  var batchChanges: js.UndefOr[js.Any] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeBatchSaveEventArgs {
  @scala.inline
  def apply(batchChanges: js.Any = null, model: js.Any = null, `type`: String = null): BeforeBatchSaveEventArgs = {
    val __obj = js.Dynamic.literal()
    if (batchChanges != null) __obj.updateDynamic("batchChanges")(batchChanges.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeBatchSaveEventArgs]
  }
}

