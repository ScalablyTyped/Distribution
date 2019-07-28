package typings.easyDashXDashHeaders.cryptoMod

import typings.easyDashXDashHeaders.Buffer
import typings.easyDashXDashHeaders.easyDashXDashHeadersStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hmac extends js.Object {
  def digest(): Buffer = js.native
  def digest(encoding: String): js.Any = js.native
  @JSName("digest")
  def digest_buffer(encoding: buffer): Buffer = js.native
  def update(data: js.Any): Hmac = js.native
  def update(data: js.Any, input_encoding: String): Hmac = js.native
}

