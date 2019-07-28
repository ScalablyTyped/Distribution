package typings.gapiDotClientDotOauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alg extends js.Object {
  var alg: js.UndefOr[String] = js.undefined
  var e: js.UndefOr[String] = js.undefined
  var kid: js.UndefOr[String] = js.undefined
  var kty: js.UndefOr[String] = js.undefined
  var n: js.UndefOr[String] = js.undefined
  var use: js.UndefOr[String] = js.undefined
}

object Anon_Alg {
  @scala.inline
  def apply(
    alg: String = null,
    e: String = null,
    kid: String = null,
    kty: String = null,
    n: String = null,
    use: String = null
  ): Anon_Alg = {
    val __obj = js.Dynamic.literal()
    if (alg != null) __obj.updateDynamic("alg")(alg)
    if (e != null) __obj.updateDynamic("e")(e)
    if (kid != null) __obj.updateDynamic("kid")(kid)
    if (kty != null) __obj.updateDynamic("kty")(kty)
    if (n != null) __obj.updateDynamic("n")(n)
    if (use != null) __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[Anon_Alg]
  }
}

