package typings.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodePathSegment extends js.Object {
  var id: String = js.native
  var nextSegments: js.Array[CodePathSegment] = js.native
  var prevSegments: js.Array[CodePathSegment] = js.native
  var reachable: Boolean = js.native
}

object CodePathSegment {
  @scala.inline
  def apply(
    id: String,
    nextSegments: js.Array[CodePathSegment],
    prevSegments: js.Array[CodePathSegment],
    reachable: Boolean
  ): CodePathSegment = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], nextSegments = nextSegments.asInstanceOf[js.Any], prevSegments = prevSegments.asInstanceOf[js.Any], reachable = reachable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePathSegment]
  }
  @scala.inline
  implicit class CodePathSegmentOps[Self <: CodePathSegment] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextSegmentsVarargs(value: CodePathSegment*): Self = this.set("nextSegments", js.Array(value :_*))
    @scala.inline
    def setNextSegments(value: js.Array[CodePathSegment]): Self = this.set("nextSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevSegmentsVarargs(value: CodePathSegment*): Self = this.set("prevSegments", js.Array(value :_*))
    @scala.inline
    def setPrevSegments(value: js.Array[CodePathSegment]): Self = this.set("prevSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setReachable(value: Boolean): Self = this.set("reachable", value.asInstanceOf[js.Any])
  }
  
}

