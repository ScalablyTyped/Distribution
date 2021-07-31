package typings.formatjsEcma402Abstract

import typings.formatjsEcma402Abstract.anon.PickDateTimeFormatOptions
import typings.formatjsEcma402Abstract.dateTimeMod.Formats
import typings.formatjsEcma402Abstract.dateTimeMod.RangePatternPart
import typings.formatjsEcma402Abstract.dateTimeMod.RangePatternType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  @JSImport("@formatjs/ecma402-abstract/lib/DateTimeFormat/skeleton", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parseDateTimeSkeleton(skeleton: String): Formats = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any]).asInstanceOf[Formats]
  @scala.inline
  def parseDateTimeSkeleton(skeleton: String, rawPattern: String): Formats = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any], rawPattern.asInstanceOf[js.Any])).asInstanceOf[Formats]
  @scala.inline
  def parseDateTimeSkeleton(skeleton: String, rawPattern: String, rangePatterns: Unit, intervalFormatFallback: String): Formats = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any], rawPattern.asInstanceOf[js.Any], rangePatterns.asInstanceOf[js.Any], intervalFormatFallback.asInstanceOf[js.Any])).asInstanceOf[Formats]
  @scala.inline
  def parseDateTimeSkeleton(skeleton: String, rawPattern: String, rangePatterns: Record[String, String]): Formats = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any], rawPattern.asInstanceOf[js.Any], rangePatterns.asInstanceOf[js.Any])).asInstanceOf[Formats]
  @scala.inline
  def parseDateTimeSkeleton(
    skeleton: String,
    rawPattern: String,
    rangePatterns: Record[String, String],
    intervalFormatFallback: String
  ): Formats = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any], rawPattern.asInstanceOf[js.Any], rangePatterns.asInstanceOf[js.Any], intervalFormatFallback.asInstanceOf[js.Any])).asInstanceOf[Formats]
  @scala.inline
  def parseDateTimeSkeleton(skeleton: String, rawPattern: Unit, rangePatterns: Unit, intervalFormatFallback: String): Formats = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any], rawPattern.asInstanceOf[js.Any], rangePatterns.asInstanceOf[js.Any], intervalFormatFallback.asInstanceOf[js.Any])).asInstanceOf[Formats]
  @scala.inline
  def parseDateTimeSkeleton(skeleton: String, rawPattern: Unit, rangePatterns: Record[String, String]): Formats = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any], rawPattern.asInstanceOf[js.Any], rangePatterns.asInstanceOf[js.Any])).asInstanceOf[Formats]
  @scala.inline
  def parseDateTimeSkeleton(
    skeleton: String,
    rawPattern: Unit,
    rangePatterns: Record[String, String],
    intervalFormatFallback: String
  ): Formats = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDateTimeSkeleton")(skeleton.asInstanceOf[js.Any], rawPattern.asInstanceOf[js.Any], rangePatterns.asInstanceOf[js.Any], intervalFormatFallback.asInstanceOf[js.Any])).asInstanceOf[Formats]
  
  @scala.inline
  def processDateTimePattern(pattern: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("processDateTimePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
  @scala.inline
  def processDateTimePattern(pattern: String, result: PickDateTimeFormatOptions): js.Tuple2[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processDateTimePattern")(pattern.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[String, String]]
  
  @scala.inline
  def splitFallbackRangePattern(pattern: String): js.Array[RangePatternPart[RangePatternType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitFallbackRangePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[RangePatternPart[RangePatternType]]]
  
  @scala.inline
  def splitRangePattern(pattern: String): js.Array[RangePatternPart[RangePatternType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitRangePattern")(pattern.asInstanceOf[js.Any]).asInstanceOf[js.Array[RangePatternPart[RangePatternType]]]
}
