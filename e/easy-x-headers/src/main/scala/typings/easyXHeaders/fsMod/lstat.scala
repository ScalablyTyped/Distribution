package typings.easyXHeaders.fsMod

import typings.easyXHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "lstat")
@js.native
object lstat extends js.Object {
  def apply(path: String): Unit = js.native
  def apply(path: String, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, _]): Unit = js.native
}

