package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayout
  extends extjsLib.ExtNs.IBase {
  /** [Method] Removes layout s itemCls and owning Container s itemCls
  		* @param item Object
  		*/
  var afterRemove: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var beginLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var beginLayoutCycle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit]] = js.undefined
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var calculate: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit]] = js.undefined
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var completeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit]] = js.undefined
  /** [Method] Called before an item is rendered to allow the layout to configure the item
  		* @param item Ext.Component The item to be configured
  		*/
  var configureItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit]] = js.undefined
  /** [Method] Destroys this layout  */
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var done: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This method if implemented is called after all layouts have completed
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var finalizeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit]] = js.undefined
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var finishedLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit]] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Ext.Component
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  var getItemSizePolicy: js.UndefOr[js.Function1[/* item */ js.UndefOr[extjsLib.ExtNs.IComponent], ISizePolicy]] = js.undefined
  /** [Method] Returns the set of items to layout empty by default */
  var getLayoutItems: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] A one time initialization method called just before rendering  */
  var initLayout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isLayout: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Validates item is in the proper place in the dom
  		* @param item Object
  		* @param target Object
  		* @param position Object
  		*/
  var isValidParent: js.UndefOr[
    js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] This method if implemented is called after all layouts are finished and all have a lastComponentSize cached
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var notifyOwner: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit]] = js.undefined
  /** [Method] This method is called when a child item changes in some way
  		* @param child Ext.Component The child item that has changed.
  		* @returns Boolean True if this layout has handled the content change.
  		*/
  var onContentChange: js.UndefOr[js.Function1[/* child */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Boolean]] = js.undefined
  /** [Method] Iterates over all passed items ensuring they are rendered
  		* @param items Object
  		* @param target Object
  		*/
  var renderItems: js.UndefOr[
    js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
}

