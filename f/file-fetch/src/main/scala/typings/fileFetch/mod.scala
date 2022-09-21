package typings.fileFetch

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("file-fetch", JSImport.Namespace)
  @js.native
  val ^ : FileFetch = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("file-fetch", "Headers")
  @js.native
  open class Headers ()
    extends typings.nodeFetch.mod.Headers
  
  @js.native
  trait Fetch extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
  }
  
  @js.native
  trait FileFetch
    extends StObject
       with Fetch {
    
    var Headers: Instantiable0[typings.nodeFetch.mod.Headers] = js.native
    
    def create(): FileFetch = js.native
    def create(opts: FileFetchOptions): FileFetch = js.native
  }
  
  trait FileFetchOptions extends StObject {
    
    var baseDir: js.UndefOr[String] = js.undefined
    
    var baseURL: js.UndefOr[String] = js.undefined
  }
  object FileFetchOptions {
    
    inline def apply(): FileFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileFetchOptions]
    }
    
    extension [Self <: FileFetchOptions](x: Self) {
      
      inline def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
      
      inline def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
      
      inline def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      inline def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
    }
  }
  
  type _To = FileFetch
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FileFetch = ^
}
