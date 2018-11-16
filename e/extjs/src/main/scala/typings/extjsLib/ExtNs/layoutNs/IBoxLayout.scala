package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBoxLayout
  extends extjsLib.ExtNs.layoutNs.containerNs.IContainer {
  /** [Method] This method is called to re cache our understanding of flexes
  		* @param ownerContext Object
  		*/
  var cacheFlexes: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Object
  		*/
  @JSName("completeLayout")
  var completeLayout_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Object) */
  var defaultMargins: js.UndefOr[js.Any] = js.undefined
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
  		* @param ownerContext Object
  		*/
  @JSName("finishedLayout")
  var finishedLayout_IBoxLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var flex: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @param ownerSizeModel Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IBoxLayout: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.undefined
  /** [Config Option] (String) */
  var pack: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var padding: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String/Ext.Component) */
  var stretchMaxPartner: js.UndefOr[js.Any] = js.undefined
}

