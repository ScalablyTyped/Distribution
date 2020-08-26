package typings.fileExists.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-exists", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(filepath: String): Unit = js.native
  def apply(filepath: String, callback: js.Function2[/* err */ Error | Null, /* exists */ Boolean, Unit]): Unit = js.native
  def apply(
    filepath: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ Error | Null, /* exists */ Boolean, Unit]
  ): Unit = js.native
  def apply(filepath: String, options: Options): Unit = js.native
  def apply(
    filepath: String,
    options: Options,
    callback: js.Function2[/* err */ Error | Null, /* exists */ Boolean, Unit]
  ): Unit = js.native
}

