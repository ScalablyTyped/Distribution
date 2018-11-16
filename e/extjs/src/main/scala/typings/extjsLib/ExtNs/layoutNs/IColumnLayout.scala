package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IColumnLayout
  extends extjsLib.ExtNs.layoutNs.containerNs.IAuto {
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @param ownerSizeModel Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IColumnLayout: js.UndefOr[
    js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy]
  ] = js.undefined
  /** [Method] This method sets the height and or width of the outerCt innerCt to adjust for the following browser specific issues
  		* @param ownerContext Object
  		* @param containerSize Object
  		*/
  @JSName("setCtSizeIfNeeded")
  var setCtSizeIfNeeded_IColumnLayout: js.UndefOr[
    js.Function2[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* containerSize */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

