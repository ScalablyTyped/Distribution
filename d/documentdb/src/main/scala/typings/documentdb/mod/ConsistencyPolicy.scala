package typings.documentdb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsistencyPolicy extends StObject {
  
  var defaultConsistencyLevel: ConsistencyLevel
  
  var maxStalenessIntervalInSeconds: Double
  
  var maxStalenessPrefix: Double
}
object ConsistencyPolicy {
  
  inline def apply(
    defaultConsistencyLevel: ConsistencyLevel,
    maxStalenessIntervalInSeconds: Double,
    maxStalenessPrefix: Double
  ): ConsistencyPolicy = {
    val __obj = js.Dynamic.literal(defaultConsistencyLevel = defaultConsistencyLevel.asInstanceOf[js.Any], maxStalenessIntervalInSeconds = maxStalenessIntervalInSeconds.asInstanceOf[js.Any], maxStalenessPrefix = maxStalenessPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsistencyPolicy]
  }
  
  extension [Self <: ConsistencyPolicy](x: Self) {
    
    inline def setDefaultConsistencyLevel(value: ConsistencyLevel): Self = StObject.set(x, "defaultConsistencyLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxStalenessIntervalInSeconds(value: Double): Self = StObject.set(x, "maxStalenessIntervalInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxStalenessPrefix(value: Double): Self = StObject.set(x, "maxStalenessPrefix", value.asInstanceOf[js.Any])
  }
}
