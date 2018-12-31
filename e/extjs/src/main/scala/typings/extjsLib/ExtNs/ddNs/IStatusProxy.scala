package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatusProxy
  extends extjsLib.ExtNs.IComponent {
  /** [Config Option] (String) */
  var dropAllowed: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dropNotAllowed: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns the ghost element
  		* @returns Ext.Element el
  		*/
  var getGhost: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Causes the proxy to return to its position of origin via an animation
  		* @param xy Number[] The XY position of the element ([x, y])
  		* @param callback Function The function to call after the repair is complete.
  		* @param scope Object The scope (this reference) in which the callback function is executed. Defaults to the browser window.
  		*/
  var repair: js.UndefOr[
    js.Function3[
      /* xy */ js.UndefOr[extjsLib.ExtNs.Array], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Resets the status indicator to the default dropNotAllowed value
  		* @param clearGhost Boolean True to also remove all content from the ghost, false to preserve it
  		*/
  var reset: js.UndefOr[js.Function1[/* clearGhost */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Method] Updates the proxy s visual element to indicate the status of whether or not drop is allowed over the current target e
  		* @param cssClass String The css class for the new drop status indicator image
  		*/
  var setStatus: js.UndefOr[js.Function1[/* cssClass */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Method] Stops the repair animation if it s currently running */
  var stop: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Force the Layer to sync its shadow and shim positions to the element */
  var sync: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Updates the contents of the ghost element
  		* @param html String/HTMLElement The html that will replace the current innerHTML of the ghost element, or a DOM node to append as the child of the ghost element (in which case the innerHTML will be cleared first).
  		*/
  @JSName("update")
  var update_IStatusProxy: js.UndefOr[js.Function1[/* html */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

