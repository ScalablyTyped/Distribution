package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a custom update for FBInstant.updateAsync.
  */
trait CustomUpdatePayload extends StObject {
  
  /**
    * For custom updates, this should be 'CUSTOM'.
    */
  var action: UpdateAction
  
  /**
    * Optional call-to-action button text. By default we will use a localized 'Play' as the button text. To provide localized
    * versions of your own call to action, pass an object with the default cta as the value of 'default' and another object mapping
    * locale keys to translations as the value of 'localizations'.
    */
  var cta: js.UndefOr[String | LocalizableContent] = js.undefined
  
  /**
    * A blob of data to attach to the update. All game sessions launched from the update will be able to access this blob
    * through FBInstant.getEntryPointData(). Must be less than or equal to 1000 characters when stringified.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Data URL of a base64 encoded image.
    */
  var image: String
  
  /**
    * Specifies notification setting for the custom update. This can be 'NO_PUSH' or 'PUSH', and defaults to 'NO_PUSH'.
    * Use push notification only for updates that are high-signal and immediately actionable for the recipients.
    * Also note that push notification is not always guaranteed, depending on user setting and platform policies.
    */
  var notification: js.UndefOr[String] = js.undefined
  
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
  var strategy: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the template this custom update is using. Templates should be predefined in fbapp-config.json.
    * See the [Bundle Config documentation]https://developers.facebook.com/docs/games/instant-games/bundle-config
    * or documentation about fbapp-config.json.
    */
  var template: String
  
  /**
    * A text message, or an object with the default text as the value of 'default' and another object mapping locale keys to
    * translations as the value of 'localizations'.
    */
  var text: String | LocalizableContent
}
object CustomUpdatePayload {
  
  inline def apply(action: UpdateAction, image: String, template: String, text: String | LocalizableContent): CustomUpdatePayload = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomUpdatePayload]
  }
  
  extension [Self <: CustomUpdatePayload](x: Self) {
    
    inline def setAction(value: UpdateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCta(value: String | LocalizableContent): Self = StObject.set(x, "cta", value.asInstanceOf[js.Any])
    
    inline def setCtaUndefined: Self = StObject.set(x, "cta", js.undefined)
    
    inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: String): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setText(value: String | LocalizableContent): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
