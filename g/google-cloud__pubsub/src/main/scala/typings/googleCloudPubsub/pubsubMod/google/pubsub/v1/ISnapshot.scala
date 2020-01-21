package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudPubsub.pubsubMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Snapshot. */
trait ISnapshot extends js.Object {
  /** Snapshot expireTime */
  var expireTime: js.UndefOr[ITimestamp | Null] = js.undefined
  /** Snapshot labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  /** Snapshot name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** Snapshot topic */
  var topic: js.UndefOr[String | Null] = js.undefined
}

object ISnapshot {
  @scala.inline
  def apply(
    expireTime: ITimestamp = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    topic: String = null
  ): ISnapshot = {
    val __obj = js.Dynamic.literal()
    if (expireTime != null) __obj.updateDynamic("expireTime")(expireTime.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISnapshot]
  }
}

