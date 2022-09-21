package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConferenceData extends StObject {
  
  /**
    * The ID of the conference.
    * Can be used by developers to keep track of conferences, should not be displayed to users.
    * The ID value is formed differently for each conference solution type:
    * - eventHangout: ID is not set. (This conference type is deprecated.)
    * - eventNamedHangout: ID is the name of the Hangout. (This conference type is deprecated.)
    * - hangoutsMeet: ID is the 10-letter meeting code, for example aaa-bbbb-ccc.
    * - addOn: ID is defined by the third-party provider.  Optional.
    */
  var conferenceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The conference solution, such as Google Meet.
    * Unset for a conference with a failed create request.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var conferenceSolution: js.UndefOr[SchemaConferenceSolution] = js.undefined
  
  /**
    * A request to generate a new conference and attach it to the event. The data is generated asynchronously. To see whether the data is present check the status field.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var createRequest: js.UndefOr[SchemaCreateConferenceRequest] = js.undefined
  
  /**
    * Information about individual conference entry points, such as URLs or phone numbers.
    * All of them must belong to the same conference.
    * Either conferenceSolution and at least one entryPoint, or createRequest is required.
    */
  var entryPoints: js.UndefOr[js.Array[SchemaEntryPoint]] = js.undefined
  
  /**
    * Additional notes (such as instructions from the domain administrator, legal notices) to display to the user. Can contain HTML. The maximum length is 2048 characters. Optional.
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional properties related to a conference. An example would be a solution-specific setting for enabling video streaming.
    */
  var parameters: js.UndefOr[SchemaConferenceParameters] = js.undefined
  
  /**
    * The signature of the conference data.
    * Generated on server side.
    * Unset for a conference with a failed create request.
    * Optional for a conference with a pending create request.
    */
  var signature: js.UndefOr[String | Null] = js.undefined
}
object SchemaConferenceData {
  
  inline def apply(): SchemaConferenceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceData]
  }
  
  extension [Self <: SchemaConferenceData](x: Self) {
    
    inline def setConferenceId(value: String): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
    
    inline def setConferenceIdNull: Self = StObject.set(x, "conferenceId", null)
    
    inline def setConferenceIdUndefined: Self = StObject.set(x, "conferenceId", js.undefined)
    
    inline def setConferenceSolution(value: SchemaConferenceSolution): Self = StObject.set(x, "conferenceSolution", value.asInstanceOf[js.Any])
    
    inline def setConferenceSolutionUndefined: Self = StObject.set(x, "conferenceSolution", js.undefined)
    
    inline def setCreateRequest(value: SchemaCreateConferenceRequest): Self = StObject.set(x, "createRequest", value.asInstanceOf[js.Any])
    
    inline def setCreateRequestUndefined: Self = StObject.set(x, "createRequest", js.undefined)
    
    inline def setEntryPoints(value: js.Array[SchemaEntryPoint]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    inline def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
    
    inline def setEntryPointsVarargs(value: SchemaEntryPoint*): Self = StObject.set(x, "entryPoints", js.Array(value*))
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setParameters(value: SchemaConferenceParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
