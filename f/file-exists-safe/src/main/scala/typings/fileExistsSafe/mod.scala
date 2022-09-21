package typings.fileExistsSafe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-exists-safe/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileExists(path: String): js.Promise[js.UndefOr[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExists")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Boolean]]]
  inline def fileExists(path: String, options: Options): js.Promise[js.UndefOr[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileExists")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Boolean]]]
  
  inline def fileExistsSync(path: String): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  inline def fileExistsSync(path: String, options: Options): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  trait Options extends StObject {
    
    /**
      * Return true if path is directory. Default: `false`
      */
    var includeDirectories: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setIncludeDirectories(value: Boolean): Self = StObject.set(x, "includeDirectories", value.asInstanceOf[js.Any])
      
      inline def setIncludeDirectoriesUndefined: Self = StObject.set(x, "includeDirectories", js.undefined)
    }
  }
}
