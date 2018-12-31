package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderResizer
  extends extjsLib.ExtNs.IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the value of dynamic
  		* @returns Boolean
  		*/
  var getDynamic: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  /** [Method] not using w and e resize bc we are only ever resizing one column wResizeCursor Ext isWebKit w resize  col resi
  		* @param headerCt Object
  		*/
  @JSName("init")
  var init_IHeaderResizer: js.UndefOr[js.Function1[/* headerCt */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Sets the value of dynamic
  		* @param dynamic Boolean
  		*/
  var setDynamic: js.UndefOr[js.Function1[/* dynamic */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

