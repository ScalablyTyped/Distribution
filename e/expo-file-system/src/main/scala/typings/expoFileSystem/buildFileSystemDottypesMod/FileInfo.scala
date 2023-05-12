package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.expoFileSystem.anon.Exists
  - typings.expoFileSystem.anon.IsDirectory
*/
trait FileInfo extends StObject
object FileInfo {
  
  inline def Exists(isDirectory: Boolean, modificationTime: Double, size: Double, uri: String): typings.expoFileSystem.anon.Exists = {
    val __obj = js.Dynamic.literal(exists = true, isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.expoFileSystem.anon.Exists]
  }
  
  inline def IsDirectory(uri: String): typings.expoFileSystem.anon.IsDirectory = {
    val __obj = js.Dynamic.literal(exists = false, isDirectory = false, uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.expoFileSystem.anon.IsDirectory]
  }
}
