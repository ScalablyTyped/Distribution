package typings.easyXapiSupertest.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verify extends js.Object {
  def update(data: js.Any): Unit = js.native
  def verify(`object`: String, signature: String): Boolean = js.native
  def verify(`object`: String, signature: String, signature_format: String): Boolean = js.native
}

