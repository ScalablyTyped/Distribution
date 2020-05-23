package typings.extjs.Ext.chart.axis

import typings.extjs.Ext.Array
import typings.extjs.Ext.IClass
import typings.extjs.Ext.chart.ILabel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxis extends IAbstract {
  /** [Config Option] (Boolean) */
  var adjustEnd: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var dashSize: js.UndefOr[Double] = js.undefined
  /** [Method] Renders the axis into the screen and updates its position
    * @param init Object
    */
  var drawAxis: js.UndefOr[js.Function1[/* init */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Method] Renders an horizontal and or vertical grid into the Surface  */
  var drawGrid: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Method] Renders the labels in the axes  */
  var drawLabel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean/Object) */
  var grid: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var length: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var majorTickSteps: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var minorTickSteps: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.undefined
  /** [Method] Updates the title of this axis
    * @param title String
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.undefined
}

object IAxis {
  @scala.inline
  def apply(
    adjustEnd: js.UndefOr[Boolean] = js.undefined,
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    dashSize: js.UndefOr[Double] = js.undefined,
    drawAxis: /* init */ js.UndefOr[js.Any] => Unit = null,
    drawGrid: () => Unit = null,
    drawLabel: () => Unit = null,
    extend: String = null,
    fields: Array = null,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    grid: js.Any = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IAxis = null,
    label: ILabel = null,
    length: js.UndefOr[Double] = js.undefined,
    majorTickSteps: js.UndefOr[Double] = js.undefined,
    minorTickSteps: js.UndefOr[Double] = js.undefined,
    mixins: js.Any = null,
    position: String = null,
    requires: Array = null,
    self: IClass = null,
    setTitle: /* title */ js.UndefOr[String] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    title: String = null,
    uses: Array = null,
    width: js.UndefOr[Double] = js.undefined
  ): IAxis = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustEnd)) __obj.updateDynamic("adjustEnd")(adjustEnd.get.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (!js.isUndefined(dashSize)) __obj.updateDynamic("dashSize")(dashSize.get.asInstanceOf[js.Any])
    if (drawAxis != null) __obj.updateDynamic("drawAxis")(js.Any.fromFunction1(drawAxis))
    if (drawGrid != null) __obj.updateDynamic("drawGrid")(js.Any.fromFunction0(drawGrid))
    if (drawLabel != null) __obj.updateDynamic("drawLabel")(js.Any.fromFunction0(drawLabel))
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(majorTickSteps)) __obj.updateDynamic("majorTickSteps")(majorTickSteps.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minorTickSteps)) __obj.updateDynamic("minorTickSteps")(minorTickSteps.get.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setTitle != null) __obj.updateDynamic("setTitle")(js.Any.fromFunction1(setTitle))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.get.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxis]
  }
}

