package typings.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEventArgs extends js.Object {
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** Returns the diagram model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object CreateEventArgs {
  @scala.inline
  def apply(diagramId: String = null, model: js.Any = null, `type`: String = null): CreateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId)
    if (model != null) __obj.updateDynamic("model")(model)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateEventArgs]
  }
}

