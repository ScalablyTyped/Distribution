package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formatted extends StObject {
  
  var familyName: js.UndefOr[String] = js.undefined
  
  var formatted: js.UndefOr[String] = js.undefined
  
  var givenName: js.UndefOr[String] = js.undefined
  
  var honorificPrefix: js.UndefOr[String] = js.undefined
  
  var honorificSuffix: js.UndefOr[String] = js.undefined
  
  var middleName: js.UndefOr[String] = js.undefined
}
object Formatted {
  
  inline def apply(): Formatted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formatted]
  }
  
  extension [Self <: Formatted](x: Self) {
    
    inline def setFamilyName(value: String): Self = StObject.set(x, "familyName", value.asInstanceOf[js.Any])
    
    inline def setFamilyNameUndefined: Self = StObject.set(x, "familyName", js.undefined)
    
    inline def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
    
    inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
    
    inline def setHonorificPrefix(value: String): Self = StObject.set(x, "honorificPrefix", value.asInstanceOf[js.Any])
    
    inline def setHonorificPrefixUndefined: Self = StObject.set(x, "honorificPrefix", js.undefined)
    
    inline def setHonorificSuffix(value: String): Self = StObject.set(x, "honorificSuffix", value.asInstanceOf[js.Any])
    
    inline def setHonorificSuffixUndefined: Self = StObject.set(x, "honorificSuffix", js.undefined)
    
    inline def setMiddleName(value: String): Self = StObject.set(x, "middleName", value.asInstanceOf[js.Any])
    
    inline def setMiddleNameUndefined: Self = StObject.set(x, "middleName", js.undefined)
  }
}
