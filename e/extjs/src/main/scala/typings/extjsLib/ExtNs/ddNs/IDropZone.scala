package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDropZone extends IDropTarget {
  /** [Method] Returns a custom data object associated with the DOM node that is the target of the event
  		* @param e Event The event
  		* @returns Object data The custom data
  		*/
  var getTargetFromEvent: js.UndefOr[js.Function1[/* e */ js.UndefOr[stdLib.Event], _]] = js.undefined
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dropped on it but not on any of its registered
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns Boolean True if the drop was valid, else false
  		*/
  var onContainerDrop: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Called while the DropZone determines that a Ext dd DragSource is being dragged over it but not over any of its regis
  		* @param source Ext.dd.DragSource The drag source that was dragged over this drop zone
  		* @param e Event The event
  		* @param data Object An object containing arbitrary data supplied by the drag source
  		* @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
  		*/
  var onContainerOver: js.UndefOr[
    js.Function3[
      /* source */ js.UndefOr[IDragSource], 
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ]
  ] = js.undefined
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
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ] = js.undefined
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
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
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
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
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
      /* e */ js.UndefOr[stdLib.Event], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ]
  ] = js.undefined
}

