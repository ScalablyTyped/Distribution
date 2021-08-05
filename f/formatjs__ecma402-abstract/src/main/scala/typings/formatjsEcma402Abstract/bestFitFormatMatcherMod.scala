package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeMod.DateTimeFormatOptions
import typings.formatjsEcma402Abstract.dateTimeMod.Formats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bestFitFormatMatcherMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/BestFitFormatMatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BestFitFormatMatcher(options: DateTimeFormatOptions, formats: js.Array[Formats]): Formats = (^.asInstanceOf[js.Dynamic].applyDynamic("BestFitFormatMatcher")(options.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Formats]
  
  inline def bestFitFormatMatcherScore(options: DateTimeFormatOptions, format: Formats): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bestFitFormatMatcherScore")(options.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
}
