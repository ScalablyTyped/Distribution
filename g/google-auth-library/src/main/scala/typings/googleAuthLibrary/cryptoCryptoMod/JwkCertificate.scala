package typings.googleAuthLibrary.cryptoCryptoMod

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
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[JwkCertificate]
  }
}

