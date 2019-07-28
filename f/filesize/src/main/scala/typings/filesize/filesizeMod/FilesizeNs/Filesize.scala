package typings.filesize.filesizeMod.FilesizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filesize extends js.Object {
  def apply(bytes: Double): String = js.native
  def apply(bytes: Double, options: Options): String = js.native
  def partial(options: Options): js.Function1[/* bytes */ Double, String] = js.native
}

