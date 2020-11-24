package typings.googleAppsScript.GoogleAppsScript.Calendar.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConferenceData extends js.Object {
  
  var conferenceId: js.UndefOr[String] = js.native
  
  var conferenceSolution: js.UndefOr[ConferenceSolution] = js.native
  
  var createRequest: js.UndefOr[CreateConferenceRequest] = js.native
  
  var entryPoints: js.UndefOr[js.Array[EntryPoint]] = js.native
  
  var notes: js.UndefOr[String] = js.native
  
  var parameters: js.UndefOr[ConferenceParameters] = js.native
  
  var signature: js.UndefOr[String] = js.native
}
object ConferenceData {
  
  @scala.inline
  def apply(): ConferenceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferenceData]
  }
  
  @scala.inline
  implicit class ConferenceDataOps[Self <: ConferenceData] (val x: Self) extends AnyVal {
    
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
    def setConferenceId(value: String): Self = this.set("conferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceId: Self = this.set("conferenceId", js.undefined)
    
    @scala.inline
    def setConferenceSolution(value: ConferenceSolution): Self = this.set("conferenceSolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConferenceSolution: Self = this.set("conferenceSolution", js.undefined)
    
    @scala.inline
    def setCreateRequest(value: CreateConferenceRequest): Self = this.set("createRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateRequest: Self = this.set("createRequest", js.undefined)
    
    @scala.inline
    def setEntryPointsVarargs(value: EntryPoint*): Self = this.set("entryPoints", js.Array(value :_*))
    
    @scala.inline
    def setEntryPoints(value: js.Array[EntryPoint]): Self = this.set("entryPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryPoints: Self = this.set("entryPoints", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setParameters(value: ConferenceParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
  }
}
