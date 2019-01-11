package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotFromSubscription extends Snapshot {
  def create(name: java.lang.String): js.Promise[js.Array[_]] = js.native
  def create(
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SnapshotNs.CreateCallback
  ): scala.Unit = js.native
  def seek(): js.Promise[js.Array[_]] = js.native
  def seek(callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SnapshotNs.SeekCallback): scala.Unit = js.native
}

