package typings.elliptic.ellipticMod

import typings.elliptic.ellipticMod.curveNs.base
import typings.elliptic.ellipticMod.curveNs.baseNs.BaseCurveOptions
import typings.elliptic.ellipticMod.curveNs.baseNs.BasePoint
import typings.elliptic.ellipticMod.curveNs.baseNs.PrecomputedValues
import typings.elliptic.ellipticMod.curveNs.edwardsNs.EdwardsConf
import typings.elliptic.ellipticMod.curveNs.edwardsNs.EdwardsPoint
import typings.elliptic.ellipticMod.curveNs.shortNs.ShortConf
import typings.elliptic.ellipticMod.curveNs.shortNs.ShortPoint
import typings.elliptic.ellipticStrings.array
import typings.elliptic.ellipticStrings.hex
import typings.node.Buffer
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
    def this(`type`: String, conf: BaseCurveOptions) = this()
    var g: BasePoint = js.native
    var n: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var one: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var p: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var red: js.Any = js.native
    var redN: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var two: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var `type`: String = js.native
     // ?
    var zero: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    def decodePoint(bytes: String): BasePoint = js.native
    def decodePoint(bytes: Buffer): BasePoint = js.native
    @JSName("decodePoint")
    def decodePoint_hex(bytes: String, enc: hex): BasePoint = js.native
    @JSName("decodePoint")
    def decodePoint_hex(bytes: Buffer, enc: hex): BasePoint = js.native
    def validate(point: BasePoint): Boolean = js.native
  }
  
  @js.native
  class edwards protected () extends base {
    def this(conf: EdwardsConf) = this()
    var a: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var c: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var c2: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var d: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    var dd: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    def point(x: BNInput, y: BNInput): EdwardsPoint = js.native
    def point(x: BNInput, y: BNInput, z: BNInput): EdwardsPoint = js.native
    def point(x: BNInput, y: BNInput, z: BNInput, t: BNInput): EdwardsPoint = js.native
    def pointFromJSON(obj: js.Array[BNInput]): EdwardsPoint = js.native
    def pointFromX(x: BNInput): EdwardsPoint = js.native
    def pointFromX(x: BNInput, odd: Boolean): EdwardsPoint = js.native
    def pointFromY(y: BNInput): EdwardsPoint = js.native
    def pointFromY(y: BNInput, odd: Boolean): EdwardsPoint = js.native
  }
  
  @js.native
  class short protected () extends base {
    def this(conf: ShortConf) = this()
    var a: BNInput = js.native
    var b: BNInput = js.native
    @JSName("g")
    var g_short: ShortPoint = js.native
    def point(x: BNInput, y: BNInput): ShortPoint = js.native
    def point(x: BNInput, y: BNInput, isRed: Boolean): ShortPoint = js.native
    def pointFromJSON(obj: js.Array[BNInput], red: Boolean): ShortPoint = js.native
    def pointFromX(x: BNInput): ShortPoint = js.native
    def pointFromX(x: BNInput, odd: Boolean): ShortPoint = js.native
  }
  
  @JSName("base")
  @js.native
  object baseNs extends js.Object {
    trait BaseCurveOptions extends js.Object {
      var g: js.UndefOr[BasePoint] = js.undefined
      var gRed: js.UndefOr[js.Any] = js.undefined
      var n: js.UndefOr[
            Double | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | Buffer
          ] = js.undefined
      var p: Double | String | js.Array[Double] | Buffer | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any)
      var prime: js.UndefOr[
            (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | String
          ] = js.undefined
    }
    
    @js.native
    class BasePoint protected () extends js.Object {
      def this(curve: base, `type`: String) = this()
      var curve: base = js.native
      var precomputed: PrecomputedValues | Null = js.native
      var `type`: String = js.native
      def add(p: BasePoint): BasePoint = js.native
      def dbl(): BasePoint = js.native
      def dblp(k: Double): BasePoint = js.native
      def encode(enc: js.UndefOr[scala.Nothing], compact: Boolean): js.Array[Double] = js.native
      def encodeCompressed(): js.Array[Double] = js.native
      @JSName("encodeCompressed")
      def encodeCompressed_array(enc: array): js.Array[Double] = js.native
      @JSName("encodeCompressed")
      def encodeCompressed_hex(enc: hex): String = js.native
      @JSName("encode")
      def encode_array(enc: array, compact: Boolean): js.Array[Double] = js.native
      @JSName("encode")
      def encode_hex(enc: hex, compact: Boolean): String = js.native
      def eq(p: BasePoint): Boolean = js.native
      def getX(): js.Any = js.native
      def getY(): js.Any = js.native
      def inspect(): String = js.native
      def isInfinity(): Boolean = js.native
      def mul(k: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any): BasePoint = js.native
      def neg(): BasePoint = js.native
      def precompute(power: Double): BasePoint = js.native
      def validate(): Boolean = js.native
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
    trait EdwardsConf extends BaseCurveOptions {
      var a: BNInput
      var c: BNInput
      var d: BNInput
    }
    
    @js.native
    class EdwardsPoint () extends BasePoint {
      var t: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      var x: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      var y: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      var z: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      def eqXToP(x: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any): Boolean = js.native
      def normalize(): EdwardsPoint = js.native
    }
    
  }
  
  @JSName("short")
  @js.native
  object shortNs extends js.Object {
    trait ShortConf extends BaseCurveOptions {
      var a: BNInput
      var b: BNInput
      var beta: js.UndefOr[BNInput] = js.undefined
      var lambda: js.UndefOr[BNInput] = js.undefined
    }
    
    @js.native
    class ShortPoint () extends BasePoint {
      var inf: Boolean = js.native
      var x: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | Null = js.native
      var y: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any) | Null = js.native
      def toJSON(): js.Array[BNInput] = js.native
    }
    
  }
  
}

