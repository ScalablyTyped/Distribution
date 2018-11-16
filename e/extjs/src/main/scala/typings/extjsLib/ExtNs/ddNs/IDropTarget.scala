package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDropTarget extends IDDTarget {
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] The function a Ext dd DragSource calls once to notify this drop target that the dragged item has been dropped on it
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop target
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns Boolean False if the drop was invalid.
  		*/
  var notifyDrop: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Boolean
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
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
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
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Unit
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
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var overClass: js.UndefOr[java.lang.String] = js.undefined
}

