package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the `CreateSnapshot` method.
  */
@js.native
trait Schema$CreateSnapshotRequest extends js.Object {
  /**
    * See &lt;a
    * href=&quot;https://cloud.google.com/pubsub/docs/labels&quot;&gt; Creating
    * and managing labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The subscription whose backlog the snapshot retains. Specifically, the
    * created snapshot is guaranteed to retain:  (a) The existing backlog on
    * the subscription. More precisely, this is      defined as the messages in
    * the subscription&#39;s backlog that are      unacknowledged upon the
    * successful completion of the      `CreateSnapshot` request; as well as:
    * (b) Any messages published to the subscription&#39;s topic following the
    * successful completion of the CreateSnapshot request. Format is
    * `projects/{project}/subscriptions/{sub}`.
    */
  var subscription: js.UndefOr[String] = js.native
}

object Schema$CreateSnapshotRequest {
  @scala.inline
  def apply(labels: StringDictionary[String] = null, subscription: String = null): Schema$CreateSnapshotRequest = {
    val __obj = js.Dynamic.literal()
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateSnapshotRequest]
  }
}

