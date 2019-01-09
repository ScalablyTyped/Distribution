package typings
package ellipticLib.ellipticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "curve")
@js.native
object curveNs extends js.Object {
  @js.native
  class BaseCurve protected () extends js.Object {
    def this(`type`: java.lang.String, conf: ellipticLib.ellipticMod.curveNs.BaseCurveNs.BaseCurveOptions) = this()
    var g: js.Any = js.native
     // ?
    var n: js.UndefOr[
        (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | scala.Null
      ] = js.native
     // ?
    var one: js.Any = js.native
    var p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var red: js.Any = js.native
     // ?
    var redN: js.Any = js.native
     // ?
    var two: js.Any = js.native
    var `type`: java.lang.String = js.native
     // ?
    var zero: js.Any = js.native
     // ?
    def decodePoint(bytes: js.Any, enc: java.lang.String): js.Any = js.native
  }
  
  @JSName("BaseCurve")
  @js.native
  object BaseCurveNs extends js.Object {
    trait BaseCurveOptions extends js.Object {
      var g: js.UndefOr[js.Any] = js.undefined
       // ?
      var gRed: js.UndefOr[js.Any] = js.undefined
      var n: js.UndefOr[
            scala.Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | nodeLib.Buffer
          ] = js.undefined
      var p: scala.Double | java.lang.String | js.Array[scala.Double] | nodeLib.Buffer | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any)
      var prime: js.UndefOr[
            (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | java.lang.String
          ] = js.undefined
    }
    
    @js.native
    class BasePoint protected () extends js.Object {
      def this(curve: js.Any, `type`: java.lang.String) = this()
      var curve: js.Any = js.native
      var precomputed: PrecomputedValues | scala.Null = js.native
      var `type`: java.lang.String = js.native
      def dblp(k: js.Any): js.Any = js.native
      def encode(enc: java.lang.String, compact: scala.Boolean): js.Any = js.native
      def encodeCompressed(enc: java.lang.String): js.Any = js.native
      def precompute(power: scala.Double): BasePoint = js.native
      def validate(): scala.Boolean = js.native
    }
    
    trait PrecomputedValues extends js.Object {
       // ?
      var beta: js.Any
      var doubles: js.Any
       // ?
      var naf: js.Any
    }
    
  }
  
}

