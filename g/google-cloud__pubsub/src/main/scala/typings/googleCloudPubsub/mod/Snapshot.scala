package typings.googleCloudPubsub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/pubsub", "Snapshot")
@js.native
class Snapshot protected ()
  extends typings.googleCloudPubsub.snapshotMod.Snapshot {
  def this(parent: typings.googleCloudPubsub.pubsubMod.PubSub, name: String) = this()
  def this(parent: typings.googleCloudPubsub.subscriptionMod.Subscription, name: String) = this()
}
/* static members */
object Snapshot {
  
  @JSImport("@google-cloud/pubsub", "Snapshot.formatName_")
  @js.native
  def formatName_(projectId: String, name: String): String = js.native
}
