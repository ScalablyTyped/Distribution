package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.Calendar
import typings.formatjsEcma402Abstract.anon.Locale
import typings.formatjsEcma402Abstract.libTypesCoreMod.LocaleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesDisplaynamesMod {
  
  type CalendarCode = String
  
  type CurrencyCode = String
  
  type DateTimeFieldCode = String
  
  trait DisplayNamesData extends StObject {
    
    /**
      * Not in spec, but we need this to display both language and region in display name.
      * e.g. zh-Hans-SG + "{0}（{1}）" -> 简体中文（新加坡）
      * Here {0} is replaced by language display name and {1} is replaced by region display name.
      */
    var patterns: Locale
    
    /**
      * Note that for style fields, `short` and `narrow` might not exist.
      * At runtime, the fallback order will be narrow -> short -> long.
      */
    var types: Calendar
  }
  object DisplayNamesData {
    
    inline def apply(patterns: Locale, types: Calendar): DisplayNamesData = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayNamesData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DisplayNamesData] (val x: Self) extends AnyVal {
      
      inline def setPatterns(value: Locale): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Calendar): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  type DisplayNamesLocaleData = LocaleData[DisplayNamesData]
  
  type LanguageTag = String
  
  type RegionCode = String
  
  type ScriptCode = String
}
