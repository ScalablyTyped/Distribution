package typings.esfxInternalHashcode

import typings.esfxInternalHashcode.anon.BigIntSeed
import typings.esfxInternalHashcode.esfxInternalHashcodeNumbers.`0`
import typings.esfxInternalHashcode.esfxInternalHashcodeNumbers.`1`
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-hashcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineHashes(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("combineHashes")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hashBigInt(x: js.BigInt): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashBigInt")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hashBoolean(x: Boolean): `1` | `0` = ^.asInstanceOf[js.Dynamic].applyDynamic("hashBoolean")(x.asInstanceOf[js.Any]).asInstanceOf[`1` | `0`]
  
  inline def hashNumber(x: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashNumber")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hashObject(x: js.Object): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashObject")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hashString(x: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashString")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def hashSymbol(x: js.Symbol): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hashSymbol")(x.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  object hashUnknown {
    
    inline def apply(x: js.Any): Double = ^.asInstanceOf[js.Dynamic].apply(x.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("@esfx/internal-hashcode", "hashUnknown")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getState(): BigIntSeed = ^.asInstanceOf[js.Dynamic].applyDynamic("getState")().asInstanceOf[BigIntSeed]
    
    inline def setState_getState(
      state: Partial[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: (x : unknown): number['getState'] */ js.Any
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setState")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait Counter extends StObject {
    
    var next: Double
  }
  object Counter {
    
    inline def apply(next: Double): Counter = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counter]
    }
    
    extension [Self <: Counter](x: Self) {
      
      inline def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    }
  }
}
