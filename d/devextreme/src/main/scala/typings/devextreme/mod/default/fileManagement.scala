package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.fileManagement.CustomFileSystemProviderOptions
import typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBaseOptions
import typings.devextreme.mod.DevExpress.fileManagement.ObjectFileSystemProviderOptions
import typings.devextreme.mod.DevExpress.fileManagement.RemoteFileSystemProviderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "fileManagement")
@js.native
object fileManagement extends js.Object {
  @js.native
  class CustomFileSystemProvider ()
    extends typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: CustomFileSystemProviderOptions) = this()
  }
  
  @js.native
  class FileSystemItem ()
    extends typings.devextreme.mod.DevExpress.fileManagement.FileSystemItem
  
  @js.native
  class FileSystemProviderBase ()
    extends typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: FileSystemProviderBaseOptions[typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase]) = this()
  }
  
  @js.native
  class ObjectFileSystemProvider ()
    extends typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: ObjectFileSystemProviderOptions) = this()
  }
  
  @js.native
  class RemoteFileSystemProvider ()
    extends typings.devextreme.mod.DevExpress.fileManagement.FileSystemProviderBase {
    def this(options: RemoteFileSystemProviderOptions) = this()
  }
  
}

