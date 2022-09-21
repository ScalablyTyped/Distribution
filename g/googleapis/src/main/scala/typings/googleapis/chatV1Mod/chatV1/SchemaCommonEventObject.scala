package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommonEventObject extends StObject {
  
  /**
    * A map containing the current values of the widgets in a card. The map keys are the string IDs assigned to each widget, and the values represent inputs to the widget. Depending on the input data type, a different object represents each input: For single-value widgets, `StringInput`. For multi-value widgets, an array of `StringInput` objects. For a date-time picker, a `DateTimeInput`. For a date-only picker, a `DateInput`. For a time-only picker, a `TimeInput`. Corresponds with the data entered by a user on a card in a [dialog](https://developers.google.com/chat/how-tos/dialogs).
    */
  var formInputs: js.UndefOr[StringDictionary[SchemaInputs] | Null] = js.undefined
  
  /**
    * The hostApp enum which indicates the app the add-on is invoked from. Always `CHAT` for Chat apps.
    */
  var hostApp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of the invoked function associated with the widget. Only set for Chat apps.
    */
  var invokedFunction: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom [parameters](/chat/api/reference/rest/v1/cards#ActionParameter) passed to the invoked function. Both keys and values must be strings.
    */
  var parameters: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * The platform enum which indicates the platform where the event originates (`WEB`, `IOS`, or `ANDROID`). Not supported by Chat apps.
    */
  var platform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timezone ID and offset from Coordinated Universal Time (UTC).
    */
  var timeZone: js.UndefOr[SchemaTimeZone] = js.undefined
  
  /**
    * The full `locale.displayName` in the format of [ISO 639 language code]-[ISO 3166 country/region code] such as "en-US". Not supported by Chat apps.
    */
  var userLocale: js.UndefOr[String | Null] = js.undefined
}
object SchemaCommonEventObject {
  
  inline def apply(): SchemaCommonEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommonEventObject]
  }
  
  extension [Self <: SchemaCommonEventObject](x: Self) {
    
    inline def setFormInputs(value: StringDictionary[SchemaInputs]): Self = StObject.set(x, "formInputs", value.asInstanceOf[js.Any])
    
    inline def setFormInputsNull: Self = StObject.set(x, "formInputs", null)
    
    inline def setFormInputsUndefined: Self = StObject.set(x, "formInputs", js.undefined)
    
    inline def setHostApp(value: String): Self = StObject.set(x, "hostApp", value.asInstanceOf[js.Any])
    
    inline def setHostAppNull: Self = StObject.set(x, "hostApp", null)
    
    inline def setHostAppUndefined: Self = StObject.set(x, "hostApp", js.undefined)
    
    inline def setInvokedFunction(value: String): Self = StObject.set(x, "invokedFunction", value.asInstanceOf[js.Any])
    
    inline def setInvokedFunctionNull: Self = StObject.set(x, "invokedFunction", null)
    
    inline def setInvokedFunctionUndefined: Self = StObject.set(x, "invokedFunction", js.undefined)
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    inline def setTimeZone(value: SchemaTimeZone): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
    
    inline def setUserLocaleNull: Self = StObject.set(x, "userLocale", null)
    
    inline def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
  }
}
