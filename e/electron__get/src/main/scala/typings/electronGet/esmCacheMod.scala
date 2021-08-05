package typings.electronGet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCacheMod {
  
  @JSImport("@electron/get/dist/esm/Cache", "Cache")
  @js.native
  class Cache () extends StObject {
    def this(cacheRoot: String) = this()
    
    /* private */ var cacheRoot: js.Any = js.native
    
    def getCachePath(downloadUrl: String, fileName: String): String = js.native
    
    def getPathForFileInCache(url: String, fileName: String): js.Promise[String | Null] = js.native
    
    def putFileInCache(url: String, currentPath: String, fileName: String): js.Promise[String] = js.native
  }
}
