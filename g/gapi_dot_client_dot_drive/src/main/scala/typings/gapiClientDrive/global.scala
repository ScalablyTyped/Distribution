package typings.gapiClientDrive

import typings.gapiClientDrive.gapi.client.drive.AboutResource
import typings.gapiClientDrive.gapi.client.drive.ChangesResource
import typings.gapiClientDrive.gapi.client.drive.ChannelsResource
import typings.gapiClientDrive.gapi.client.drive.CommentsResource
import typings.gapiClientDrive.gapi.client.drive.DrivesResource
import typings.gapiClientDrive.gapi.client.drive.FilesResource
import typings.gapiClientDrive.gapi.client.drive.PermissionsResource
import typings.gapiClientDrive.gapi.client.drive.RepliesResource
import typings.gapiClientDrive.gapi.client.drive.RevisionsResource
import typings.gapiClientDrive.gapi.client.drive.TeamdrivesResource
import typings.gapiClientDrive.gapiClientDriveStrings.drive
import typings.gapiClientDrive.gapiClientDriveStrings.v3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      /** Load Drive API v3 */
      def load(name: drive, version: v3): js.Thenable[Unit] = js.native
      def load(name: drive, version: v3, callback: js.Function0[_]): Unit = js.native
      @js.native
      object drive extends js.Object {
        val about: AboutResource = js.native
        val changes: ChangesResource = js.native
        val channels: ChannelsResource = js.native
        val comments: CommentsResource = js.native
        val drives: DrivesResource = js.native
        val files: FilesResource = js.native
        val permissions: PermissionsResource = js.native
        val replies: RepliesResource = js.native
        val revisions: RevisionsResource = js.native
        val teamdrives: TeamdrivesResource = js.native
      }
      
    }
    
  }
  
}

