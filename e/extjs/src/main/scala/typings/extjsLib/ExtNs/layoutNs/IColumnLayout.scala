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

object IColumnLayout {
  @scala.inline
  def apply(
    addChildEls: js.Function0[scala.Unit] = null,
    afterRemove: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    beginLayout: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    beginLayoutCycle: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    calculate: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    calculateOverflow: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    completeLayout: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    config: js.Any = null,
    configureItem: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    done: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    finalizeLayout: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    finishedLayout: js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit] = null,
    getContainerSize: js.Function2[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* inDom */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    getElementTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getItemSizePolicy: js.Function2[/* item */ js.UndefOr[js.Any], /* ownerSizeModel */ js.UndefOr[js.Any], ISizePolicy] = null,
    getLayoutItems: js.Function0[extjsLib.ExtNs.Array] = null,
    getOverflowXStyle: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], java.lang.String] = null,
    getOverflowYStyle: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], java.lang.String] = null,
    getRenderTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getRenderedItems: js.Function0[extjsLib.ExtNs.Array] = null,
    getTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getVisibleItems: js.Function0[extjsLib.ExtNs.Array] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IColumnLayout] = null,
    initLayout: js.Function0[scala.Unit] = null,
    isLayout: js.UndefOr[scala.Boolean] = js.undefined,
    isValidParent: js.Function3[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    itemCls: java.lang.String = null,
    manageOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    managePadding: js.UndefOr[scala.Boolean] = js.undefined,
    mixins: js.Any = null,
    notifyOwner: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    onContentChange: js.Function1[/* child */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Boolean] = null,
    overflowPadderEl: extjsLib.ExtNs.IElement = null,
    removeChildEls: js.Function1[/* testFn */ js.UndefOr[js.Any], scala.Unit] = null,
    renderItems: js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    reserveScrollbar: js.UndefOr[scala.Boolean] = js.undefined,
    self: extjsLib.ExtNs.IClass = null,
    setCtSizeIfNeeded: js.Function2[
      /* ownerContext */ js.UndefOr[js.Any], 
      /* containerSize */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IColumnLayout = {
    val __obj = js.Dynamic.literal()
    if (addChildEls != null) __obj.updateDynamic("addChildEls")(addChildEls)
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(afterRemove)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(beginLayout)
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(beginLayoutCycle)
    if (calculate != null) __obj.updateDynamic("calculate")(calculate)
    if (calculateOverflow != null) __obj.updateDynamic("calculateOverflow")(calculateOverflow)
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
    if (getContainerSize != null) __obj.updateDynamic("getContainerSize")(getContainerSize)
    if (getElementTarget != null) __obj.updateDynamic("getElementTarget")(getElementTarget)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(getItemSizePolicy)
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(getLayoutItems)
    if (getOverflowXStyle != null) __obj.updateDynamic("getOverflowXStyle")(getOverflowXStyle)
    if (getOverflowYStyle != null) __obj.updateDynamic("getOverflowYStyle")(getOverflowYStyle)
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
    if (!js.isUndefined(manageOverflow)) __obj.updateDynamic("manageOverflow")(manageOverflow)
    if (!js.isUndefined(managePadding)) __obj.updateDynamic("managePadding")(managePadding)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(notifyOwner)
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(onContentChange)
    if (overflowPadderEl != null) __obj.updateDynamic("overflowPadderEl")(overflowPadderEl)
    if (removeChildEls != null) __obj.updateDynamic("removeChildEls")(removeChildEls)
    if (renderItems != null) __obj.updateDynamic("renderItems")(renderItems)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (!js.isUndefined(reserveScrollbar)) __obj.updateDynamic("reserveScrollbar")(reserveScrollbar)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setCtSizeIfNeeded != null) __obj.updateDynamic("setCtSizeIfNeeded")(setCtSizeIfNeeded)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IColumnLayout]
  }
}

