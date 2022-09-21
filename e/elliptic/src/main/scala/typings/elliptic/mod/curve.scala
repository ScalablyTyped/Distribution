package typings.elliptic.mod

import typings.elliptic.ellipticStrings.array
import typings.elliptic.ellipticStrings.hex
import typings.elliptic.mod.curve.base.BaseCurveOptions
import typings.elliptic.mod.curve.base.BasePoint
import typings.elliptic.mod.curve.edwards.EdwardsConf
import typings.elliptic.mod.curve.edwards.EdwardsPoint
import typings.elliptic.mod.curve.short.ShortConf
import typings.elliptic.mod.curve.short.ShortPoint
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curve {
  
  /**
    * @description Base class for the curves
    */
  @JSImport("elliptic", "curve.base")
  @js.native
  open class base protected () extends StObject {
    def this(`type`: String, conf: BaseCurveOptions) = this()
    
    def decodePoint(bytes: String): BasePoint = js.native
    def decodePoint(bytes: Buffer): BasePoint = js.native
    @JSName("decodePoint")
    def decodePoint_hex(bytes: String, enc: hex): BasePoint = js.native
    @JSName("decodePoint")
    def decodePoint_hex(bytes: Buffer, enc: hex): BasePoint = js.native
    
    var g: BasePoint = js.native
    
    var n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var one: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var red: Any = js.native
    
    var redN: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var two: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var `type`: String = js.native
    
    def validate(point: BasePoint): Boolean = js.native
    
    // ?
    var zero: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
  }
  object base {
    
    @JSImport("elliptic", "curve.base.BasePoint")
    @js.native
    open class BasePoint protected () extends StObject {
      def this(curve: base, `type`: String) = this()
      
      def add(p: BasePoint): BasePoint = js.native
      
      var curve: base = js.native
      
      def dbl(): BasePoint = js.native
      
      def dblp(k: Double): BasePoint = js.native
      
      def encode(enc: Unit, compact: Boolean): js.Array[Double] = js.native
      
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
      
      def getX(): Any = js.native
      
      def getY(): Any = js.native
      
      def inspect(): String = js.native
      
      def isInfinity(): Boolean = js.native
      
      def mul(k: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any): BasePoint = js.native
      
      def neg(): BasePoint = js.native
      
      def precompute(power: Double): BasePoint = js.native
      
      var precomputed: PrecomputedValues | Null = js.native
      
      var `type`: String = js.native
      
      def validate(): Boolean = js.native
    }
    
    trait BaseCurveOptions extends StObject {
      
      var g: js.UndefOr[BasePoint] = js.undefined
      
      var gRed: js.UndefOr[Any] = js.undefined
      
      var n: js.UndefOr[
            Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any) | Buffer
          ] = js.undefined
      
      var p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any)
      
      var prime: js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any) | String
          ] = js.undefined
    }
    object BaseCurveOptions {
      
      inline def apply(
        p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any)
      ): BaseCurveOptions = {
        val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseCurveOptions]
      }
      
      extension [Self <: BaseCurveOptions](x: Self) {
        
        inline def setG(value: BasePoint): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        inline def setGRed(value: Any): Self = StObject.set(x, "gRed", value.asInstanceOf[js.Any])
        
        inline def setGRedUndefined: Self = StObject.set(x, "gRed", js.undefined)
        
        inline def setGUndefined: Self = StObject.set(x, "g", js.undefined)
        
        inline def setN(
          value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any) | Buffer
        ): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
        
        inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
        
        inline def setP(
          value: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any)
        ): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        inline def setPVarargs(value: Double*): Self = StObject.set(x, "p", js.Array(value*))
        
        inline def setPrime(
          value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any) | String
        ): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
        
        inline def setPrimeUndefined: Self = StObject.set(x, "prime", js.undefined)
      }
    }
    
    trait PrecomputedValues extends StObject {
      
      // ?
      var beta: Any
      
      var doubles: Any
      
      // ?
      var naf: Any
    }
    object PrecomputedValues {
      
      inline def apply(beta: Any, doubles: Any, naf: Any): PrecomputedValues = {
        val __obj = js.Dynamic.literal(beta = beta.asInstanceOf[js.Any], doubles = doubles.asInstanceOf[js.Any], naf = naf.asInstanceOf[js.Any])
        __obj.asInstanceOf[PrecomputedValues]
      }
      
      extension [Self <: PrecomputedValues](x: Self) {
        
        inline def setBeta(value: Any): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
        
        inline def setDoubles(value: Any): Self = StObject.set(x, "doubles", value.asInstanceOf[js.Any])
        
        inline def setNaf(value: Any): Self = StObject.set(x, "naf", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("elliptic", "curve.edwards")
  @js.native
  open class edwards protected () extends base {
    def this(conf: EdwardsConf) = this()
    
    var a: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var c: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var c2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var d: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    var dd: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    
    def point(x: BNInput, y: BNInput): EdwardsPoint = js.native
    def point(x: BNInput, y: BNInput, z: Unit, t: BNInput): EdwardsPoint = js.native
    def point(x: BNInput, y: BNInput, z: BNInput): EdwardsPoint = js.native
    def point(x: BNInput, y: BNInput, z: BNInput, t: BNInput): EdwardsPoint = js.native
    
    def pointFromJSON(obj: js.Array[BNInput]): EdwardsPoint = js.native
    
    def pointFromX(x: BNInput): EdwardsPoint = js.native
    def pointFromX(x: BNInput, odd: Boolean): EdwardsPoint = js.native
    
    def pointFromY(y: BNInput): EdwardsPoint = js.native
    def pointFromY(y: BNInput, odd: Boolean): EdwardsPoint = js.native
  }
  object edwards {
    
    @JSImport("elliptic", "curve.edwards.EdwardsPoint")
    @js.native
    open class EdwardsPoint protected () extends BasePoint {
      def this(curve: base, `type`: String) = this()
      
      def eqXToP(x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any): Boolean = js.native
      
      def normalize(): EdwardsPoint = js.native
      
      var t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
      
      var x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
      
      var y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
      
      var z: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any = js.native
    }
    
    trait EdwardsConf
      extends StObject
         with BaseCurveOptions {
      
      var a: BNInput
      
      var c: BNInput
      
      var d: BNInput
    }
    object EdwardsConf {
      
      inline def apply(
        a: BNInput,
        c: BNInput,
        d: BNInput,
        p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any)
      ): EdwardsConf = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
        __obj.asInstanceOf[EdwardsConf]
      }
      
      extension [Self <: EdwardsConf](x: Self) {
        
        inline def setA(value: BNInput): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        inline def setAVarargs(value: Double*): Self = StObject.set(x, "a", js.Array(value*))
        
        inline def setC(value: BNInput): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
        
        inline def setCVarargs(value: Double*): Self = StObject.set(x, "c", js.Array(value*))
        
        inline def setD(value: BNInput): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
        
        inline def setDVarargs(value: Double*): Self = StObject.set(x, "d", js.Array(value*))
      }
    }
  }
  
  @JSImport("elliptic", "curve.short")
  @js.native
  open class short protected () extends base {
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
  object short {
    
    @JSImport("elliptic", "curve.short.ShortPoint")
    @js.native
    open class ShortPoint protected () extends BasePoint {
      def this(curve: base, `type`: String) = this()
      
      var inf: Boolean = js.native
      
      def toJSON(): js.Array[BNInput] = js.native
      
      var x: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any) | Null = js.native
      
      var y: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any) | Null = js.native
    }
    
    trait ShortConf
      extends StObject
         with BaseCurveOptions {
      
      var a: BNInput
      
      var b: BNInput
      
      var beta: js.UndefOr[BNInput] = js.undefined
      
      var lambda: js.UndefOr[BNInput] = js.undefined
    }
    object ShortConf {
      
      inline def apply(
        a: BNInput,
        b: BNInput,
        p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ Any)
      ): ShortConf = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
        __obj.asInstanceOf[ShortConf]
      }
      
      extension [Self <: ShortConf](x: Self) {
        
        inline def setA(value: BNInput): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        inline def setAVarargs(value: Double*): Self = StObject.set(x, "a", js.Array(value*))
        
        inline def setB(value: BNInput): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        inline def setBVarargs(value: Double*): Self = StObject.set(x, "b", js.Array(value*))
        
        inline def setBeta(value: BNInput): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
        
        inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
        
        inline def setBetaVarargs(value: Double*): Self = StObject.set(x, "beta", js.Array(value*))
        
        inline def setLambda(value: BNInput): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
        
        inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
        
        inline def setLambdaVarargs(value: Double*): Self = StObject.set(x, "lambda", js.Array(value*))
      }
    }
  }
}
