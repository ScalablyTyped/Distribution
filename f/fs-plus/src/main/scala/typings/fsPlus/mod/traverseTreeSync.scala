package typings.fsPlus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "traverseTreeSync")
@js.native
object traverseTreeSync extends js.Object {
  def apply(
    rootPath: String,
    onFile: js.Function1[/* file */ String, Unit],
    onDirectory: js.Function1[/* dir */ String, Boolean | Unit]
  ): Unit = js.native
}

