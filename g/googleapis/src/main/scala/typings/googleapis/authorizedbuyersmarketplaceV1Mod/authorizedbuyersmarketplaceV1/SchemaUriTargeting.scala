package typings.googleapis.authorizedbuyersmarketplaceV1Mod.authorizedbuyersmarketplaceV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUriTargeting extends StObject {
  
  /**
    * A list of URLs to be excluded.
    */
  var excludedUris: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of URLs to be included.
    */
  var targetedUris: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaUriTargeting {
  
  inline def apply(): SchemaUriTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUriTargeting]
  }
  
  extension [Self <: SchemaUriTargeting](x: Self) {
    
    inline def setExcludedUris(value: js.Array[String]): Self = StObject.set(x, "excludedUris", value.asInstanceOf[js.Any])
    
    inline def setExcludedUrisNull: Self = StObject.set(x, "excludedUris", null)
    
    inline def setExcludedUrisUndefined: Self = StObject.set(x, "excludedUris", js.undefined)
    
    inline def setExcludedUrisVarargs(value: String*): Self = StObject.set(x, "excludedUris", js.Array(value*))
    
    inline def setTargetedUris(value: js.Array[String]): Self = StObject.set(x, "targetedUris", value.asInstanceOf[js.Any])
    
    inline def setTargetedUrisNull: Self = StObject.set(x, "targetedUris", null)
    
    inline def setTargetedUrisUndefined: Self = StObject.set(x, "targetedUris", js.undefined)
    
    inline def setTargetedUrisVarargs(value: String*): Self = StObject.set(x, "targetedUris", js.Array(value*))
  }
}
