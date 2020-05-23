package typings.elliptic.mod.curves.PresetCurve

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
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], gRed = gRed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], prime = prime.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (basis != null) __obj.updateDynamic("basis")(basis.asInstanceOf[js.Any])
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (lambda != null) __obj.updateDynamic("lambda")(lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

