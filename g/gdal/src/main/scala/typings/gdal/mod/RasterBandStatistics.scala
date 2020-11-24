package typings.gdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterBandStatistics extends js.Object {
  
  var max: Double = js.native
  
  var mean: Double = js.native
  
  var min: Double = js.native
  
  var std_dev: Double = js.native
}
object RasterBandStatistics {
  
  @scala.inline
  def apply(max: Double, mean: Double, min: Double, std_dev: Double): RasterBandStatistics = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], std_dev = std_dev.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterBandStatistics]
  }
  
  @scala.inline
  implicit class RasterBandStatisticsOps[Self <: RasterBandStatistics] (val x: Self) extends AnyVal {
    
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMean(value: Double): Self = this.set("mean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStd_dev(value: Double): Self = this.set("std_dev", value.asInstanceOf[js.Any])
  }
}
