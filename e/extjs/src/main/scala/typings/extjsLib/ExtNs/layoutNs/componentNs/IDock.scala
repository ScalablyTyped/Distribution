package typings
package extjsLib.ExtNs.layoutNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDock extends IComponent {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Object
  		*/
  @JSName("beginLayout")
  var beginLayout_IDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IDock: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Retrieve an ordered and or filtered array of all docked Components
  		* @param order String The desired ordering of the items ('render' or 'visual').
  		* @param beforeBody Boolean An optional flag to limit the set of items to only those before the body (true) or after the body (false). All components are returned by default.
  		* @returns Ext.Component[] An array of components.
  		*/
  var getDockedItems: js.UndefOr[
    js.Function2[
      /* order */ js.UndefOr[java.lang.String], 
      /* beforeBody */ js.UndefOr[scala.Boolean], 
      extjsLib.ExtNs.Array
    ]
  ] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @param ownerSizeModel Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IDock: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* ownerSizeModel */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.layoutNs.ISizePolicy
    ]
  ] = js.undefined
  /** [Method] Returns an array containing all the visible docked items inside this layout s owner Panel
  		* @returns Array An array containing all the visible docked items of the Panel
  		*/
  @JSName("getLayoutItems")
  var getLayoutItems_IDock: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] The default weighting of docked items produces this arrangement
  		* @param ownerContext Object
  		* @param horz Object
  		* @param vert Object
  		*/
  var invalidateAxes: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* horz */ js.UndefOr[js.Any], 
      /* vert */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

