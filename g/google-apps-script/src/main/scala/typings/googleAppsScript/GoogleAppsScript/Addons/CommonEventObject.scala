package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StringDictionary
import typings.googleAppsScript.anon.Id
import typings.googleAppsScript.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Event object with host-independent information
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#common_event_object
  */
trait CommonEventObject extends StObject {
  
  var formInputs: StringDictionary[_empty]
  
  var hostApp: HostApplication
  
  var parameters: StringDictionary[String]
  
  var platform: Platform
  
  var timeZone: js.UndefOr[Id] = js.undefined
  
  var userLocale: js.UndefOr[String] = js.undefined
}
object CommonEventObject {
  
  inline def apply(
    formInputs: StringDictionary[_empty],
    hostApp: HostApplication,
    parameters: StringDictionary[String],
    platform: Platform
  ): CommonEventObject = {
    val __obj = js.Dynamic.literal(formInputs = formInputs.asInstanceOf[js.Any], hostApp = hostApp.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonEventObject]
  }
  
  extension [Self <: CommonEventObject](x: Self) {
    
    inline def setFormInputs(value: StringDictionary[_empty]): Self = StObject.set(x, "formInputs", value.asInstanceOf[js.Any])
    
    inline def setHostApp(value: HostApplication): Self = StObject.set(x, "hostApp", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: Id): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
    
    inline def setUserLocaleUndefined: Self = StObject.set(x, "userLocale", js.undefined)
  }
}
