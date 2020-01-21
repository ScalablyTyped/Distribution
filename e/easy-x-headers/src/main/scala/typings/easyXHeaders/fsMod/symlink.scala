package typings.easyXHeaders.fsMod

import typings.easyXHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "symlink")
@js.native
object symlink extends js.Object {
  def apply(srcpath: String, dstpath: String): Unit = js.native
  def apply(srcpath: String, dstpath: String, `type`: String): Unit = js.native
  def apply(
    srcpath: String,
    dstpath: String,
    `type`: String,
    callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]
  ): Unit = js.native
}

