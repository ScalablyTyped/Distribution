package typings.fsPlus.mod

import typings.fsPlus.anon.Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-plus", "writeFile")
@js.native
object writeFile extends js.Object {
  def apply(filePath: String, content: js.Any, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def apply(
    filePath: String,
    content: js.Any,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  def apply(filePath: String, content: js.Any, options: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def apply(filePath: String, content: js.Any, options: Null, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  def apply(
    filePath: String,
    content: js.Any,
    options: Encoding,
    callback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
}

