package typings.fileUrl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(filePath: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(filePath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    /**
    	Passing `false` will make it not call `path.resolve()` on the path.
    	@default true
    	*/
    val resolve: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setResolve(value: Boolean): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
}
