package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.dateTimeMod.DateTimeFormatOptions
import typings.formatjsEcma402Abstract.dateTimeMod.Formats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/BestFitFormatMatcher", JSImport.Namespace)
@js.native
object bestFitFormatMatcherMod extends js.Object {
  
  def BestFitFormatMatcher(options: DateTimeFormatOptions, formats: js.Array[Formats]): Formats = js.native
  
  def bestFitFormatMatcherScore(options: DateTimeFormatOptions, format: Formats): Double = js.native
}
