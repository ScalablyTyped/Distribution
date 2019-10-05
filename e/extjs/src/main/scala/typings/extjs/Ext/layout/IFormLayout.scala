package typings.extjs.Ext.layout

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormLayout
  extends typings.extjs.Ext.layout.container.IContainer {
  /** [Method] Handles overflow processing for a container
  		* @param ownerContext Ext.layout.ContextItem
  		* @param containerSize Object
  		* @param dimensions Number A bit mask for the overflow managed dimensions. The 0-bit is for width and the 1-bit is for height. In other words, a value of 1 would be only width, 2 would be only height and 3 would be both.
  		*/
  var calculateOverflow: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* containerSize */ js.UndefOr[js.Any], 
      /* dimensions */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IFormLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] This method if implemented is called at the end of the cycle in which this layout completes by not setting done to
  		* @param ownerContext Object
  		*/
  @JSName("completeLayout")
  var completeLayout_IFormLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Creates an element that makes bottom right body padding consistent across browsers
  		* @param out Object
  		* @param renderData Object
  		*/
  var doRenderPadder: js.UndefOr[
    js.Function2[/* out */ js.UndefOr[js.Any], /* renderData */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Returns the container size that of the target
  		* @param ownerContext Ext.layout.ContextItem The owner's context item.
  		* @param inDom Boolean True if the container size must be in the DOM.
  		* @param ignoreOverflow Boolean if true scrollbar size will not be subtracted from container size.
  		* @returns Object The size
  		*/
  @JSName("getContainerSize")
  var getContainerSize_IFormLayout: js.UndefOr[
    js.Function3[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* inDom */ js.UndefOr[Boolean], 
      /* ignoreOverflow */ js.UndefOr[Boolean], 
      _
    ]
  ] = js.undefined
  /** [Method] Returns an object describing how this layout manages the size of the given component
  		* @param item Object
  		* @returns Ext.layout.SizePolicy An object describing the sizing done by the layout for this item.
  		*/
  @JSName("getItemSizePolicy")
  var getItemSizePolicy_IFormLayout: js.UndefOr[js.Function1[/* item */ js.UndefOr[js.Any], ISizePolicy]] = js.undefined
  /** [Method] returns the overflow x style of the render target
  		* @param ownerContext Ext.layout.ContextItem
  		* @returns String
  		*/
  var getOverflowXStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], java.lang.String]] = js.undefined
  /** [Method] returns the overflow y style of the render target
  		* @param ownerContext Ext.layout.ContextItem
  		* @returns String
  		*/
  var getOverflowYStyle: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[IContextItem], java.lang.String]] = js.undefined
  /** [Property] (Object) */
  var getScrollRangeFlags: js.UndefOr[js.Any] = js.undefined
}

object IFormLayout {
  @scala.inline
  def apply(
    addChildEls: () => Unit = null,
    afterRemove: /* item */ js.UndefOr[js.Any] => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    beginLayout: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    beginLayoutCycle: (/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any]) => Unit = null,
    calculate: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    calculateOverflow: (/* ownerContext */ js.UndefOr[IContextItem], /* containerSize */ js.UndefOr[js.Any], /* dimensions */ js.UndefOr[Double]) => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    completeLayout: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    config: js.Any = null,
    configureItem: /* item */ js.UndefOr[js.Any] => Unit = null,
    destroy: () => Unit = null,
    doRenderPadder: (/* out */ js.UndefOr[js.Any], /* renderData */ js.UndefOr[js.Any]) => Unit = null,
    done: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    finalizeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    finishedLayout: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    getContainerSize: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean], /* ignoreOverflow */ js.UndefOr[Boolean]) => _ = null,
    getElementTarget: () => IElement = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemSizePolicy: /* item */ js.UndefOr[js.Any] => ISizePolicy = null,
    getLayoutItems: () => Array = null,
    getOverflowXStyle: /* ownerContext */ js.UndefOr[IContextItem] => java.lang.String = null,
    getOverflowYStyle: /* ownerContext */ js.UndefOr[IContextItem] => java.lang.String = null,
    getRenderTarget: () => IElement = null,
    getRenderedItems: () => Array = null,
    getScrollRangeFlags: js.Any = null,
    getTarget: () => IElement = null,
    getVisibleItems: () => Array = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IFormLayout = null,
    initLayout: () => Unit = null,
    isLayout: js.UndefOr[Boolean] = js.undefined,
    isValidParent: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit = null,
    itemCls: java.lang.String = null,
    mixins: js.Any = null,
    notifyOwner: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    onContentChange: /* child */ js.UndefOr[IComponent] => Boolean = null,
    overflowPadderEl: IElement = null,
    removeChildEls: /* testFn */ js.UndefOr[js.Any] => Unit = null,
    renderItems: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IFormLayout = {
    val __obj = js.Dynamic.literal()
    if (addChildEls != null) __obj.updateDynamic("addChildEls")(js.Any.fromFunction0(addChildEls))
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(js.Any.fromFunction1(afterRemove))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(js.Any.fromFunction1(beginLayout))
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(js.Any.fromFunction2(beginLayoutCycle))
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction1(calculate))
    if (calculateOverflow != null) __obj.updateDynamic("calculateOverflow")(js.Any.fromFunction3(calculateOverflow))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(js.Any.fromFunction1(completeLayout))
    if (config != null) __obj.updateDynamic("config")(config)
    if (configureItem != null) __obj.updateDynamic("configureItem")(js.Any.fromFunction1(configureItem))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (doRenderPadder != null) __obj.updateDynamic("doRenderPadder")(js.Any.fromFunction2(doRenderPadder))
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(js.Any.fromFunction1(finalizeLayout))
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(js.Any.fromFunction1(finishedLayout))
    if (getContainerSize != null) __obj.updateDynamic("getContainerSize")(js.Any.fromFunction3(getContainerSize))
    if (getElementTarget != null) __obj.updateDynamic("getElementTarget")(js.Any.fromFunction0(getElementTarget))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(js.Any.fromFunction1(getItemSizePolicy))
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(js.Any.fromFunction0(getLayoutItems))
    if (getOverflowXStyle != null) __obj.updateDynamic("getOverflowXStyle")(js.Any.fromFunction1(getOverflowXStyle))
    if (getOverflowYStyle != null) __obj.updateDynamic("getOverflowYStyle")(js.Any.fromFunction1(getOverflowYStyle))
    if (getRenderTarget != null) __obj.updateDynamic("getRenderTarget")(js.Any.fromFunction0(getRenderTarget))
    if (getRenderedItems != null) __obj.updateDynamic("getRenderedItems")(js.Any.fromFunction0(getRenderedItems))
    if (getScrollRangeFlags != null) __obj.updateDynamic("getScrollRangeFlags")(getScrollRangeFlags)
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction0(getTarget))
    if (getVisibleItems != null) __obj.updateDynamic("getVisibleItems")(js.Any.fromFunction0(getVisibleItems))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initLayout != null) __obj.updateDynamic("initLayout")(js.Any.fromFunction0(initLayout))
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout)
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(js.Any.fromFunction3(isValidParent))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(js.Any.fromFunction1(notifyOwner))
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(js.Any.fromFunction1(onContentChange))
    if (overflowPadderEl != null) __obj.updateDynamic("overflowPadderEl")(overflowPadderEl)
    if (removeChildEls != null) __obj.updateDynamic("removeChildEls")(js.Any.fromFunction1(removeChildEls))
    if (renderItems != null) __obj.updateDynamic("renderItems")(js.Any.fromFunction2(renderItems))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IFormLayout]
  }
}

