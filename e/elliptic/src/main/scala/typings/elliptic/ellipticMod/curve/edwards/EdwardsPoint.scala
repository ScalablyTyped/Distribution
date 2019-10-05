package typings.elliptic.ellipticMod.curve.edwards

import typings.elliptic.ellipticMod.curve.base.BasePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "curve.edwards.EdwardsPoint")
@js.native
class EdwardsPoint () extends BasePoint {
  var t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var x: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var y: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  var z: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  def eqXToP(x: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any): Boolean = js.native
  def normalize(): EdwardsPoint = js.native
}

