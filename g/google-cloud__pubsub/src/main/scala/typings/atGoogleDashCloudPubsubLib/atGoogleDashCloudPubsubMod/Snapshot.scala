package typings
package atGoogleDashCloudPubsubLib.atGoogleDashCloudPubsubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub", "Snapshot")
@js.native
class Snapshot protected ()
  extends atGoogleDashCloudPubsubLib.buildSrcSnapshotMod.Snapshot {
  def this(parent: atGoogleDashCloudPubsubLib.buildSrcSubscriptionMod.Subscription, name: java.lang.String) = this()
  def this(parent: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify PubSub */ js.Any, name: java.lang.String) = this()
}

/* static members */
@JSImport("@google-cloud/pubsub", "Snapshot")
@js.native
object Snapshot extends js.Object {
  def formatName_(projectId: java.lang.String, name: java.lang.String): java.lang.String = js.native
}

