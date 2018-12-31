package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAnchor extends IAuto {
  /** [Config Option] (String) */
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultAnchor: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IAnchor: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], extjsLib.ExtNs.layoutNs.ISizePolicy]] = js.undefined
}

