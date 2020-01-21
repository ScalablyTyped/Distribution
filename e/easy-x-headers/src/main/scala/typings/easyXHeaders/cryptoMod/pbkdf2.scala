package typings.easyXHeaders.cryptoMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "pbkdf2")
@js.native
object pbkdf2 extends js.Object {
  def apply(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
  def apply(
    password: String,
    salt: String,
    iterations: Double,
    keylen: Double,
    digest: String,
    callback: js.Function2[/* err */ Error, /* derivedKey */ Buffer, _]
  ): Unit = js.native
}

