package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryChangeEventArgs extends js.Object {
  /** A collection of objects that are changed in the last undo/redo
    */
  var Source: js.UndefOr[js.Array[_]] = js.undefined
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the model of the diagram
    */
  var cause: js.UndefOr[Boolean] = js.undefined
  /** An array of objects, where each object represents the changes made in last undo/redo. To explore how the changes are defined, refer [Undo Redo Changes](#undo-redo-changes)
    */
  var changes: js.UndefOr[js.Array[_]] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
}

object HistoryChangeEventArgs {
  @scala.inline
  def apply(
    Source: js.Array[_] = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    cause: js.UndefOr[Boolean] = js.undefined,
    changes: js.Array[_] = null,
    diagramId: String = null
  ): HistoryChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cause)) __obj.updateDynamic("cause")(cause.get.asInstanceOf[js.Any])
    if (changes != null) __obj.updateDynamic("changes")(changes.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryChangeEventArgs]
  }
}

