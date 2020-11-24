package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GaugeChartOptions extends js.Object {
  
  var animation: js.UndefOr[TransitionAnimation] = js.native
  
  var forceIFrame: js.UndefOr[Boolean] = js.native
  
  var greenColor: js.UndefOr[String] = js.native
  
  var greenFrom: js.UndefOr[Double] = js.native
  
  var greenTo: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var majorTicks: js.UndefOr[js.Array[String]] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var minorTicks: js.UndefOr[Double] = js.native
  
  var redColor: js.UndefOr[String] = js.native
  
  var redFrom: js.UndefOr[Double] = js.native
  
  var redTo: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var yellowColor: js.UndefOr[String] = js.native
  
  var yellowFrom: js.UndefOr[Double] = js.native
  
  var yellowTo: js.UndefOr[Double] = js.native
}
object GaugeChartOptions {
  
  @scala.inline
  def apply(): GaugeChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeChartOptions]
  }
  
  @scala.inline
  implicit class GaugeChartOptionsOps[Self <: GaugeChartOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimation(value: TransitionAnimation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setForceIFrame(value: Boolean): Self = this.set("forceIFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceIFrame: Self = this.set("forceIFrame", js.undefined)
    
    @scala.inline
    def setGreenColor(value: String): Self = this.set("greenColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenColor: Self = this.set("greenColor", js.undefined)
    
    @scala.inline
    def setGreenFrom(value: Double): Self = this.set("greenFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenFrom: Self = this.set("greenFrom", js.undefined)
    
    @scala.inline
    def setGreenTo(value: Double): Self = this.set("greenTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreenTo: Self = this.set("greenTo", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMajorTicksVarargs(value: String*): Self = this.set("majorTicks", js.Array(value :_*))
    
    @scala.inline
    def setMajorTicks(value: js.Array[String]): Self = this.set("majorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMajorTicks: Self = this.set("majorTicks", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinorTicks(value: Double): Self = this.set("minorTicks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinorTicks: Self = this.set("minorTicks", js.undefined)
    
    @scala.inline
    def setRedColor(value: String): Self = this.set("redColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedColor: Self = this.set("redColor", js.undefined)
    
    @scala.inline
    def setRedFrom(value: Double): Self = this.set("redFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedFrom: Self = this.set("redFrom", js.undefined)
    
    @scala.inline
    def setRedTo(value: Double): Self = this.set("redTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedTo: Self = this.set("redTo", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setYellowColor(value: String): Self = this.set("yellowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYellowColor: Self = this.set("yellowColor", js.undefined)
    
    @scala.inline
    def setYellowFrom(value: Double): Self = this.set("yellowFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYellowFrom: Self = this.set("yellowFrom", js.undefined)
    
    @scala.inline
    def setYellowTo(value: Double): Self = this.set("yellowTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYellowTo: Self = this.set("yellowTo", js.undefined)
  }
}
