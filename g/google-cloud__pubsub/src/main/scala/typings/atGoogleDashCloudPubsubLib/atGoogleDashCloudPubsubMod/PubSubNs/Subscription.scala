package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription
  extends nodeLib.eventsMod.EventEmitter {
  var iam: IAM = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def close(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.CloseCallback
  ): scala.Unit = js.native
  def createSnapshot(name: java.lang.String): js.Promise[js.Array[_]] = js.native
  def createSnapshot(
    name: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.CreateSnapshotCallback
  ): scala.Unit = js.native
  def createSnapshot(
    name: java.lang.String,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions
  ): js.Promise[js.Array[_]] = js.native
  def createSnapshot(
    name: java.lang.String,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.CreateSnapshotCallback
  ): scala.Unit = js.native
  def delete(): js.Promise[js.Array[_]] = js.native
  def delete(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.DeleteCallback
  ): scala.Unit = js.native
  def delete(gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions): js.Promise[js.Array[_]] = js.native
  def delete(
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.DeleteCallback
  ): scala.Unit = js.native
  def exists(): js.Promise[js.Array[_]] = js.native
  def exists(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.ExistsCallback
  ): scala.Unit = js.native
  def get(): js.Promise[js.Array[_]] = js.native
   // TODO: only expose autoCreate
  // NOTE: The following are not documented, but are possible signatures base on the source code
  def get(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.GetCallback
  ): scala.Unit = js.native
  def get(gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions): js.Promise[js.Array[_]] = js.native
  def get(
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.GetCallback
  ): scala.Unit = js.native
  def getMetadata(): js.Promise[js.Array[_]] = js.native
  def getMetadata(
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.GetMetadataCallback
  ): scala.Unit = js.native
  def getMetadata(gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions): js.Promise[js.Array[_]] = js.native
  def getMetadata(
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.GetMetadataCallback
  ): scala.Unit = js.native
  def modifyPushConfig(config: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.PushConfig): js.Promise[js.Array[_]] = js.native
  def modifyPushConfig(
    config: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.PushConfig,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.ModifyPushConfigCallback
  ): scala.Unit = js.native
  def modifyPushConfig(
    config: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.PushConfig,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions
  ): js.Promise[js.Array[_]] = js.native
  def modifyPushConfig(
    config: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.PushConfig,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.ModifyPushConfigCallback
  ): scala.Unit = js.native
  def seek(
    snapshot: java.lang.String,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.SeekCallback
  ): scala.Unit = js.native
  def seek(
    snapshot: java.lang.String,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.SeekCallback
  ): scala.Unit = js.native
  def seek(
    snapshot: stdLib.Date,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.SeekCallback
  ): scala.Unit = js.native
  def seek(
    snapshot: stdLib.Date,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.SeekCallback
  ): scala.Unit = js.native
  def setMetadata(metadata: js.Object): js.Promise[js.Array[_]] = js.native
  def setMetadata(
    metadata: js.Object,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.SetMetadataCallback
  ): scala.Unit = js.native
  def setMetadata(
    metadata: js.Object,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions
  ): js.Promise[js.Array[_]] = js.native
  def setMetadata(
    metadata: js.Object,
    gaxOpts: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.GAXNs.CallOptions,
    callback: atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod.PubSubNs.SubscriptionNs.SetMetadataCallback
  ): scala.Unit = js.native
  def snapshot(name: java.lang.String): SnapshotFromSubscription = js.native
}

