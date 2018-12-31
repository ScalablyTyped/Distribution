package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDragStopEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current dragged TreeView node
    */
  var draggedElement: js.UndefOr[js.Any] = js.undefined
  /** returns the current dragged TreeView node details
    */
  var draggedElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the original drop target
    */
  var dropTarget: js.UndefOr[js.Any] = js.undefined
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the drop position such as before, after or over
    */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** if it is true, the parent node will be prevented from auto expanding; otherwise, it work's usually
    */
  var preventTargetExpand: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the current parent element of the dragged node
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the given parent node details
    */
  var targetElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

