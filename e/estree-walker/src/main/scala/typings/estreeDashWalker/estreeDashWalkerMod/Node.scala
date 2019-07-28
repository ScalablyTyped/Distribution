package typings.estreeDashWalker.estreeDashWalkerMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node
  extends /* propName */ StringDictionary[js.Any] {
  var end: Double
  var start: Double
  var `type`: String
}

object Node {
  @scala.inline
  def apply(
    end: Double,
    start: Double,
    `type`: String,
    StringDictionary: /* propName */ StringDictionary[js.Any] = null
  ): Node = {
    val __obj = js.Dynamic.literal(end = end, start = start)
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Node]
  }
}

