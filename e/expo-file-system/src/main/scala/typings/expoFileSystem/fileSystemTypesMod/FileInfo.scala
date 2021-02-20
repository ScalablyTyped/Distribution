package typings.expoFileSystem.fileSystemTypesMod

import typings.expoFileSystem.expoFileSystemBooleans.`false`
import typings.expoFileSystem.expoFileSystemBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.expoFileSystem.anon.Exists
  - typings.expoFileSystem.anon.IsDirectory
*/
trait FileInfo extends StObject
object FileInfo {
  
  @scala.inline
  def Exists(exists: `true`, isDirectory: Boolean, modificationTime: Double, size: Double, uri: String): typings.expoFileSystem.anon.Exists = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.expoFileSystem.anon.Exists]
  }
  
  @scala.inline
  def IsDirectory(exists: `false`, isDirectory: `false`, uri: String): typings.expoFileSystem.anon.IsDirectory = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.expoFileSystem.anon.IsDirectory]
  }
}
