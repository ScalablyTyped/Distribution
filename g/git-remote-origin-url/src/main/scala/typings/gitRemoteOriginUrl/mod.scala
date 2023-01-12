package typings.gitRemoteOriginUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-remote-origin-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[String]]
  inline def default(options: Options): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait Options extends StObject {
    
    /**
    	The current working directory.
    	@default process.cwd()
    	*/
    val cwd: js.UndefOr[String] = js.undefined
    
    /**
    	The Git remote name.
    	@default 'origin'
    	*/
    val remoteName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setRemoteName(value: String): Self = StObject.set(x, "remoteName", value.asInstanceOf[js.Any])
      
      inline def setRemoteNameUndefined: Self = StObject.set(x, "remoteName", js.undefined)
    }
  }
}
