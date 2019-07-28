package typings.extjs.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClass extends js.Object {
  /** [Config Option] (String[]) */
  var alias: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String/String[]) */
  var alternateClassName: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var config: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var extend: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object) */
  var inheritableStatics: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String[]/Object) */
  var mixins: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String[]) */
  var requires: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var singleton: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Object) */
  var statics: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String[]) */
  var uses: js.UndefOr[Array] = js.undefined
}

object IClass {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    inheritableStatics: js.Any = null,
    mixins: js.Any = null,
    requires: Array = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): IClass = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IClass]
  }
}

