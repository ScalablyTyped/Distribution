package typings.elliptic.ellipticMod

import typings.elliptic.ellipticMod.curvesNs.PresetCurveNs.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "curves")
@js.native
object curvesNs extends js.Object {
  @js.native
  class PresetCurve protected () extends js.Object {
     // ?
    def this(options: Options) = this()
    var g: js.Any = js.native
    var hash: js.Any = js.native
     // ?
    var n: js.UndefOr[
        (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | Null
      ] = js.native
    var `type`: String = js.native
  }
  
  @JSName("PresetCurve")
  @js.native
  object PresetCurveNs extends js.Object {
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
    
  }
  
}

