package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckboxGroup extends IContainer {
  /** [Config Option] (Boolean) */
  var autoFlex: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Just wait for the child items to all lay themselves out in the width we are configured to make available to them
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_ICheckboxGroup: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_ICheckboxGroup: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], extjsLib.ExtNs.layoutNs.ISizePolicy]] = js.undefined
  /** [Method] Always valid  */
  @JSName("isValidParent")
  var isValidParent_ICheckboxGroup: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Iterates over all passed items ensuring they are rendered
  		* @param items Object
  		*/
  @JSName("renderItems")
  var renderItems_ICheckboxGroup: js.UndefOr[js.Function1[/* items */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

