package typings
package gapiDotClientDotPubsubLib.gapiNs.clientNs.pubsubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var snapshots: SnapshotsResource
  var subscriptions: SubscriptionsResource
  var topics: TopicsResource
}

object ProjectsResource {
  @scala.inline
  def apply(snapshots: SnapshotsResource, subscriptions: SubscriptionsResource, topics: TopicsResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(snapshots = snapshots, subscriptions = subscriptions, topics = topics)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

