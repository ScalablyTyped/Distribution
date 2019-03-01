package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a custom update for FBInstant.updateAsync.
  */
trait CustomUpdatePayload extends js.Object {
  /**
    * For custom updates, this should be 'CUSTOM'.
    */
  var action: UpdateAction
  /**
    * Optional call-to-action button text. By default we will use a localized 'Play' as the button text. To provide localized
    * versions of your own call to action, pass an object with the default cta as the value of 'default' and another object mapping
    * locale keys to translations as the value of 'localizations'.
    */
  var cta: js.UndefOr[java.lang.String | LocalizableContent] = js.undefined
  /**
    * A blob of data to attach to the update. All game sessions launched from the update will be able to access this blob
    * through FBInstant.getEntryPointData(). Must be less than or equal to 1000 characters when stringified.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Data URL of a base64 encoded image.
    */
  var image: java.lang.String
  /**
    * Specifies notification setting for the custom update. This can be 'NO_PUSH' or 'PUSH', and defaults to 'NO_PUSH'.
    * Use push notification only for updates that are high-signal and immediately actionable for the recipients.
    * Also note that push notification is not always guaranteed, depending on user setting and platform policies.
    */
  var notification: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies how the update should be delivered. This can be one of the following:
    *
    * 'IMMEDIATE' - The update should be posted immediately.
    *
    * 'LAST' - The update should be posted when the game session ends. The most recent update sent using the 'LAST' strategy will be the one sent.
    *
    * 'IMMEDIATE_CLEAR' - The update is posted immediately, and clears any other pending updates (such as those sent with the 'LAST' strategy).
    *
    * If no strategy is specified, we default to 'IMMEDIATE'.
    */
  var strategy: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of the template this custom update is using. Templates should be predefined in fbapp-config.json.
    * See the [Bundle Config documentation]https://developers.facebook.com/docs/games/instant-games/bundle-config
    * or documentation about fbapp-config.json.
    */
  var template: java.lang.String
  /**
    * A text message, or an object with the default text as the value of 'default' and another object mapping locale keys to
    * translations as the value of 'localizations'.
    */
  var text: java.lang.String | LocalizableContent
}

object CustomUpdatePayload {
  @scala.inline
  def apply(
    action: UpdateAction,
    image: java.lang.String,
    template: java.lang.String,
    text: java.lang.String | LocalizableContent,
    cta: java.lang.String | LocalizableContent = null,
    data: js.Any = null,
    notification: java.lang.String = null,
    strategy: java.lang.String = null
  ): CustomUpdatePayload = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("image")(image)
    __obj.updateDynamic("template")(template)
    __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (cta != null) __obj.updateDynamic("cta")(cta.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy)
    __obj.asInstanceOf[CustomUpdatePayload]
  }
}

