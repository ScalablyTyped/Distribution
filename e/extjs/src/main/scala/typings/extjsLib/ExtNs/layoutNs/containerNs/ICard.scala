package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICard extends IFit {
  /** [Config Option] (Boolean) */
  var deferredRender: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Return the active visible component in the layout
  		* @returns Ext.Component
  		*/
  var getActiveItem: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Return the active visible component in the layout to the next card
  		* @returns Ext.Component The next component or false.
  		*/
  var getNext: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Return the active visible component in the layout to the previous card
  		* @returns Ext.Component The previous component or false.
  		*/
  var getPrev: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Sets the active visible component in the layout to the next card
  		* @returns Ext.Component the activated component or false when nothing activated.
  		*/
  var next: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Sets the active visible component in the layout to the previous card
  		* @returns Ext.Component the activated component or false when nothing activated.
  		*/
  var prev: js.UndefOr[js.Function0[extjsLib.ExtNs.IComponent]] = js.undefined
  /** [Method] Makes the given card active
  		* @param newCard Ext.Component/Number/String The component, component id, itemId, or index of component.
  		* @returns Ext.Component the activated component or false when nothing activated. False is returned also when trying to activate an already active card.
  		*/
  var setActiveItem: js.UndefOr[js.Function1[/* newCard */ js.UndefOr[js.Any], extjsLib.ExtNs.IComponent]] = js.undefined
}

object ICard {
  @scala.inline
  def apply(
    addChildEls: js.Function0[scala.Unit] = null,
    afterRemove: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    beginLayout: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    beginLayoutCycle: js.Function2[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* firstCycle */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    calculate: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    completeLayout: js.Function1[/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], scala.Unit] = null,
    config: js.Any = null,
    configureItem: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    defaultMargins: js.Any = null,
    deferredRender: js.UndefOr[scala.Boolean] = js.undefined,
    destroy: js.Function0[scala.Unit] = null,
    done: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    finalizeLayout: js.Function1[/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], scala.Unit] = null,
    finishedLayout: js.Function1[/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], scala.Unit] = null,
    getActiveItem: js.Function0[extjsLib.ExtNs.IComponent] = null,
    getContainerSize: js.Function2[
      /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], 
      /* inDom */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    getElementTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getItemSizePolicy: js.Function2[
      /* item */ js.UndefOr[js.Any], 
      /* ownerSizeModel */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.layoutNs.ISizePolicy
    ] = null,
    getLayoutItems: js.Function0[extjsLib.ExtNs.Array] = null,
    getNext: js.Function0[extjsLib.ExtNs.IComponent] = null,
    getPrev: js.Function0[extjsLib.ExtNs.IComponent] = null,
    getRenderTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getRenderedItems: js.Function0[extjsLib.ExtNs.Array] = null,
    getTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getVisibleItems: js.Function0[extjsLib.ExtNs.Array] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ICard] = null,
    initLayout: js.Function0[scala.Unit] = null,
    isLayout: js.UndefOr[scala.Boolean] = js.undefined,
    isValidParent: js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    itemCls: java.lang.String = null,
    mixins: js.Any = null,
    next: js.Function0[extjsLib.ExtNs.IComponent] = null,
    notifyOwner: js.Function1[/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], scala.Unit] = null,
    onContentChange: js.Function1[/* child */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Boolean] = null,
    overflowPadderEl: extjsLib.ExtNs.IElement = null,
    prev: js.Function0[extjsLib.ExtNs.IComponent] = null,
    removeChildEls: js.Function1[/* testFn */ js.UndefOr[js.Any], scala.Unit] = null,
    renderItems: js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    setActiveItem: js.Function1[/* newCard */ js.UndefOr[js.Any], extjsLib.ExtNs.IComponent] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): ICard = {
    val __obj = js.Dynamic.literal()
    if (addChildEls != null) __obj.updateDynamic("addChildEls")(addChildEls)
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
    if (defaultMargins != null) __obj.updateDynamic("defaultMargins")(defaultMargins)
    if (!js.isUndefined(deferredRender)) __obj.updateDynamic("deferredRender")(deferredRender)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(finalizeLayout)
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(finishedLayout)
    if (getActiveItem != null) __obj.updateDynamic("getActiveItem")(getActiveItem)
    if (getContainerSize != null) __obj.updateDynamic("getContainerSize")(getContainerSize)
    if (getElementTarget != null) __obj.updateDynamic("getElementTarget")(getElementTarget)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(getItemSizePolicy)
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(getLayoutItems)
    if (getNext != null) __obj.updateDynamic("getNext")(getNext)
    if (getPrev != null) __obj.updateDynamic("getPrev")(getPrev)
    if (getRenderTarget != null) __obj.updateDynamic("getRenderTarget")(getRenderTarget)
    if (getRenderedItems != null) __obj.updateDynamic("getRenderedItems")(getRenderedItems)
    if (getTarget != null) __obj.updateDynamic("getTarget")(getTarget)
    if (getVisibleItems != null) __obj.updateDynamic("getVisibleItems")(getVisibleItems)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (initLayout != null) __obj.updateDynamic("initLayout")(initLayout)
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout)
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(isValidParent)
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (next != null) __obj.updateDynamic("next")(next)
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(notifyOwner)
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(onContentChange)
    if (overflowPadderEl != null) __obj.updateDynamic("overflowPadderEl")(overflowPadderEl)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    if (removeChildEls != null) __obj.updateDynamic("removeChildEls")(removeChildEls)
    if (renderItems != null) __obj.updateDynamic("renderItems")(renderItems)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setActiveItem != null) __obj.updateDynamic("setActiveItem")(setActiveItem)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ICard]
  }
}

