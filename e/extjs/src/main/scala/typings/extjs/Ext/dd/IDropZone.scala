package typings.extjs.Ext.dd

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropZone extends IDropTarget {
  /** [Method] Returns a custom data object associated with the DOM node that is the target of the event
    * @param e Event The event
    * @returns Object data The custom data
    */
  var getTargetFromEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], _]] = js.native
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dropped on it but not on any of its registered
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    * @returns Boolean True if the drop was valid, else false
    */
  var onContainerDrop: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[js.Any], 
      Boolean
    ]
  ] = js.native
  /** [Method] Called while the DropZone determines that a Ext dd DragSource is being dragged over it but not over any of its regis
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    * @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
    */
  var onContainerOver: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[js.Any], 
      String
    ]
  ] = js.native
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dropped onto the drop node
    * @param nodeData Object The custom data associated with the drop node (this is the same value returned from getTargetFromEvent for this node)
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    * @returns Boolean True if the drop was valid, else false
    */
  var onNodeDrop: js.UndefOr[
    js.Function4[
      /* nodeData */ js.UndefOr[js.Any], 
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[js.Any], 
      Boolean
    ]
  ] = js.native
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has entered a drop node that has either been registered
    * @param nodeData Object The custom data associated with the drop node (this is the same value returned from getTargetFromEvent for this node)
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    */
  var onNodeEnter: js.UndefOr[
    js.Function4[
      /* nodeData */ js.UndefOr[js.Any], 
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dragged out of the drop node without dropping
    * @param nodeData Object The custom data associated with the drop node (this is the same value returned from getTargetFromEvent for this node)
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    */
  var onNodeOut: js.UndefOr[
    js.Function4[
      /* nodeData */ js.UndefOr[js.Any], 
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] Called while the DropZone determines that a Ext dd DragSource is over a drop node that has either been registered or
    * @param nodeData Object The custom data associated with the drop node (this is the same value returned from getTargetFromEvent for this node)
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    * @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
    */
  var onNodeOver: js.UndefOr[
    js.Function4[
      /* nodeData */ js.UndefOr[js.Any], 
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[js.Any], 
      String
    ]
  ] = js.native
}

object IDropZone {
  @scala.inline
  def apply(): IDropZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropZone]
  }
  @scala.inline
  implicit class IDropZoneOps[Self <: IDropZone] (val x: Self) extends AnyVal {
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
    def setGetTargetFromEvent(value: /* e */ js.UndefOr[Event] => _): Self = this.set("getTargetFromEvent", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetTargetFromEvent: Self = this.set("getTargetFromEvent", js.undefined)
    @scala.inline
    def setOnContainerDrop(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => Boolean
    ): Self = this.set("onContainerDrop", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnContainerDrop: Self = this.set("onContainerDrop", js.undefined)
    @scala.inline
    def setOnContainerOver(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => String
    ): Self = this.set("onContainerOver", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnContainerOver: Self = this.set("onContainerOver", js.undefined)
    @scala.inline
    def setOnNodeDrop(
      value: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => Boolean
    ): Self = this.set("onNodeDrop", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnNodeDrop: Self = this.set("onNodeDrop", js.undefined)
    @scala.inline
    def setOnNodeEnter(
      value: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onNodeEnter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnNodeEnter: Self = this.set("onNodeEnter", js.undefined)
    @scala.inline
    def setOnNodeOut(
      value: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("onNodeOut", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnNodeOut: Self = this.set("onNodeOut", js.undefined)
    @scala.inline
    def setOnNodeOver(
      value: (/* nodeData */ js.UndefOr[js.Any], /* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => String
    ): Self = this.set("onNodeOver", js.Any.fromFunction4(value))
    @scala.inline
    def deleteOnNodeOver: Self = this.set("onNodeOver", js.undefined)
  }
  
}

