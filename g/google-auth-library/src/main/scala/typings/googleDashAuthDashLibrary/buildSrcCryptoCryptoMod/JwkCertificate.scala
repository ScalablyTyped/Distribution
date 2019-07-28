package typings.googleDashAuthDashLibrary.buildSrcCryptoCryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JwkCertificate extends js.Object {
  var alg: String
  var e: String
  var kid: String
  var kty: String
  var n: String
  var use: js.UndefOr[String] = js.undefined
}

object JwkCertificate {
  @scala.inline
  def apply(alg: String, e: String, kid: String, kty: String, n: String, use: String = null): JwkCertificate = {
    val __obj = js.Dynamic.literal(alg = alg, e = e, kid = kid, kty = kty, n = n)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[JwkCertificate]
  }
}

