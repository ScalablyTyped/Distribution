package typings.formatjsEcma402Abstract

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreMod {
  
  type Locale = String
  
  @js.native
  trait LocaleData[T] extends StObject {
    
    var data: T = js.native
    
    var locale: Locale = js.native
  }
  object LocaleData {
    
    @scala.inline
    def apply[T](data: T, locale: Locale): LocaleData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleData[T]]
    }
    
    @scala.inline
    implicit class LocaleDataMutableBuilder[Self <: LocaleData[_], T] (val x: Self with LocaleData[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LookupMatcherResult extends StObject {
    
    var extension: js.UndefOr[String] = js.native
    
    var locale: String = js.native
    
    var nu: js.UndefOr[String] = js.native
  }
  object LookupMatcherResult {
    
    @scala.inline
    def apply(locale: String): LookupMatcherResult = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LookupMatcherResult]
    }
    
    @scala.inline
    implicit class LookupMatcherResultMutableBuilder[Self <: LookupMatcherResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNu(value: String): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNuUndefined: Self = StObject.set(x, "nu", js.undefined)
    }
  }
}
