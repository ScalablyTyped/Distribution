package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServiceAccountKeyRequest extends js.Object {
  /**
    * Which type of key and algorithm to use for the key.
    * The default is currently a 2K RSA key.  However this may change in the
    * future.
    */
  var keyAlgorithm: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The output format of the private key. `GOOGLE_CREDENTIALS_FILE` is the
    * default output format.
    */
  var privateKeyType: js.UndefOr[java.lang.String] = js.undefined
}

