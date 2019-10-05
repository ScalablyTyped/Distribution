package typings.fastDashGlob.outManagersTasksMod

import typings.fastDashGlob.outManagersOptionsMod.IOptions
import typings.fastDashGlob.outTypesEntriesMod.EntryItem
import typings.fastDashGlob.outTypesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/managers/tasks", "generate")
@js.native
object generate extends js.Object {
  def apply(patterns: js.Array[Pattern], options: IOptions[EntryItem]): js.Array[ITask] = js.native
}

