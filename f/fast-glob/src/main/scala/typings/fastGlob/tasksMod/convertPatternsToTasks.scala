package typings.fastGlob.tasksMod

import typings.fastGlob.typesMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-glob/out/managers/tasks", "convertPatternsToTasks")
@js.native
object convertPatternsToTasks extends js.Object {
  
  def apply(positive: js.Array[Pattern], negative: js.Array[Pattern], dynamic: Boolean): js.Array[Task] = js.native
}
