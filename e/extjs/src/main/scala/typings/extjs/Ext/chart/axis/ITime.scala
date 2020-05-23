package typings.extjs.Ext.chart.axis

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.chart.ILabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITime extends INumeric {
  /** [Config Option] (String/Boolean) */
  var dateFormat: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Date) */
  var fromDate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Array) */
  var step: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Date) */
  var toDate: js.UndefOr[js.Any] = js.undefined
}

object ITime {
  @scala.inline
  def apply(
    adjustEnd: js.UndefOr[Boolean] = js.undefined,
    adjustMaximumByMajorUnit: js.UndefOr[Boolean] = js.undefined,
    adjustMinimumByMajorUnit: js.UndefOr[Boolean] = js.undefined,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    constrain: js.UndefOr[Boolean] = js.undefined,
    dashSize: js.UndefOr[Double] = js.undefined,
    dateFormat: js.Any = null,
    decimals: js.UndefOr[Double] = js.undefined,
    drawAxis: /* init */ js.UndefOr[js.Any] => Unit = null,
    drawGrid: () => Unit = null,
    drawLabel: () => Unit = null,
    extend: String = null,
    fields: Array = null,
    fromDate: js.Any = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    grid: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ITime = null,
    label: ILabel = null,
    length: js.UndefOr[Double] = js.undefined,
    majorTickSteps: js.UndefOr[Double] = js.undefined,
    maximum: js.UndefOr[Double] = js.undefined,
    minimum: js.UndefOr[Double] = js.undefined,
    minorTickSteps: js.UndefOr[Double] = js.undefined,
    mixins: js.Any = null,
    position: String = null,
    requires: Array = null,
    self: IClass = null,
    setTitle: /* title */ js.UndefOr[String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    step: Array = null,
    title: String = null,
    toDate: js.Any = null,
    uses: Array = null,
    width: js.UndefOr[Double] = js.undefined
  ): ITime = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustEnd)) __obj.updateDynamic("adjustEnd")(adjustEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustMaximumByMajorUnit)) __obj.updateDynamic("adjustMaximumByMajorUnit")(adjustMaximumByMajorUnit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustMinimumByMajorUnit)) __obj.updateDynamic("adjustMinimumByMajorUnit")(adjustMinimumByMajorUnit.get.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(constrain)) __obj.updateDynamic("constrain")(constrain.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dashSize)) __obj.updateDynamic("dashSize")(dashSize.get.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(decimals)) __obj.updateDynamic("decimals")(decimals.get.asInstanceOf[js.Any])
    if (drawAxis != null) __obj.updateDynamic("drawAxis")(js.Any.fromFunction1(drawAxis))
    if (drawGrid != null) __obj.updateDynamic("drawGrid")(js.Any.fromFunction0(drawGrid))
    if (drawLabel != null) __obj.updateDynamic("drawLabel")(js.Any.fromFunction0(drawLabel))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fromDate != null) __obj.updateDynamic("fromDate")(fromDate.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTickSteps)) __obj.updateDynamic("majorTickSteps")(majorTickSteps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimum)) __obj.updateDynamic("minimum")(minimum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickSteps)) __obj.updateDynamic("minorTickSteps")(minorTickSteps.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (toDate != null) __obj.updateDynamic("toDate")(toDate.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITime]
  }
}

