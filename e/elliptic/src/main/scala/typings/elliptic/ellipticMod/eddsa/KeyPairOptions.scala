package typings.elliptic.ellipticMod.eddsa

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyPairOptions extends js.Object {
  var pub: Buffer | Point
  var secret: Buffer
}

object KeyPairOptions {
  @scala.inline
  def apply(pub: Buffer | Point, secret: Buffer): KeyPairOptions = {
    val __obj = js.Dynamic.literal(pub = pub.asInstanceOf[js.Any], secret = secret)
  
    __obj.asInstanceOf[KeyPairOptions]
  }
}

