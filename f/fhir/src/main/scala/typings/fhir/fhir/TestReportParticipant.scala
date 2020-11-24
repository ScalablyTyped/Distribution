package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A participant in the test execution, either the execution engine, a client, or a server
  */
@js.native
trait TestReportParticipant extends BackboneElement {
  
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.native
  
  /**
    * The display name of the participant
    */
  var display: js.UndefOr[String] = js.native
  
  /**
    * test-engine | client | server
    */
  var `type`: code = js.native
  
  /**
    * The uri of the participant. An absolute URL is preferred
    */
  var uri: typings.fhir.fhir.uri = js.native
}
object TestReportParticipant {
  
  @scala.inline
  def apply(`type`: code, uri: uri): TestReportParticipant = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestReportParticipant]
  }
  
  @scala.inline
  implicit class TestReportParticipantOps[Self <: TestReportParticipant] (val x: Self) extends AnyVal {
    
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
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: uri): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_display(value: Element): Self = this.set("_display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_display: Self = this.set("_display", js.undefined)
    
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    
    @scala.inline
    def set_uri(value: Element): Self = this.set("_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_uri: Self = this.set("_uri", js.undefined)
    
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
  }
}
