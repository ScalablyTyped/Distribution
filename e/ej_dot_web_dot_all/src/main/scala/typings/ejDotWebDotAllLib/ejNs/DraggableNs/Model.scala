package typings
package ejDotWebDotAllLib.ejNs.DraggableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** If clone is specified.
               * @Default {false}
               */
  @JSName("clone")
  var clone_FModel: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the offset of the dragging helper relative to the mouse cursor.
               * @Default {{ top: -1, left: -2 }}
               */
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  /** This event is triggered when dragging element is destroyed.
               */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Distance in pixels after mousedown the mouse must move before dragging should start. This option can be used to prevent unwanted drags when clicking on an element.
               * @Default {1}
               */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /** This event is triggered when the mouse is moved during the dragging.
               */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, scala.Unit]] = js.undefined
  /** The drag area is used to restrict the dragging element bounds.Specify the id of the container within which the element should be dragged.
               * @Default {null}
               */
  var dragArea: js.UndefOr[scala.Boolean] = js.undefined
  /** Supply a callback function to handle the drag start event as an init option.
               */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, scala.Unit]] = js.undefined
  /** This event is triggered when the mouse is moved during the dragging.
               */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, scala.Unit]] = js.undefined
  /** If specified, restricts drag start click to the specified element(s).
               * @Default {null}
               */
  var handle: js.UndefOr[java.lang.String] = js.undefined
  /** This event is triggered when dragged.
               */
  var helper: js.UndefOr[js.Function1[/* e */ HelperEventArgs, scala.Unit]] = js.undefined
  /** Used to group sets of draggable and droppable items, in addition to droppable's accept option. A draggable with the same scope value as a droppable will be accepted by the
               * droppable.
               * @Default {'default'}
               */
  var scope: js.UndefOr[java.lang.String] = js.undefined
}

