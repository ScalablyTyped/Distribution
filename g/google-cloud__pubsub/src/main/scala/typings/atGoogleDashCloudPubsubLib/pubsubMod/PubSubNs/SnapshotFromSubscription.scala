package typings
package atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotFromSubscription extends Snapshot {
  def create(name: java.lang.String): stdLib.Promise[js.Array[_]] = js.native
  def create(
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.SnapshotNs.CreateCallback
  ): scala.Unit = js.native
  def seek(): stdLib.Promise[js.Array[_]] = js.native
  def seek(callback: atGoogleDashCloudPubsubLib.pubsubMod.PubSubNs.SnapshotNs.SeekCallback): scala.Unit = js.native
}

