package typings.fastGlob.matcherMod

import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternInfo extends js.Object {
  /**
    * Indicates that the pattern has a globstar (more than a single section).
    */
  var complete: Boolean = js.native
  var pattern: Pattern = js.native
  var sections: js.Array[PatternSection] = js.native
  var segments: js.Array[PatternSegment] = js.native
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
  @scala.inline
  implicit class PatternInfoOps[Self <: PatternInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: Pattern): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionsVarargs(value: PatternSection*): Self = this.set("sections", js.Array(value :_*))
    @scala.inline
    def setSections(value: js.Array[PatternSection]): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegmentsVarargs(value: PatternSegment*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[PatternSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
  }
  
}

