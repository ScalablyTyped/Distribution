package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.typesDateTimeMod.DateTimeFormatOptions
import typings.formatjsEcma402Abstract.typesDateTimeMod.Formats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateTimeFormatBestFitFormatMatcherMod {
  
  @JSImport("@formatjs/ecma402-abstract/DateTimeFormat/BestFitFormatMatcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def BestFitFormatMatcher(options: DateTimeFormatOptions, formats: js.Array[Formats]): Formats = (^.asInstanceOf[js.Dynamic].applyDynamic("BestFitFormatMatcher")(options.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[Formats]
  
  @scala.inline
  def bestFitFormatMatcherScore(options: DateTimeFormatOptions, format: Formats): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("bestFitFormatMatcherScore")(options.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
}
