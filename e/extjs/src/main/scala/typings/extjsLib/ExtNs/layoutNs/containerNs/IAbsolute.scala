package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAbsolute extends IAnchor {
  /** [Config Option] (Boolean) */
  var ignoreOnContentChange: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] This method is called when a child item changes in some way
  		* @returns Boolean True if this layout has handled the content change.
  		*/
  @JSName("onContentChange")
  var onContentChange_IAbsolute: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

object IAbsolute {
  @scala.inline
  def apply(
    addChildEls: () => scala.Unit = null,
    afterRemove: /* item */ js.UndefOr[js.Any] => scala.Unit = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    anchor: java.lang.String = null,
    beginLayout: /* ownerContext */ js.UndefOr[js.Any] => scala.Unit = null,
    beginLayoutCycle: /* ownerContext */ js.UndefOr[js.Any] => scala.Unit = null,
    calculate: /* ownerContext */ js.UndefOr[js.Any] => scala.Unit = null,
    calculateOverflow: /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem] => scala.Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    completeLayout: /* ownerContext */ js.UndefOr[js.Any] => scala.Unit = null,
    config: js.Any = null,
    configureItem: /* item */ js.UndefOr[js.Any] => scala.Unit = null,
    defaultAnchor: java.lang.String = null,
    destroy: () => scala.Unit = null,
    done: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    finalizeLayout: /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem] => scala.Unit = null,
    finishedLayout: /* ownerContext */ js.UndefOr[js.Any] => scala.Unit = null,
    getContainerSize: (/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], /* inDom */ js.UndefOr[scala.Boolean]) => _ = null,
    getElementTarget: () => extjsLib.ExtNs.IElement = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemSizePolicy: /* item */ js.UndefOr[js.Any] => extjsLib.ExtNs.layoutNs.ISizePolicy = null,
    getLayoutItems: () => extjsLib.ExtNs.Array = null,
    getOverflowXStyle: /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem] => java.lang.String = null,
    getOverflowYStyle: /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem] => java.lang.String = null,
    getRenderTarget: () => extjsLib.ExtNs.IElement = null,
    getRenderedItems: () => extjsLib.ExtNs.Array = null,
    getTarget: () => extjsLib.ExtNs.IElement = null,
    getVisibleItems: () => extjsLib.ExtNs.Array = null,
    ignoreOnContentChange: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IAbsolute = null,
    initLayout: () => scala.Unit = null,
    isLayout: js.UndefOr[scala.Boolean] = js.undefined,
    isValidParent: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => scala.Unit = null,
    itemCls: java.lang.String = null,
    manageOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    managePadding: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    notifyOwner: /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem] => scala.Unit = null,
    onContentChange: () => scala.Boolean = null,
    overflowPadderEl: extjsLib.ExtNs.IElement = null,
    removeChildEls: /* testFn */ js.UndefOr[js.Any] => scala.Unit = null,
    renderItems: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => scala.Unit = null,
    requires: extjsLib.ExtNs.Array = null,
    reserveScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    self: extjsLib.ExtNs.IClass = null,
    setCtSizeIfNeeded: (/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], /* containerSize */ js.UndefOr[js.Any]) => scala.Unit = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IAbsolute = {
    val __obj = js.Dynamic.literal()
    if (addChildEls != null) __obj.updateDynamic("addChildEls")(js.Any.fromFunction0(addChildEls))
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(js.Any.fromFunction1(afterRemove))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(js.Any.fromFunction1(beginLayout))
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(js.Any.fromFunction1(beginLayoutCycle))
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction1(calculate))
    if (calculateOverflow != null) __obj.updateDynamic("calculateOverflow")(js.Any.fromFunction1(calculateOverflow))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(js.Any.fromFunction1(completeLayout))
    if (config != null) __obj.updateDynamic("config")(config)
    if (configureItem != null) __obj.updateDynamic("configureItem")(js.Any.fromFunction1(configureItem))
    if (defaultAnchor != null) __obj.updateDynamic("defaultAnchor")(defaultAnchor)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(js.Any.fromFunction1(finalizeLayout))
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(js.Any.fromFunction1(finishedLayout))
    if (getContainerSize != null) __obj.updateDynamic("getContainerSize")(js.Any.fromFunction2(getContainerSize))
    if (getElementTarget != null) __obj.updateDynamic("getElementTarget")(js.Any.fromFunction0(getElementTarget))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(js.Any.fromFunction1(getItemSizePolicy))
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(js.Any.fromFunction0(getLayoutItems))
    if (getOverflowXStyle != null) __obj.updateDynamic("getOverflowXStyle")(js.Any.fromFunction1(getOverflowXStyle))
    if (getOverflowYStyle != null) __obj.updateDynamic("getOverflowYStyle")(js.Any.fromFunction1(getOverflowYStyle))
    if (getRenderTarget != null) __obj.updateDynamic("getRenderTarget")(js.Any.fromFunction0(getRenderTarget))
    if (getRenderedItems != null) __obj.updateDynamic("getRenderedItems")(js.Any.fromFunction0(getRenderedItems))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction0(getTarget))
    if (getVisibleItems != null) __obj.updateDynamic("getVisibleItems")(js.Any.fromFunction0(getVisibleItems))
    if (!js.isUndefined(ignoreOnContentChange)) __obj.updateDynamic("ignoreOnContentChange")(ignoreOnContentChange)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initLayout != null) __obj.updateDynamic("initLayout")(js.Any.fromFunction0(initLayout))
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout)
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(js.Any.fromFunction3(isValidParent))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (!js.isUndefined(manageOverflow)) __obj.updateDynamic("manageOverflow")(manageOverflow)
    if (!js.isUndefined(managePadding)) __obj.updateDynamic("managePadding")(managePadding)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(js.Any.fromFunction1(notifyOwner))
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(js.Any.fromFunction0(onContentChange))
    if (overflowPadderEl != null) __obj.updateDynamic("overflowPadderEl")(overflowPadderEl)
    if (removeChildEls != null) __obj.updateDynamic("removeChildEls")(js.Any.fromFunction1(removeChildEls))
    if (renderItems != null) __obj.updateDynamic("renderItems")(js.Any.fromFunction2(renderItems))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (!js.isUndefined(reserveScrollbar)) __obj.updateDynamic("reserveScrollbar")(reserveScrollbar)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCtSizeIfNeeded != null) __obj.updateDynamic("setCtSizeIfNeeded")(js.Any.fromFunction2(setCtSizeIfNeeded))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAbsolute]
  }
}

