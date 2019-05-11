package typings
package atGoogleDashCloudPubsubLib.buildSrcSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/snapshot", "Snapshot")
@js.native
class Snapshot protected () extends js.Object {
  def this(parent: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription, name: java.lang.String) = this()
  def this(parent: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PubSub */ js.Any, name: java.lang.String) = this()
  var Promise: js.UndefOr[stdLib.PromiseConstructor] = js.native
  var metadata: js.UndefOr[atGoogleDashCloudPubsubLib.buildProtoPubsubMod.googleNs.pubsubNs.v1Ns.ISnapshot] = js.native
  var name: java.lang.String = js.native
  var parent: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PubSub */ js.Any) = js.native
  def create(): js.Promise[CreateSnapshotResponse] = js.native
  def create(callback: CreateSnapshotCallback): scala.Unit = js.native
  def create(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[CreateSnapshotResponse] = js.native
  def create(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions, callback: CreateSnapshotCallback): scala.Unit = js.native
  def delete(): js.Promise[atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyResponse] = js.native
  def delete(callback: atGoogleDashCloudPubsubLib.buildSrcPubsubMod.EmptyCallback): scala.Unit = js.native
  def seek(): js.Promise[SeekResponse] = js.native
  def seek(callback: SeekCallback): scala.Unit = js.native
  def seek(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions): js.Promise[SeekResponse] = js.native
  def seek(gaxOpts: googleDashGaxLib.buildSrcGaxMod.CallOptions, callback: SeekCallback): scala.Unit = js.native
}

/* static members */
@JSImport("@google-cloud/pubsub/build/src/snapshot", "Snapshot")
@js.native
object Snapshot extends js.Object {
  def formatName_(projectId: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

