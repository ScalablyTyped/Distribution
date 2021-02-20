package typings.extjs.Ext.dd

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDragSource extends IDDProxy {
  
  /** [Method] An empty function by default but provided so that you can perform a custom action after a valid drag drop has occurr
    * @param target Ext.dd.DragDrop The drop target
    * @param e Event The event object
    * @param id String The id of the dropped element
    */
  var afterDragDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action when the dragged item enters the d
    * @param target Ext.dd.DragDrop The drop target
    * @param e Event The event object
    * @param id String The id of the dragged element
    */
  var afterDragEnter: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action after the dragged item is dragged
    * @param target Ext.dd.DragDrop The drop target
    * @param e Event The event object
    * @param id String The id of the dragged element
    */
  var afterDragOut: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action while the dragged item is over the
    * @param target Ext.dd.DragDrop The drop target
    * @param e Event The event object
    * @param id String The id of the dragged element
    */
  var afterDragOver: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action after an invalid drop has occurred
    * @param e Event The event object
    * @param id String The id of the dropped element
    */
  var afterInvalidDrop: js.UndefOr[js.Function2[/* e */ js.UndefOr[Event], /* id */ js.UndefOr[String], Unit]] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action after a valid drop has occurred by
    * @param target Object The target DD
    * @param e Event The event object
    * @param id String The id of the dropped element
    */
  var afterValidDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[Event], 
      /* id */ js.UndefOr[String], 
      Unit
    ]
  ] = js.native
  
  /** [Method] Sets the element to the location of the mousedown or click event maintaining the cursor location relative to the loc  */
  @JSName("alignElWithMouse")
  var alignElWithMouse_IDragSource: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Config Option] (Boolean) */
  var animRepair: js.UndefOr[Boolean] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action before the dragged item is dropped
    * @param target Ext.dd.DragDrop The drop target
    * @param e Event The event object
    * @param id String The id of the dragged element
    * @returns Boolean isValid True if the drag drop event is valid, else false to cancel
    */
  var beforeDragDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event], 
      /* id */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action before the dragged item enters the
    * @param target Ext.dd.DragDrop The drop target
    * @param e Event The event object
    * @param id String The id of the dragged element
    * @returns Boolean isValid True if the drag event is valid, else false to cancel
    */
  var beforeDragEnter: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event], 
      /* id */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action before the dragged item is dragged
    * @param target Ext.dd.DragDrop The drop target
    * @param e Event The event object
    * @param id String The id of the dragged element
    * @returns Boolean isValid True if the drag event is valid, else false to cancel
    */
  var beforeDragOut: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event], 
      /* id */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action while the dragged item is over the
    * @param target Ext.dd.DragDrop The drop target
    * @param e Event The event object
    * @param id String The id of the dragged element
    * @returns Boolean isValid True if the drag event is valid, else false to cancel
    */
  var beforeDragOver: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event], 
      /* id */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action after an invalid drop has occurred
    * @param target Ext.dd.DragDrop The drop target
    * @param e Event The event object
    * @param id String The id of the dragged element
    * @returns Boolean isValid True if the invalid drop should proceed, else false to cancel
    */
  var beforeInvalidDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[Event], 
      /* id */ js.UndefOr[String], 
      Boolean
    ]
  ] = js.native
  
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[String] = js.native
  
  /** [Property] (Object) */
  var dragData: js.UndefOr[js.Any] = js.native
  
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[String] = js.native
  
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[String] = js.native
  
  /** [Method] Returns the data object associated with this drag source
    * @param e Object
    * @returns Object data An object containing arbitrary data
    */
  var getDragData: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], _]] = js.native
  
  /** [Method] Returns the drag source s underlying Ext dd StatusProxy
    * @returns Ext.dd.StatusProxy proxy The StatusProxy
    */
  var getProxy: js.UndefOr[js.Function0[IStatusProxy]] = js.native
  
  /** [Method] Hides the drag source s Ext dd StatusProxy */
  var hideProxy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action before the initial drag event begi
    * @param data Object An object containing arbitrary data to be shared with drop targets
    * @param e Event The event object
    * @returns Boolean isValid True if the drag event is valid, else false to cancel
    */
  var onBeforeDrag: js.UndefOr[js.Function2[/* data */ js.UndefOr[js.Any], /* e */ js.UndefOr[Event], Boolean]] = js.native
  
  /** [Method] An empty function by default but provided so that you can perform a custom action once the initial drag event has be
    * @param x Number The x position of the click on the dragged object
    * @param y Number The y position of the click on the dragged object
    */
  var onStartDrag: js.UndefOr[js.Function2[/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double], Unit]] = js.native
  
  /** [Config Option] (String) */
  var repairHighlightColor: js.UndefOr[String] = js.native
}
object IDragSource {
  
