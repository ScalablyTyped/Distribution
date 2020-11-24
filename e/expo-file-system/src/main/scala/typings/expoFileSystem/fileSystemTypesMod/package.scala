package typings.expoFileSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fileSystemTypesMod {
  
  type DownloadProgressCallback = js.Function1[
    /* data */ typings.expoFileSystem.fileSystemTypesMod.DownloadProgressData, 
    scala.Unit
  ]
  
  type FileSystemUploadOptions = (typings.expoFileSystem.anon.UploadType | typings.expoFileSystem.anon.FieldName) with typings.expoFileSystem.anon.Headers
  
  type PlatformMethod = js.Function1[/* repeated */ js.Any, js.Promise[js.Any]]
}
