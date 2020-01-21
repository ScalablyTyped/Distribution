package typings.googleCloudPubsub.pubsubMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Topic. */
trait ITopic extends js.Object {
  /** Topic kmsKeyName */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  /** Topic labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  /** Topic messageStoragePolicy */
  var messageStoragePolicy: js.UndefOr[IMessageStoragePolicy | Null] = js.undefined
  /** Topic name */
  var name: js.UndefOr[String | Null] = js.undefined
}

object ITopic {
  @scala.inline
  def apply(
    kmsKeyName: String = null,
    labels: StringDictionary[String] = null,
    messageStoragePolicy: IMessageStoragePolicy = null,
    name: String = null
  ): ITopic = {
    val __obj = js.Dynamic.literal()
    if (kmsKeyName != null) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (messageStoragePolicy != null) __obj.updateDynamic("messageStoragePolicy")(messageStoragePolicy.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopic]
  }
}

