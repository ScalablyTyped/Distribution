package typings.fastGlob.tasksMod

import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Task extends js.Object {
  var base: String
  var dynamic: Boolean
  var negative: js.Array[Pattern]
  var patterns: js.Array[Pattern]
  var positive: js.Array[Pattern]
}

object Task {
  @scala.inline
  def apply(
    base: String,
    dynamic: Boolean,
    negative: js.Array[Pattern],
    patterns: js.Array[Pattern],
    positive: js.Array[Pattern]
  ): Task = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dynamic = dynamic.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
}

