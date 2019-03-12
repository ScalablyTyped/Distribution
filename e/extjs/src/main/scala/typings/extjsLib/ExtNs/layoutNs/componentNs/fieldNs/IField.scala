package typings
package extjsLib.ExtNs.layoutNs.componentNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField
  extends extjsLib.ExtNs.layoutNs.componentNs.IAuto {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IField: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Object
  		*/
  @JSName("beginLayout")
  var beginLayout_IField: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Object) */
  var elementId: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var errorStrategies: js.UndefOr[js.Any] = js.undefined
  /** [Method] Return the set of strategy functions from the errorStrategies collection that is appropriate for the field s msgTarge  */
  var getErrorStrategy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Return the set of strategy functions from the labelStrategies collection that is appropriate for the field s labelAli  */
  var getLabelStrategy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Object) */
  var labelStrategies: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var left: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var qtip: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var right: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var side: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var title: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var top: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var under: js.UndefOr[js.Any] = js.undefined
}

object IField {
  @scala.inline
  def apply(
    afterRemove: /* item */ js.UndefOr[js.Any] => scala.Unit = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    beginLayout: /* ownerContext */ js.UndefOr[js.Any] => scala.Unit = null,
    beginLayoutCycle: /* ownerContext */ js.UndefOr[js.Any] => scala.Unit = null,
    calculate: /* ownerContext */ js.UndefOr[js.Any] => scala.Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    completeLayout: /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem] => scala.Unit = null,
    config: js.Any = null,
    configureItem: /* item */ js.UndefOr[extjsLib.ExtNs.IComponent] => scala.Unit = null,
    destroy: () => scala.Unit = null,
    done: js.UndefOr[scala.Boolean] = js.undefined,
    elementId: js.Any = null,
    errorStrategies: js.Any = null,
    extend: java.lang.String = null,
    finalizeLayout: /* ownerContext */ js.UndefOr[extjsLib.ExtNs.layoutNs.IContextItem] => scala.Unit = null,
    finishedLayout: /* ownerContext */ js.UndefOr[js.Any] => scala.Unit = null,
    getErrorStrategy: () => scala.Unit = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    getItemSizePolicy: /* item */ js.UndefOr[extjsLib.ExtNs.IComponent] => extjsLib.ExtNs.layoutNs.ISizePolicy = null,
    getLabelStrategy: () => scala.Unit = null,
    getLayoutItems: () => scala.Unit = null,
    getRenderTarget: () => extjsLib.ExtNs.IElement = null,
    getTarget: () => extjsLib.ExtNs.IElement = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IField = null,
    initLayout: () => scala.Unit = null,
    isLayout: js.UndefOr[scala.Boolean] = js.undefined,
    isValidParent: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => scala.Unit = null,
    labelStrategies: js.Any = null,
    left: js.Any = null,
    mixins: js.Any = null,
    notifyOwner: /* ownerContext */ js.UndefOr[js.Any] => scala.Unit = null,
    onContentChange: /* child */ js.UndefOr[extjsLib.ExtNs.IComponent] => scala.Boolean = null,
    qtip: js.Any = null,
    renderItems: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => scala.Unit = null,
    requires: extjsLib.ExtNs.Array = null,
    right: js.Any = null,
    self: extjsLib.ExtNs.IClass = null,
    setHeightInDom: js.UndefOr[scala.Boolean] = js.undefined,
    setWidthInDom: js.UndefOr[scala.Boolean] = js.undefined,
    side: js.Any = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    title: js.Any = null,
    top: js.Any = null,
    under: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IField = {
    val __obj = js.Dynamic.literal()
    if (afterRemove != null) __obj.updateDynamic("afterRemove")(js.Any.fromFunction1(afterRemove))
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (beginLayout != null) __obj.updateDynamic("beginLayout")(js.Any.fromFunction1(beginLayout))
    if (beginLayoutCycle != null) __obj.updateDynamic("beginLayoutCycle")(js.Any.fromFunction1(beginLayoutCycle))
    if (calculate != null) __obj.updateDynamic("calculate")(js.Any.fromFunction1(calculate))
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (completeLayout != null) __obj.updateDynamic("completeLayout")(js.Any.fromFunction1(completeLayout))
    if (config != null) __obj.updateDynamic("config")(config)
    if (configureItem != null) __obj.updateDynamic("configureItem")(js.Any.fromFunction1(configureItem))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done)
    if (elementId != null) __obj.updateDynamic("elementId")(elementId)
    if (errorStrategies != null) __obj.updateDynamic("errorStrategies")(errorStrategies)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(js.Any.fromFunction1(finalizeLayout))
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(js.Any.fromFunction1(finishedLayout))
    if (getErrorStrategy != null) __obj.updateDynamic("getErrorStrategy")(js.Any.fromFunction0(getErrorStrategy))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(js.Any.fromFunction1(getItemSizePolicy))
    if (getLabelStrategy != null) __obj.updateDynamic("getLabelStrategy")(js.Any.fromFunction0(getLabelStrategy))
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(js.Any.fromFunction0(getLayoutItems))
    if (getRenderTarget != null) __obj.updateDynamic("getRenderTarget")(js.Any.fromFunction0(getRenderTarget))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction0(getTarget))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initLayout != null) __obj.updateDynamic("initLayout")(js.Any.fromFunction0(initLayout))
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout)
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(js.Any.fromFunction3(isValidParent))
    if (labelStrategies != null) __obj.updateDynamic("labelStrategies")(labelStrategies)
    if (left != null) __obj.updateDynamic("left")(left)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(js.Any.fromFunction1(notifyOwner))
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(js.Any.fromFunction1(onContentChange))
    if (qtip != null) __obj.updateDynamic("qtip")(qtip)
    if (renderItems != null) __obj.updateDynamic("renderItems")(js.Any.fromFunction2(renderItems))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (right != null) __obj.updateDynamic("right")(right)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(setHeightInDom)) __obj.updateDynamic("setHeightInDom")(setHeightInDom)
    if (!js.isUndefined(setWidthInDom)) __obj.updateDynamic("setWidthInDom")(setWidthInDom)
    if (side != null) __obj.updateDynamic("side")(side)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (title != null) __obj.updateDynamic("title")(title)
    if (top != null) __obj.updateDynamic("top")(top)
    if (under != null) __obj.updateDynamic("under")(under)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IField]
  }
}

