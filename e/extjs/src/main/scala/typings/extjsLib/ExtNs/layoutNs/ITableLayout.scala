package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITableLayout
  extends extjsLib.ExtNs.layoutNs.containerNs.IContainer {
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_ITableLayout: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var columns: js.UndefOr[scala.Double] = js.undefined
  /** [Method] This method if implemented is called after all layouts have completed  */
  @JSName("finalizeLayout")
  var finalizeLayout_ITableLayout: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Validates item is in the proper place in the dom
  		* @param item Object
  		* @param target Object
  		* @param rowIdx Object
  		* @param cellIdx Object
  		*/
  @JSName("isValidParent")
  var isValidParent_ITableLayout: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* cellIdx */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var tableAttrs: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var tdAttrs: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var trAttrs: js.UndefOr[js.Any] = js.undefined
}

object ITableLayout {
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
    columns: scala.Int | scala.Double = null,
    completeLayout: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    config: js.Any = null,
    configureItem: js.Function1[/* item */ js.UndefOr[js.Any], scala.Unit] = null,
    destroy: js.Function0[scala.Unit] = null,
    done: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    finalizeLayout: js.Function0[scala.Unit] = null,
    finishedLayout: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    getContainerSize: js.Function2[
      /* ownerContext */ js.UndefOr[IContextItem], 
      /* inDom */ js.UndefOr[scala.Boolean], 
      _
    ] = null,
    getElementTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    getItemSizePolicy: js.Function1[/* item */ js.UndefOr[extjsLib.ExtNs.IComponent], ISizePolicy] = null,
    getLayoutItems: js.Function0[extjsLib.ExtNs.Array] = null,
    getRenderTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getRenderedItems: js.Function0[extjsLib.ExtNs.Array] = null,
    getTarget: js.Function0[extjsLib.ExtNs.IElement] = null,
    getVisibleItems: js.Function0[extjsLib.ExtNs.Array] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ITableLayout] = null,
    initLayout: js.Function0[scala.Unit] = null,
    isLayout: js.UndefOr[scala.Boolean] = js.undefined,
    isValidParent: js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* cellIdx */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    itemCls: java.lang.String = null,
    mixins: js.Any = null,
    notifyOwner: js.Function1[/* ownerContext */ js.UndefOr[IContextItem], scala.Unit] = null,
    onContentChange: js.Function1[/* child */ js.UndefOr[extjsLib.ExtNs.IComponent], scala.Boolean] = null,
    overflowPadderEl: extjsLib.ExtNs.IElement = null,
    removeChildEls: js.Function1[/* testFn */ js.UndefOr[js.Any], scala.Unit] = null,
    renderItems: js.Function2[/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    tableAttrs: js.Any = null,
    tdAttrs: js.Any = null,
    trAttrs: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): ITableLayout = {
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
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
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
    if (removeChildEls != null) __obj.updateDynamic("removeChildEls")(removeChildEls)
    if (renderItems != null) __obj.updateDynamic("renderItems")(renderItems)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (tableAttrs != null) __obj.updateDynamic("tableAttrs")(tableAttrs)
    if (tdAttrs != null) __obj.updateDynamic("tdAttrs")(tdAttrs)
    if (trAttrs != null) __obj.updateDynamic("trAttrs")(trAttrs)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ITableLayout]
  }
}

