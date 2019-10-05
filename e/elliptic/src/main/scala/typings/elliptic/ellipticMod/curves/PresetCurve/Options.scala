package typings.elliptic.ellipticMod.curves.PresetCurve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var a: String
  var b: String
  var basis: js.UndefOr[js.Any] = js.undefined
   // ?
  var beta: js.UndefOr[String] = js.undefined
  var g: js.Any
  var gRed: Boolean
  var hash: js.Any
  var lambda: js.UndefOr[String] = js.undefined
  var n: String
  var p: String
  var prime: String | Null
  var `type`: String
}

object Options {
  @scala.inline
  def apply(
    a: String,
    b: String,
    g: js.Any,
    gRed: Boolean,
    hash: js.Any,
    n: String,
    p: String,
    `type`: String,
    basis: js.Any = null,
    beta: String = null,
    lambda: String = null,
    prime: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(a = a, b = b, g = g, gRed = gRed, hash = hash, n = n, p = p)
    __obj.updateDynamic("type")(`type`)
    if (basis != null) __obj.updateDynamic("basis")(basis)
    if (beta != null) __obj.updateDynamic("beta")(beta)
    if (lambda != null) __obj.updateDynamic("lambda")(lambda)
    if (prime != null) __obj.updateDynamic("prime")(prime)
    __obj.asInstanceOf[Options]
  }
}

