package typings
package extjsLib.ExtNs.ddNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDDProxy extends IDD {
  /** [Property] (Boolean) */
  var centerFrame: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Creates the proxy element if it does not yet exist */
  var createFrame: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (String) */
  var dragElId: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] overrides Ext dd DragDrop By default we try to move the element to the last location of the frame
  		* @param e Object
  		*/
  @JSName("endDrag")
  var endDrag_IDDProxy: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Initialization for the drag frame element  */
  var initFrame: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var resizeFrame: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] toString method
  		* @returns String string representation of the dd obj
  		*/
  @JSName("toString")
  var toString_FIDDProxy: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
}

