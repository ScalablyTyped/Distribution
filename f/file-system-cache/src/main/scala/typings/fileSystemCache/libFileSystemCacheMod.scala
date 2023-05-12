package typings.fileSystemCache

import typings.fileSystemCache.anon.Files
import typings.fileSystemCache.anon.Key
import typings.fileSystemCache.anon.Path
import typings.fileSystemCache.anon.Paths
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFileSystemCacheMod {
  
  @JSImport("file-system-cache/lib/FileSystemCache", "FileSystemCache")
  @js.native
  open class FileSystemCache () extends StObject {
    def this(options: FileSystemCacheOptions) = this()
    
    var basePath: String = js.native
    
    var basePathExists: js.UndefOr[Boolean] = js.native
    
    def clear(): js.Promise[Unit] = js.native
    
    def ensureBasePath(): js.Promise[Unit] = js.native
    
    var `extension`: js.UndefOr[String] = js.native
    
    def fileExists(key: String): js.Promise[Boolean] = js.native
    
    def get(key: String): js.Promise[Any] = js.native
    def get(key: String, defaultValue: Any): js.Promise[Any] = js.native
    
    def getSync(key: String): Any = js.native
    def getSync(key: String, defaultValue: Any): Any = js.native
    
    def load(): js.Promise[Files] = js.native
    
    var ns: js.UndefOr[Any] = js.native
    
    def path(key: String): String = js.native
    
    def remove(key: String): js.Promise[Unit] = js.native
    
    def save(input: js.Array[js.UndefOr[Key | Null]]): js.Promise[Paths] = js.native
    
    def set(key: String, value: Any): js.Promise[Path] = js.native
    
    def setSync(key: String, value: Any): this.type = js.native
  }
  
  trait FileSystemCacheOptions extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var `extension`: js.UndefOr[String] = js.undefined
    
    var ns: js.UndefOr[Any] = js.undefined
  }
  object FileSystemCacheOptions {
    
    inline def apply(): FileSystemCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSystemCacheOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileSystemCacheOptions] (val x: Self) extends AnyVal {
      
      inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setNs(value: Any): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
    }
  }
}
