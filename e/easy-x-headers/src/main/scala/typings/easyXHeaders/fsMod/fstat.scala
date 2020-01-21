package typings.easyXHeaders.fsMod

import typings.easyXHeaders.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "fstat")
@js.native
object fstat extends js.Object {
  def apply(fd: Double): Unit = js.native
  def apply(fd: Double, callback: js.Function2[/* err */ ErrnoException, /* stats */ Stats, _]): Unit = js.native
}

