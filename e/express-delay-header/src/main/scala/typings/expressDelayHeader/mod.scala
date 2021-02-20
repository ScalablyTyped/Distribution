package typings.expressDelayHeader

import typings.expressServeStaticCore.mod.NextFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Simulates latency on express requests when header is provided
    */
  @JSImport("express-delay-header", JSImport.Namespace)
  @js.native
  def apply(): NextFunction = js.native
  @JSImport("express-delay-header", JSImport.Namespace)
  @js.native
  def apply(options: Options): NextFunction = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
      * @default process.env.NODE_ENV
      */
    var currentEnv: js.UndefOr[String] = js.native
    
    /**
      * @default 'delay'
      */
    var headerName: js.UndefOr[String] = js.native
    
    /**
      * @default 'development'
      */
    var nodeEnv: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
      * @default setTimeout
      */
    var timeoutFunction: js.UndefOr[js.Function2[/* next */ js.Function0[Unit], /* ms */ Double, Unit]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentEnv(value: String): Self = StObject.set(x, "currentEnv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentEnvUndefined: Self = StObject.set(x, "currentEnv", js.undefined)
      
      @scala.inline
      def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderNameUndefined: Self = StObject.set(x, "headerName", js.undefined)
      
      @scala.inline
      def setNodeEnv(value: String | js.Array[String]): Self = StObject.set(x, "nodeEnv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeEnvUndefined: Self = StObject.set(x, "nodeEnv", js.undefined)
      
      @scala.inline
      def setNodeEnvVarargs(value: String*): Self = StObject.set(x, "nodeEnv", js.Array(value :_*))
      
      @scala.inline
      def setTimeoutFunction(value: (/* next */ js.Function0[Unit], /* ms */ Double) => Unit): Self = StObject.set(x, "timeoutFunction", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTimeoutFunctionUndefined: Self = StObject.set(x, "timeoutFunction", js.undefined)
    }
  }
}
