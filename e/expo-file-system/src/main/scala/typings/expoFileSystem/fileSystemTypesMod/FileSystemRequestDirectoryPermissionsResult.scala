package typings.expoFileSystem.fileSystemTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.expoFileSystem.anon.DirectoryUri
  - typings.expoFileSystem.anon.Granted
*/
trait FileSystemRequestDirectoryPermissionsResult extends StObject
object FileSystemRequestDirectoryPermissionsResult {
  
  inline def DirectoryUri(directoryUri: String): typings.expoFileSystem.anon.DirectoryUri = {
    val __obj = js.Dynamic.literal(directoryUri = directoryUri.asInstanceOf[js.Any], granted = true)
    __obj.asInstanceOf[typings.expoFileSystem.anon.DirectoryUri]
  }
  
  inline def Granted(): typings.expoFileSystem.anon.Granted = {
    val __obj = js.Dynamic.literal(granted = false)
    __obj.asInstanceOf[typings.expoFileSystem.anon.Granted]
  }
}
