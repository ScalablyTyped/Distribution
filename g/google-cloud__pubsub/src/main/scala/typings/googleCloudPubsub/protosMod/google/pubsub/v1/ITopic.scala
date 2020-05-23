package typings.googleCloudPubsub.protosMod.google.pubsub.v1

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
    kmsKeyName: js.UndefOr[Null | String] = js.undefined,
    labels: js.UndefOr[Null | StringDictionary[String]] = js.undefined,
    messageStoragePolicy: js.UndefOr[Null | IMessageStoragePolicy] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined
  ): ITopic = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(kmsKeyName)) __obj.updateDynamic("kmsKeyName")(kmsKeyName.asInstanceOf[js.Any])
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (!js.isUndefined(messageStoragePolicy)) __obj.updateDynamic("messageStoragePolicy")(messageStoragePolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITopic]
  }
}

