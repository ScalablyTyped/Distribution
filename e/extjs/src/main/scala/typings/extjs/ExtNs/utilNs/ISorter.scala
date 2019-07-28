package typings.extjs.ExtNs.utilNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IBase
import typings.extjs.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISorter extends IBase {
  /** [Config Option] (String) */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var property: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var root: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Set the sorting direction for this sorter
  		* @param direction String The direction to sort in. Should be either 'ASC' or 'DESC'.
  		*/
  var setDirection: js.UndefOr[js.Function1[/* direction */ js.UndefOr[java.lang.String], Unit]] = js.undefined
  /** [Config Option] (Function) */
  var sorterFn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Toggles the sorting direction for this sorter  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Function) */
  var transform: js.UndefOr[js.Any] = js.undefined
  /** [Method] Update the sort function for this sorter
  		* @param fn Function A new sorter function for this sorter. If not specified it will use the default sorting function.
  		*/
  var updateSortFunction: js.UndefOr[js.Function1[/* fn */ js.UndefOr[js.Any], Unit]] = js.undefined
}

object ISorter {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    direction: java.lang.String = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ISorter = null,
    mixins: js.Any = null,
    property: java.lang.String = null,
    requires: Array = null,
    root: java.lang.String = null,
    self: IClass = null,
    setDirection: /* direction */ js.UndefOr[java.lang.String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    sorterFn: js.Any = null,
    statics: js.Any = null,
    toggle: () => Unit = null,
    transform: js.Any = null,
    updateSortFunction: /* fn */ js.UndefOr[js.Any] => Unit = null,
    uses: Array = null
  ): ISorter = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (property != null) __obj.updateDynamic("property")(property)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (root != null) __obj.updateDynamic("root")(root)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setDirection != null) __obj.updateDynamic("setDirection")(js.Any.fromFunction1(setDirection))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (sorterFn != null) __obj.updateDynamic("sorterFn")(sorterFn)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toggle != null) __obj.updateDynamic("toggle")(js.Any.fromFunction0(toggle))
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (updateSortFunction != null) __obj.updateDynamic("updateSortFunction")(js.Any.fromFunction1(updateSortFunction))
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISorter]
  }
}

