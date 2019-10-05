package typings.extjs.Ext.layout

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IElement
import typings.extjs.Ext.layout.container.IVBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccordionLayout extends IVBox {
  /** [Config Option] (Boolean) */
  var activeOnTop: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var animate: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoWidth: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var collapseFirst: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var fill: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var hideCollapseTool: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var multi: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var titleCollapse: js.UndefOr[Boolean] = js.undefined
}

object IAccordionLayout {
  @scala.inline
  def apply(
    activeOnTop: js.UndefOr[Boolean] = js.undefined,
    addChildEls: () => Unit = null,
    afterRemove: /* item */ js.UndefOr[js.Any] => Unit = null,
    alias: Array = null,
    align: java.lang.String = null,
    alignRoundingMethod: js.Any = null,
    alternateClassName: js.Any = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    autoWidth: js.UndefOr[Boolean] = js.undefined,
    beginLayout: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    beginLayoutCycle: (/* ownerContext */ js.UndefOr[js.Any], /* firstCycle */ js.UndefOr[js.Any]) => Unit = null,
    cacheFlexes: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    calculate: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    collapseFirst: js.UndefOr[Boolean] = js.undefined,
    completeLayout: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    config: js.Any = null,
    configureItem: /* item */ js.UndefOr[js.Any] => Unit = null,
    constrainAlign: js.UndefOr[Boolean] = js.undefined,
    defaultMargins: js.Any = null,
    destroy: () => Unit = null,
    done: js.UndefOr[Boolean] = js.undefined,
    extend: java.lang.String = null,
    fill: js.UndefOr[Boolean] = js.undefined,
    finalizeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    finishedLayout: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    flex: Int | Double = null,
    getContainerSize: (/* ownerContext */ js.UndefOr[IContextItem], /* inDom */ js.UndefOr[Boolean]) => _ = null,
    getElementTarget: () => IElement = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemSizePolicy: (/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any]) => ISizePolicy = null,
    getLayoutItems: () => Array = null,
    getRenderTarget: () => IElement = null,
    getRenderedItems: () => Array = null,
    getTarget: () => IElement = null,
    getVisibleItems: () => Array = null,
    hideCollapseTool: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IAccordionLayout = null,
    initLayout: () => Unit = null,
    isLayout: js.UndefOr[Boolean] = js.undefined,
    isValidParent: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit = null,
    itemCls: java.lang.String = null,
    mixins: js.Any = null,
    multi: js.UndefOr[Boolean] = js.undefined,
    notifyOwner: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    onContentChange: /* child */ js.UndefOr[IComponent] => Boolean = null,
    overflowPadderEl: IElement = null,
    pack: java.lang.String = null,
    padding: java.lang.String = null,
    removeChildEls: /* testFn */ js.UndefOr[js.Any] => Unit = null,
    renderItems: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    stretchMaxPartner: js.Any = null,
    titleCollapse: js.UndefOr[Boolean] = js.undefined,
    uses: Array = null
  ): IAccordionLayout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(activeOnTop)) __obj.updateDynamic("activeOnTop")(activeOnTop)
    if (addChildEls != null) __obj.updateDynamic("addChildEls")(js.Any.fromFunction0(addChildEls))
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(js.Any.fromFunction1(afterRemove))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (align != null) __obj.updateDynamic("align")(align)
    if (alignRoundingMethod != null) __obj.updateDynamic("alignRoundingMethod")(alignRoundingMethod)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(autoWidth)) __obj.updateDynamic("autoWidth")(autoWidth)
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(js.Any.fromFunction1(beginLayout))
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(js.Any.fromFunction2(beginLayoutCycle))
    if (cacheFlexes != null) __obj.updateDynamic("cacheFlexes")(js.Any.fromFunction1(cacheFlexes))
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction1(calculate))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (!js.isUndefined(collapseFirst)) __obj.updateDynamic("collapseFirst")(collapseFirst)
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(js.Any.fromFunction1(completeLayout))
    if (config != null) __obj.updateDynamic("config")(config)
    if (configureItem != null) __obj.updateDynamic("configureItem")(js.Any.fromFunction1(configureItem))
    if (!js.isUndefined(constrainAlign)) __obj.updateDynamic("constrainAlign")(constrainAlign)
    if (defaultMargins != null) __obj.updateDynamic("defaultMargins")(defaultMargins)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (!js.isUndefined(fill)) __obj.updateDynamic("fill")(fill)
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(js.Any.fromFunction1(finalizeLayout))
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(js.Any.fromFunction1(finishedLayout))
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (getContainerSize != null) __obj.updateDynamic("getContainerSize")(js.Any.fromFunction2(getContainerSize))
    if (getElementTarget != null) __obj.updateDynamic("getElementTarget")(js.Any.fromFunction0(getElementTarget))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(js.Any.fromFunction2(getItemSizePolicy))
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(js.Any.fromFunction0(getLayoutItems))
    if (getRenderTarget != null) __obj.updateDynamic("getRenderTarget")(js.Any.fromFunction0(getRenderTarget))
    if (getRenderedItems != null) __obj.updateDynamic("getRenderedItems")(js.Any.fromFunction0(getRenderedItems))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction0(getTarget))
    if (getVisibleItems != null) __obj.updateDynamic("getVisibleItems")(js.Any.fromFunction0(getVisibleItems))
    if (!js.isUndefined(hideCollapseTool)) __obj.updateDynamic("hideCollapseTool")(hideCollapseTool)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initLayout != null) __obj.updateDynamic("initLayout")(js.Any.fromFunction0(initLayout))
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout)
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(js.Any.fromFunction3(isValidParent))
    if (itemCls != null) __obj.updateDynamic("itemCls")(itemCls)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(js.Any.fromFunction1(notifyOwner))
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(js.Any.fromFunction1(onContentChange))
    if (overflowPadderEl != null) __obj.updateDynamic("overflowPadderEl")(overflowPadderEl)
    if (pack != null) __obj.updateDynamic("pack")(pack)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (removeChildEls != null) __obj.updateDynamic("removeChildEls")(js.Any.fromFunction1(removeChildEls))
    if (renderItems != null) __obj.updateDynamic("renderItems")(js.Any.fromFunction2(renderItems))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stretchMaxPartner != null) __obj.updateDynamic("stretchMaxPartner")(stretchMaxPartner)
    if (!js.isUndefined(titleCollapse)) __obj.updateDynamic("titleCollapse")(titleCollapse)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IAccordionLayout]
  }
}

