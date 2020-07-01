package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crv extends js.Object {
  var crv: js.UndefOr[String] = js.undefined
  var kty: js.UndefOr[String] = js.undefined
  var x: js.UndefOr[String] = js.undefined
  var y: js.UndefOr[String] = js.undefined
}

object Crv {
  @scala.inline
  def apply(crv: String = null, kty: String = null, x: String = null, y: String = null): Crv = {
    val __obj = js.Dynamic.literal()
    if (crv != null) __obj.updateDynamic("crv")(crv.asInstanceOf[js.Any])
    if (kty != null) __obj.updateDynamic("kty")(kty.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crv]
  }
}

