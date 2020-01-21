package typings.fileExists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-exists", "sync")
@js.native
object sync extends js.Object {
  def apply(filepath: String): Boolean = js.native
  def apply(filepath: String, options: Options): Boolean = js.native
}

