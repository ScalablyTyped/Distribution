package typings
package extjsLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILegend
  extends extjsLib.ExtNs.IBase {
  /** [Config Option] (String) */
  var boxFill: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var boxStroke: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var boxStrokeWidth: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var boxZIndex: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Boolean) */
  var isVertical: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var itemSpacing: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var labelColor: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var labelFont: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] toggle
  		* @param show Boolean Whether to show or hide the legend.
  		*/
  var toggle: js.UndefOr[js.Function1[/* show */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var update: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ILegend {
  @scala.inline
  def apply(
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    boxFill: java.lang.String = null,
    boxStroke: java.lang.String = null,
    boxStrokeWidth: java.lang.String = null,
    boxZIndex: scala.Int | scala.Double = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    extend: java.lang.String = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ILegend] = null,
    isVertical: js.UndefOr[scala.Boolean] = js.undefined,
    itemSpacing: scala.Int | scala.Double = null,
    labelColor: java.lang.String = null,
    labelFont: java.lang.String = null,
    mixins: js.Any = null,
    padding: scala.Int | scala.Double = null,
    position: java.lang.String = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    toggle: js.Function1[/* show */ js.UndefOr[scala.Boolean], scala.Unit] = null,
    update: js.UndefOr[scala.Boolean] = js.undefined,
    uses: extjsLib.ExtNs.Array = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): ILegend = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (boxFill != null) __obj.updateDynamic("boxFill")(boxFill)
    if (boxStroke != null) __obj.updateDynamic("boxStroke")(boxStroke)
    if (boxStrokeWidth != null) __obj.updateDynamic("boxStrokeWidth")(boxStrokeWidth)
    if (boxZIndex != null) __obj.updateDynamic("boxZIndex")(boxZIndex.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (!js.isUndefined(isVertical)) __obj.updateDynamic("isVertical")(isVertical)
    if (itemSpacing != null) __obj.updateDynamic("itemSpacing")(itemSpacing.asInstanceOf[js.Any])
    if (labelColor != null) __obj.updateDynamic("labelColor")(labelColor)
    if (labelFont != null) __obj.updateDynamic("labelFont")(labelFont)
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (!js.isUndefined(update)) __obj.updateDynamic("update")(update)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILegend]
  }
}

