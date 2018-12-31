package typings
package extjsLib.ExtNs.gridNs.headerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropZone
  extends extjsLib.ExtNs.ddNs.IDropZone {
  /** [Method] Returns a custom data object associated with the DOM node that is the target of the event
  		* @param e Object
  		* @returns Object data The custom data
  		*/
  @JSName("getTargetFromEvent")
  var getTargetFromEvent_IDropZone: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dropped onto the drop node
  		* @param node Object
  		* @param dragZone Object
  		* @param e Object
  		* @param data Object
  		* @returns Boolean True if the drop was valid, else false
  		*/
  @JSName("onNodeDrop")
  var onNodeDrop_IDropZone: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[js.Any], 
      /* dragZone */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Called when the DropZone determines that a Ext dd DragSource has been dragged out of the drop node without dropping  */
  @JSName("onNodeOut")
  var onNodeOut_IDropZone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Called while the DropZone determines that a Ext dd DragSource is over a drop node that has either been registered or
  		* @param node Object
  		* @param dragZone Object
  		* @param e Object
  		* @param data Object
  		* @returns String status The CSS class that communicates the drop status back to the source so that the underlying Ext.dd.StatusProxy can be updated
  		*/
  @JSName("onNodeOver")
  var onNodeOver_IDropZone: js.UndefOr[
    js.Function4[
      /* node */ js.UndefOr[js.Any], 
      /* dragZone */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      java.lang.String
    ]
  ] = js.undefined
}

