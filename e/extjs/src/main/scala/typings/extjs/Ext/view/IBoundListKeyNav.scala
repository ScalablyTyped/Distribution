package typings.extjs.Ext.view

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBoundListKeyNav
  extends typings.extjs.Ext.util.IKeyNav {
  /** [Config Option] (Ext.view.BoundList) */
  var boundList: js.UndefOr[typings.extjs.Ext.view.IBoundList] = js.undefined
  /** [Method] Highlights the item at the given index
  		* @param index Number
  		*/
  var highlightAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Triggers selection of the currently highlighted item according to the behavior of the configured SelectionModel
  		* @param e Object
  		*/
  var selectHighlighted: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object IBoundListKeyNav {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    boundList: typings.extjs.Ext.view.IBoundList = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    defaultEventAction: java.lang.String = null,
    destroy: /* removeEl */ js.UndefOr[Boolean] => Unit = null,
    disable: () => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enable: () => Unit = null,
    eventName: java.lang.String = null,
    extend: java.lang.String = null,
    forceKeyDown: js.UndefOr[Boolean] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    highlightAt: /* index */ js.UndefOr[Double] => Unit = null,
    ignoreInputFields: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IBoundListKeyNav = null,
    keyMap: typings.extjs.Ext.util.IKeyMap = null,
    mixins: js.Any = null,
    processEvent: js.Any = null,
    processEventScope: js.Any = null,
    requires: Array = null,
    selectHighlighted: /* e */ js.UndefOr[js.Any] => Unit = null,
    self: IClass = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    target: js.Any = null,
    uses: Array = null
  ): IBoundListKeyNav = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (boundList != null) __obj.updateDynamic("boundList")(boundList)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaultEventAction != null) __obj.updateDynamic("defaultEventAction")(defaultEventAction)
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (eventName != null) __obj.updateDynamic("eventName")(eventName)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (!js.isUndefined(forceKeyDown)) __obj.updateDynamic("forceKeyDown")(forceKeyDown)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (highlightAt != null) __obj.updateDynamic("highlightAt")(js.Any.fromFunction1(highlightAt))
    if (!js.isUndefined(ignoreInputFields)) __obj.updateDynamic("ignoreInputFields")(ignoreInputFields)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (processEvent != null) __obj.updateDynamic("processEvent")(processEvent)
    if (processEventScope != null) __obj.updateDynamic("processEventScope")(processEventScope)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (selectHighlighted != null) __obj.updateDynamic("selectHighlighted")(js.Any.fromFunction1(selectHighlighted))
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1(setDisabled))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (target != null) __obj.updateDynamic("target")(target)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBoundListKeyNav]
  }
}

