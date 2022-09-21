package typings.fluentBundle

import typings.fluentBundle.anon.TypeofDateTimeFormat
import typings.fluentBundle.anon.TypeofNumberFormat
import typings.fluentBundle.anon.TypeofPluralRules
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.NumberFormat
import typings.std.Intl.PluralRules
import typings.std.Map
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoizerMod {
  
  @JSImport("@fluent/bundle/esm/memoizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMemoizerForLocale(locales: String): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("getMemoizerForLocale")(locales.asInstanceOf[js.Any]).asInstanceOf[IntlCache]
  inline def getMemoizerForLocale(locales: js.Array[String]): IntlCache = ^.asInstanceOf[js.Dynamic].applyDynamic("getMemoizerForLocale")(locales.asInstanceOf[js.Any]).asInstanceOf[IntlCache]
  
  type IntlCache = Map[
    TypeofNumberFormat | TypeofDateTimeFormat | TypeofPluralRules, 
    Record[String, NumberFormat | DateTimeFormat | PluralRules]
  ]
}
