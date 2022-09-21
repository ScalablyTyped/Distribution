package typings.googleAppsScript.GoogleAppsScript.Addons

import typings.googleAppsScript.anon.AddOnParameters
import typings.googleAppsScript.anon.IconUri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Object with information on conferences attached to Calendar events
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#conference_data
  */
trait ConferenceDataObject extends StObject {
  
  var conferenceId: String
  
  var conferenceSolution: IconUri
  
  var entryPoints: js.Array[EntryPointObject]
  
  var notes: String
  
  var parameters: AddOnParameters
}
object ConferenceDataObject {
  
  inline def apply(
    conferenceId: String,
    conferenceSolution: IconUri,
    entryPoints: js.Array[EntryPointObject],
    notes: String,
    parameters: AddOnParameters
  ): ConferenceDataObject = {
    val __obj = js.Dynamic.literal(conferenceId = conferenceId.asInstanceOf[js.Any], conferenceSolution = conferenceSolution.asInstanceOf[js.Any], entryPoints = entryPoints.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferenceDataObject]
  }
  
  extension [Self <: ConferenceDataObject](x: Self) {
    
    inline def setConferenceId(value: String): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
    
    inline def setConferenceSolution(value: IconUri): Self = StObject.set(x, "conferenceSolution", value.asInstanceOf[js.Any])
    
    inline def setEntryPoints(value: js.Array[EntryPointObject]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setEntryPointsVarargs(value: EntryPointObject*): Self = StObject.set(x, "entryPoints", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: AddOnParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
