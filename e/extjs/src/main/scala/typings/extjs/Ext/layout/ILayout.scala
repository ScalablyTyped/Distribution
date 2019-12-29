package typings.extjs.Ext.layout

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILayout extends IBase {
  /** [Method] Removes layout s itemCls and owning Container s itemCls
  		* @param item Object
  		*/
  var afterRemove: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var beginLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var beginLayoutCycle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var calculate: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var completeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] Called before an item is rendered to allow the layout to configure the item
  		* @param item Ext.Component The item to be configured
  		*/
  var configureItem: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], Unit]] = js.undefined
  /** [Method] Destroys this layout  */
  var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var done: js.UndefOr[Boolean] = js.undefined
  /** [Method] This method if implemented is called after all layouts have completed
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var finalizeLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var finishedLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Ext.Component
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  var getItemSizePolicy: js.UndefOr[js.Function1[/* item */ js.UndefOr[IComponent], ISizePolicy]] = js.undefined
  /** [Method] Returns the set of items to layout empty by default */
  var getLayoutItems: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] A one time initialization method called just before rendering  */
  var initLayout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isLayout: js.UndefOr[Boolean] = js.undefined
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
      Unit
    ]
  ] = js.undefined
  /** [Method] This method if implemented is called after all layouts are finished and all have a lastComponentSize cached
  		* @param ownerContext Ext.layout.ContextItem The context item for the layout's owner component.
  		*/
  var notifyOwner: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], Unit]] = js.undefined
  /** [Method] This method is called when a child item changes in some way
  		* @param child Ext.Component The child item that has changed.
  		* @returns Boolean True if this layout has handled the content change.
  		*/
  var onContentChange: js.UndefOr[js.Function1[/* child */ js.UndefOr[IComponent], Boolean]] = js.undefined
  /** [Method] Iterates over all passed items ensuring they are rendered
  		* @param items Object
  		* @param target Object
  		*/
  var renderItems: js.UndefOr[
    js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
}

object ILayout {
  @scala.inline
  def apply(
    afterRemove: /* item */ js.UndefOr[js.Any] => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    beginLayout: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    beginLayoutCycle: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    calculate: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    completeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    config: js.Any = null,
    configureItem: /* item */ js.UndefOr[IComponent] => Unit = null,
    destroy: () => Unit = null,
    done: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    finalizeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    finishedLayout: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getItemSizePolicy: /* item */ js.UndefOr[IComponent] => ISizePolicy = null,
    getLayoutItems: () => Unit = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ILayout = null,
    initLayout: () => Unit = null,
    isLayout: js.UndefOr[Boolean] = js.undefined,
    isValidParent: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit = null,
    mixins: js.Any = null,
    notifyOwner: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    onContentChange: /* child */ js.UndefOr[IComponent] => Boolean = null,
    renderItems: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ILayout = {
    val __obj = js.Dynamic.literal()
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(js.Any.fromFunction1(afterRemove))
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(js.Any.fromFunction1(beginLayout))
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(js.Any.fromFunction1(beginLayoutCycle))
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction1(calculate))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(js.Any.fromFunction1(completeLayout))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (configureItem != null) __obj.updateDynamic("configureItem")(js.Any.fromFunction1(configureItem))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(js.Any.fromFunction1(finalizeLayout))
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(js.Any.fromFunction1(finishedLayout))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(js.Any.fromFunction1(getItemSizePolicy))
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(js.Any.fromFunction0(getLayoutItems))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initLayout != null) __obj.updateDynamic("initLayout")(js.Any.fromFunction0(initLayout))
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout.asInstanceOf[js.Any])
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(js.Any.fromFunction3(isValidParent))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(js.Any.fromFunction1(notifyOwner))
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(js.Any.fromFunction1(onContentChange))
    if (renderItems != null) __obj.updateDynamic("renderItems")(js.Any.fromFunction2(renderItems))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILayout]
  }
}

