package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramHistogramOptions extends StObject {
  
  var bucketSize: js.UndefOr[Double] = js.undefined
  
  var hideBucketItems: js.UndefOr[Boolean] = js.undefined
  
  var lastBucketPercentile: js.UndefOr[Double] = js.undefined
}
object HistogramHistogramOptions {
  
  inline def apply(): HistogramHistogramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramHistogramOptions]
  }
  
  extension [Self <: HistogramHistogramOptions](x: Self) {
    
    inline def setBucketSize(value: Double): Self = StObject.set(x, "bucketSize", value.asInstanceOf[js.Any])
    
    inline def setBucketSizeUndefined: Self = StObject.set(x, "bucketSize", js.undefined)
    
    inline def setHideBucketItems(value: Boolean): Self = StObject.set(x, "hideBucketItems", value.asInstanceOf[js.Any])
    
    inline def setHideBucketItemsUndefined: Self = StObject.set(x, "hideBucketItems", js.undefined)
    
    inline def setLastBucketPercentile(value: Double): Self = StObject.set(x, "lastBucketPercentile", value.asInstanceOf[js.Any])
    
    inline def setLastBucketPercentileUndefined: Self = StObject.set(x, "lastBucketPercentile", js.undefined)
  }
}
