package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IEditor extends IContainer {
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IEditor: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IEditor: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], extjsLib.ExtNs.layoutNs.ISizePolicy]] = js.undefined
}

