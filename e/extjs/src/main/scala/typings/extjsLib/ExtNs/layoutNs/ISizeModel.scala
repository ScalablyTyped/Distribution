package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISizeModel
  extends extjsLib.ExtNs.IBase {
  /** [Property] (Boolean) */
  var auto: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var calculated: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var calculatedFromConfigured: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var calculatedFromNatural: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var calculatedFromShrinkWrap: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var configured: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var constrainedMax: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var constrainedMin: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Boolean) */
  var fixed: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (String) */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** [Property] (Object) */
  var names: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var natural: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (Number) */
  var ordinal: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Object[]) */
  var pairsByHeightOrdinal: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Property] (Boolean) */
  var shrinkWrap: js.UndefOr[scala.Boolean] = js.undefined
}

object ISizeModel {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    auto: js.UndefOr[scala.Boolean] = js.undefined,
    calculated: js.UndefOr[scala.Boolean] = js.undefined,
    calculatedFromConfigured: js.UndefOr[scala.Boolean] = js.undefined,
    calculatedFromNatural: js.UndefOr[scala.Boolean] = js.undefined,
    calculatedFromShrinkWrap: js.UndefOr[scala.Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    configured: js.UndefOr[scala.Boolean] = js.undefined,
    constrainedMax: js.UndefOr[scala.Boolean] = js.undefined,
    constrainedMin: js.UndefOr[scala.Boolean] = js.undefined,
    extend: java.lang.String = null,
    fixed: js.UndefOr[scala.Boolean] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ISizeModel = null,
    mixins: js.Any = null,
    name: java.lang.String = null,
    names: js.Any = null,
    natural: js.UndefOr[scala.Boolean] = js.undefined,
    ordinal: scala.Int | scala.Double = null,
    pairsByHeightOrdinal: extjsLib.ExtNs.Array = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    shrinkWrap: js.UndefOr[scala.Boolean] = js.undefined,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    uses: extjsLib.ExtNs.Array = null
  ): ISizeModel = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto)
    if (!js.isUndefined(calculated)) __obj.updateDynamic("calculated")(calculated)
    if (!js.isUndefined(calculatedFromConfigured)) __obj.updateDynamic("calculatedFromConfigured")(calculatedFromConfigured)
    if (!js.isUndefined(calculatedFromNatural)) __obj.updateDynamic("calculatedFromNatural")(calculatedFromNatural)
    if (!js.isUndefined(calculatedFromShrinkWrap)) __obj.updateDynamic("calculatedFromShrinkWrap")(calculatedFromShrinkWrap)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(configured)) __obj.updateDynamic("configured")(configured)
    if (!js.isUndefined(constrainedMax)) __obj.updateDynamic("constrainedMax")(constrainedMax)
    if (!js.isUndefined(constrainedMin)) __obj.updateDynamic("constrainedMin")(constrainedMin)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (name != null) __obj.updateDynamic("name")(name)
    if (names != null) __obj.updateDynamic("names")(names)
    if (!js.isUndefined(natural)) __obj.updateDynamic("natural")(natural)
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (pairsByHeightOrdinal != null) __obj.updateDynamic("pairsByHeightOrdinal")(pairsByHeightOrdinal)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(shrinkWrap)) __obj.updateDynamic("shrinkWrap")(shrinkWrap)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[ISizeModel]
  }
}

