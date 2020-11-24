package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramHistogramOptions extends js.Object {
  
  var bucketSize: js.UndefOr[Double] = js.native
  
  var hideBucketItems: js.UndefOr[Boolean] = js.native
  
  var lastBucketPercentile: js.UndefOr[Double] = js.native
}
object HistogramHistogramOptions {
  
  @scala.inline
  def apply(): HistogramHistogramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramHistogramOptions]
  }
  
  @scala.inline
  implicit class HistogramHistogramOptionsOps[Self <: HistogramHistogramOptions] (val x: Self) extends AnyVal {
    
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
    def setBucketSize(value: Double): Self = this.set("bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketSize: Self = this.set("bucketSize", js.undefined)
    
    @scala.inline
    def setHideBucketItems(value: Boolean): Self = this.set("hideBucketItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideBucketItems: Self = this.set("hideBucketItems", js.undefined)
    
    @scala.inline
    def setLastBucketPercentile(value: Double): Self = this.set("lastBucketPercentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastBucketPercentile: Self = this.set("lastBucketPercentile", js.undefined)
  }
}
