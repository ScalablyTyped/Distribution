package typings.extjs.Ext.chart.axis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAxis extends IAbstract {
  /** [Config Option] (Boolean) */
  var adjustEnd: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var dashSize: js.UndefOr[Double] = js.native
  /** [Method] Renders the axis into the screen and updates its position
    * @param init Object
    */
  var drawAxis: js.UndefOr[js.Function1[/* init */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Renders an horizontal and or vertical grid into the Surface  */
  var drawGrid: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Renders the labels in the axes  */
  var drawLabel: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean/Object) */
  var grid: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var hidden: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var length: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var majorTickSteps: js.UndefOr[Double] = js.native
  /** [Config Option] (Number) */
  var minorTickSteps: js.UndefOr[Double] = js.native
  /** [Config Option] (String) */
  var position: js.UndefOr[String] = js.native
  /** [Method] Updates the title of this axis
    * @param title String
    */
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], Unit]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Config Option] (Number) */
  var width: js.UndefOr[Double] = js.native
}

object IAxis {
  @scala.inline
  def apply(): IAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAxis]
  }
  @scala.inline
  implicit class IAxisOps[Self <: IAxis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdjustEnd(value: Boolean): Self = this.set("adjustEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustEnd: Self = this.set("adjustEnd", js.undefined)
    @scala.inline
    def setDashSize(value: Double): Self = this.set("dashSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDashSize: Self = this.set("dashSize", js.undefined)
    @scala.inline
    def setDrawAxis(value: /* init */ js.UndefOr[js.Any] => Unit): Self = this.set("drawAxis", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDrawAxis: Self = this.set("drawAxis", js.undefined)
    @scala.inline
    def setDrawGrid(value: () => Unit): Self = this.set("drawGrid", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDrawGrid: Self = this.set("drawGrid", js.undefined)
    @scala.inline
    def setDrawLabel(value: () => Unit): Self = this.set("drawLabel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDrawLabel: Self = this.set("drawLabel", js.undefined)
    @scala.inline
    def setGrid(value: js.Any): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setMajorTickSteps(value: Double): Self = this.set("majorTickSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajorTickSteps: Self = this.set("majorTickSteps", js.undefined)
    @scala.inline
    def setMinorTickSteps(value: Double): Self = this.set("minorTickSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinorTickSteps: Self = this.set("minorTickSteps", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setSetTitle(value: /* title */ js.UndefOr[String] => Unit): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetTitle: Self = this.set("setTitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

