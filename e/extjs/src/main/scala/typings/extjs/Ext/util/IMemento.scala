package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMemento extends IBase {
  /** [Method] Captures the specified properties from the target object in this memento
  		* @param props String/String[] The property or array of properties to capture.
  		* @param target Object The object from which to capture properties.
  		*/
  var capture: js.UndefOr[
    js.Function2[/* props */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Method] Removes the specified properties from this memento
  		* @param props String/String[] The property or array of properties to remove.
  		*/
  var remove: js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Restores the specified properties from this memento to the target object
  		* @param props String/String[] The property or array of properties to restore.
  		* @param clear Boolean True to remove the restored properties from this memento or false to keep them (default is true).
  		* @param target Object The object to which to restore properties.
  		*/
  var restore: js.UndefOr[
    js.Function3[
      /* props */ js.UndefOr[js.Any], 
      /* clear */ js.UndefOr[Boolean], 
      /* target */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Restores all captured properties in this memento to the target object
  		* @param clear Boolean True to remove the restored properties from this memento or false to keep them (default is true).
  		* @param target Object The object to which to restore properties.
  		*/
  var restoreAll: js.UndefOr[
    js.Function2[/* clear */ js.UndefOr[Boolean], /* target */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Property] (Object) */
  var target: js.UndefOr[js.Any] = js.undefined
}

object IMemento {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    capture: (/* props */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any]) => Unit = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IMemento = null,
    mixins: js.Any = null,
    remove: /* props */ js.UndefOr[js.Any] => Unit = null,
    requires: Array = null,
    restore: (/* props */ js.UndefOr[js.Any], /* clear */ js.UndefOr[Boolean], /* target */ js.UndefOr[js.Any]) => Unit = null,
    restoreAll: (/* clear */ js.UndefOr[Boolean], /* target */ js.UndefOr[js.Any]) => Unit = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    target: js.Any = null,
    uses: Array = null
  ): IMemento = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (capture != null) __obj.updateDynamic("capture")(js.Any.fromFunction2(capture))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (restore != null) __obj.updateDynamic("restore")(js.Any.fromFunction3(restore))
    if (restoreAll != null) __obj.updateDynamic("restoreAll")(js.Any.fromFunction2(restoreAll))
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMemento]
  }
}

