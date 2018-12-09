package typings
package gapiDotClientDotStorageLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val bucketAccessControls: gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs.BucketAccessControlsResource = js.native
  val buckets: gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs.BucketsResource = js.native
  val channels: gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs.ChannelsResource = js.native
  val defaultObjectAccessControls: gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs.DefaultObjectAccessControlsResource = js.native
  val notifications: gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs.NotificationsResource = js.native
  val objectAccessControls: gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs.ObjectAccessControlsResource = js.native
  val objects: gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs.ObjectsResource = js.native
  val projects: gapiDotClientDotStorageLib.gapiNs.clientNs.storageNs.ProjectsResource = js.native
  /** Load Cloud Storage JSON API v1 */
  def load(
    name: gapiDotClientDotStorageLib.gapiDotClientDotStorageLibStrings.storage,
    version: gapiDotClientDotStorageLib.gapiDotClientDotStorageLibStrings.v1
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotStorageLib.gapiDotClientDotStorageLibStrings.storage,
    version: gapiDotClientDotStorageLib.gapiDotClientDotStorageLibStrings.v1,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

