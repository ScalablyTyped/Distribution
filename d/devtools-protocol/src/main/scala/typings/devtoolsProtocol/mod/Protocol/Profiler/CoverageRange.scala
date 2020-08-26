package typings.devtoolsProtocol.mod.Protocol.Profiler

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageRange extends js.Object {
  /**
    * Collected execution count of the source range.
    */
  var count: integer = js.native
  /**
    * JavaScript script source offset for the range end.
    */
  var endOffset: integer = js.native
  /**
    * JavaScript script source offset for the range start.
    */
  var startOffset: integer = js.native
}

object CoverageRange {
  @scala.inline
  def apply(count: integer, endOffset: integer, startOffset: integer): CoverageRange = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endOffset = endOffset.asInstanceOf[js.Any], startOffset = startOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoverageRange]
  }
  @scala.inline
  implicit class CoverageRangeOps[Self <: CoverageRange] (val x: Self) extends AnyVal {
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
    def setCount(value: integer): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndOffset(value: integer): Self = this.set("endOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartOffset(value: integer): Self = this.set("startOffset", value.asInstanceOf[js.Any])
  }
  
}

