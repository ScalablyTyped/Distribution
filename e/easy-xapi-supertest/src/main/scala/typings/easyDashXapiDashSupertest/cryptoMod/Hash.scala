package typings.easyDashXapiDashSupertest.cryptoMod

import typings.easyDashXapiDashSupertest.Buffer
import typings.easyDashXapiDashSupertest.easyDashXapiDashSupertestStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hash extends js.Object {
  def digest(): Buffer = js.native
  def digest(encoding: String): js.Any = js.native
  @JSName("digest")
  def digest_buffer(encoding: buffer): Buffer = js.native
  def update(data: js.Any): Hash = js.native
  def update(data: js.Any, input_encoding: String): Hash = js.native
}

