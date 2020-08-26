package typings.extjs.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IScatter extends ICartesian {
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var markerConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
}

object IScatter {
  @scala.inline
  def apply(): IScatter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScatter]
  }
  @scala.inline
  implicit class IScatterOps[Self <: IScatter] (val x: Self) extends AnyVal {
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
    def setDrawSeries(value: () => Unit): Self = this.set("drawSeries", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDrawSeries: Self = this.set("drawSeries", js.undefined)
    @scala.inline
    def setMarkerConfig(value: js.Any): Self = this.set("markerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerConfig: Self = this.set("markerConfig", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

