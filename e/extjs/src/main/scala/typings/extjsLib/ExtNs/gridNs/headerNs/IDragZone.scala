package typings
package extjsLib.ExtNs.gridNs.headerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDragZone
  extends extjsLib.ExtNs.ddNs.IDragZone {
  /** [Method] Called before a repair of an invalid drop to get the XY to animate to
  		* @returns Number[] The xy location (e.g. [100, 200])
  		*/
  @JSName("getRepairXY")
  var getRepairXY_IDragZone: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] An empty function by default but provided so that you can perform a custom action before the initial drag event begi
  		* @returns Boolean isValid True if the drag event is valid, else false to cancel
  		*/
  @JSName("onBeforeDrag")
  var onBeforeDrag_IDragZone: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] Called once drag threshold has been reached to initialize the proxy element
  		* @returns Boolean true to continue the drag, false to cancel
  		*/
  @JSName("onInitDrag")
  var onInitDrag_IDragZone: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

