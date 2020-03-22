package typings.fastGlob.matcherMod

import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternInfo extends js.Object {
  /**
    * Indicates that the pattern has a globstar (more than a single section).
    */
  var complete: Boolean
  var pattern: Pattern
  var sections: js.Array[PatternSection]
  var segments: js.Array[PatternSegment]
}

object PatternInfo {
  @scala.inline
  def apply(
    complete: Boolean,
    pattern: Pattern,
    sections: js.Array[PatternSection],
    segments: js.Array[PatternSegment]
  ): PatternInfo = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PatternInfo]
  }
}

