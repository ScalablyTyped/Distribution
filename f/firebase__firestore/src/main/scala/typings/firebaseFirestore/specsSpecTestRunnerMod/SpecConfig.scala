package typings.firebaseFirestore.specsSpecTestRunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecConfig extends StObject {
  
  /**
    * The maximum number of concurrently-active listens for limbo resolutions.
    * This value must be strictly greater than zero, or undefined to use the
    * default value.
    */
  var maxConcurrentLimboResolutions: js.UndefOr[Double] = js.undefined
  
  /** The number of active clients for this test run. */
  var numClients: Double
  
  /** A boolean to enable / disable GC. */
  var useGarbageCollection: Boolean
}
object SpecConfig {
  
  inline def apply(numClients: Double, useGarbageCollection: Boolean): SpecConfig = {
    val __obj = js.Dynamic.literal(numClients = numClients.asInstanceOf[js.Any], useGarbageCollection = useGarbageCollection.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecConfig]
  }
  
  extension [Self <: SpecConfig](x: Self) {
    
    inline def setMaxConcurrentLimboResolutions(value: Double): Self = StObject.set(x, "maxConcurrentLimboResolutions", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentLimboResolutionsUndefined: Self = StObject.set(x, "maxConcurrentLimboResolutions", js.undefined)
    
    inline def setNumClients(value: Double): Self = StObject.set(x, "numClients", value.asInstanceOf[js.Any])
    
    inline def setUseGarbageCollection(value: Boolean): Self = StObject.set(x, "useGarbageCollection", value.asInstanceOf[js.Any])
  }
}
