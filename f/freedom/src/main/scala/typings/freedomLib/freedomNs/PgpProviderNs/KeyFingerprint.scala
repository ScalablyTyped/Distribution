package typings
package freedomLib.freedomNs.PgpProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyFingerprint extends js.Object {
  var fingerprint: java.lang.String
  var words: js.Array[java.lang.String]
}

object KeyFingerprint {
  @scala.inline
  def apply(fingerprint: java.lang.String, words: js.Array[java.lang.String]): KeyFingerprint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fingerprint")(fingerprint)
    __obj.updateDynamic("words")(words)
    __obj.asInstanceOf[KeyFingerprint]
  }
}

