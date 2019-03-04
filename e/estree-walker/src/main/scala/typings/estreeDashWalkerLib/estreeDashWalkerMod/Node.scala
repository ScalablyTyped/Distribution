package typings
package estreeDashWalkerLib.estreeDashWalkerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var end: scala.Double
  var start: scala.Double
  var `type`: java.lang.String
}

object Node {
  @scala.inline
  def apply(
    end: scala.Double,
    start: scala.Double,
    `type`: java.lang.String,
    StringDictionary: /* propName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Node = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Node]
  }
}

