package typings.entropyString

import typings.entropyString.entropyStringStrings.bits
import typings.entropyString.entropyStringStrings.charset
import typings.entropyString.entropyStringStrings.length
import typings.entropyString.entropyStringStrings.risk
import typings.entropyString.entropyStringStrings.total
import typings.node.bufferMod.global.Buffer
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("entropy-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("entropy-string", "CHARSET")
  @js.native
  val CHARSET_ : /* "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-_" */ String = js.native
  
  @JSImport("entropy-string", "CharSet")
  @js.native
  open class CharSet protected () extends StObject {
    def this(chars: String) = this()
    
    var bitsPerChar: Double = js.native
    
    def bytesNeeded(bitLen: Double): Double = js.native
    
    var chars: String = js.native
    
    var charsPerChunk: Double = js.native
    
    var length: Double = js.native
    
    def ndxFn(chunk: Double, slice: Double, bytes: js.typedarray.ArrayBuffer): Double = js.native
  }
  
  @JSImport("entropy-string", "Entropy")
  @js.native
  open class Entropy () extends StObject {
    def this(options: Options) = this()
    
    def bits(): Double = js.native
    
    def bytesNeeded(): Double = js.native
    def bytesNeeded(bitLen: Double): Double = js.native
    def bytesNeeded(bitLen: Double, charset: CharSet): Double = js.native
    def bytesNeeded(bitLen: Unit, charset: CharSet): Double = js.native
    
    def chars(): String = js.native
    
    var charset: String | js.Array[String] = js.native
    
    def largeID(): String = js.native
    def largeID(charset: CharSet): String = js.native
    
    var length: Double = js.native
    
    def mediumID(): String = js.native
    def mediumID(charset: CharSet): String = js.native
    
    def rng(size: Double): Buffer = js.native
    
    def sessionID(): String = js.native
    def sessionID(charset: CharSet): String = js.native
    
    def smallID(): String = js.native
    def smallID(charset: CharSet): String = js.native
    
    def string(): String = js.native
    def string(bitLen: Double): String = js.native
    def string(bitLen: Double, charset: CharSet): String = js.native
    def string(bitLen: Unit, charset: CharSet): String = js.native
    
    def stringWithBytes(bytes: js.typedarray.ArrayBuffer): String = js.native
    def stringWithBytes(bytes: js.typedarray.ArrayBuffer, bitLen: Double): String = js.native
    def stringWithBytes(bytes: js.typedarray.ArrayBuffer, bitLen: Double, charset: CharSet): String = js.native
    def stringWithBytes(bytes: js.typedarray.ArrayBuffer, bitLen: Unit, charset: CharSet): String = js.native
    
    def token(): String = js.native
    def token(charset: CharSet): String = js.native
    
    def use(charset: CharSet): Unit = js.native
    
    def useChars(chars: String): Unit = js.native
  }
  /* static members */
  object Entropy {
    
    @JSImport("entropy-string", "Entropy")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bits(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("bits")().asInstanceOf[Double]
  }
  
  @JSImport("entropy-string", "HASH_LENGTH")
  @js.native
  val HASH_LENGTH: /* 6 */ Double = js.native
  
  inline def RNG(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("RNG")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @JSImport("entropy-string", "charset16")
  @js.native
  val charset16: CharSet = js.native
  
  @JSImport("entropy-string", "charset2")
  @js.native
  val charset2: CharSet = js.native
  
  @JSImport("entropy-string", "charset32")
  @js.native
  val charset32: CharSet = js.native
  
  @JSImport("entropy-string", "charset4")
  @js.native
  val charset4: CharSet = js.native
  
  @JSImport("entropy-string", "charset64")
  @js.native
  val charset64: CharSet = js.native
  
  @JSImport("entropy-string", "charset8")
  @js.native
  val charset8: CharSet = js.native
  
  type Options = RequireAtLeastOne[Opts, bits | total | risk | length | charset]
  
  trait Opts extends StObject {
    
    var bits: js.UndefOr[Double] = js.undefined
    
    var charset: js.UndefOr[CharSet | String] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var risk: js.UndefOr[Double] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object Opts {
    
    inline def apply(): Opts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      inline def setBits(value: Double): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setBitsUndefined: Self = StObject.set(x, "bits", js.undefined)
      
      inline def setCharset(value: CharSet | String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setRisk(value: Double): Self = StObject.set(x, "risk", value.asInstanceOf[js.Any])
      
      inline def setRiskUndefined: Self = StObject.set(x, "risk", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  type RequireAtLeastOne[T, Keys /* <: /* keyof T */ String */] = (Pick[T, Exclude[/* keyof T */ String, Keys]]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in Keys ]: -? std.Required<std.Pick<T, K>> & std.Partial<std.Pick<T, std.Exclude<Keys, K>>>}[Keys] */ js.Any)
}
