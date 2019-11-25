package typings.freedom.freedom.PgpProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicKey extends js.Object {
  var fingerprint: String
  var key: String
  var words: js.Array[String]
}

object PublicKey {
  @scala.inline
  def apply(fingerprint: String, key: String, words: js.Array[String]): PublicKey = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublicKey]
  }
}

