package typings
package fastDashGlobLib.outManagersTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var base: java.lang.String
  var dynamic: scala.Boolean
  var negative: js.Array[fastDashGlobLib.outTypesMod.Pattern]
  var patterns: js.Array[fastDashGlobLib.outTypesMod.Pattern]
  var positive: js.Array[fastDashGlobLib.outTypesMod.Pattern]
}

object Task {
  @scala.inline
  def apply(
    base: java.lang.String,
    dynamic: scala.Boolean,
    negative: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    patterns: js.Array[fastDashGlobLib.outTypesMod.Pattern],
    positive: js.Array[fastDashGlobLib.outTypesMod.Pattern]
  ): Task = {
    val __obj = js.Dynamic.literal(base = base, dynamic = dynamic, negative = negative, patterns = patterns, positive = positive)
  
    __obj.asInstanceOf[Task]
  }
}

