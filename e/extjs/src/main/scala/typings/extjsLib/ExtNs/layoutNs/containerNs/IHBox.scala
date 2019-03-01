package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHBox extends IBox {
  /** [Config Option] (String) */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] ("round"/"floor"/"ceil") */
  var alignRoundingMethod: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var constrainAlign: js.UndefOr[scala.Boolean] = js.undefined
}

object IHBox {
  @scala.inline
  def apply(
    addChildEls: js.Function0[scala.Unit] = null,
    afterRemove: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    align: java.lang.String = null,
    alignRoundingMethod: js.Any = null,
    alternateClassName: js.Any = null,
    beginLayout: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    beginLayoutCycle: js.Function2[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* firstCycle */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    cacheFlexes: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    calculate: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    completeLayout: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    config: js.Any = null,
    configureItem: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    constrainAlign: js.UndefOr[scala.Boolean] = js.undefined,
    defaultMargins: js.Any = null,
    destroy: js.Function0[scala.Unit] = null,
    done: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    finalizeLayout: js.Function1[/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], scala.Unit] = null,
    finishedLayout: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    flex: scala.Int | scala.Double = null,
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
    getRenderTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getRenderedItems: js.Function0[extjsLib.ExtNs.Array] = null,
    getTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getVisibleItems: js.Function0[extjsLib.ExtNs.Array] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IHBox] = null,
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
    notifyOwner: js.Function1[/* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem], scala.Unit] = null,
    onContentChange: js.Function1[/* child */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Boolean] = null,
    overflowPadderEl: extjsLib.ExtNs.IElement = null,
    pack: java.lang.String = null,
    padding: java.lang.String = null,
    removeChildEls: js.Function1[/* testFn */ js.UndefOr[js.Any], scala.Unit] = null,
    renderItems: js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    stretchMaxPartner: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IHBox = {
    val __obj = js.Dynamic.literal()
    if (addChildEls != null) __obj.updateDynamic("addChildEls")(addChildEls)
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(afterRemove)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (align != null) __obj.updateDynamic("align")(align)
    if (alignRoundingMethod != null) __obj.updateDynamic("alignRoundingMethod")(alignRoundingMethod)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(beginLayout)
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(beginLayoutCycle)
    if (cacheFlexes != null) __obj.updateDynamic("cacheFlexes")(cacheFlexes)
    if (calculate != null) __obj.updateDynamic("calculate")(calculate)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(completeLayout)
    if (config != null) __obj.updateDynamic("config")(config)
    if (configureItem != null) __obj.updateDynamic("configureItem")(configureItem)
    if (!js.isUndefined(constrainAlign)) __obj.updateDynamic("constrainAlign")(constrainAlign)
    if (defaultMargins != null) __obj.updateDynamic("defaultMargins")(defaultMargins)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(finalizeLayout)
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(finishedLayout)
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (getContainerSize != null) __obj.updateDynamic("getContainerSize")(getContainerSize)
    if (getElementTarget != null) __obj.updateDynamic("getElementTarget")(getElementTarget)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(getItemSizePolicy)
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(getLayoutItems)
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
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(notifyOwner)
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(onContentChange)
    if (overflowPadderEl != null) __obj.updateDynamic("overflowPadderEl")(overflowPadderEl)
    if (pack != null) __obj.updateDynamic("pack")(pack)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (removeChildEls != null) __obj.updateDynamic("removeChildEls")(removeChildEls)
    if (renderItems != null) __obj.updateDynamic("renderItems")(renderItems)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (stretchMaxPartner != null) __obj.updateDynamic("stretchMaxPartner")(stretchMaxPartner)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IHBox]
  }
}

