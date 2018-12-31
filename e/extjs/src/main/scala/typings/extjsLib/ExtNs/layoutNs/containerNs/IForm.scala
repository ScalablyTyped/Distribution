package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IForm extends IContainer {
  /** [Method] Handles overflow processing for a container
  		* @param ownerContext Ext.layout.ContextItem
  		* @param containerSize Object
  		* @param dimensions Number A bit mask for the overflow managed dimensions. The 0-bit is for width and the 1-bit is for height. In other words, a value of 1 would be only width, 2 would be only height and 3 would be both.
  		*/
  var calculateOverflow: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], 
      /* containerSize */ js.UndefOr[js.Any], 
      /* dimensions */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IForm: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Object
  		*/
  @JSName("completeLayout")
  var completeLayout_IForm: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Creates an element that makes bottom right body padding consistent across browsers
  		* @param out Object
  		* @param renderData Object
  		*/
  var doRenderPadder: js.UndefOr[
    js.Function2[/* out */ js.UndefOr[js.Any], /* renderData */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Returns the container size that of the target
  		* @param ownerContext Ext.layout.ContextItem The owner's context item.
  		* @param inDom Boolean True if the container size must be in the DOM.
  		* @param ignoreOverflow Boolean if true scrollbar size will not be subtracted from container size.
  		* @returns Object The size
  		*/
  @JSName("getContainerSize")
  var getContainerSize_IForm: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], 
      /* inDom */ js.UndefOr[scala.Boolean], 
      /* ignoreOverflow */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IForm: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], extjsLib.ExtNs.layoutNs.ISizePolicy]] = js.undefined
  /** [Method] returns the overflow x style of the render target
  		* @param ownerContext Ext.layout.ContextItem
  		* @returns String
  		*/
  var getOverflowXStyle: js.UndefOr[
    js.Function1[
      /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Method] returns the overflow y style of the render target
  		* @param ownerContext Ext.layout.ContextItem
  		* @returns String
  		*/
  var getOverflowYStyle: js.UndefOr[
    js.Function1[
      /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], 
      java.lang.String
    ]
  ] = js.undefined
  /** [Property] (Object) */
  var getScrollRangeFlags: js.UndefOr[js.Any] = js.undefined
}

