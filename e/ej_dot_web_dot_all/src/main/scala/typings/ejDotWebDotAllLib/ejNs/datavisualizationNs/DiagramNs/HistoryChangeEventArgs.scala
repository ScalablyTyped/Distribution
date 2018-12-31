package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HistoryChangeEventArgs extends js.Object {
  /** A collection of objects that are changed in the last undo/redo
    */
  var Source: js.UndefOr[js.Array[_]] = js.undefined
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the model of the diagram
    */
  var cause: js.UndefOr[scala.Boolean] = js.undefined
  /** An array of objects, where each object represents the changes made in last undo/redo. To explore how the changes are defined, refer [Undo Redo Changes](#undo-redo-changes)
    */
  var changes: js.UndefOr[js.Array[_]] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
}

