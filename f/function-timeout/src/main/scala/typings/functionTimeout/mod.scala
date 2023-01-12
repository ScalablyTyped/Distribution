package typings.functionTimeout

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("function-timeout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: js.Function */](function_ : T, options: Options): T = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(function_.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def isTimeoutError(error: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeoutError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    /**
    	The time in milliseconds to wait before timing out.
    	Keep in mind that execution time can vary between different hardware and Node.js versions. Set a generous timeout to avoid flakiness.
    	*/
    val timeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
