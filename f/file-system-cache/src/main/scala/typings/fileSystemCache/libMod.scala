package typings.fileSystemCache

import typings.fileSystemCache.libFileSystemCacheMod.FileSystemCacheOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("file-system-cache/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): typings.fileSystemCache.libFileSystemCacheMod.FileSystemCache = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[typings.fileSystemCache.libFileSystemCacheMod.FileSystemCache]
  inline def default(options: FileSystemCacheOptions): typings.fileSystemCache.libFileSystemCacheMod.FileSystemCache = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[typings.fileSystemCache.libFileSystemCacheMod.FileSystemCache]
  
  @JSImport("file-system-cache/lib", "FileSystemCache")
  @js.native
  open class FileSystemCache ()
    extends typings.fileSystemCache.libFileSystemCacheMod.FileSystemCache {
    def this(options: FileSystemCacheOptions) = this()
  }
}
