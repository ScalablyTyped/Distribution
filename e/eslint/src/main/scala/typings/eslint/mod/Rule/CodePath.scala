package typings.eslint.mod.Rule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodePath extends js.Object {
  var childCodePaths: js.Array[CodePath] = js.native
  var currentSegments: js.Array[CodePathSegment] = js.native
  var finalSegments: js.Array[CodePathSegment] = js.native
  var id: String = js.native
  var initialSegment: CodePathSegment = js.native
  var returnedSegments: js.Array[CodePathSegment] = js.native
  var thrownSegments: js.Array[CodePathSegment] = js.native
  var upper: CodePath | Null = js.native
}

object CodePath {
  @scala.inline
  def apply(
    childCodePaths: js.Array[CodePath],
    currentSegments: js.Array[CodePathSegment],
    finalSegments: js.Array[CodePathSegment],
    id: String,
    initialSegment: CodePathSegment,
    returnedSegments: js.Array[CodePathSegment],
    thrownSegments: js.Array[CodePathSegment]
  ): CodePath = {
    val __obj = js.Dynamic.literal(childCodePaths = childCodePaths.asInstanceOf[js.Any], currentSegments = currentSegments.asInstanceOf[js.Any], finalSegments = finalSegments.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialSegment = initialSegment.asInstanceOf[js.Any], returnedSegments = returnedSegments.asInstanceOf[js.Any], thrownSegments = thrownSegments.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodePath]
  }
  @scala.inline
  implicit class CodePathOps[Self <: CodePath] (val x: Self) extends AnyVal {
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
    def setChildCodePathsVarargs(value: CodePath*): Self = this.set("childCodePaths", js.Array(value :_*))
    @scala.inline
    def setChildCodePaths(value: js.Array[CodePath]): Self = this.set("childCodePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentSegmentsVarargs(value: CodePathSegment*): Self = this.set("currentSegments", js.Array(value :_*))
    @scala.inline
    def setCurrentSegments(value: js.Array[CodePathSegment]): Self = this.set("currentSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalSegmentsVarargs(value: CodePathSegment*): Self = this.set("finalSegments", js.Array(value :_*))
    @scala.inline
    def setFinalSegments(value: js.Array[CodePathSegment]): Self = this.set("finalSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialSegment(value: CodePathSegment): Self = this.set("initialSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnedSegmentsVarargs(value: CodePathSegment*): Self = this.set("returnedSegments", js.Array(value :_*))
    @scala.inline
    def setReturnedSegments(value: js.Array[CodePathSegment]): Self = this.set("returnedSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setThrownSegmentsVarargs(value: CodePathSegment*): Self = this.set("thrownSegments", js.Array(value :_*))
    @scala.inline
    def setThrownSegments(value: js.Array[CodePathSegment]): Self = this.set("thrownSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpper(value: CodePath): Self = this.set("upper", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpperNull: Self = this.set("upper", null)
  }
  
}

