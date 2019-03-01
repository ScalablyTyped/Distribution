package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodePathSegment extends js.Object {
  var id: java.lang.String
  var nextSegments: js.Array[CodePathSegment]
  var prevSegments: js.Array[CodePathSegment]
  var reachable: scala.Boolean
}

object CodePathSegment {
  @scala.inline
  def apply(
    id: java.lang.String,
    nextSegments: js.Array[CodePathSegment],
    prevSegments: js.Array[CodePathSegment],
    reachable: scala.Boolean
  ): CodePathSegment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("nextSegments")(nextSegments)
    __obj.updateDynamic("prevSegments")(prevSegments)
    __obj.updateDynamic("reachable")(reachable)
    __obj.asInstanceOf[CodePathSegment]
  }
}

