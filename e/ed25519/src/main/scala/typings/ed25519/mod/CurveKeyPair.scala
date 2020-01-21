package typings.ed25519.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurveKeyPair extends js.Object {
  /**
    * A Buffer containing the private, secret portion of the Curve25519 key.
    */
  var privateKey: Buffer
  /**
    * A Buffer containing the public portion of the Curve25519 key.
    */
  var publicKey: Buffer
}

object CurveKeyPair {
  @scala.inline
  def apply(privateKey: Buffer, publicKey: Buffer): CurveKeyPair = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CurveKeyPair]
  }
}

