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

object ILayout {
  @scala.inline
  def apply(
    afterRemove: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    beginLayout: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    beginLayoutCycle: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    calculate: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    completeLayout: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    config: js.Any = null,
    configureItem: js.Function1[/* item */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    done: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    finalizeLayout: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    finishedLayout: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getItemSizePolicy: js.Function1[/* item */ js.UndefOr[extjsLib.ExtNs.IComponent], ISizePolicy] = null,
    getLayoutItems: js.Function0[scala.Unit] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ILayout] = null,
    initLayout: js.Function0[scala.Unit] = null,
    isLayout: js.UndefOr[scala.Boolean] = js.undefined,
    isValidParent: js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    mixins: js.Any = null,
    notifyOwner: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    onContentChange: js.Function1[/* child */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Boolean] = null,
    renderItems: js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): ILayout = {
    val __obj = js.Dynamic.literal()
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(afterRemove)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(beginLayout)
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(beginLayoutCycle)
    if (calculate != null) __obj.updateDynamic("calculate")(calculate)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(completeLayout)
    if (config != null) __obj.updateDynamic("config")(config)
    if (configureItem != null) __obj.updateDynamic("configureItem")(configureItem)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(finalizeLayout)
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(finishedLayout)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(getItemSizePolicy)
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(getLayoutItems)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initLayout != null) __obj.updateDynamic("initLayout")(initLayout)
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout)
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(isValidParent)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(notifyOwner)
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(onContentChange)
    if (renderItems != null) __obj.updateDynamic("renderItems")(renderItems)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ILayout]
  }
}

