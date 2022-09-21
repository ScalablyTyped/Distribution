package typings.googleAppsScript.anon

import typings.googleAppsScript.GoogleAppsScript.Addons.ConferenceDataObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanAddAttendees extends StObject {
  
  var canAddAttendees: Boolean
  
  var canSeeAttendees: Boolean
  
  var canSeeConferenceData: Boolean
  
  var canSetConferenceData: Boolean
  
  var conferenceData: ConferenceDataObject
}
object CanAddAttendees {
  
  inline def apply(
    canAddAttendees: Boolean,
    canSeeAttendees: Boolean,
    canSeeConferenceData: Boolean,
    canSetConferenceData: Boolean,
    conferenceData: ConferenceDataObject
  ): CanAddAttendees = {
    val __obj = js.Dynamic.literal(canAddAttendees = canAddAttendees.asInstanceOf[js.Any], canSeeAttendees = canSeeAttendees.asInstanceOf[js.Any], canSeeConferenceData = canSeeConferenceData.asInstanceOf[js.Any], canSetConferenceData = canSetConferenceData.asInstanceOf[js.Any], conferenceData = conferenceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanAddAttendees]
  }
  
  extension [Self <: CanAddAttendees](x: Self) {
    
    inline def setCanAddAttendees(value: Boolean): Self = StObject.set(x, "canAddAttendees", value.asInstanceOf[js.Any])
    
    inline def setCanSeeAttendees(value: Boolean): Self = StObject.set(x, "canSeeAttendees", value.asInstanceOf[js.Any])
    
    inline def setCanSeeConferenceData(value: Boolean): Self = StObject.set(x, "canSeeConferenceData", value.asInstanceOf[js.Any])
    
    inline def setCanSetConferenceData(value: Boolean): Self = StObject.set(x, "canSetConferenceData", value.asInstanceOf[js.Any])
    
    inline def setConferenceData(value: ConferenceDataObject): Self = StObject.set(x, "conferenceData", value.asInstanceOf[js.Any])
  }
}
