package typings.elliptic.ellipticMod.curve.short

import typings.elliptic.ellipticMod.BNInput
import typings.elliptic.ellipticMod.curve.base.BasePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "curve.short.ShortPoint")
@js.native
class ShortPoint () extends BasePoint {
  var inf: Boolean = js.native
  var x: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | Null = js.native
  var y: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | Null = js.native
  def toJSON(): js.Array[BNInput] = js.native
}

