package typings.fluentBundle

import typings.fluentBundle.esmBundleMod.TextTransform
import typings.fluentBundle.esmTypesMod.FluentFunction
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatOptions
import typings.std.Intl.PluralRules
import typings.std.Intl.PluralRulesOptions
import typings.std.Record
import typings.std.anon.LocaleMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowOverrides extends StObject {
    
    var allowOverrides: js.UndefOr[Boolean] = js.undefined
  }
  object AllowOverrides {
    
    inline def apply(): AllowOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowOverrides]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowOverrides] (val x: Self) extends AnyVal {
      
      inline def setAllowOverrides(value: Boolean): Self = StObject.set(x, "allowOverrides", value.asInstanceOf[js.Any])
      
      inline def setAllowOverridesUndefined: Self = StObject.set(x, "allowOverrides", js.undefined)
    }
  }
  
  trait Functions extends StObject {
    
    var functions: js.UndefOr[Record[String, FluentFunction]] = js.undefined
    
    var transform: js.UndefOr[TextTransform] = js.undefined
    
    var useIsolating: js.UndefOr[Boolean] = js.undefined
  }
  object Functions {
    
    inline def apply(): Functions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Functions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Functions] (val x: Self) extends AnyVal {
      
      inline def setFunctions(value: Record[String, FluentFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
      
      inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
      
      inline def setTransform(value: /* text */ String => String): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
      
      inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      inline def setUseIsolating(value: Boolean): Self = StObject.set(x, "useIsolating", value.asInstanceOf[js.Any])
      
      inline def setUseIsolatingUndefined: Self = StObject.set(x, "useIsolating", js.undefined)
    }
  }
  
  @js.native
  trait TypeofDateTimeFormat extends StObject {
    
    /* standard es5 */
    def apply(): DateTimeFormat = js.native
    def apply(locales: String): DateTimeFormat = js.native
    def apply(locales: String, options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: js.Array[String]): DateTimeFormat = js.native
    def apply(locales: js.Array[String], options: DateTimeFormatOptions): DateTimeFormat = js.native
    def apply(locales: Unit, options: DateTimeFormatOptions): DateTimeFormat = js.native
    
    /* standard es5 */
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: DateTimeFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: DateTimeFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofNumberFormat extends StObject {
    
    /* standard es5 */
    def apply(): NumberFormat = js.native
    def apply(locales: String): NumberFormat = js.native
    def apply(locales: String, options: NumberFormatOptions): NumberFormat = js.native
    def apply(locales: js.Array[String]): NumberFormat = js.native
    def apply(locales: js.Array[String], options: NumberFormatOptions): NumberFormat = js.native
    def apply(locales: Unit, options: NumberFormatOptions): NumberFormat = js.native
    
    /* standard es5 */
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: NumberFormatOptions): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: NumberFormatOptions): js.Array[String] = js.native
  }
  
  @js.native
  trait TypeofPluralRules extends StObject {
    
    /* standard es2018.intl */
    def apply(): PluralRules = js.native
    def apply(locales: String): PluralRules = js.native
    def apply(locales: String, options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: js.Array[String]): PluralRules = js.native
    def apply(locales: js.Array[String], options: PluralRulesOptions): PluralRules = js.native
    def apply(locales: Unit, options: PluralRulesOptions): PluralRules = js.native
    
    /* standard es2018.intl */
    def supportedLocalesOf(locales: String): js.Array[String] = js.native
    def supportedLocalesOf(locales: String, options: LocaleMatcher): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String]): js.Array[String] = js.native
    def supportedLocalesOf(locales: js.Array[String], options: LocaleMatcher): js.Array[String] = js.native
  }
}
