package typings.easyDashXapiDashSupertest.zlibMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", "inflateRaw")
@js.native
object inflateRaw extends js.Object {
  def apply(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
}

