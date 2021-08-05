package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheProvisionOptions extends StObject {
  
  /**
    * number of items to store in the cache before the least used items are dropped.
    *
    * @default 1000
    */
  var max: Double
}
object CacheProvisionOptions {
  
  inline def apply(max: Double): CacheProvisionOptions = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheProvisionOptions]
  }
  
  extension [Self <: CacheProvisionOptions](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
