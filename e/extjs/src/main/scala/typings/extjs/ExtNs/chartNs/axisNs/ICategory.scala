package typings.extjs.ExtNs.chartNs.axisNs

import typings.extjs.ExtNs.Array
import typings.extjs.ExtNs.IClass
import typings.extjs.ExtNs.chartNs.ILabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICategory
  extends typings.extjs.ExtNs.chartNs.axisNs.IAxis {
  /** [Config Option] (Boolean) */
  var calculateCategoryCount: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var categoryNames: js.UndefOr[java.lang.String] = js.undefined
}

object ICategory {
  @scala.inline
  def apply(
    adjustEnd: js.UndefOr[Boolean] = js.undefined,
    alias: Array = null,
    alternateClassName: js.Any = null,
    calculateCategoryCount: js.UndefOr[Boolean] = js.undefined,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    categoryNames: java.lang.String = null,
    config: js.Any = null,
    dashSize: Int | Double = null,
    drawAxis: /* init */ js.UndefOr[js.Any] => Unit = null,
    drawGrid: () => Unit = null,
    drawLabel: () => Unit = null,
    extend: java.lang.String = null,
    fields: Array = null,
    getInitialConfig: /* name */ js.UndefOr[java.lang.String] => _ = null,
    grid: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => ICategory = null,
    label: ILabel = null,
    length: Int | Double = null,
    majorTickSteps: Int | Double = null,
    minorTickSteps: Int | Double = null,
    mixins: js.Any = null,
    position: java.lang.String = null,
    requires: Array = null,
    self: IClass = null,
    setTitle: /* title */ js.UndefOr[java.lang.String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    title: java.lang.String = null,
    uses: Array = null,
    width: Int | Double = null
  ): ICategory = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustEnd)) __obj.updateDynamic("adjustEnd")(adjustEnd)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName)
    if (!js.isUndefined(calculateCategoryCount)) __obj.updateDynamic("calculateCategoryCount")(calculateCategoryCount)
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (categoryNames != null) __obj.updateDynamic("categoryNames")(categoryNames)
    if (config != null) __obj.updateDynamic("config")(config)
    if (dashSize != null) __obj.updateDynamic("dashSize")(dashSize.asInstanceOf[js.Any])
    if (drawAxis != null) __obj.updateDynamic("drawAxis")(js.Any.fromFunction1(drawAxis))
    if (drawGrid != null) __obj.updateDynamic("drawGrid")(js.Any.fromFunction0(drawGrid))
    if (drawLabel != null) __obj.updateDynamic("drawLabel")(js.Any.fromFunction0(drawLabel))
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics)
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (label != null) __obj.updateDynamic("label")(label)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (majorTickSteps != null) __obj.updateDynamic("majorTickSteps")(majorTickSteps.asInstanceOf[js.Any])
    if (minorTickSteps != null) __obj.updateDynamic("minorTickSteps")(minorTickSteps.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins)
    if (position != null) __obj.updateDynamic("position")(position)
    if (requires != null) __obj.updateDynamic("requires")(requires)
    if (self != null) __obj.updateDynamic("self")(self)
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton)
    if (statics != null) __obj.updateDynamic("statics")(statics)
    if (title != null) __obj.updateDynamic("title")(title)
    if (uses != null) __obj.updateDynamic("uses")(uses)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICategory]
  }
}

