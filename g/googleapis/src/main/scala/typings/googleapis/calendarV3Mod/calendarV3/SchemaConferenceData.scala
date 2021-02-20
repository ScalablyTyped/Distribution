package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaConferenceData extends StObject {
  
  /**
    * The ID of the conference. Can be used by developers to keep track of
    * conferences, should not be displayed to users. Values for solution types:
    * - &quot;eventHangout&quot;: unset. - &quot;eventNamedHangout&quot;: the
    * name of the Hangout. - &quot;hangoutsMeet&quot;: the 10-letter meeting
    * code, for example &quot;aaa-bbbb-ccc&quot;.  Optional.
    */
  var conferenceId: js.UndefOr[String] = js.native
  
  /**
    * The conference solution, such as Hangouts or Hangouts Meet. Unset for a
    * conference with a failed create request. Either conferenceSolution and at
    * least one entryPoint, or createRequest is required.
    */
  var conferenceSolution: js.UndefOr[SchemaConferenceSolution] = js.native
  
  /**
    * A request to generate a new conference and attach it to the event. The
    * data is generated asynchronously. To see whether the data is present
    * check the status field. Either conferenceSolution and at least one
    * entryPoint, or createRequest is required.
    */
  var createRequest: js.UndefOr[SchemaCreateConferenceRequest] = js.native
  
  /**
    * Information about individual conference entry points, such as URLs or
    * phone numbers. All of them must belong to the same conference. Either
    * conferenceSolution and at least one entryPoint, or createRequest is
    * required.
    */
  var entryPoints: js.UndefOr[js.Array[SchemaEntryPoint]] = js.native
  
  /**
    * Additional notes (such as instructions from the domain administrator,
    * legal notices) to display to the user. Can contain HTML. The maximum
    * length is 2048 characters. Optional.
    */
  var notes: js.UndefOr[String] = js.native
  
  /**
    * Additional properties related to a conference. An example would be a
    * solution-specific setting for enabling video streaming.
    */
  var parameters: js.UndefOr[SchemaConferenceParameters] = js.native
  
  /**
    * The signature of the conference data. Genereated on server side. Must be
    * preserved while copying the conference data between events, otherwise the
    * conference data will not be copied. Unset for a conference with a failed
    * create request. Optional for a conference with a pending create request.
    */
  var signature: js.UndefOr[String] = js.native
}
object SchemaConferenceData {
  
  @scala.inline
  def apply(): SchemaConferenceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConferenceData]
  }
  
  @scala.inline
  implicit class SchemaConferenceDataMutableBuilder[Self <: SchemaConferenceData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConferenceId(value: String): Self = StObject.set(x, "conferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceIdUndefined: Self = StObject.set(x, "conferenceId", js.undefined)
    
    @scala.inline
    def setConferenceSolution(value: SchemaConferenceSolution): Self = StObject.set(x, "conferenceSolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConferenceSolutionUndefined: Self = StObject.set(x, "conferenceSolution", js.undefined)
    
    @scala.inline
    def setCreateRequest(value: SchemaCreateConferenceRequest): Self = StObject.set(x, "createRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateRequestUndefined: Self = StObject.set(x, "createRequest", js.undefined)
    
    @scala.inline
    def setEntryPoints(value: js.Array[SchemaEntryPoint]): Self = StObject.set(x, "entryPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryPointsUndefined: Self = StObject.set(x, "entryPoints", js.undefined)
    
    @scala.inline
    def setEntryPointsVarargs(value: SchemaEntryPoint*): Self = StObject.set(x, "entryPoints", js.Array(value :_*))
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setParameters(value: SchemaConferenceParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
  }
}
