package typings.extjs.ExtNs.sliderNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IBase
import typings.extjs.ExtNs.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThumb extends IBase {
  /** [Config Option] (Boolean) */
  var constrain: js.UndefOr[Boolean] = js.undefined
  /** [Method] Disables the thumb if it is currently enabled */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Enables the thumb if it is currently disabled */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Sets up an Ext dd DragTracker for this thumb */
  var initEvents: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Renders the thumb into a slider */
  var render: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Ext.slider.MultiSlider) */
  var slider: js.UndefOr[IMultiSlider] = js.undefined
}

object IThumb {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    constrain: js.UndefOr[Boolean] = js.undefined,
    disable: () => Unit = null,
    enable: () => Unit = null,
    extend: java.lang.String = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IThumb = null,
    initEvents: () => Unit = null,
    mixins: js.Any = null,
    render: () => Unit = null,
    requires: Array = null,
    self: IClass = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    slider: IMultiSlider = null,
    statics: js.Any = null,
    uses: Array = null
  ): IThumb = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain)
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (initEvents != null) __obj.updateDynamic("initEvents")(js.Any.fromFunction0(initEvents))
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction0(render))
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (slider != null) __obj.updateDynamic("slider")(slider)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    __obj.asInstanceOf[IThumb]
  }
}

