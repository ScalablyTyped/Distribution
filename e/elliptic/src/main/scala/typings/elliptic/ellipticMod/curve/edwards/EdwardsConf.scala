package typings.elliptic.ellipticMod.curve.edwards

import typings.elliptic.ellipticMod.BNInput
import typings.elliptic.ellipticMod.curve.base.BaseCurveOptions
import typings.elliptic.ellipticMod.curve.base.BasePoint
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdwardsConf extends BaseCurveOptions {
  var a: BNInput
  var c: BNInput
  var d: BNInput
}

object EdwardsConf {
  @scala.inline
  def apply(
    a: BNInput,
    c: BNInput,
    d: BNInput,
    p: Double | String | js.Array[Double] | Buffer | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any),
    g: BasePoint = null,
    gRed: js.Any = null,
    n: Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | Buffer = null,
    prime: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | String = null
  ): EdwardsConf = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
    if (g != null) __obj.updateDynamic("g")(g)
    if (gRed != null) __obj.updateDynamic("gRed")(gRed)
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (prime != null) __obj.updateDynamic("prime")(prime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdwardsConf]
  }
}

