package typings
package firebaseDashAdminLib.adminNs.messagingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the [aps dictionary](https://developer.apple.com/library/content/documentation/NetworkingInternet/Conceptual/RemoteNotificationsPG/PayloadKeyReference.html)
  * that is part of APNs messages.
  */
trait Aps
  extends /* customData */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * Alert to be included in the message. This may be a string or an object of
    * type `admin.messaging.ApsAlert`.
    */
  var alert: js.UndefOr[java.lang.String | ApsAlert] = js.undefined
  /**
    * Badge to be displayed with the message. Set to 0 to remove the badge. When
    * not specified, the badge will remain unchanged.
    */
  var badge: js.UndefOr[scala.Double] = js.undefined
  /**
    * Type of the notification.
    */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies whether to configure a background update notification.
    */
  var contentAvailable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specifies whether to set the `mutable-content` property on the message
    * so the clients can modify the notification via app extensions.
    */
  var mutableContent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Sound to be played with the message.
    */
  var sound: js.UndefOr[java.lang.String | CriticalSound] = js.undefined
  /**
    * An app-specific identifier for grouping notifications.
    */
  var threadId: js.UndefOr[java.lang.String] = js.undefined
}

object Aps {
  @scala.inline
  def apply(
    StringDictionary: /* customData */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    alert: java.lang.String | ApsAlert = null,
    badge: scala.Int | scala.Double = null,
    category: java.lang.String = null,
    contentAvailable: js.UndefOr[scala.Boolean] = js.undefined,
    mutableContent: js.UndefOr[scala.Boolean] = js.undefined,
    sound: java.lang.String | CriticalSound = null,
    threadId: java.lang.String = null
  ): Aps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alert != null) __obj.updateDynamic("alert")(alert.asInstanceOf[js.Any])
    if (badge != null) __obj.updateDynamic("badge")(badge.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category)
    if (!js.isUndefined(contentAvailable)) __obj.updateDynamic("contentAvailable")(contentAvailable)
    if (!js.isUndefined(mutableContent)) __obj.updateDynamic("mutableContent")(mutableContent)
    if (sound != null) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    if (threadId != null) __obj.updateDynamic("threadId")(threadId)
    __obj.asInstanceOf[Aps]
  }
}

