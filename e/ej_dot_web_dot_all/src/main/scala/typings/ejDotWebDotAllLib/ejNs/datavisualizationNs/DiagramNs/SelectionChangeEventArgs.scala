package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionChangeEventArgs extends js.Object {
  /** parameter to specify whether or not to cancel the selection change event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the actual cause of the event
    */
  var cause: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns whether the item is selected or removed selection
    */
  var changeType: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the item which is selected or to be selected
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the collection of nodes and connectors that have to be added to selection list
    */
  var newItems: js.UndefOr[js.Array[_]] = js.undefined
  /** parameter returns the collection of nodes and connectors that have to be removed from selection list
    */
  var oldItems: js.UndefOr[js.Array[_]] = js.undefined
  /** parameter returns the collection of nodes and connectors that will be selected after selection change
    */
  var selectedItems: js.UndefOr[js.Array[_]] = js.undefined
  /** triggers before and after adding the selection to the object in the diagram which can be differentiated through `state` argument. We can cancel the event only before the selection
    * of the object.
    */
  var state: js.UndefOr[java.lang.String] = js.undefined
}

