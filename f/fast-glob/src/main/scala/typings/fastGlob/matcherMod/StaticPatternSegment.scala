package typings.fastGlob.matcherMod

import typings.fastGlob.fastGlobBooleans.`false`
import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticPatternSegment extends PatternSegment {
  var dynamic: `false`
  var pattern: Pattern
}

object StaticPatternSegment {
  @scala.inline
  def apply(dynamic: `false`, pattern: Pattern): StaticPatternSegment = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPatternSegment]
  }
}