  @scala.inline
  def apply(): IDragSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragSource]
  }
  
  @scala.inline
  implicit class IDragSourceMutableBuilder[Self <: IDragSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterDragDrop(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "afterDragDrop", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterDragDropUndefined: Self = StObject.set(x, "afterDragDrop", js.undefined)
    
    @scala.inline
    def setAfterDragEnter(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "afterDragEnter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterDragEnterUndefined: Self = StObject.set(x, "afterDragEnter", js.undefined)
    
    @scala.inline
    def setAfterDragOut(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "afterDragOut", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterDragOutUndefined: Self = StObject.set(x, "afterDragOut", js.undefined)
    
    @scala.inline
    def setAfterDragOver(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "afterDragOver", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterDragOverUndefined: Self = StObject.set(x, "afterDragOver", js.undefined)
    
    @scala.inline
    def setAfterInvalidDrop(value: (/* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "afterInvalidDrop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAfterInvalidDropUndefined: Self = StObject.set(x, "afterInvalidDrop", js.undefined)
    
    @scala.inline
    def setAfterValidDrop(
      value: (/* target */ js.UndefOr[js.Any], /* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "afterValidDrop", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAfterValidDropUndefined: Self = StObject.set(x, "afterValidDrop", js.undefined)
    
    @scala.inline
    def setAlignElWithMouse(value: () => Unit): Self = StObject.set(x, "alignElWithMouse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAlignElWithMouseUndefined: Self = StObject.set(x, "alignElWithMouse", js.undefined)
    
    @scala.inline
    def setAnimRepair(value: Boolean): Self = StObject.set(x, "animRepair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimRepairUndefined: Self = StObject.set(x, "animRepair", js.undefined)
    
    @scala.inline
    def setBeforeDragDrop(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Boolean
    ): Self = StObject.set(x, "beforeDragDrop", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeDragDropUndefined: Self = StObject.set(x, "beforeDragDrop", js.undefined)
    
    @scala.inline
    def setBeforeDragEnter(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Boolean
    ): Self = StObject.set(x, "beforeDragEnter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeDragEnterUndefined: Self = StObject.set(x, "beforeDragEnter", js.undefined)
    
    @scala.inline
    def setBeforeDragOut(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Boolean
    ): Self = StObject.set(x, "beforeDragOut", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeDragOutUndefined: Self = StObject.set(x, "beforeDragOut", js.undefined)
    
    @scala.inline
    def setBeforeDragOver(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Boolean
    ): Self = StObject.set(x, "beforeDragOver", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeDragOverUndefined: Self = StObject.set(x, "beforeDragOver", js.undefined)
    
    @scala.inline
    def setBeforeInvalidDrop(
      value: (/* target */ js.UndefOr[IDragDrop], /* e */ js.UndefOr[Event], /* id */ js.UndefOr[String]) => Boolean
    ): Self = StObject.set(x, "beforeInvalidDrop", js.Any.fromFunction3(value))
    
    @scala.inline
    def setBeforeInvalidDropUndefined: Self = StObject.set(x, "beforeInvalidDrop", js.undefined)
    
    @scala.inline
    def setDdGroup(value: String): Self = StObject.set(x, "ddGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDdGroupUndefined: Self = StObject.set(x, "ddGroup", js.undefined)
    
    @scala.inline
    def setDragData(value: js.Any): Self = StObject.set(x, "dragData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragDataUndefined: Self = StObject.set(x, "dragData", js.undefined)
    
    @scala.inline
    def setDropAllowed(value: String): Self = StObject.set(x, "dropAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropAllowedUndefined: Self = StObject.set(x, "dropAllowed", js.undefined)
    
    @scala.inline
    def setDropNotAllowed(value: String): Self = StObject.set(x, "dropNotAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropNotAllowedUndefined: Self = StObject.set(x, "dropNotAllowed", js.undefined)
    
    @scala.inline
    def setGetDragData(value: /* e */ js.UndefOr[js.Any] => _): Self = StObject.set(x, "getDragData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDragDataUndefined: Self = StObject.set(x, "getDragData", js.undefined)
    
    @scala.inline
    def setGetProxy(value: () => IStatusProxy): Self = StObject.set(x, "getProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
    
    @scala.inline
    def setHideProxy(value: () => Unit): Self = StObject.set(x, "hideProxy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideProxyUndefined: Self = StObject.set(x, "hideProxy", js.undefined)
    
    @scala.inline
    def setOnBeforeDrag(value: (/* data */ js.UndefOr[js.Any], /* e */ js.UndefOr[Event]) => Boolean): Self = StObject.set(x, "onBeforeDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnBeforeDragUndefined: Self = StObject.set(x, "onBeforeDrag", js.undefined)
    
    @scala.inline
    def setOnStartDrag(value: (/* x */ js.UndefOr[Double], /* y */ js.UndefOr[Double]) => Unit): Self = StObject.set(x, "onStartDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnStartDragUndefined: Self = StObject.set(x, "onStartDrag", js.undefined)
    
    @scala.inline
    def setRepairHighlightColor(value: String): Self = StObject.set(x, "repairHighlightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepairHighlightColorUndefined: Self = StObject.set(x, "repairHighlightColor", js.undefined)
  }
}
