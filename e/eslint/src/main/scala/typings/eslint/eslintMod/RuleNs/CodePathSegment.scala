package typings.eslint.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePathSegment extends js.Object {
  var id: String
  var nextSegments: js.Array[CodePathSegment]
  var prevSegments: js.Array[CodePathSegment]
  var reachable: Boolean
}

object CodePathSegment {
  @scala.inline
  def apply(
    id: String,
    nextSegments: js.Array[CodePathSegment],
    prevSegments: js.Array[CodePathSegment],
    reachable: Boolean
  ): CodePathSegment = {
    val __obj = js.Dynamic.literal(id = id, nextSegments = nextSegments, prevSegments = prevSegments, reachable = reachable)
  
    __obj.asInstanceOf[CodePathSegment]
  }
}

