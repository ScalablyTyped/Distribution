package typings
package extjsLib.ExtNs.viewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBoundListKeyNav
  extends extjsLib.ExtNs.utilNs.IKeyNav {
  /** [Config Option] (Ext.view.BoundList) */
  var boundList: js.UndefOr[IBoundList] = js.undefined
  /** [Method] Highlights the item at the given index
  		* @param index Number
  		*/
  var highlightAt: js.UndefOr[js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Triggers selection of the currently highlighted item according to the behavior of the configured SelectionModel
  		* @param e Object
  		*/
  var selectHighlighted: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IBoundListKeyNav {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    boundList: IBoundList = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    defaultEventAction: java.lang.String = null,
    destroy: js.Function1[/* removeEl */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    disable: js.Function0[scala.Unit] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    enable: js.Function0[scala.Unit] = null,
    eventName: java.lang.String = null,
    extend: java.lang.String = null,
    forceKeyDown: js.UndefOr[scala.Boolean] = js.undefined,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    highlightAt: js.Function1[/* index */ js.UndefOr[scala.Double], scala.Unit] = null,
    ignoreInputFields: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IBoundListKeyNav] = null,
    keyMap: extjsLib.ExtNs.utilNs.IKeyMap = null,
    mixins: js.Any = null,
    processEvent: js.Any = null,
    processEventScope: js.Any = null,
    requires: extjsLib.ExtNs.Array = null,
    selectHighlighted: js.Function1[/* e */ js.UndefOr[js.Any], scala.Unit] = null,
    self: extjsLib.ExtNs.IClass = null,
    setDisabled: js.Function1[/* disabled */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    target: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IBoundListKeyNav = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (boundList != null) __obj.updateDynamic("boundList")(boundList)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (defaultEventAction != null) __obj.updateDynamic("defaultEventAction")(defaultEventAction)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (disable != null) __obj.updateDynamic("disable")(disable)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (enable != null) __obj.updateDynamic("enable")(enable)
    if (eventName != null) __obj.updateDynamic("eventName")(eventName)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (!js.isUndefined(forceKeyDown)) __obj.updateDynamic("forceKeyDown")(forceKeyDown)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (highlightAt != null) __obj.updateDynamic("highlightAt")(highlightAt)
    if (!js.isUndefined(ignoreInputFields)) __obj.updateDynamic("ignoreInputFields")(ignoreInputFields)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (processEvent != null) __obj.updateDynamic("processEvent")(processEvent)
    if (processEventScope != null) __obj.updateDynamic("processEventScope")(processEventScope)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (selectHighlighted != null) __obj.updateDynamic("selectHighlighted")(selectHighlighted)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(setDisabled)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (target != null) __obj.updateDynamic("target")(target)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IBoundListKeyNav]
  }
}

