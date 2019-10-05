package typings.ejDotWebDotAll.ej.Scroller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DestroyEventArgs extends js.Object {
  /** returns the scroller model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.Scroller.Model] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DestroyEventArgs {
  @scala.inline
  def apply(model: typings.ejDotWebDotAll.ej.Scroller.Model = null, `type`: String = null): DestroyEventArgs = {
    val __obj = js.Dynamic.literal()
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DestroyEventArgs]
  }
}

