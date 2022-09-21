package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Object with information on means of accessing a conference
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#entry_point
  */
trait EntryPointObject extends StObject {
  
  var accessCode: String
  
  var entryPointFeatures: js.Array[EntryPointFeature]
  
  var entryPointType: EntryPointType
  
  var label: String
  
  var meetingCode: String
  
  var passcode: String
  
  var password: String
  
  var pin: String
  
  var regionCode: String
  
  var uri: String
}
object EntryPointObject {
  
  inline def apply(
    accessCode: String,
    entryPointFeatures: js.Array[EntryPointFeature],
    entryPointType: EntryPointType,
    label: String,
    meetingCode: String,
    passcode: String,
    password: String,
    pin: String,
    regionCode: String,
    uri: String
  ): EntryPointObject = {
    val __obj = js.Dynamic.literal(accessCode = accessCode.asInstanceOf[js.Any], entryPointFeatures = entryPointFeatures.asInstanceOf[js.Any], entryPointType = entryPointType.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], meetingCode = meetingCode.asInstanceOf[js.Any], passcode = passcode.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pin = pin.asInstanceOf[js.Any], regionCode = regionCode.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntryPointObject]
  }
  
  extension [Self <: EntryPointObject](x: Self) {
    
    inline def setAccessCode(value: String): Self = StObject.set(x, "accessCode", value.asInstanceOf[js.Any])
    
    inline def setEntryPointFeatures(value: js.Array[EntryPointFeature]): Self = StObject.set(x, "entryPointFeatures", value.asInstanceOf[js.Any])
    
    inline def setEntryPointFeaturesVarargs(value: EntryPointFeature*): Self = StObject.set(x, "entryPointFeatures", js.Array(value*))
    
    inline def setEntryPointType(value: EntryPointType): Self = StObject.set(x, "entryPointType", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMeetingCode(value: String): Self = StObject.set(x, "meetingCode", value.asInstanceOf[js.Any])
    
    inline def setPasscode(value: String): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPin(value: String): Self = StObject.set(x, "pin", value.asInstanceOf[js.Any])
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
