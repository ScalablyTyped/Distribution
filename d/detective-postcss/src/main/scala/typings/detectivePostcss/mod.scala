package typings.detectivePostcss

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(src: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  inline def apply(src: Any, options: Options): js.Array[Any] = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  @JSImport("detective-postcss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("detective-postcss", "MalformedCssError")
  @js.native
  open class MalformedCssError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait Options extends StObject {
    
    var url: Boolean
  }
  object Options {
    
    inline def apply(url: Boolean): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setUrl(value: Boolean): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
