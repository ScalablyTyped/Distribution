package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUriMod {
  
  @JSImport("fbjs/lib/URI", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with URI {
    def this(uri: String) = this()
    
    /* CompleteClass */
    var _uri: String = js.native
  }
  
  trait URI extends StObject {
    
    var _uri: String
  }
  object URI {
    
    inline def apply(_uri: String): URI = {
      val __obj = js.Dynamic.literal(_uri = _uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[URI]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: URI] (val x: Self) extends AnyVal {
      
      inline def set_uri(value: String): Self = StObject.set(x, "_uri", value.asInstanceOf[js.Any])
    }
  }
}
