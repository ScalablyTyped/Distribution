package typings
package ellipticLib.ellipticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "curves")
@js.native
object curvesNs extends js.Object {
  @js.native
  class PresetCurve protected () extends js.Object {
     // ?
    def this(options: ellipticLib.ellipticMod.curvesNs.PresetCurveNs.Options) = this()
    var g: js.Any = js.native
    var hash: js.Any = js.native
     // ?
    var n: js.UndefOr[
        (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | scala.Null
      ] = js.native
    var `type`: java.lang.String = js.native
  }
  
  @JSName("PresetCurve")
  @js.native
  object PresetCurveNs extends js.Object {
    trait Options extends js.Object {
      var a: java.lang.String
      var b: java.lang.String
      var basis: js.UndefOr[js.Any] = js.undefined
       // ?
      var beta: js.UndefOr[java.lang.String] = js.undefined
      var g: js.Any
      var gRed: scala.Boolean
      var hash: js.Any
      var lambda: js.UndefOr[java.lang.String] = js.undefined
      var n: java.lang.String
      var p: java.lang.String
      var prime: java.lang.String | scala.Null
      var `type`: java.lang.String
    }
    
  }
  
}

