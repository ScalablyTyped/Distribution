package typings.extjs.Ext.layout.component

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.IElement
import typings.extjs.Ext.layout.IContextItem
import typings.extjs.Ext.layout.ISizePolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButton extends IAuto {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IButton: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Object
  		*/
  @JSName("beginLayout")
  var beginLayout_IButton: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IButton {
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
    configureItem: /* item */ js.UndefOr[typings.extjs.Ext.IComponent] => Unit = null,
    destroy: () => Unit = null,
    done: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    finalizeLayout: /* ownerContext */ js.UndefOr[IContextItem] => Unit = null,
    finishedLayout: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    getItemSizePolicy: /* item */ js.UndefOr[typings.extjs.Ext.IComponent] => ISizePolicy = null,
    getLayoutItems: () => Unit = null,
    getRenderTarget: () => IElement = null,
    getTarget: () => IElement = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IButton = null,
    initLayout: () => Unit = null,
    isLayout: js.UndefOr[Boolean] = js.undefined,
    isValidParent: (/* item */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit = null,
    mixins: js.Any = null,
    notifyOwner: /* ownerContext */ js.UndefOr[js.Any] => Unit = null,
    onContentChange: /* child */ js.UndefOr[typings.extjs.Ext.IComponent] => Boolean = null,
    renderItems: (/* items */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit = null,
    requires: Array = null,
    self: IClass = null,
    setHeightInDom: js.UndefOr[Boolean] = js.undefined,
    setWidthInDom: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IButton = {
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
    if (getRenderTarget != null) __obj.updateDynamic("getRenderTarget")(js.Any.fromFunction0(getRenderTarget))
    if (getTarget != null) __obj.updateDynamic("getTarget")(js.Any.fromFunction0(getTarget))
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
    if (!js.isUndefined(setHeightInDom)) __obj.updateDynamic("setHeightInDom")(setHeightInDom.asInstanceOf[js.Any])
    if (!js.isUndefined(setWidthInDom)) __obj.updateDynamic("setWidthInDom")(setWidthInDom.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButton]
  }
}

