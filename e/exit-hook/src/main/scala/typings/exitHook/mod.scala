package typings.exitHook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("exit-hook", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(onExit: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(onExit.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def asyncExitHook(onExit: js.Function0[Unit | js.Promise[Unit]], options: Options): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("asyncExitHook")(onExit.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def gracefulExit(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("gracefulExit")().asInstanceOf[Unit]
  inline def gracefulExit(signal: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("gracefulExit")(signal.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
    	The amount of time in milliseconds that the `onExit` function is expected to take.
    	*/
    var minimumWait: Double
  }
  object Options {
    
    inline def apply(minimumWait: Double): Options = {
      val __obj = js.Dynamic.literal(minimumWait = minimumWait.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMinimumWait(value: Double): Self = StObject.set(x, "minimumWait", value.asInstanceOf[js.Any])
    }
  }
}
