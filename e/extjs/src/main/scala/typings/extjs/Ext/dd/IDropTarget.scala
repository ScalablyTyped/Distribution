package typings.extjs.Ext.dd

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropTarget extends IDDTarget {
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[String] = js.native
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the dragged item has been dropped on it
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop target
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    * @returns Boolean False if the drop was invalid.
    */
  var notifyDrop: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[js.Any], 
      Boolean
    ]
  ] = js.native
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the source is now over the target
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop target
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    * @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
    */
  var notifyEnter: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[js.Any], 
      String
    ]
  ] = js.native
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the source has been dragged out of the ta
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop target
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    */
  var notifyOut: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] The function a Ext dd DragSource calls continuously while it is being dragged over the target
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop target
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    * @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
    */
  var notifyOver: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[js.Any], 
      String
    ]
  ] = js.native
  /** [Config Option] (String) */
  var overClass: js.UndefOr[String] = js.native
}

object IDropTarget {
  @scala.inline
  def apply(): IDropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropTarget]
  }
  @scala.inline
  implicit class IDropTargetOps[Self <: IDropTarget] (val x: Self) extends AnyVal {
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
    def setDdGroup(value: String): Self = this.set("ddGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDdGroup: Self = this.set("ddGroup", js.undefined)
    @scala.inline
    def setDropAllowed(value: String): Self = this.set("dropAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropAllowed: Self = this.set("dropAllowed", js.undefined)
    @scala.inline
    def setDropNotAllowed(value: String): Self = this.set("dropNotAllowed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropNotAllowed: Self = this.set("dropNotAllowed", js.undefined)
    @scala.inline
    def setNotifyDrop(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => Boolean
    ): Self = this.set("notifyDrop", js.Any.fromFunction3(value))
    @scala.inline
    def deleteNotifyDrop: Self = this.set("notifyDrop", js.undefined)
    @scala.inline
    def setNotifyEnter(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => String
    ): Self = this.set("notifyEnter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteNotifyEnter: Self = this.set("notifyEnter", js.undefined)
    @scala.inline
    def setNotifyOut(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("notifyOut", js.Any.fromFunction3(value))
    @scala.inline
    def deleteNotifyOut: Self = this.set("notifyOut", js.undefined)
    @scala.inline
    def setNotifyOver(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[js.Any]) => String
    ): Self = this.set("notifyOver", js.Any.fromFunction3(value))
    @scala.inline
    def deleteNotifyOver: Self = this.set("notifyOver", js.undefined)
    @scala.inline
    def setOverClass(value: String): Self = this.set("overClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverClass: Self = this.set("overClass", js.undefined)
  }
  
}

