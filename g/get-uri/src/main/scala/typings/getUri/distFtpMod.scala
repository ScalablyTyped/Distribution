package typings.getUri

import typings.ftp.mod.Options
import typings.getUri.mod.GetUriOptions
import typings.node.streamMod.Readable
import typings.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFtpMod {
  
  @JSImport("get-uri/dist/ftp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(parsed: UrlWithStringQuery, opts: FTPOptions): js.Promise[Readable] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(parsed.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Readable]]
  
  trait FTPOptions
    extends StObject
       with GetUriOptions
       with Options {
    
    @JSName("cache")
    var cache_FTPOptions: js.UndefOr[FTPReadable] = js.undefined
  }
  object FTPOptions {
    
    inline def apply(): FTPOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FTPOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FTPOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: FTPReadable): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    }
  }
  
  @js.native
  trait FTPReadable extends Readable {
    
    var lastModified: js.UndefOr[js.Date] = js.native
  }
}
