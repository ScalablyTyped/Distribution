package typings.firebaseFirestore.distPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LruParams extends StObject {
  
  val cacheSizeCollectionThreshold: Double
  
  val maximumSequenceNumbersToCollect: Double
  
  val percentileToCollect: Double
}
object LruParams {
  
  inline def apply(
    cacheSizeCollectionThreshold: Double,
    maximumSequenceNumbersToCollect: Double,
    percentileToCollect: Double
  ): LruParams = {
    val __obj = js.Dynamic.literal(cacheSizeCollectionThreshold = cacheSizeCollectionThreshold.asInstanceOf[js.Any], maximumSequenceNumbersToCollect = maximumSequenceNumbersToCollect.asInstanceOf[js.Any], percentileToCollect = percentileToCollect.asInstanceOf[js.Any])
    __obj.asInstanceOf[LruParams]
  }
  
  extension [Self <: LruParams](x: Self) {
    
    inline def setCacheSizeCollectionThreshold(value: Double): Self = StObject.set(x, "cacheSizeCollectionThreshold", value.asInstanceOf[js.Any])
    
    inline def setMaximumSequenceNumbersToCollect(value: Double): Self = StObject.set(x, "maximumSequenceNumbersToCollect", value.asInstanceOf[js.Any])
    
    inline def setPercentileToCollect(value: Double): Self = StObject.set(x, "percentileToCollect", value.asInstanceOf[js.Any])
  }
}
