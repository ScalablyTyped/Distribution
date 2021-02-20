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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object drive {
        
        object files {
          
          @JSGlobal("gapi.client.drive.files.copy")
          @js.native
          def copy(parameters: CopyParameters): HttpRequest[FileResource] = js.native
          
          @JSGlobal("gapi.client.drive.files.delete")
          @js.native
          def delete(parameters: DeleteParameters): HttpRequest[_] = js.native
          
          @JSGlobal("gapi.client.drive.files.emptyTrash")
          @js.native
          def emptyTrash(): HttpRequest[_] = js.native
          
          @JSGlobal("gapi.client.drive.files.export")
          @js.native
          def export(parameters: ExportParameters): HttpRequest[FileResource] = js.native
          
          @JSGlobal("gapi.client.drive.files.generateIds")
          @js.native
          def generateIds(parameters: GenerateIdsParameters): HttpRequest[IdsResource] = js.native
          
          @JSGlobal("gapi.client.drive.files.get")
          @js.native
          def get(parameters: GetParameters): HttpRequest[FileResource] = js.native
          
          @JSGlobal("gapi.client.drive.files.insert")
          @js.native
          def insert(parameters: InsertParameters): HttpRequest[FileResource] = js.native
          
          @JSGlobal("gapi.client.drive.files.list")
          @js.native
          def list(parameters: ListParameters): HttpRequest[FileListResource] = js.native
          
          @JSGlobal("gapi.client.drive.files.patch")
          @js.native
          def patch(parameters: PatchParameters): HttpRequest[FileResource] = js.native
          
          @JSGlobal("gapi.client.drive.files.touch")
          @js.native
          def touch(parameters: TouchParameters): HttpRequest[FileResource] = js.native
          
          @JSGlobal("gapi.client.drive.files.trash")
          @js.native
          def trash(parameters: TrashParameters): HttpRequest[FileResource] = js.native
          
          @JSGlobal("gapi.client.drive.files.untrash")
          @js.native
          def untrash(parameters: UntrashParameters): HttpRequest[FileResource] = js.native
          
          @JSGlobal("gapi.client.drive.files.watch")
          @js.native
          def watch(parameters: WatchParameters): HttpRequest[ChannelResource] = js.native
        }
      }
    }
  }
}
