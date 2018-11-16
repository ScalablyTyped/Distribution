package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDragSource extends IDDProxy {
  /** [Method] An empty function by default but provided so that you can perform a custom action after a valid drag drop has occurr
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dropped element
  		*/
  var afterDragDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action when the dragged item enters the d
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		*/
  var afterDragEnter: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action after the dragged item is dragged
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		*/
  var afterDragOut: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action while the dragged item is over the
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		*/
  var afterDragOver: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action after an invalid drop has occurred
  		* @param e Event The event object
  		* @param id String The id of the dropped element
  		*/
  var afterInvalidDrop: js.UndefOr[
    js.Function2[/* e */ js.UndefOr[stdLib.Event], /* id */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action after a valid drop has occurred by
  		* @param target Object The target DD
  		* @param e Event The event object
  		* @param id String The id of the dropped element
  		*/
  var afterValidDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the element to the location of the mousedown or click event maintaining the cursor location relative to the loc  */
  @JSName("alignElWithMouse")
  var alignElWithMouse_IDragSource: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var animRepair: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action before the dragged item is dropped
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		* @returns Boolean isValid True if the drag drop event is valid, else false to cancel
  		*/
  var beforeDragDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action before the dragged item enters the
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		* @returns Boolean isValid True if the drag event is valid, else false to cancel
  		*/
  var beforeDragEnter: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action before the dragged item is dragged
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		* @returns Boolean isValid True if the drag event is valid, else false to cancel
  		*/
  var beforeDragOut: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action while the dragged item is over the
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		* @returns Boolean isValid True if the drag event is valid, else false to cancel
  		*/
  var beforeDragOver: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action after an invalid drop has occurred
  		* @param target Ext.dd.DragDrop The drop target
  		* @param e Event The event object
  		* @param id String The id of the dragged element
  		* @returns Boolean isValid True if the invalid drop should proceed, else false to cancel
  		*/
  var beforeInvalidDrop: js.UndefOr[
    js.Function3[
      /* target */ js.UndefOr[IDragDrop], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* id */ js.UndefOr[java.lang.String], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var dragData: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the data object associated with this drag source
  		* @param e Object
  		* @returns Object data An object containing arbitrary data
  		*/
  var getDragData: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the drag source s underlying Ext dd StatusProxy
  		* @returns Ext.dd.StatusProxy proxy The StatusProxy
  		*/
  var getProxy: js.UndefOr[js.Function0[IStatusProxy]] = js.undefined
  /** [Method] Hides the drag source s Ext dd StatusProxy */
  var hideProxy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action before the initial drag event begi
  		* @param data Object An object containing arbitrary data to be shared with drop targets
  		* @param e Event The event object
  		* @returns Boolean isValid True if the drag event is valid, else false to cancel
  		*/
  var onBeforeDrag: js.UndefOr[
    js.Function2[/* data */ js.UndefOr[js.Any], /* e */ js.UndefOr[stdLib.Event], scala.Boolean]
  ] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action once the initial drag event has be
  		* @param x Number The x position of the click on the dragged object
  		* @param y Number The y position of the click on the dragged object
  		*/
  var onStartDrag: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Unit]
  ] = js.undefined
  /** [Config Option] (String) */
  var repairHighlightColor: js.UndefOr[java.lang.String] = js.undefined
}

