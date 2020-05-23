package typings.gapiClientStorage

import typings.gapiClientStorage.gapi.client.storage.BucketAccessControlsResource
import typings.gapiClientStorage.gapi.client.storage.BucketsResource
import typings.gapiClientStorage.gapi.client.storage.ChannelsResource
import typings.gapiClientStorage.gapi.client.storage.DefaultObjectAccessControlsResource
import typings.gapiClientStorage.gapi.client.storage.NotificationsResource
import typings.gapiClientStorage.gapi.client.storage.ObjectAccessControlsResource
import typings.gapiClientStorage.gapi.client.storage.ObjectsResource
import typings.gapiClientStorage.gapi.client.storage.ProjectsResource
import typings.gapiClientStorage.gapiClientStorageStrings.storage
import typings.gapiClientStorage.gapiClientStorageStrings.v1
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
      val bucketAccessControls: BucketAccessControlsResource = js.native
      val buckets: BucketsResource = js.native
      val channels: ChannelsResource = js.native
      val defaultObjectAccessControls: DefaultObjectAccessControlsResource = js.native
      val notifications: NotificationsResource = js.native
      val objectAccessControls: ObjectAccessControlsResource = js.native
      val objects: ObjectsResource = js.native
      val projects: ProjectsResource = js.native
      /** Load Cloud Storage JSON API v1 */
      def load(name: storage, version: v1): js.Thenable[Unit] = js.native
      def load(name: storage, version: v1, callback: js.Function0[_]): Unit = js.native
    }
    
  }
  
}

