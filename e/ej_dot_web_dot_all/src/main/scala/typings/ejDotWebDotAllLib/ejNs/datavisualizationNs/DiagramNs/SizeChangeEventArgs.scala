package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeChangeEventArgs extends js.Object {
  /** parameter to cancel the size change
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns the direction of the node is resized
    */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** parameter returns node that was resized
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new width, height, offsetX and offsetY values of the element that is being resized
    */
  var newValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the difference between new and old value
    */
  var offset: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the previous width,height,offsetX and offsetY values of the element that is being resized
    */
  var oldValue: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the state of resizing(starting,resizing,completed)
    */
  var resizeState: js.UndefOr[java.lang.String] = js.undefined
}

