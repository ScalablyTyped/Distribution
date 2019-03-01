package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassList
  extends extjsLib.ExtNs.IBase {
  /** [Method] Adds a single class to the class list
  		* @param cls Object
  		*/
  var add: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Adds one or more classes in an array or space delimited string to the class list
  		* @param classes Object
  		*/
  var addMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Removes a single class from the class list
  		* @param cls Object
  		*/
  var remove: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Removes one or more classes in an array or space delimited string from the class list
  		* @param classes Object
  		*/
  var removeMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

object IClassList {
  @scala.inline
  def apply(
    add: js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit] = null,
    addMany: js.Function1[/* classes */ js.UndefOr[js.Any], scala.Unit] = null,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IClassList] = null,
    mixins: js.Any = null,
    remove: js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit] = null,
    removeMany: js.Function1[/* classes */ js.UndefOr[js.Any], scala.Unit] = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): IClassList = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(add)
    if (addMany != null) __obj.updateDynamic("addMany")(addMany)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeMany != null) __obj.updateDynamic("removeMany")(removeMany)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IClassList]
  }
}

