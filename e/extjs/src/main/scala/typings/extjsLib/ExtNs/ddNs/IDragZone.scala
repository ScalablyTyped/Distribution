package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragZone extends IDragSource {
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.undefined
  /** [Method] Called when a mousedown occurs in this container
  		* @param e Event The mouse down event
  		* @returns Object The dragData
  		*/
  @JSName("getDragData")
  var getDragData_IDragZone: js.UndefOr[js.Function1[/* e */ js.UndefOr[stdLib.Event], _]] = js.undefined
  /** [Method] Called before a repair of an invalid drop to get the XY to animate to
  		* @param e Event The mouse up event
  		* @returns Number[] The xy location (e.g. [100, 200])
  		*/
  var getRepairXY: js.UndefOr[js.Function1[/* e */ js.UndefOr[stdLib.Event], extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Called once drag threshold has been reached to initialize the proxy element
  		* @param x Number The x position of the click on the dragged object
  		* @param y Number The y position of the click on the dragged object
  		* @returns Boolean true to continue the drag, false to cancel
  		*/
  var onInitDrag: js.UndefOr[
    js.Function2[/* x */ js.UndefOr[scala.Double], /* y */ js.UndefOr[scala.Double], scala.Boolean]
  ] = js.undefined
  /** [Config Option] (String/HTMLElement/Ext.dom.Element) */
  var scrollEl: js.UndefOr[js.Any] = js.undefined
}

