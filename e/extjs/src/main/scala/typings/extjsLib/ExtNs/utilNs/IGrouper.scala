package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGrouper extends ISorter {
  /** [Method] Returns the value for grouping to be used
  		* @param instance Ext.data.Model The Model instance
  		* @returns String The group string for this model
  		*/
  var getGroupString: js.UndefOr[
    js.Function1[/* instance */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], java.lang.String]
  ] = js.undefined
}

object IGrouper {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    direction: java.lang.String = null,
    extend: java.lang.String = null,
    getGroupString: js.Function1[/* instance */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], java.lang.String] = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], IGrouper] = null,
    mixins: js.Any = null,
    property: java.lang.String = null,
    requires: extjsLib.ExtNs.Array = null,
    root: java.lang.String = null,
    self: extjsLib.ExtNs.IClass = null,
    setDirection: js.Function1[/* direction */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    sorterFn: js.Any = null,
    statics: js.Any = null,
    toggle: js.Function0[scala.Unit] = null,
    transform: js.Any = null,
    updateSortFunction: js.Function1[/* fn */ js.UndefOr[js.Any], scala.Unit] = null,
    uses: extjsLib.ExtNs.Array = null
  ): IGrouper = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getGroupString != null) __obj.updateDynamic("getGroupString")(getGroupString)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (property != null) __obj.updateDynamic("property")(property)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (root != null) __obj.updateDynamic("root")(root)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDirection != null) __obj.updateDynamic("setDirection")(setDirection)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sorterFn != null) __obj.updateDynamic("sorterFn")(sorterFn)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (updateSortFunction != null) __obj.updateDynamic("updateSortFunction")(updateSortFunction)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IGrouper]
  }
}

