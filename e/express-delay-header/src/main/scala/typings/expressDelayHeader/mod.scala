package typings.expressDelayHeader

import typings.expressServeStaticCore.mod.NextFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Simulates latency on express requests when header is provided
    */
  inline def apply(): NextFunction = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[NextFunction]
  inline def apply(options: Options): NextFunction = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[NextFunction]
  
  @JSImport("express-delay-header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * @default process.env.NODE_ENV
      */
    var currentEnv: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'delay'
      */
    var headerName: js.UndefOr[String] = js.undefined
    
    /**
      * @default 'development'
      */
    var nodeEnv: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * @default setTimeout
      */
    var timeoutFunction: js.UndefOr[js.Function2[/* next */ js.Function0[Unit], /* ms */ Double, Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCurrentEnv(value: String): Self = StObject.set(x, "currentEnv", value.asInstanceOf[js.Any])
      
      inline def setCurrentEnvUndefined: Self = StObject.set(x, "currentEnv", js.undefined)
      
      inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      inline def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
      
      inline def setNodeEnv(value: String | js.Array[String]): Self = StObject.set(x, "nodeEnv", value.asInstanceOf[js.Any])
      
      inline def setNodeEnvUndefined: Self = StObject.set(x, "nodeEnv", js.undefined)
      
      inline def setNodeEnvVarargs(value: String*): Self = StObject.set(x, "nodeEnv", js.Array(value*))
      
      inline def setTimeoutFunction(value: (/* next */ js.Function0[Unit], /* ms */ Double) => Unit): Self = StObject.set(x, "timeoutFunction", js.Any.fromFunction2(value))
      
      inline def setTimeoutFunctionUndefined: Self = StObject.set(x, "timeoutFunction", js.undefined)
    }
  }
}
