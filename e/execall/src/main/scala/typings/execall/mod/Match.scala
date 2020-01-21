package typings.execall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  var index: Double
  var `match`: String
  var subMatches: js.Array[String]
}

object Match {
  @scala.inline
  def apply(index: Double, `match`: String, subMatches: js.Array[String]): Match = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subMatches = subMatches.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match]
  }
}

