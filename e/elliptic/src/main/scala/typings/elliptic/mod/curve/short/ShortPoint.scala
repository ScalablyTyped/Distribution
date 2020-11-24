package typings.elliptic.mod.curve.short

import typings.elliptic.mod.BNInput
import typings.elliptic.mod.curve.base.BasePoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elliptic", "curve.short.ShortPoint")
@js.native
class ShortPoint () extends BasePoint {
  
  var inf: Boolean = js.native
  
  def toJSON(): js.Array[BNInput] = js.native
  
  var x: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Null = js.native
  
  var y: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Null = js.native
}
