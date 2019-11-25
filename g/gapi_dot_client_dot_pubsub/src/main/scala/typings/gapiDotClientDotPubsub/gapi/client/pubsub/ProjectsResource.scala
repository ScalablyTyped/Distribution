package typings.gapiDotClientDotPubsub.gapi.client.pubsub

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
    val __obj = js.Dynamic.literal(snapshots = snapshots.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

