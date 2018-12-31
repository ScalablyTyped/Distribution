package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentChangeEventArgs extends js.Object {
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the state of editing (starting, dragging, completed)
    */
  var dragState: js.UndefOr[java.lang.String] = js.undefined
  /** Parameter returns the connector that is being edited
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the current mouse position
    */
  var point: js.UndefOr[js.Any] = js.undefined
}

