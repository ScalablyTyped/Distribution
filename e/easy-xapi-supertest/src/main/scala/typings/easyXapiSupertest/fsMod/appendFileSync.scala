package typings.easyXapiSupertest.fsMod

import typings.easyXapiSupertest.anon.EncodingFlag
import typings.easyXapiSupertest.anon.Mode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "appendFileSync")
@js.native
object appendFileSync extends js.Object {
  def apply(filename: String, data: js.Any): Unit = js.native
  def apply(filename: String, data: js.Any, options: EncodingFlag): Unit = js.native
  def apply(filename: String, data: js.Any, options: Mode): Unit = js.native
}

