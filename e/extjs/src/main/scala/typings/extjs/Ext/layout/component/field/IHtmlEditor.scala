package typings.extjs.Ext.layout.component.field

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IComponent
import typings.extjs.Ext.IElement
import typings.extjs.Ext.layout.IContextItem
import typings.extjs.Ext.layout.ISizePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHtmlEditor extends IFieldContainer {
  /** [Method] This method is called after all layouts are complete and their calculations flushed to the DOM  */
  @JSName("finishedLayout")
  var finishedLayout_IHtmlEditor: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object IHtmlEditor {
  @scala.inline
  def apply(
    afterRemove: /* item */ js.UndefOr[js.Any] => Unit = null,
    alias: Array = null,
    alternateClassName: js.Any = null,
    beginLayout: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    beginLayoutCycle: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    calculate: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    completeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    config: js.Any = null,
    configureItem: /* item */ js.UndefOr[IComponent] => Unit = null,
    destroy: () => Unit = null,
    done: js.UndefOr[Boolean] = js.undefined,
    elementId: js.Any = null,
    errorStrategies: js.Any = null,
    extend: String = null,
    finalizeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    finishedLayout: () => Unit = null,
    getErrorStrategy: () => Unit = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getItemSizePolicy: /* item */ js.UndefOr[IComponent] => ISizePolicy = null,
    getLabelStrategy: () => Unit = null,
    getLayoutItems: () => Unit = null,
    getRenderTarget: () => IElement = null,
    getTarget: () => IElement = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IHtmlEditor = null,
    initLayout: () => Unit = null,
    isLayout: js.UndefOr[Boolean] = js.undefined,
    isValidParent: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit = null,
    labelStrategies: js.Any = null,
    left: js.Any = null,
    mixins: js.Any = null,
    notifyOwner: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    onContentChange: /* child */ js.UndefOr[IComponent] => Boolean = null,
    qtip: js.Any = null,
    renderItems: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    right: js.Any = null,
    self: IClass = null,
    setHeightInDom: js.UndefOr[Boolean] = js.undefined,
    setWidthInDom: js.UndefOr[Boolean] = js.undefined,
    side: js.Any = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    title: js.Any = null,
    top: js.Any = null,
    under: js.Any = null,
    uses: Array = null
  ): IHtmlEditor = {
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
    if (elementId != null) __obj.updateDynamic("elementId")(elementId.asInstanceOf[js.Any])
    if (errorStrategies != null) __obj.updateDynamic("errorStrategies")(errorStrategies.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (finalizeLayout != null) __obj.updateDynamic("finalizeLayout")(js.Any.fromFunction1(finalizeLayout))
    if (finishedLayout != null) __obj.updateDynamic("finishedLayout")(js.Any.fromFunction0(finishedLayout))
    if (getErrorStrategy != null) __obj.updateDynamic("getErrorStrategy")(js.Any.fromFunction0(getErrorStrategy))
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (getItemSizePolicy != null) __obj.updateDynamic("getItemSizePolicy")(js.Any.fromFunction1(getItemSizePolicy))
    if (getLabelStrategy != null) __obj.updateDynamic("getLabelStrategy")(js.Any.fromFunction0(getLabelStrategy))
    if (getLayoutItems != null) __obj.updateDynamic("getLayoutItems")(js.Any.fromFunction0(getLayoutItems))
    if (getRenderTarget != null) __obj.updateDynamic("getRenderTarget")(js.Any.fromFunction0(getRenderTarget))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction0(getTarget))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initLayout != null) __obj.updateDynamic("initLayout")(js.Any.fromFunction0(initLayout))
    if (!js.isUndefined(isLayout)) __obj.updateDynamic("isLayout")(isLayout.asInstanceOf[js.Any])
    if (isValidParent != null) __obj.updateDynamic("isValidParent")(js.Any.fromFunction3(isValidParent))
    if (labelStrategies != null) __obj.updateDynamic("labelStrategies")(labelStrategies.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (notifyOwner != null) __obj.updateDynamic("notifyOwner")(js.Any.fromFunction1(notifyOwner))
    if (onContentChange != null) __obj.updateDynamic("onContentChange")(js.Any.fromFunction1(onContentChange))
    if (qtip != null) __obj.updateDynamic("qtip")(qtip.asInstanceOf[js.Any])
    if (renderItems != null) __obj.updateDynamic("renderItems")(js.Any.fromFunction2(renderItems))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(setHeightInDom)) __obj.updateDynamic("setHeightInDom")(setHeightInDom.asInstanceOf[js.Any])
    if (!js.isUndefined(setWidthInDom)) __obj.updateDynamic("setWidthInDom")(setWidthInDom.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (under != null) __obj.updateDynamic("under")(under.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHtmlEditor]
  }
}

