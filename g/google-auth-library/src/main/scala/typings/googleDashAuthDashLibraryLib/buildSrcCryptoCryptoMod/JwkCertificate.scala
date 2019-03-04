package typings
package googleDashAuthDashLibraryLib.buildSrcCryptoCryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JwkCertificate extends js.Object {
  var alg: java.lang.String
  var e: java.lang.String
  var kid: java.lang.String
  var kty: java.lang.String
  var n: java.lang.String
  var use: js.UndefOr[java.lang.String] = js.undefined
}

object JwkCertificate {
  @scala.inline
  def apply(
    alg: java.lang.String,
    e: java.lang.String,
    kid: java.lang.String,
    kty: java.lang.String,
    n: java.lang.String,
    use: java.lang.String = null
  ): JwkCertificate = {
    val __obj = js.Dynamic.literal(alg = alg, e = e, kid = kid, kty = kty, n = n)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[JwkCertificate]
  }
}

