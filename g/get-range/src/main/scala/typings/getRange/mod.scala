package typings.getRange

import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(range: Range): IterableIterator[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(range.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Double]]
  
  trait Range extends StObject {
    
    /**
    	End of the range.
    	*/
    val end: Double
    
    /**
    	Start of the range.
    	@default 0
    	*/
    val start: js.UndefOr[Double] = js.undefined
    
    /**
    	Distance between numbers.
    	Minimum: `1`.
    	@default 1
    	*/
    val step: js.UndefOr[Double] = js.undefined
  }
  object Range {
    
    inline def apply(end: Double): Range = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any])
      __obj.asInstanceOf[Range]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
