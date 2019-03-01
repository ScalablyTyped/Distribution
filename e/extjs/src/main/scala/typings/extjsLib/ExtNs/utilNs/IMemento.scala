package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMemento
  extends extjsLib.ExtNs.IBase {
  /** [Method] Captures the specified properties from the target object in this memento
  		* @param props String/String[] The property or array of properties to capture.
  		* @param target Object The object from which to capture properties.
  		*/
  var capture: js.UndefOr[
    js.Function2[/* props */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Removes the specified properties from this memento
  		* @param props String/String[] The property or array of properties to remove.
  		*/
  var remove: js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Restores the specified properties from this memento to the target object
  		* @param props String/String[] The property or array of properties to restore.
  		* @param clear Boolean True to remove the restored properties from this memento or false to keep them (default is true).
  		* @param target Object The object to which to restore properties.
  		*/
  var restore: js.UndefOr[
    js.Function3[
      /* props */ js.UndefOr[js.Any], 
      /* clear */ js.UndefOr[scala.Boolean], 
      /* target */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Restores all captured properties in this memento to the target object
  		* @param clear Boolean True to remove the restored properties from this memento or false to keep them (default is true).
  		* @param target Object The object to which to restore properties.
  		*/
  var restoreAll: js.UndefOr[
    js.Function2[/* clear */ js.UndefOr[scala.Boolean], /* target */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Property] (Object) */
  var target: js.UndefOr[js.Any] = js.undefined
}

object IMemento {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    capture: js.Function2[/* props */ js.UndefOr[js.Any], /* target */ js.UndefOr[js.Any], scala.Unit] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IMemento] = null,
    mixins: js.Any = null,
    remove: js.Function1[/* props */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    restore: js.Function3[
      /* props */ js.UndefOr[js.Any], 
      /* clear */ js.UndefOr[scala.Boolean], 
      /* target */ js.UndefOr[js.Any], 
      scala.Unit
    ] = null,
    restoreAll: js.Function2[/* clear */ js.UndefOr[scala.Boolean], /* target */ js.UndefOr[js.Any], scala.Unit] = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    target: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IMemento = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (capture != null) __obj.updateDynamic("capture")(capture)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (restore != null) __obj.updateDynamic("restore")(restore)
    if (restoreAll != null) __obj.updateDynamic("restoreAll")(restoreAll)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (target != null) __obj.updateDynamic("target")(target)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IMemento]
  }
}

