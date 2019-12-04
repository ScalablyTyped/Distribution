package typings.fastDashGlob.packageOutManagersTasksMod

import typings.fastDashGlob.packageOutTypesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/managers/tasks", "convertPatternGroupToTask")
@js.native
object convertPatternGroupToTask extends js.Object {
  def apply(base: String, positive: js.Array[Pattern], negative: js.Array[Pattern], dynamic: Boolean): ITask = js.native
}

