package typings
package extjsLib.ExtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewDropZone
  extends extjsLib.ExtNs.viewNs.IDropZone {
  /** [Config Option] (Boolean) */
  var allowContainerDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowParentInserts: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var appendOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var expandDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Moved out of the DropZone without dropping  */
  @JSName("notifyOut")
  var notifyOut_IViewDropZone: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] The mouse is no longer over a tree node so dropping is not valid
  		* @param n Object
  		* @param dd Object
  		* @param e Object
  		* @param data Object
  		*/
  @JSName("onNodeOut")
  var onNodeOut_IViewDropZone: js.UndefOr[
    js.Function4[
      /* n */ js.UndefOr[js.Any], 
      /* dd */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      /* data */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

