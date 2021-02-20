package typings.esfxInternalHashcode

import typings.esfxInternalHashcode.anon.BigIntSeed
import typings.esfxInternalHashcode.esfxInternalHashcodeNumbers.`0`
import typings.esfxInternalHashcode.esfxInternalHashcodeNumbers.`1`
import typings.std.Partial
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/internal-hashcode", "combineHashes")
  @js.native
  def combineHashes(x: Double, y: Double): Double = js.native
  
  @JSImport("@esfx/internal-hashcode", "hashBigInt")
  @js.native
  def hashBigInt(x: js.BigInt): Double = js.native
  
  @JSImport("@esfx/internal-hashcode", "hashBoolean")
  @js.native
  def hashBoolean(x: Boolean): `1` | `0` = js.native
  
  @JSImport("@esfx/internal-hashcode", "hashNumber")
  @js.native
  def hashNumber(x: Double): Double = js.native
  
  @JSImport("@esfx/internal-hashcode", "hashObject")
  @js.native
  def hashObject(x: js.Object): Double = js.native
  
  @JSImport("@esfx/internal-hashcode", "hashString")
  @js.native
  def hashString(x: String): Double = js.native
  
  @JSImport("@esfx/internal-hashcode", "hashSymbol")
  @js.native
  def hashSymbol(x: js.Symbol): Double = js.native
  
  object hashUnknown {
    
    @JSImport("@esfx/internal-hashcode", "hashUnknown")
    @js.native
    def apply(x: js.Any): Double = js.native
    
    @JSImport("@esfx/internal-hashcode", "hashUnknown.getState")
    @js.native
    def getState(): BigIntSeed = js.native
    
    @JSImport("@esfx/internal-hashcode", "hashUnknown.setState")
    @js.native
    def setState_getState(
      state: Partial[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: (x : unknown): number['getState'] */ js.Any
          ]
        ]
    ): Unit = js.native
  }
  
  @js.native
  trait Counter extends StObject {
    
    var next: Double = js.native
  }
  object Counter {
    
    @scala.inline
    def apply(next: Double): Counter = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
      __obj.asInstanceOf[Counter]
    }
    
    @scala.inline
    implicit class CounterMutableBuilder[Self <: Counter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: Double): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    }
  }
}
