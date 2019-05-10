package typings
package ellipticLib.ellipticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elliptic", "curve")
@js.native
object curveNs extends js.Object {
  /**
    * @description Base class for the curves
    */
  @js.native
  class base protected () extends js.Object {
    def this(`type`: java.lang.String, conf: ellipticLib.ellipticMod.curveNs.baseNs.BaseCurveOptions) = this()
    var g: ellipticLib.ellipticMod.curveNs.baseNs.BasePoint = js.native
    var n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var one: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var red: js.Any = js.native
    var redN: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var two: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var `type`: java.lang.String = js.native
     // ?
    var zero: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    def decodePoint(bytes: java.lang.String): ellipticLib.ellipticMod.curveNs.baseNs.BasePoint = js.native
    def decodePoint(bytes: nodeLib.Buffer): ellipticLib.ellipticMod.curveNs.baseNs.BasePoint = js.native
    @JSName("decodePoint")
    def decodePoint_hex(bytes: java.lang.String, enc: ellipticLib.ellipticLibStrings.hex): ellipticLib.ellipticMod.curveNs.baseNs.BasePoint = js.native
    @JSName("decodePoint")
    def decodePoint_hex(bytes: nodeLib.Buffer, enc: ellipticLib.ellipticLibStrings.hex): ellipticLib.ellipticMod.curveNs.baseNs.BasePoint = js.native
    def validate(point: ellipticLib.ellipticMod.curveNs.baseNs.BasePoint): scala.Boolean = js.native
  }
  
  @js.native
  class edwards protected () extends base {
    def this(conf: ellipticLib.ellipticMod.curveNs.edwardsNs.EdwardsConf) = this()
    var a: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var c: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var c2: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var d: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var dd: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    def point(x: ellipticLib.ellipticMod.BNInput, y: ellipticLib.ellipticMod.BNInput): ellipticLib.ellipticMod.curveNs.edwardsNs.EdwardsPoint = js.native
    def point(
      x: ellipticLib.ellipticMod.BNInput,
      y: ellipticLib.ellipticMod.BNInput,
      z: ellipticLib.ellipticMod.BNInput
    ): ellipticLib.ellipticMod.curveNs.edwardsNs.EdwardsPoint = js.native
    def point(
      x: ellipticLib.ellipticMod.BNInput,
      y: ellipticLib.ellipticMod.BNInput,
      z: ellipticLib.ellipticMod.BNInput,
      t: ellipticLib.ellipticMod.BNInput
    ): ellipticLib.ellipticMod.curveNs.edwardsNs.EdwardsPoint = js.native
    def pointFromJSON(obj: js.Array[ellipticLib.ellipticMod.BNInput]): ellipticLib.ellipticMod.curveNs.edwardsNs.EdwardsPoint = js.native
    def pointFromX(x: ellipticLib.ellipticMod.BNInput): ellipticLib.ellipticMod.curveNs.edwardsNs.EdwardsPoint = js.native
    def pointFromX(x: ellipticLib.ellipticMod.BNInput, odd: scala.Boolean): ellipticLib.ellipticMod.curveNs.edwardsNs.EdwardsPoint = js.native
    def pointFromY(y: ellipticLib.ellipticMod.BNInput): ellipticLib.ellipticMod.curveNs.edwardsNs.EdwardsPoint = js.native
    def pointFromY(y: ellipticLib.ellipticMod.BNInput, odd: scala.Boolean): ellipticLib.ellipticMod.curveNs.edwardsNs.EdwardsPoint = js.native
  }
  
