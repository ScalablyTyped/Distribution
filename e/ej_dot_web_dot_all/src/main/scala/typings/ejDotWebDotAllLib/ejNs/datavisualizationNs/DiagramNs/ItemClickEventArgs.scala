package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemClickEventArgs extends js.Object {
  /** parameter returns the object that was actually clicked
    */
  var actualObject: js.UndefOr[js.Any] = js.undefined
  /** parameter returns whether or not to cancel the drop event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the model of the diagram
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object that is selected
    */
  var selectedObject: js.UndefOr[js.Any] = js.undefined
}

