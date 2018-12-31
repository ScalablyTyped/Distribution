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

