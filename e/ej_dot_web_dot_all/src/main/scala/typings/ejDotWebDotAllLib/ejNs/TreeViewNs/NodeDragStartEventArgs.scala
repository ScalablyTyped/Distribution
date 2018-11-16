package typings
package ejDotWebDotAllLib.ejNs.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NodeDragStartEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the original drag target
               */
  var dragTarget: js.UndefOr[js.Any] = js.undefined
  /** returns the event object
               */
  var event: js.UndefOr[js.Any] = js.undefined
  /** returns the TreeView model
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the current dragging parent TreeView node
               */
  var parentElement: js.UndefOr[js.Any] = js.undefined
  /** returns the current dragging parent TreeView node details
               */
  var parentElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the current parent element of the dragging node
               */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the given parent node details
               */
  var targetElementData: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

