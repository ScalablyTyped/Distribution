package typings.elliptic.mod

import typings.elliptic.ellipticStrings.array
import typings.elliptic.ellipticStrings.hex
import typings.elliptic.mod.curve.base.BaseCurveOptions
import typings.elliptic.mod.curve.base.BasePoint
import typings.elliptic.mod.curve.edwards.EdwardsConf
import typings.elliptic.mod.curve.edwards.EdwardsPoint
import typings.elliptic.mod.curve.short.ShortConf
import typings.elliptic.mod.curve.short.ShortPoint
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object curve {
  
  /**
    * @description Base class for the curves
    */
  @JSImport("elliptic", "curve.base")
  @js.native
  class base protected () extends StObject {
    def this(`type`: String, conf: BaseCurveOptions) = this()
    
    def decodePoint(bytes: String): BasePoint = js.native
    def decodePoint(bytes: Buffer): BasePoint = js.native
    @JSName("decodePoint")
    def decodePoint_hex(bytes: String, enc: hex): BasePoint = js.native
    @JSName("decodePoint")
    def decodePoint_hex(bytes: Buffer, enc: hex): BasePoint = js.native
    
    var g: BasePoint = js.native
    
    var n: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var one: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var p: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var red: js.Any = js.native
    
    var redN: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var two: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var `type`: String = js.native
    
    def validate(point: BasePoint): Boolean = js.native
    
    // ?
    var zero: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
  }
  object base {
    
    @JSImport("elliptic", "curve.base.BasePoint")
    @js.native
    class BasePoint protected () extends StObject {
      def this(curve: base, `type`: String) = this()
      
      def add(p: BasePoint): BasePoint = js.native
      
      var curve: base = js.native
      
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
      
      def mul(
        k: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): BasePoint = js.native
      
      def neg(): BasePoint = js.native
      
      def precompute(power: Double): BasePoint = js.native
      
      var precomputed: PrecomputedValues | Null = js.native
      
      var `type`: String = js.native
      
      def validate(): Boolean = js.native
    }
    
    @js.native
    trait BaseCurveOptions extends StObject {
      
      var g: js.UndefOr[BasePoint] = js.native
      
      var gRed: js.UndefOr[js.Any] = js.native
      
      var n: js.UndefOr[
            Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Buffer
          ] = js.native
      
      var p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) = js.native
      
      var prime: js.UndefOr[
            (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | String
          ] = js.native
    }
    object BaseCurveOptions {
      
      @scala.inline
      def apply(
        p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
      ): BaseCurveOptions = {
        val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any])
        __obj.asInstanceOf[BaseCurveOptions]
      }
      
      @scala.inline
      implicit class BaseCurveOptionsMutableBuilder[Self <: BaseCurveOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setG(value: BasePoint): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGRed(value: js.Any): Self = StObject.set(x, "gRed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGRedUndefined: Self = StObject.set(x, "gRed", js.undefined)
        
        @scala.inline
        def setGUndefined: Self = StObject.set(x, "g", js.undefined)
        
        @scala.inline
        def setN(
          value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Buffer
        ): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNUndefined: Self = StObject.set(x, "n", js.undefined)
        
        @scala.inline
        def setP(
          value: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
        ): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPVarargs(value: Double*): Self = StObject.set(x, "p", js.Array(value :_*))
        
        @scala.inline
        def setPrime(
          value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | String
        ): Self = StObject.set(x, "prime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrimeUndefined: Self = StObject.set(x, "prime", js.undefined)
      }
    }
    
    @js.native
    trait PrecomputedValues extends StObject {
      
      // ?
      var beta: js.Any = js.native
      
      var doubles: js.Any = js.native
      
      // ?
      var naf: js.Any = js.native
    }
    object PrecomputedValues {
      
      @scala.inline
      def apply(beta: js.Any, doubles: js.Any, naf: js.Any): PrecomputedValues = {
        val __obj = js.Dynamic.literal(beta = beta.asInstanceOf[js.Any], doubles = doubles.asInstanceOf[js.Any], naf = naf.asInstanceOf[js.Any])
        __obj.asInstanceOf[PrecomputedValues]
      }
      
      @scala.inline
      implicit class PrecomputedValuesMutableBuilder[Self <: PrecomputedValues] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBeta(value: js.Any): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDoubles(value: js.Any): Self = StObject.set(x, "doubles", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNaf(value: js.Any): Self = StObject.set(x, "naf", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("elliptic", "curve.edwards")
  @js.native
  class edwards protected () extends base {
    def this(conf: EdwardsConf) = this()
    
    var a: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var c: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var c2: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var d: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    var dd: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    
    def point(x: BNInput, y: BNInput): EdwardsPoint = js.native
    def point(x: BNInput, y: BNInput, z: js.UndefOr[BNInput], t: BNInput): EdwardsPoint = js.native
    def point(x: BNInput, y: BNInput, z: BNInput): EdwardsPoint = js.native
    
    def pointFromJSON(obj: js.Array[BNInput]): EdwardsPoint = js.native
    
    def pointFromX(x: BNInput): EdwardsPoint = js.native
    def pointFromX(x: BNInput, odd: Boolean): EdwardsPoint = js.native
    
    def pointFromY(y: BNInput): EdwardsPoint = js.native
    def pointFromY(y: BNInput, odd: Boolean): EdwardsPoint = js.native
  }
  object edwards {
    
    @JSImport("elliptic", "curve.edwards.EdwardsPoint")
    @js.native
    class EdwardsPoint protected () extends BasePoint {
      def this(curve: base, `type`: String) = this()
      
      def eqXToP(
        x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
      ): Boolean = js.native
      
      def normalize(): EdwardsPoint = js.native
      
      var t: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      
      var x: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      
      var y: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
      
      var z: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any = js.native
    }
    
    @js.native
    trait EdwardsConf extends BaseCurveOptions {
      
      var a: BNInput = js.native
      
      var c: BNInput = js.native
      
      var d: BNInput = js.native
    }
    object EdwardsConf {
      
      @scala.inline
      def apply(
        a: BNInput,
        c: BNInput,
        d: BNInput,
        p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
      ): EdwardsConf = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], c = c.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
        __obj.asInstanceOf[EdwardsConf]
      }
      
      @scala.inline
      implicit class EdwardsConfMutableBuilder[Self <: EdwardsConf] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(value: BNInput): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAVarargs(value: Double*): Self = StObject.set(x, "a", js.Array(value :_*))
        
        @scala.inline
        def setC(value: BNInput): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCVarargs(value: Double*): Self = StObject.set(x, "c", js.Array(value :_*))
        
        @scala.inline
        def setD(value: BNInput): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDVarargs(value: Double*): Self = StObject.set(x, "d", js.Array(value :_*))
      }
    }
  }
  
  @JSImport("elliptic", "curve.short")
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
  object short {
    
    @JSImport("elliptic", "curve.short.ShortPoint")
    @js.native
    class ShortPoint protected () extends BasePoint {
      def this(curve: base, `type`: String) = this()
      
      var inf: Boolean = js.native
      
      def toJSON(): js.Array[BNInput] = js.native
      
      var x: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Null = js.native
      
      var y: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any) | Null = js.native
    }
    
    @js.native
    trait ShortConf extends BaseCurveOptions {
      
      var a: BNInput = js.native
      
      var b: BNInput = js.native
      
      var beta: js.UndefOr[BNInput] = js.native
      
      var lambda: js.UndefOr[BNInput] = js.native
    }
    object ShortConf {
      
      @scala.inline
      def apply(
        a: BNInput,
        b: BNInput,
        p: Double | String | js.Array[Double] | Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any)
      ): ShortConf = {
        val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any])
        __obj.asInstanceOf[ShortConf]
      }
      
      @scala.inline
      implicit class ShortConfMutableBuilder[Self <: ShortConf] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setA(value: BNInput): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAVarargs(value: Double*): Self = StObject.set(x, "a", js.Array(value :_*))
        
        @scala.inline
        def setB(value: BNInput): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBVarargs(value: Double*): Self = StObject.set(x, "b", js.Array(value :_*))
        
        @scala.inline
        def setBeta(value: BNInput): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
        
        @scala.inline
        def setBetaVarargs(value: Double*): Self = StObject.set(x, "beta", js.Array(value :_*))
        
        @scala.inline
        def setLambda(value: BNInput): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
        
        @scala.inline
        def setLambdaVarargs(value: Double*): Self = StObject.set(x, "lambda", js.Array(value :_*))
      }
    }
  }
}
