package typings.formatjsIcuMessageformatParser

import typings.std.Intl.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimePatternGeneratorMod {
  
  @JSImport("@formatjs/icu-messageformat-parser/date-time-pattern-generator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBestPattern(skeleton: String, locale: Locale): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBestPattern")(skeleton.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
}
