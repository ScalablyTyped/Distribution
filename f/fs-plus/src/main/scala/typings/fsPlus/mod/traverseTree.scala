package typings.fsPlus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "traverseTree")
@js.native
object traverseTree extends js.Object {
  def apply(
    rootPath: String,
    onFile: js.Function1[/* file */ String, Unit],
    onDirectory: js.Function1[/* dir */ String, Boolean | Unit],
    onDone: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
}

