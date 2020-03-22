package typings.fsMerger

import typings.minimatch.mod.IMinimatch
import typings.walkSync.mod.Entry
import typings.walkSync.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallBaseDirInputOptions extends js.Object {
  def apply(baseDir: String): js.Array[Entry] = js.native
  def apply(baseDir: String, inputOptions: js.Array[String | IMinimatch]): js.Array[Entry] = js.native
  def apply(baseDir: String, inputOptions: Options): js.Array[Entry] = js.native
}

