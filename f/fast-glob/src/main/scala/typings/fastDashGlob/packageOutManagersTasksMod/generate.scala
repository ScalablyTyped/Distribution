package typings.fastDashGlob.packageOutManagersTasksMod

import typings.fastDashGlob.packageOutManagersOptionsMod.IOptions
import typings.fastDashGlob.packageOutTypesEntriesMod.EntryItem
import typings.fastDashGlob.packageOutTypesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/managers/tasks", "generate")
@js.native
object generate extends js.Object {
  def apply(patterns: js.Array[Pattern], options: IOptions[EntryItem]): js.Array[ITask] = js.native
}

