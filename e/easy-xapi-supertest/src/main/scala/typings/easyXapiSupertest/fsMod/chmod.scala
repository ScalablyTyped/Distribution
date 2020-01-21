package typings.easyXapiSupertest.fsMod

import typings.easyXapiSupertest.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "chmod")
@js.native
object chmod extends js.Object {
  def apply(path: String, mode: String): Unit = js.native
  def apply(path: String, mode: String, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
  def apply(path: String, mode: Double): Unit = js.native
  def apply(path: String, mode: Double, callback: js.Function1[/* err */ js.UndefOr[ErrnoException], Unit]): Unit = js.native
}

