package typings.formatjsIntlLocalematcher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAbstractTypesMod {
  
  trait LookupMatcherResult extends StObject {
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var locale: String
    
    var nu: js.UndefOr[String] = js.undefined
  }
  object LookupMatcherResult {
    
    inline def apply(locale: String): LookupMatcherResult = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupMatcherResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LookupMatcherResult] (val x: Self) extends AnyVal {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNu(value: String): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
      
      inline def setNuUndefined: Self = StObject.set(x, "nu", js.undefined)
    }
  }
}
