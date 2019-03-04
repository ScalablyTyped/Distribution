package typings
package fastDashGlobLib.outManagersTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITask extends js.Object {
  var base: java.lang.String
  var dynamic: scala.Boolean
  var negative: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]
  var patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]
  var positive: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]
}

object ITask {
  @scala.inline
  def apply(
    base: java.lang.String,
    dynamic: scala.Boolean,
    negative: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    patterns: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern],
    positive: js.Array[fastDashGlobLib.outTypesPatternsMod.Pattern]
  ): ITask = {
    val __obj = js.Dynamic.literal(base = base, dynamic = dynamic, negative = negative, patterns = patterns, positive = positive)
  
    __obj.asInstanceOf[ITask]
  }
}

