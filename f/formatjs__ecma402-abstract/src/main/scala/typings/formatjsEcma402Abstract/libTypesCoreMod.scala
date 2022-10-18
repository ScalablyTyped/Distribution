package typings.formatjsEcma402Abstract

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesCoreMod {
  
  type Locale = String
  
  trait LocaleData[T] extends StObject {
    
    var data: T
    
    var locale: Locale
  }
  object LocaleData {
    
    inline def apply[T](data: T, locale: Locale): LocaleData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleData[T]]
    }
    
    extension [Self <: LocaleData[?], T](x: Self & LocaleData[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    extension [Self <: LookupMatcherResult](x: Self) {
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setNu(value: String): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
      
      inline def setNuUndefined: Self = StObject.set(x, "nu", js.undefined)
    }
  }
}
