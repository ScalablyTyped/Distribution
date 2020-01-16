package typings.easyDashXDashHeaders.zlibMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", "unzip")
@js.native
object unzip extends js.Object {
  def apply(buf: Buffer, callback: js.Function2[/* error */ Error, /* result */ js.Any, Unit]): Unit = js.native
}

