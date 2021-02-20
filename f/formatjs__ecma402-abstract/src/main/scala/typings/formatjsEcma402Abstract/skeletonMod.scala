package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.PickDateTimeFormatOptions
import typings.formatjsEcma402Abstract.dateTimeMod.Formats
import typings.formatjsEcma402Abstract.dateTimeMod.RangePatternPart
import typings.formatjsEcma402Abstract.dateTimeMod.RangePatternType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "parseDateTimeSkeleton")
  @js.native
  def parseDateTimeSkeleton(skeleton: String): Formats = js.native
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "parseDateTimeSkeleton")
  @js.native
  def parseDateTimeSkeleton(
    skeleton: String,
    rawPattern: js.UndefOr[scala.Nothing],
    rangePatterns: js.UndefOr[scala.Nothing],
    intervalFormatFallback: String
  ): Formats = js.native
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "parseDateTimeSkeleton")
  @js.native
  def parseDateTimeSkeleton(skeleton: String, rawPattern: js.UndefOr[scala.Nothing], rangePatterns: Record[String, String]): Formats = js.native
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "parseDateTimeSkeleton")
  @js.native
  def parseDateTimeSkeleton(
    skeleton: String,
    rawPattern: js.UndefOr[scala.Nothing],
    rangePatterns: Record[String, String],
    intervalFormatFallback: String
  ): Formats = js.native
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "parseDateTimeSkeleton")
  @js.native
  def parseDateTimeSkeleton(skeleton: String, rawPattern: String): Formats = js.native
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "parseDateTimeSkeleton")
  @js.native
  def parseDateTimeSkeleton(
    skeleton: String,
    rawPattern: String,
    rangePatterns: js.UndefOr[scala.Nothing],
    intervalFormatFallback: String
  ): Formats = js.native
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "parseDateTimeSkeleton")
  @js.native
  def parseDateTimeSkeleton(skeleton: String, rawPattern: String, rangePatterns: Record[String, String]): Formats = js.native
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "parseDateTimeSkeleton")
  @js.native
  def parseDateTimeSkeleton(
    skeleton: String,
    rawPattern: String,
    rangePatterns: Record[String, String],
    intervalFormatFallback: String
  ): Formats = js.native
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "processDateTimePattern")
  @js.native
  def processDateTimePattern(pattern: String): js.Tuple2[String, String] = js.native
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "processDateTimePattern")
  @js.native
  def processDateTimePattern(pattern: String, result: PickDateTimeFormatOptions): js.Tuple2[String, String] = js.native
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "splitFallbackRangePattern")
  @js.native
  def splitFallbackRangePattern(pattern: String): js.Array[RangePatternPart[RangePatternType]] = js.native
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", "splitRangePattern")
  @js.native
  def splitRangePattern(pattern: String): js.Array[RangePatternPart[RangePatternType]] = js.native
}
