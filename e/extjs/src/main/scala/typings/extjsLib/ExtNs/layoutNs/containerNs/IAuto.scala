package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAuto extends IContainer {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Handles overflow processing for a container
  		* @param ownerContext Ext.layout.ContextItem
  		*/
  var calculateOverflow: js.UndefOr[
    js.Function1[/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], scala.Unit]
  ] = js.undefined
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Object
  		*/
  @JSName("completeLayout")
  var completeLayout_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
  		* @param ownerContext Object
  		*/
  @JSName("finishedLayout")
  var finishedLayout_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the overflow x style of the render target
  		* @param ownerContext Ext.layout.ContextItem
  		* @returns String
  		*/
  var getOverflowXStyle: js.UndefOr[
    js.Function1[
      /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Method] Returns the overflow y style of the render target
  		* @param ownerContext Ext.layout.ContextItem
  		* @returns String
  		*/
  var getOverflowYStyle: js.UndefOr[
    js.Function1[
      /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Property] (Boolean) */
  var manageOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var managePadding: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var reserveScrollbar: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This method sets the height and or width of the outerCt innerCt to adjust for the following browser specific issues
  		* @param ownerContext Ext.layout.ContextItem
  		* @param containerSize Object
  		*/
  var setCtSizeIfNeeded: js.UndefOr[
    js.Function2[
      /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], 
      /* containerSize */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

