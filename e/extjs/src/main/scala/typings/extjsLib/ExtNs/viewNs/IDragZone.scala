package typings
package extjsLib.ExtNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragZone
  extends extjsLib.ExtNs.ddNs.IDragZone {
  /** [Method] Called before a repair of an invalid drop to get the XY to animate to
  		* @param e Object
  		* @param data Object
  		* @returns Number[] The xy location (e.g. [100, 200])
  		*/
  @JSName("getRepairXY")
  var getRepairXY_IDragZone: js.UndefOr[
    js.Function2[/* e */ js.UndefOr[js.Any], /* data */ js.UndefOr[js.Any], extjsLib.ExtNs.Array]
  ] = js.undefined
  /** [Method] Sets up the DragDrop object
  		* @param id Object
  		* @param sGroup Object
  		* @param config Object
  		*/
  @JSName("init")
  var init_IDragZone: js.UndefOr[
    js.Function3[
      /* id */ js.UndefOr[js.Any], 
      /* sGroup */ js.UndefOr[js.Any], 
      /* config */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Called once drag threshold has been reached to initialize the proxy element
  		* @param x Object
  		* @param y Object
  		* @returns Boolean true to continue the drag, false to cancel
  		*/
  @JSName("onInitDrag")
  var onInitDrag_IDragZone: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[js.Any], scala.Boolean]
  ] = js.undefined
}

