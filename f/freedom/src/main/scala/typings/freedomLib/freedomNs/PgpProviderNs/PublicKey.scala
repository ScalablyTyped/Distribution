package typings
package freedomLib.freedomNs.PgpProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  var fingerprint: java.lang.String
  var key: java.lang.String
  var words: js.Array[java.lang.String]
}

object PublicKey {
  @scala.inline
  def apply(fingerprint: java.lang.String, key: java.lang.String, words: js.Array[java.lang.String]): PublicKey = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint, key = key, words = words)
  
    __obj.asInstanceOf[PublicKey]
  }
}

