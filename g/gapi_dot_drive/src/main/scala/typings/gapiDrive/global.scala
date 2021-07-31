package typings.gapiDrive

import typings.gapi.gapi.client.HttpRequest
import typings.gapiDrive.gapi.client.drive.ChannelResource
import typings.gapiDrive.gapi.client.drive.CopyParameters
import typings.gapiDrive.gapi.client.drive.DeleteParameters
import typings.gapiDrive.gapi.client.drive.ExportParameters
import typings.gapiDrive.gapi.client.drive.FileListResource
import typings.gapiDrive.gapi.client.drive.FileResource
import typings.gapiDrive.gapi.client.drive.GenerateIdsParameters
import typings.gapiDrive.gapi.client.drive.GetParameters
import typings.gapiDrive.gapi.client.drive.IdsResource
import typings.gapiDrive.gapi.client.drive.InsertParameters
import typings.gapiDrive.gapi.client.drive.ListParameters
import typings.gapiDrive.gapi.client.drive.PatchParameters
import typings.gapiDrive.gapi.client.drive.TouchParameters
import typings.gapiDrive.gapi.client.drive.TrashParameters
import typings.gapiDrive.gapi.client.drive.UntrashParameters
import typings.gapiDrive.gapi.client.drive.WatchParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object drive {
        
        object files {
          
          @JSGlobal("gapi.client.drive.files")
          @js.native
          val ^ : js.Any = js.native
          
          @scala.inline
          def copy(parameters: CopyParameters): HttpRequest[FileResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[FileResource]]
          
          @scala.inline
          def delete(parameters: DeleteParameters): HttpRequest[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[js.Any]]
          
          @scala.inline
          def emptyTrash(): HttpRequest[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyTrash")().asInstanceOf[HttpRequest[js.Any]]
          
          @scala.inline
          def `export`(parameters: ExportParameters): HttpRequest[FileResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("export")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[FileResource]]
          
          @scala.inline
          def generateIds(parameters: GenerateIdsParameters): HttpRequest[IdsResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateIds")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[IdsResource]]
          
          @scala.inline
          def get(parameters: GetParameters): HttpRequest[FileResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[FileResource]]
          
          @scala.inline
          def insert(parameters: InsertParameters): HttpRequest[FileResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[FileResource]]
          
          @scala.inline
          def list(parameters: ListParameters): HttpRequest[FileListResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("list")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[FileListResource]]
          
          @scala.inline
          def patch(parameters: PatchParameters): HttpRequest[FileResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[FileResource]]
          
          @scala.inline
          def touch(parameters: TouchParameters): HttpRequest[FileResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("touch")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[FileResource]]
          
          @scala.inline
          def trash(parameters: TrashParameters): HttpRequest[FileResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("trash")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[FileResource]]
          
          @scala.inline
          def untrash(parameters: UntrashParameters): HttpRequest[FileResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("untrash")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[FileResource]]
          
          @scala.inline
          def watch(parameters: WatchParameters): HttpRequest[ChannelResource] = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(parameters.asInstanceOf[js.Any]).asInstanceOf[HttpRequest[ChannelResource]]
        }
      }
    }
  }
}
