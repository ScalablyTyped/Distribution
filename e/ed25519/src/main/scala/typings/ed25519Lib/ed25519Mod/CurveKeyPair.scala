package typings
package ed25519Lib.ed25519Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CurveKeyPair extends js.Object {
  /**
       * A Buffer containing the private, secret portion of the Curve25519 key.
       */
  var privateKey: nodeLib.Buffer
  /**
       * A Buffer containing the public portion of the Curve25519 key.
       */
  var publicKey: nodeLib.Buffer
}

