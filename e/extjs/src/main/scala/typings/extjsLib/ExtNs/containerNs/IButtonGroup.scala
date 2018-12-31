package typings
package extjsLib.ExtNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonGroup
  extends extjsLib.ExtNs.panelNs.IPanel {
  /** [Config Option] (Number) */
  var columns: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var defaultButtonUI: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] private
  		* @param component Object
  		*/
  @JSName("onBeforeAdd")
  var onBeforeAdd_IButtonGroup: js.UndefOr[js.Function1[/* component */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

