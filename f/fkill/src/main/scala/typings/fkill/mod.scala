package typings.fkill

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fkill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(input: String, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(input: js.Array[String | Double]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(input: js.Array[String | Double], options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(input: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(input: Double, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait Options extends StObject {
    
    /**
    	Force kill the processes.
    	@default false
    	*/
    val force: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Force kill processes that did not exit within the given number of milliseconds.
    	@default undefined
    	*/
    val forceAfterTimeout: js.UndefOr[Double] = js.undefined
    
    /**
    	Ignore capitalization when killing a process.
    	Note that the case is always ignored on Windows.
    	@default false
    	*/
    val ignoreCase: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Suppress all error messages. For example: `Process doesn't exist`.
    	@default false
    	*/
    val silent: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Kill all child processes along with the parent process. _(Windows only)_
    	@default true
    	*/
    val tree: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceAfterTimeout(value: Double): Self = StObject.set(x, "forceAfterTimeout", value.asInstanceOf[js.Any])
      
      inline def setForceAfterTimeoutUndefined: Self = StObject.set(x, "forceAfterTimeout", js.undefined)
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setIgnoreCase(value: Boolean): Self = StObject.set(x, "ignoreCase", value.asInstanceOf[js.Any])
      
      inline def setIgnoreCaseUndefined: Self = StObject.set(x, "ignoreCase", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setTree(value: Boolean): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
      
      inline def setTreeUndefined: Self = StObject.set(x, "tree", js.undefined)
    }
  }
}
