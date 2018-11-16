package typings
package filesizeLib.filesizeMod.FilesizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filesize extends js.Object {
  def apply(bytes: scala.Double): java.lang.String = js.native
  def apply(bytes: scala.Double, options: Options): java.lang.String = js.native
  def partial(options: Options): js.Function1[/* bytes */ scala.Double, java.lang.String] = js.native
}

