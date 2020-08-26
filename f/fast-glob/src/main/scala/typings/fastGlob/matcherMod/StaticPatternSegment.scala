package typings.fastGlob.matcherMod

import typings.fastGlob.fastGlobBooleans.`false`
import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticPatternSegment extends PatternSegment {
  var dynamic: `false` = js.native
  var pattern: Pattern = js.native
}

object StaticPatternSegment {
  @scala.inline
  def apply(dynamic: `false`, pattern: Pattern): StaticPatternSegment = {
    val __obj = js.Dynamic.literal(dynamic = dynamic.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticPatternSegment]
  }
  @scala.inline
  implicit class StaticPatternSegmentOps[Self <: StaticPatternSegment] (val x: Self) extends AnyVal {
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
    def setDynamic(value: `false`): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: Pattern): Self = this.set("pattern", value.asInstanceOf[js.Any])
  }
  
}

