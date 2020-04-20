package typings.fastGlob.matcherMod

import typings.fastGlob.fastGlobBooleans.`false`
import typings.fastGlob.fastGlobBooleans.`true`
import typings.fastGlob.typesMod.Pattern
import typings.fastGlob.typesMod.PatternRe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.fastGlob.matcherMod.StaticPatternSegment
  - typings.fastGlob.matcherMod.DynamicPatternSegment
*/
trait PatternSegment extends js.Object

object PatternSegment {
  @scala.inline
  def StaticPatternSegment(dynamic: `false`, pattern: Pattern): PatternSegment = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternSegment]
  }
  @scala.inline
  def DynamicPatternSegment(dynamic: `true`, pattern: Pattern, patternRe: PatternRe): PatternSegment = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], patternRe = patternRe.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternSegment]
  }
}

