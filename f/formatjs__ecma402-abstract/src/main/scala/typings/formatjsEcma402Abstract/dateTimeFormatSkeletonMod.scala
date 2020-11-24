package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.PickDateTimeFormatOptions
import typings.formatjsEcma402Abstract.typesDateTimeMod.Formats
import typings.formatjsEcma402Abstract.typesDateTimeMod.RangePatternPart
import typings.formatjsEcma402Abstract.typesDateTimeMod.RangePatternType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@formatjs/ecma402-abstract/DateTimeFormat/skeleton", JSImport.Namespace)
@js.native
object dateTimeFormatSkeletonMod extends js.Object {
  
  def parseDateTimeSkeleton(skeleton: String): Formats = js.native
  def parseDateTimeSkeleton(
    skeleton: String,
    rawPattern: js.UndefOr[scala.Nothing],
    rangePatterns: js.UndefOr[scala.Nothing],
    intervalFormatFallback: String
  ): Formats = js.native
  def parseDateTimeSkeleton(skeleton: String, rawPattern: js.UndefOr[scala.Nothing], rangePatterns: Record[String, String]): Formats = js.native
  def parseDateTimeSkeleton(
    skeleton: String,
    rawPattern: js.UndefOr[scala.Nothing],
    rangePatterns: Record[String, String],
    intervalFormatFallback: String
  ): Formats = js.native
  def parseDateTimeSkeleton(skeleton: String, rawPattern: String): Formats = js.native
  def parseDateTimeSkeleton(
    skeleton: String,
    rawPattern: String,
    rangePatterns: js.UndefOr[scala.Nothing],
    intervalFormatFallback: String
  ): Formats = js.native
  def parseDateTimeSkeleton(skeleton: String, rawPattern: String, rangePatterns: Record[String, String]): Formats = js.native
  def parseDateTimeSkeleton(
    skeleton: String,
    rawPattern: String,
    rangePatterns: Record[String, String],
    intervalFormatFallback: String
  ): Formats = js.native
  
  def processDateTimePattern(pattern: String): js.Tuple2[String, String] = js.native
  def processDateTimePattern(pattern: String, result: PickDateTimeFormatOptions): js.Tuple2[String, String] = js.native
  
  def splitFallbackRangePattern(pattern: String): js.Array[RangePatternPart[RangePatternType]] = js.native
  
  def splitRangePattern(pattern: String): js.Array[RangePatternPart[RangePatternType]] = js.native
}
