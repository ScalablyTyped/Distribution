package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotationChangeEventArgs extends js.Object {
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the actual click event arguments that explains which button is clicked
    */
  var cause: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the node that is rotated
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new rotation angle
    */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the previous rotation angle
    */
  var oldValue: js.UndefOr[js.Any] = js.undefined
}

