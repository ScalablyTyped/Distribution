package typings.expoFileSystem.buildFileSystemDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.expoFileSystem.anon.UploadOptionsBinaryheader
  - typings.expoFileSystem.anon.UploadOptionsMultiparthea
*/
trait FileSystemUploadOptions extends StObject
object FileSystemUploadOptions {
  
  inline def UploadOptionsBinaryheader(): typings.expoFileSystem.anon.UploadOptionsBinaryheader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.expoFileSystem.anon.UploadOptionsBinaryheader]
  }
  
  inline def UploadOptionsMultiparthea(uploadType: FileSystemUploadType): typings.expoFileSystem.anon.UploadOptionsMultiparthea = {
    val __obj = js.Dynamic.literal(uploadType = uploadType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.expoFileSystem.anon.UploadOptionsMultiparthea]
  }
}
