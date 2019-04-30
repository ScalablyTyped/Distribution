package typings
package execallLib.execallMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match extends js.Object {
  var index: scala.Double
  var `match`: java.lang.String
  var subMatches: js.Array[java.lang.String]
}

object Match {
  @scala.inline
  def apply(index: scala.Double, `match`: java.lang.String, subMatches: js.Array[java.lang.String]): Match = {
    val __obj = js.Dynamic.literal(index = index, subMatches = subMatches)
    __obj.updateDynamic("match")(`match`)
    __obj.asInstanceOf[Match]
  }
}

