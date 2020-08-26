package typings.easyXHeaders.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vm", "runInNewContext")
@js.native
object runInNewContext extends js.Object {
  def apply(code: String): Unit = js.native
  def apply(code: String, sandbox: js.UndefOr[scala.Nothing], filename: String): Unit = js.native
  def apply(code: String, sandbox: Context): Unit = js.native
  def apply(code: String, sandbox: Context, filename: String): Unit = js.native
}

