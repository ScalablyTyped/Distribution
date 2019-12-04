package typings.fastDashGlob.packageOutManagersTasksMod

import typings.fastDashGlob.packageOutTypesPatternsMod.Pattern
import typings.fastDashGlob.packageOutTypesPatternsMod.PatternsGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/managers/tasks", "convertPatternGroupsToTasks")
@js.native
object convertPatternGroupsToTasks extends js.Object {
  def apply(positive: PatternsGroup, negative: js.Array[Pattern], dynamic: Boolean): js.Array[ITask] = js.native
}

