package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePath extends js.Object {
  var childCodePaths: js.Array[CodePath]
  var currentSegments: js.Array[CodePathSegment]
  var finalSegments: js.Array[CodePathSegment]
  var id: java.lang.String
  var initialSegment: CodePathSegment
  var returnedSegments: js.Array[CodePathSegment]
  var thrownSegments: js.Array[CodePathSegment]
  var upper: CodePath | scala.Null
}

object CodePath {
  @scala.inline
  def apply(
    childCodePaths: js.Array[CodePath],
    currentSegments: js.Array[CodePathSegment],
    finalSegments: js.Array[CodePathSegment],
    id: java.lang.String,
    initialSegment: CodePathSegment,
    returnedSegments: js.Array[CodePathSegment],
    thrownSegments: js.Array[CodePathSegment],
    upper: CodePath = null
  ): CodePath = {
    val __obj = js.Dynamic.literal(childCodePaths = childCodePaths, currentSegments = currentSegments, finalSegments = finalSegments, id = id, initialSegment = initialSegment, returnedSegments = returnedSegments, thrownSegments = thrownSegments)
    if (upper != null) __obj.updateDynamic("upper")(upper)
    __obj.asInstanceOf[CodePath]
  }
}

