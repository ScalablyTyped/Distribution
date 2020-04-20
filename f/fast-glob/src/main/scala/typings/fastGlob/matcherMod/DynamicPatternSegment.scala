package typings.fastGlob.matcherMod

import typings.fastGlob.fastGlobBooleans.`true`
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.PatternRe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicPatternSegment extends PatternSegment {
  var dynamic: `true`
  var pattern: Pattern
  var patternRe: PatternRe
}

object DynamicPatternSegment {
  @scala.inline
  def apply(dynamic: `true`, pattern: Pattern, patternRe: PatternRe): DynamicPatternSegment = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternRe = patternRe.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicPatternSegment]
  }
}