  @js.native
  class short protected () extends base {
    def this(conf: ellipticLib.ellipticMod.curveNs.shortNs.ShortConf) = this()
    var a: ellipticLib.ellipticMod.BNInput = js.native
    var b: ellipticLib.ellipticMod.BNInput = js.native
    @JSName("g")
    var g_short: ellipticLib.ellipticMod.curveNs.shortNs.ShortPoint = js.native
    def point(x: ellipticLib.ellipticMod.BNInput, y: ellipticLib.ellipticMod.BNInput): ellipticLib.ellipticMod.curveNs.shortNs.ShortPoint = js.native
    def point(x: ellipticLib.ellipticMod.BNInput, y: ellipticLib.ellipticMod.BNInput, isRed: scala.Boolean): ellipticLib.ellipticMod.curveNs.shortNs.ShortPoint = js.native
    def pointFromJSON(obj: js.Array[ellipticLib.ellipticMod.BNInput], red: scala.Boolean): ellipticLib.ellipticMod.curveNs.shortNs.ShortPoint = js.native
    def pointFromX(x: ellipticLib.ellipticMod.BNInput): ellipticLib.ellipticMod.curveNs.shortNs.ShortPoint = js.native
    def pointFromX(x: ellipticLib.ellipticMod.BNInput, odd: scala.Boolean): ellipticLib.ellipticMod.curveNs.shortNs.ShortPoint = js.native
  }
  
  @JSName("base")
  @js.native
  object baseNs extends js.Object {
    trait BaseCurveOptions extends js.Object {
      var g: js.UndefOr[BasePoint] = js.undefined
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
      def this(curve: ellipticLib.ellipticMod.curveNs.base, `type`: java.lang.String) = this()
      var curve: ellipticLib.ellipticMod.curveNs.base = js.native
      var precomputed: PrecomputedValues | scala.Null = js.native
      var `type`: java.lang.String = js.native
      def add(p: BasePoint): BasePoint = js.native
      def dbl(): BasePoint = js.native
      def dblp(k: scala.Double): BasePoint = js.native
      @JSName("encodeCompressed")
      def encodeCompressed_array(enc: ellipticLib.ellipticLibStrings.array): js.Any = js.native
      @JSName("encodeCompressed")
      def encodeCompressed_hex(enc: ellipticLib.ellipticLibStrings.hex): js.Any = js.native
      @JSName("encode")
      def encode_array(enc: ellipticLib.ellipticLibStrings.array, compact: scala.Boolean): java.lang.String | nodeLib.Buffer = js.native
      @JSName("encode")
      def encode_hex(enc: ellipticLib.ellipticLibStrings.hex, compact: scala.Boolean): java.lang.String | nodeLib.Buffer = js.native
      def eq(p: BasePoint): scala.Boolean = js.native
      def getX(): js.Any = js.native
      def getY(): js.Any = js.native
      def inspect(): java.lang.String = js.native
      def isInfinity(): scala.Boolean = js.native
      def mul(k: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any): BasePoint = js.native
      def neg(): BasePoint = js.native
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
  
  @JSName("edwards")
  @js.native
  object edwardsNs extends js.Object {
    trait EdwardsConf
      extends ellipticLib.ellipticMod.curveNs.baseNs.BaseCurveOptions {
      var a: ellipticLib.ellipticMod.BNInput
      var c: ellipticLib.ellipticMod.BNInput
      var d: ellipticLib.ellipticMod.BNInput
    }
    
    @js.native
    class EdwardsPoint ()
      extends ellipticLib.ellipticMod.curveNs.baseNs.BasePoint {
      var t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      var x: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      var y: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      var z: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      def eqXToP(x: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any): scala.Boolean = js.native
      def normalize(): EdwardsPoint = js.native
    }
    
  }
  
  @JSName("short")
  @js.native
  object shortNs extends js.Object {
    trait ShortConf
      extends ellipticLib.ellipticMod.curveNs.baseNs.BaseCurveOptions {
      var a: ellipticLib.ellipticMod.BNInput
      var b: ellipticLib.ellipticMod.BNInput
      var beta: js.UndefOr[ellipticLib.ellipticMod.BNInput] = js.undefined
      var lambda: js.UndefOr[ellipticLib.ellipticMod.BNInput] = js.undefined
    }
    
    @js.native
    class ShortPoint ()
      extends ellipticLib.ellipticMod.curveNs.baseNs.BasePoint {
      var inf: scala.Boolean = js.native
      var x: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | scala.Null = js.native
      var y: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | scala.Null = js.native
      def toJSON(): js.Array[ellipticLib.ellipticMod.BNInput] = js.native
    }
    
  }
  
}

