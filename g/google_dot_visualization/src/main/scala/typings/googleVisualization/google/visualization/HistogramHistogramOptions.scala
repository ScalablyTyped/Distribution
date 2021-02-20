package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistogramHistogramOptions extends StObject {
  
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
  implicit class HistogramHistogramOptionsMutableBuilder[Self <: HistogramHistogramOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketSize(value: Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    @scala.inline
    def setHideBucketItems(value: Boolean): Self = StObject.set(x, "hideBucketItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideBucketItemsUndefined: Self = StObject.set(x, "hideBucketItems", js.undefined)
    
    @scala.inline
    def setLastBucketPercentile(value: Double): Self = StObject.set(x, "lastBucketPercentile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastBucketPercentileUndefined: Self = StObject.set(x, "lastBucketPercentile", js.undefined)
  }
}
