package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(extjsLib.ExtNs.utilNs.IElementContainer because Would inherit conflicting mutable fields List(statics, uses, mixins, config, extend, inheritableStatics, alias, alternateClassName, requires, singleton, callSuper, self, getInitialConfig, callParent, callOverridden, initConfig))*/

trait IContainer
  extends extjsLib.ExtNs.layoutNs.ILayout {
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		* @param firstCycle Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IContainer: js.UndefOr[
    js.Function2[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* firstCycle */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] In addition to work done by our base classes containers benefit from some extra cached data
  		* @param ownerContext Object
  		*/
  @JSName("beginLayout")
  var beginLayout_IContainer: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Adds layout s itemCls and owning Container s itemCls
  		* @param item Object
  		*/
  @JSName("configureItem")
  var configureItem_IContainer: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Returns the container size that of the target
  		* @param ownerContext Ext.layout.ContextItem The owner's context item.
  		* @param inDom Boolean True if the container size must be in the DOM.
  		* @returns Object The size
  		*/
  var getContainerSize: js.UndefOr[
    js.Function2[
      /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], 
      /* inDom */ js.UndefOr[scala.Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns the element into which extra functional DOM elements can be inserted
  		* @returns Ext.Element
  		*/
  var getElementTarget: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Returns an array of child components either for a render phase Performed in the beforeLayout method of the layout s
  		* @returns Ext.Component[] of child components
  		*/
  @JSName("getLayoutItems")
  var getLayoutItems_IContainer: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the element into which rendering must take place
  		* @returns Ext.Element
  		*/
  var getRenderTarget: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Returns all items that are rendered
  		* @returns Array All matching items
  		*/
  var getRenderedItems: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the owner component s resize element
  		* @returns Ext.Element
  		*/
  var getTarget: js.UndefOr[js.Function0[extjsLib.ExtNs.IElement]] = js.undefined
  /** [Method] Returns all items that are both rendered and visible
  		* @returns Array All matching items
  		*/
  var getVisibleItems: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Config Option] (String) */
  var itemCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Ext.Element) */
  var overflowPadderEl: js.UndefOr[extjsLib.ExtNs.IElement] = js.undefined
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
  		* @param testFn Function The test function.
  		*/
  var removeChildEls: js.UndefOr[js.Function1[/* testFn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

