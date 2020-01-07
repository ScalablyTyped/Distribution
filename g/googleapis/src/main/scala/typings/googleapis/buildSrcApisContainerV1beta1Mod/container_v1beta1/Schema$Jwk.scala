package typings.googleapis.buildSrcApisContainerV1beta1Mod.container_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Jwk is a JSON Web Key as specified in RFC 7517
  */
@js.native
trait Schema$Jwk extends js.Object {
  /**
    * NOLINT
    */
  var alg: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var crv: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var e: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var kid: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var kty: js.UndefOr[String] = js.native
  /**
    * Fields for RSA keys. NOLINT
    */
  var n: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var use: js.UndefOr[String] = js.native
  /**
    * Fields for ECDSA keys. NOLINT
    */
  var x: js.UndefOr[String] = js.native
  /**
    * NOLINT
    */
  var y: js.UndefOr[String] = js.native
}

object Schema$Jwk {
  @scala.inline
  def apply(
    alg: String = null,
    crv: String = null,
    e: String = null,
    kid: String = null,
    kty: String = null,
    n: String = null,
    use: String = null,
    x: String = null,
    y: String = null
  ): Schema$Jwk = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (crv != null) __obj.updateDynamic("crv")(crv.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (kty != null) __obj.updateDynamic("kty")(kty.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Jwk]
  }
}

