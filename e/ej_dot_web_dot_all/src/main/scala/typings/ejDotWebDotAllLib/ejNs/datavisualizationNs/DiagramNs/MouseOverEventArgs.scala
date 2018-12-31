package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseOverEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the dragOver event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the target node or connector
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object from where the element is dragged
    */
  var source: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object over which the element is being dragged.
    */
  var target: js.UndefOr[js.Any] = js.undefined
}

