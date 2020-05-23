package typings.ejWebAll.ej.Draggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Used to enable auto scroll while drag and drop the element.
    * @Default {'false'}
    */
  var autoScroll: js.UndefOr[Boolean] = js.undefined
  /** If clone is specified.
    * @Default {false}
    */
  @JSName("clone")
  var clone_FModel: js.UndefOr[Boolean] = js.undefined
  /** Sets the offset of the dragging helper relative to the mouse cursor.
    * @Default {{ top: -1, left: -2 }}
    */
  var cursorAt: js.UndefOr[js.Any] = js.undefined
  /** This event is triggered when dragging element is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Distance in pixels after mousedown the mouse must move before dragging should start. This option can be used to prevent unwanted drags when clicking on an element.
    * @Default {1}
    */
  var distance: js.UndefOr[Double] = js.undefined
  /** This event is triggered when the mouse is moved during the dragging.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.undefined
  /** The drag area is used to restrict the dragging element bounds.Specify the id of the container within which the element should be dragged.
    * @Default {null}
    */
  var dragArea: js.UndefOr[Boolean] = js.undefined
  /** Supply a callback function to handle the drag start event as an init option.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.undefined
  /** This event is triggered when the mouse is moved during the dragging.
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.undefined
  /** If specified, restricts drag start click to the specified element(s).
    * @Default {null}
    */
  var handle: js.UndefOr[String] = js.undefined
  /** This event is triggered when dragged.
    */
  var helper: js.UndefOr[js.Function1[/* e */ HelperEventArgs, Unit]] = js.undefined
  /** Used to group sets of draggable and droppable items, in addition to droppable's accept option. A draggable with the same scope value as a droppable will be accepted by the
    * droppable.
    * @Default {'default'}
    */
  var scope: js.UndefOr[String] = js.undefined
  /** Represents when to start the scrolling inside the scroll container on dragging
    * @Default {'20'}
    */
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  /** Specifies how much distance of scroll should move on dragging once reached scroll sensitivity area.
    * @Default {'20'}
    */
  var scrollSpeed: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    autoScroll: js.UndefOr[Boolean] = js.undefined,
    clone: js.UndefOr[Boolean] = js.undefined,
    cursorAt: js.Any = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    distance: js.UndefOr[Double] = js.undefined,
    drag: /* e */ DragEventArgs => Unit = null,
    dragArea: js.UndefOr[Boolean] = js.undefined,
    dragStart: /* e */ DragStartEventArgs => Unit = null,
    dragStop: /* e */ DragStopEventArgs => Unit = null,
    handle: String = null,
    helper: /* e */ HelperEventArgs => Unit = null,
    scope: String = null,
    scrollSensitivity: js.UndefOr[Double] = js.undefined,
    scrollSpeed: js.UndefOr[Double] = js.undefined
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoScroll)) __obj.updateDynamic("autoScroll")(autoScroll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clone)) __obj.updateDynamic("clone")(clone.get.asInstanceOf[js.Any])
    if (cursorAt != null) __obj.updateDynamic("cursorAt")(cursorAt.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (!js.isUndefined(distance)) __obj.updateDynamic("distance")(distance.get.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (!js.isUndefined(dragArea)) __obj.updateDynamic("dragArea")(dragArea.get.asInstanceOf[js.Any])
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction1(dragStop))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (helper != null) __obj.updateDynamic("helper")(js.Any.fromFunction1(helper))
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSensitivity)) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollSpeed)) __obj.updateDynamic("scrollSpeed")(scrollSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

