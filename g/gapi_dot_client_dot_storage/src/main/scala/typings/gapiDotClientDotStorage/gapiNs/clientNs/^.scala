package typings.gapiDotClientDotStorage.gapiNs.clientNs

import typings.gapiDotClientDotStorage.gapiDotClientDotStorageStrings.storage
import typings.gapiDotClientDotStorage.gapiDotClientDotStorageStrings.v1
import typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs.BucketAccessControlsResource
import typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs.BucketsResource
import typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs.ChannelsResource
import typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs.DefaultObjectAccessControlsResource
import typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs.NotificationsResource
import typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs.ObjectAccessControlsResource
import typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs.ObjectsResource
import typings.gapiDotClientDotStorage.gapiNs.clientNs.storageNs.ProjectsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
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

