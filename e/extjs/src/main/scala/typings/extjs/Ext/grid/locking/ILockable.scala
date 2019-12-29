package typings.extjs.Ext.grid.locking

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockable extends IBase {
  /** [Config Option] (Object) */
  var lockedGridConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var lockedViewConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var normalGridConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var normalViewConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Number) */
  var scrollDelta: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var subGridXType: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var syncRowHeight: js.UndefOr[Boolean] = js.undefined
  /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
  var syncRowHeights: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object ILockable {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    extend: String = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ILockable = null,
    lockedGridConfig: js.Any = null,
    lockedViewConfig: js.Any = null,
    mixins: js.Any = null,
    normalGridConfig: js.Any = null,
    normalViewConfig: js.Any = null,
    requires: Array = null,
    scrollDelta: Int | Double = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    subGridXType: String = null,
    syncRowHeight: js.UndefOr[Boolean] = js.undefined,
    syncRowHeights: () => Unit = null,
    uses: Array = null
  ): ILockable = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (lockedGridConfig != null) __obj.updateDynamic("lockedGridConfig")(lockedGridConfig.asInstanceOf[js.Any])
    if (lockedViewConfig != null) __obj.updateDynamic("lockedViewConfig")(lockedViewConfig.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (normalGridConfig != null) __obj.updateDynamic("normalGridConfig")(normalGridConfig.asInstanceOf[js.Any])
    if (normalViewConfig != null) __obj.updateDynamic("normalViewConfig")(normalViewConfig.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (scrollDelta != null) __obj.updateDynamic("scrollDelta")(scrollDelta.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (subGridXType != null) __obj.updateDynamic("subGridXType")(subGridXType.asInstanceOf[js.Any])
    if (!js.isUndefined(syncRowHeight)) __obj.updateDynamic("syncRowHeight")(syncRowHeight.asInstanceOf[js.Any])
    if (syncRowHeights != null) __obj.updateDynamic("syncRowHeights")(js.Any.fromFunction0(syncRowHeights))
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockable]
  }
}

