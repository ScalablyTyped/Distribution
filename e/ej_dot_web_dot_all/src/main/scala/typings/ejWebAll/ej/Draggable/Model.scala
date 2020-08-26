package typings.ejWebAll.ej.Draggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Used to enable auto scroll while drag and drop the element.
    * @Default {'false'}
    */
  var autoScroll: js.UndefOr[Boolean] = js.native
  /** If clone is specified.
    * @Default {false}
    */
  @JSName("clone")
  var clone_FModel: js.UndefOr[Boolean] = js.native
  /** Sets the offset of the dragging helper relative to the mouse cursor.
    * @Default {{ top: -1, left: -2 }}
    */
  var cursorAt: js.UndefOr[js.Any] = js.native
  /** This event is triggered when dragging element is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Distance in pixels after mousedown the mouse must move before dragging should start. This option can be used to prevent unwanted drags when clicking on an element.
    * @Default {1}
    */
  var distance: js.UndefOr[Double] = js.native
  /** This event is triggered when the mouse is moved during the dragging.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
  /** The drag area is used to restrict the dragging element bounds.Specify the id of the container within which the element should be dragged.
    * @Default {null}
    */
  var dragArea: js.UndefOr[Boolean] = js.native
  /** Supply a callback function to handle the drag start event as an init option.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.native
  /** This event is triggered when the mouse is moved during the dragging.
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.native
  /** If specified, restricts drag start click to the specified element(s).
    * @Default {null}
    */
  var handle: js.UndefOr[String] = js.native
  /** This event is triggered when dragged.
    */
  var helper: js.UndefOr[js.Function1[/* e */ HelperEventArgs, Unit]] = js.native
  /** Used to group sets of draggable and droppable items, in addition to droppable's accept option. A draggable with the same scope value as a droppable will be accepted by the
    * droppable.
    * @Default {'default'}
    */
  var scope: js.UndefOr[String] = js.native
  /** Represents when to start the scrolling inside the scroll container on dragging
    * @Default {'20'}
    */
  var scrollSensitivity: js.UndefOr[Double] = js.native
  /** Specifies how much distance of scroll should move on dragging once reached scroll sensitivity area.
    * @Default {'20'}
    */
  var scrollSpeed: js.UndefOr[Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoScroll(value: Boolean): Self = this.set("autoScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScroll: Self = this.set("autoScroll", js.undefined)
    @scala.inline
    def setClone(value: Boolean): Self = this.set("clone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClone: Self = this.set("clone", js.undefined)
    @scala.inline
    def setCursorAt(value: js.Any): Self = this.set("cursorAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorAt: Self = this.set("cursorAt", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
    @scala.inline
    def setDrag(value: /* e */ DragEventArgs => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    @scala.inline
    def setDragArea(value: Boolean): Self = this.set("dragArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragArea: Self = this.set("dragArea", js.undefined)
    @scala.inline
    def setDragStart(value: /* e */ DragStartEventArgs => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    @scala.inline
    def setDragStop(value: /* e */ DragStopEventArgs => Unit): Self = this.set("dragStop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDragStop: Self = this.set("dragStop", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setHelper(value: /* e */ HelperEventArgs => Unit): Self = this.set("helper", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHelper: Self = this.set("helper", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setScrollSensitivity(value: Double): Self = this.set("scrollSensitivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSensitivity: Self = this.set("scrollSensitivity", js.undefined)
    @scala.inline
    def setScrollSpeed(value: Double): Self = this.set("scrollSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSpeed: Self = this.set("scrollSpeed", js.undefined)
  }
  
}

