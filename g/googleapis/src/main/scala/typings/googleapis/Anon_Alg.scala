package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Alg extends js.Object {
  var alg: js.UndefOr[String] = js.native
  var e: js.UndefOr[String] = js.native
  var kid: js.UndefOr[String] = js.native
  var kty: js.UndefOr[String] = js.native
  var n: js.UndefOr[String] = js.native
  var use: js.UndefOr[String] = js.native
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
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (e != null) __obj.updateDynamic("e")(e.asInstanceOf[js.Any])
    if (kid != null) __obj.updateDynamic("kid")(kid.asInstanceOf[js.Any])
    if (kty != null) __obj.updateDynamic("kty")(kty.asInstanceOf[js.Any])
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (use != null) __obj.updateDynamic("use")(use.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alg]
  }
}

