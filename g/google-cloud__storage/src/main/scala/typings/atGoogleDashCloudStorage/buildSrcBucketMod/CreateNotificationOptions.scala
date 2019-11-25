package typings.atGoogleDashCloudStorage.buildSrcBucketMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNotificationOptions extends js.Object {
  var customAttributes: js.UndefOr[StringDictionary[String]] = js.undefined
  var eventTypes: js.UndefOr[js.Array[String]] = js.undefined
  var objectNamePrefix: js.UndefOr[String] = js.undefined
  var payloadFormat: js.UndefOr[String] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
}

object CreateNotificationOptions {
  @scala.inline
  def apply(
    customAttributes: StringDictionary[String] = null,
    eventTypes: js.Array[String] = null,
    objectNamePrefix: String = null,
    payloadFormat: String = null,
    userProject: String = null
  ): CreateNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes.asInstanceOf[js.Any])
    if (eventTypes != null) __obj.updateDynamic("eventTypes")(eventTypes.asInstanceOf[js.Any])
    if (objectNamePrefix != null) __obj.updateDynamic("objectNamePrefix")(objectNamePrefix.asInstanceOf[js.Any])
    if (payloadFormat != null) __obj.updateDynamic("payloadFormat")(payloadFormat.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNotificationOptions]
  }
}

