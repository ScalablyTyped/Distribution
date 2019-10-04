package typings.fastDashGlob.outManagersTasksMod

import typings.fastDashGlob.outTypesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITask extends js.Object {
  var base: String
  var dynamic: Boolean
  var negative: js.Array[Pattern]
  var patterns: js.Array[Pattern]
  var positive: js.Array[Pattern]
}

object ITask {
  @scala.inline
  def apply(
    base: String,
    dynamic: Boolean,
    negative: js.Array[Pattern],
    patterns: js.Array[Pattern],
    positive: js.Array[Pattern]
  ): ITask = {
    val __obj = js.Dynamic.literal(base = base, dynamic = dynamic, negative = negative, patterns = patterns, positive = positive)
  
    __obj.asInstanceOf[ITask]
  }
}

