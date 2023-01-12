package typings.extractDomain

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): String = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(url: String, opts: Options): String = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(urls: js.Array[String]): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(urls.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def apply(urls: js.Array[String], options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].apply(urls.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  @JSImport("extract-domain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var tld: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setTld(value: Boolean): Self = StObject.set(x, "tld", value.asInstanceOf[js.Any])
      
      inline def setTldUndefined: Self = StObject.set(x, "tld", js.undefined)
    }
  }
}
