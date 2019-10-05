package typings.fastDashGlob.outManagersTasksMod

import typings.fastDashGlob.outTypesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/managers/tasks", "convertPatternsToTasks")
@js.native
object convertPatternsToTasks extends js.Object {
  def apply(positive: js.Array[Pattern], negative: js.Array[Pattern], dynamic: Boolean): js.Array[ITask] = js.native
}

