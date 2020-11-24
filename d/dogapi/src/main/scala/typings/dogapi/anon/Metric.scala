package typings.dogapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metric extends js.Object {
  
  var metric: String = js.native
  
  var metric_type: js.UndefOr[String] = js.native
  
  var points: Double | (js.Array[Double | (js.Tuple2[String, Double])]) = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Metric {
  
  @scala.inline
  def apply(metric: String, points: Double | (js.Array[Double | (js.Tuple2[String, Double])])): Metric = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  
  @scala.inline
  implicit class MetricOps[Self <: Metric] (val x: Self) extends AnyVal {
    
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
    def setMetric(value: String): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: (Double | (js.Tuple2[String, Double]))*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: Double | (js.Array[Double | (js.Tuple2[String, Double])])): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric_type(value: String): Self = this.set("metric_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric_type: Self = this.set("metric_type", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
