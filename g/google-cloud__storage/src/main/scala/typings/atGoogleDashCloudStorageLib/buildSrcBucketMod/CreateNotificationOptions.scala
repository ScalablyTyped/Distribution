package typings
package atGoogleDashCloudStorageLib.buildSrcBucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNotificationOptions extends js.Object {
  var customAttributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var eventTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var objectNamePrefix: js.UndefOr[java.lang.String] = js.undefined
  var payloadFormat: js.UndefOr[java.lang.String] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
}

object CreateNotificationOptions {
  @scala.inline
  def apply(
    customAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    eventTypes: js.Array[java.lang.String] = null,
    objectNamePrefix: java.lang.String = null,
    payloadFormat: java.lang.String = null,
    userProject: java.lang.String = null
  ): CreateNotificationOptions = {
    val __obj = js.Dynamic.literal()
    if (customAttributes != null) __obj.updateDynamic("customAttributes")(customAttributes)
    if (eventTypes != null) __obj.updateDynamic("eventTypes")(eventTypes)
    if (objectNamePrefix != null) __obj.updateDynamic("objectNamePrefix")(objectNamePrefix)
    if (payloadFormat != null) __obj.updateDynamic("payloadFormat")(payloadFormat)
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    __obj.asInstanceOf[CreateNotificationOptions]
  }
}

