package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A snapshot resource. Snapshots are used in &lt;a
  * href=&quot;https://cloud.google.com/pubsub/docs/replay-overview&quot;&gt;Seek&lt;/a&gt;
  * operations, which allow you to manage message acknowledgments in bulk. That
  * is, you can set the acknowledgment state of messages in an existing
  * subscription to the state captured by a snapshot.
  */
@js.native
trait Schema$Snapshot extends js.Object {
  /**
    * The snapshot is guaranteed to exist up until this time. A newly-created
    * snapshot expires no later than 7 days from the time of its creation. Its
    * exact lifetime is determined at creation by the existing backlog in the
    * source subscription. Specifically, the lifetime of the snapshot is `7
    * days - (age of oldest unacked message in the subscription)`. For example,
    * consider a subscription whose oldest unacked message is 3 days old. If a
    * snapshot is created from this subscription, the snapshot -- which will
    * always capture this 3-day-old backlog as long as the snapshot exists --
    * will expire in 4 days. The service will refuse to create a snapshot that
    * would expire in less than 1 hour after creation.
    */
  var expireTime: js.UndefOr[String] = js.native
  /**
    * See &lt;a
    * href=&quot;https://cloud.google.com/pubsub/docs/labels&quot;&gt; Creating
    * and managing labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The name of the snapshot.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The name of the topic from which this snapshot is retaining messages.
    */
  var topic: js.UndefOr[String] = js.native
}

object Schema$Snapshot {
  @scala.inline
  def apply(
    expireTime: String = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    topic: String = null
  ): Schema$Snapshot = {
    val __obj = js.Dynamic.literal()
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Snapshot]
  }
}

