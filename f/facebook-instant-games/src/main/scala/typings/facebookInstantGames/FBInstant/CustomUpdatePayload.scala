package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a custom update for FBInstant.updateAsync.
  */
@js.native
trait CustomUpdatePayload extends js.Object {
  /**
    * For custom updates, this should be 'CUSTOM'.
    */
  var action: UpdateAction = js.native
  /**
    * Optional call-to-action button text. By default we will use a localized 'Play' as the button text. To provide localized
    * versions of your own call to action, pass an object with the default cta as the value of 'default' and another object mapping
    * locale keys to translations as the value of 'localizations'.
    */
  var cta: js.UndefOr[String | LocalizableContent] = js.native
  /**
    * A blob of data to attach to the update. All game sessions launched from the update will be able to access this blob
    * through FBInstant.getEntryPointData(). Must be less than or equal to 1000 characters when stringified.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * Data URL of a base64 encoded image.
    */
  var image: String = js.native
  /**
    * Specifies notification setting for the custom update. This can be 'NO_PUSH' or 'PUSH', and defaults to 'NO_PUSH'.
    * Use push notification only for updates that are high-signal and immediately actionable for the recipients.
    * Also note that push notification is not always guaranteed, depending on user setting and platform policies.
    */
  var notification: js.UndefOr[String] = js.native
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
  var strategy: js.UndefOr[String] = js.native
  /**
    * ID of the template this custom update is using. Templates should be predefined in fbapp-config.json.
    * See the [Bundle Config documentation]https://developers.facebook.com/docs/games/instant-games/bundle-config
    * or documentation about fbapp-config.json.
    */
  var template: String = js.native
  /**
    * A text message, or an object with the default text as the value of 'default' and another object mapping locale keys to
    * translations as the value of 'localizations'.
    */
  var text: String | LocalizableContent = js.native
}

object CustomUpdatePayload {
  @scala.inline
  def apply(action: UpdateAction, image: String, template: String, text: String | LocalizableContent): CustomUpdatePayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomUpdatePayload]
  }
  @scala.inline
  implicit class CustomUpdatePayloadOps[Self <: CustomUpdatePayload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAction(value: UpdateAction): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String | LocalizableContent): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setCta(value: String | LocalizableContent): Self = this.set("cta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCta: Self = this.set("cta", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setNotification(value: String): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setStrategy(value: String): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
  }
  
}

