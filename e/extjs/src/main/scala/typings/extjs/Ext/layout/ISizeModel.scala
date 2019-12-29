package typings.extjs.Ext.layout

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISizeModel extends IBase {
  /** [Property] (Boolean) */
  var auto: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var calculated: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var calculatedFromConfigured: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var calculatedFromNatural: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var calculatedFromShrinkWrap: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var configured: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var constrainedMax: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var constrainedMin: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Boolean) */
  var fixed: js.UndefOr[Boolean] = js.undefined
  /** [Property] (String) */
  var name: js.UndefOr[String] = js.undefined
  /** [Property] (Object) */
  var names: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Boolean) */
  var natural: js.UndefOr[Boolean] = js.undefined
  /** [Property] (Number) */
  var ordinal: js.UndefOr[Double] = js.undefined
  /** [Property] (Object[]) */
  var pairsByHeightOrdinal: js.UndefOr[Array] = js.undefined
  /** [Property] (Boolean) */
  var shrinkWrap: js.UndefOr[Boolean] = js.undefined
}

object ISizeModel {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    auto: js.UndefOr[Boolean] = js.undefined,
    calculated: js.UndefOr[Boolean] = js.undefined,
    calculatedFromConfigured: js.UndefOr[Boolean] = js.undefined,
    calculatedFromNatural: js.UndefOr[Boolean] = js.undefined,
    calculatedFromShrinkWrap: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    configured: js.UndefOr[Boolean] = js.undefined,
    constrainedMax: js.UndefOr[Boolean] = js.undefined,
    constrainedMin: js.UndefOr[Boolean] = js.undefined,
    extend: String = null,
    fixed: js.UndefOr[Boolean] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ISizeModel = null,
    mixins: js.Any = null,
    name: String = null,
    names: js.Any = null,
    natural: js.UndefOr[Boolean] = js.undefined,
    ordinal: Int | Double = null,
    pairsByHeightOrdinal: Array = null,
    requires: Array = null,
    self: IClass = null,
    shrinkWrap: js.UndefOr[Boolean] = js.undefined,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    uses: Array = null
  ): ISizeModel = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (!js.isUndefined(calculated)) __obj.updateDynamic("calculated")(calculated.asInstanceOf[js.Any])
    if (!js.isUndefined(calculatedFromConfigured)) __obj.updateDynamic("calculatedFromConfigured")(calculatedFromConfigured.asInstanceOf[js.Any])
    if (!js.isUndefined(calculatedFromNatural)) __obj.updateDynamic("calculatedFromNatural")(calculatedFromNatural.asInstanceOf[js.Any])
    if (!js.isUndefined(calculatedFromShrinkWrap)) __obj.updateDynamic("calculatedFromShrinkWrap")(calculatedFromShrinkWrap.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(configured)) __obj.updateDynamic("configured")(configured.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainedMax)) __obj.updateDynamic("constrainedMax")(constrainedMax.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainedMin)) __obj.updateDynamic("constrainedMin")(constrainedMin.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (names != null) __obj.updateDynamic("names")(names.asInstanceOf[js.Any])
    if (!js.isUndefined(natural)) __obj.updateDynamic("natural")(natural.asInstanceOf[js.Any])
    if (ordinal != null) __obj.updateDynamic("ordinal")(ordinal.asInstanceOf[js.Any])
    if (pairsByHeightOrdinal != null) __obj.updateDynamic("pairsByHeightOrdinal")(pairsByHeightOrdinal.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (!js.isUndefined(shrinkWrap)) __obj.updateDynamic("shrinkWrap")(shrinkWrap.asInstanceOf[js.Any])
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISizeModel]
  }
}

