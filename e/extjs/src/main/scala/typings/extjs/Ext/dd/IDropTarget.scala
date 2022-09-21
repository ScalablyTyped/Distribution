package typings.extjs.Ext.dd

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDropTarget
  extends StObject
     with IDDTarget {
  
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[String] = js.undefined
  
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
      /* data */ js.UndefOr[Any], 
      Boolean
    ]
  ] = js.undefined
  
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
      /* data */ js.UndefOr[Any], 
      String
    ]
  ] = js.undefined
  
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the source has been dragged out of the ta
    * @param source Ext.dd.DragSource The drag source that was dragged over this drop target
    * @param e Event The event
    * @param data Object An object containing arbitrary data supplied by the drag source
    */
  var notifyOut: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[Event], 
      /* data */ js.UndefOr[Any], 
      Unit
    ]
  ] = js.undefined
  
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
      /* data */ js.UndefOr[Any], 
      String
    ]
  ] = js.undefined
  
  /** [Config Option] (String) */
  var overClass: js.UndefOr[String] = js.undefined
}
object IDropTarget {
  
  inline def apply(): IDropTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropTarget]
  }
  
  extension [Self <: IDropTarget](x: Self) {
    
    inline def setDdGroup(value: String): Self = StObject.set(x, "ddGroup", value.asInstanceOf[js.Any])
    
    inline def setDdGroupUndefined: Self = StObject.set(x, "ddGroup", js.undefined)
    
    inline def setDropAllowed(value: String): Self = StObject.set(x, "dropAllowed", value.asInstanceOf[js.Any])
    
    inline def setDropAllowedUndefined: Self = StObject.set(x, "dropAllowed", js.undefined)
    
    inline def setDropNotAllowed(value: String): Self = StObject.set(x, "dropNotAllowed", value.asInstanceOf[js.Any])
    
    inline def setDropNotAllowedUndefined: Self = StObject.set(x, "dropNotAllowed", js.undefined)
    
    inline def setNotifyDrop(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[Any]) => Boolean
    ): Self = StObject.set(x, "notifyDrop", js.Any.fromFunction3(value))
    
    inline def setNotifyDropUndefined: Self = StObject.set(x, "notifyDrop", js.undefined)
    
    inline def setNotifyEnter(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[Any]) => String
    ): Self = StObject.set(x, "notifyEnter", js.Any.fromFunction3(value))
    
    inline def setNotifyEnterUndefined: Self = StObject.set(x, "notifyEnter", js.undefined)
    
    inline def setNotifyOut(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[Any]) => Unit
    ): Self = StObject.set(x, "notifyOut", js.Any.fromFunction3(value))
    
    inline def setNotifyOutUndefined: Self = StObject.set(x, "notifyOut", js.undefined)
    
    inline def setNotifyOver(
      value: (/* source */ js.UndefOr[IDragSource], /* e */ js.UndefOr[Event], /* data */ js.UndefOr[Any]) => String
    ): Self = StObject.set(x, "notifyOver", js.Any.fromFunction3(value))
    
    inline def setNotifyOverUndefined: Self = StObject.set(x, "notifyOver", js.undefined)
    
    inline def setOverClass(value: String): Self = StObject.set(x, "overClass", value.asInstanceOf[js.Any])
    
    inline def setOverClassUndefined: Self = StObject.set(x, "overClass", js.undefined)
  }
}
