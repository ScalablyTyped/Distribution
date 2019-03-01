package typings
package extjsLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeAxis
  extends extjsLib.ExtNs.chartNs.axisNs.INumeric {
  /** [Config Option] (String/Boolean) */
  var dateFormat: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Date) */
  var fromDate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Array) */
  var step: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Date) */
  var toDate: js.UndefOr[js.Any] = js.undefined
}

object ITimeAxis {
  @scala.inline
  def apply(
    adjustEnd: js.UndefOr[scala.Boolean] = js.undefined,
    adjustMaximumByMajorUnit: js.UndefOr[scala.Boolean] = js.undefined,
    adjustMinimumByMajorUnit: js.UndefOr[scala.Boolean] = js.undefined,
    alias: extjsLib.ExtNs.Array = null,
    alternateClassName: js.Any = null,
    callOverridden: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callParent: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    callSuper: js.Function1[/* args */ js.UndefOr[js.Any], _] = null,
    config: js.Any = null,
    constrain: js.UndefOr[scala.Boolean] = js.undefined,
    dashSize: scala.Int | scala.Double = null,
    dateFormat: js.Any = null,
    decimals: scala.Int | scala.Double = null,
    drawAxis: js.Function1[/* init */ js.UndefOr[js.Any], scala.Unit] = null,
    drawGrid: js.Function0[scala.Unit] = null,
    drawLabel: js.Function0[scala.Unit] = null,
    extend: java.lang.String = null,
    fields: extjsLib.ExtNs.Array = null,
    fromDate: js.Any = null,
    getInitialConfig: js.Function1[/* name */ js.UndefOr[java.lang.String], _] = null,
    grid: js.Any = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: js.Function1[/* config */ js.UndefOr[js.Any], ITimeAxis] = null,
    label: ILabel = null,
    length: scala.Int | scala.Double = null,
    majorTickSteps: scala.Int | scala.Double = null,
    maximum: scala.Int | scala.Double = null,
    minimum: scala.Int | scala.Double = null,
    minorTickSteps: scala.Int | scala.Double = null,
    mixins: js.Any = null,
    position: java.lang.String = null,
    requires: extjsLib.ExtNs.Array = null,
    self: extjsLib.ExtNs.IClass = null,
    setTitle: js.Function1[/* title */ js.UndefOr[java.lang.String], scala.Unit] = null,
    singleton: js.UndefOr[scala.Boolean] = js.undefined,
    statics: js.Any = null,
    step: extjsLib.ExtNs.Array = null,
    title: java.lang.String = null,
    toDate: js.Any = null,
    uses: extjsLib.ExtNs.Array = null,
    width: scala.Int | scala.Double = null
  ): ITimeAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustEnd)) __obj.updateDynamic("adjustEnd")(adjustEnd)
    if (!js.isUndefined(adjustMaximumByMajorUnit)) __obj.updateDynamic("adjustMaximumByMajorUnit")(adjustMaximumByMajorUnit)
    if (!js.isUndefined(adjustMinimumByMajorUnit)) __obj.updateDynamic("adjustMinimumByMajorUnit")(adjustMinimumByMajorUnit)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(callOverridden)
    if (callParent != null) __obj.updateDynamic("callParent")(callParent)
    if (callSuper != null) __obj.updateDynamic("callSuper")(callSuper)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain)
    if (dashSize != null) __obj.updateDynamic("dashSize")(dashSize.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat)
    if (decimals != null) __obj.updateDynamic("decimals")(decimals.asInstanceOf[js.Any])
    if (drawAxis != null) __obj.updateDynamic("drawAxis")(drawAxis)
    if (drawGrid != null) __obj.updateDynamic("drawGrid")(drawGrid)
    if (drawLabel != null) __obj.updateDynamic("drawLabel")(drawLabel)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (fromDate != null) __obj.updateDynamic("fromDate")(fromDate)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(getInitialConfig)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(initConfig)
    if (label != null) __obj.updateDynamic("label")(label)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (majorTickSteps != null) __obj.updateDynamic("majorTickSteps")(majorTickSteps.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (minimum != null) __obj.updateDynamic("minimum")(minimum.asInstanceOf[js.Any])
    if (minorTickSteps != null) __obj.updateDynamic("minorTickSteps")(minorTickSteps.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (position != null) __obj.updateDynamic("position")(position)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setTitle != null) __obj.updateDynamic("setTitle")(setTitle)
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (step != null) __obj.updateDynamic("step")(step)
    if (title != null) __obj.updateDynamic("title")(title)
    if (toDate != null) __obj.updateDynamic("toDate")(toDate)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeAxis]
  }
}

