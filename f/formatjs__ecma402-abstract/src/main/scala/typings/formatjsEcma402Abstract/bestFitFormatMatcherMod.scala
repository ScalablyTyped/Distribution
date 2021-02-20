package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeMod.DateTimeFormatOptions
import typings.formatjsEcma402Abstract.dateTimeMod.Formats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bestFitFormatMatcherMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/BestFitFormatMatcher", "BestFitFormatMatcher")
  @js.native
  def BestFitFormatMatcher(options: DateTimeFormatOptions, formats: js.Array[Formats]): Formats = js.native
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/BestFitFormatMatcher", "bestFitFormatMatcherScore")
  @js.native
  def bestFitFormatMatcherScore(options: DateTimeFormatOptions, format: Formats): Double = js.native
}
