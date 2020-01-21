package typings.fastGlob.managersTasksMod

import typings.fastGlob.managersOptionsMod.IOptions
import typings.fastGlob.typesEntriesMod.EntryItem
import typings.fastGlob.typesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/package/out/managers/tasks", "generate")
@js.native
object generate extends js.Object {
  def apply(patterns: js.Array[Pattern], options: IOptions[EntryItem]): js.Array[ITask] = js.native
}

