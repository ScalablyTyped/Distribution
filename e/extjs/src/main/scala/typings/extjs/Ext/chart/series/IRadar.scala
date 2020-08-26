package typings.extjs.Ext.chart.series

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadar extends ISeries {
  /** [Method] Draws the series for the current chart  */
  var drawSeries: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var markerConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var showMarkers: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var style: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var xField: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var yField: js.UndefOr[String] = js.native
}

object IRadar {
  @scala.inline
  def apply(): IRadar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadar]
  }
  @scala.inline
  implicit class IRadarOps[Self <: IRadar] (val x: Self) extends AnyVal {
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
    def setShowMarkers(value: Boolean): Self = this.set("showMarkers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowMarkers: Self = this.set("showMarkers", js.undefined)
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setXField(value: String): Self = this.set("xField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXField: Self = this.set("xField", js.undefined)
    @scala.inline
    def setYField(value: String): Self = this.set("yField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYField: Self = this.set("yField", js.undefined)
  }
  
}

