package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Declare support for this event
  */
@js.native
trait CapabilityStatementMessagingEvent extends BackboneElement {
  /**
    * Contains extended information for property 'category'.
    */
  var _category: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'focus'.
    */
  var _focus: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  /**
    * Consequence | Currency | Notification
    */
  var category: js.UndefOr[code] = js.native
  /**
    * Event type
    */
  var code: Coding = js.native
  /**
    * Endpoint-specific event documentation
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * Resource that's focus of message
    */
  var focus: code = js.native
  /**
    * sender | receiver
    */
  var mode: code = js.native
  /**
    * Profile that describes the request
    */
  var request: Reference = js.native
  /**
    * Profile that describes the response
    */
  var response: Reference = js.native
}

object CapabilityStatementMessagingEvent {
  @scala.inline
  def apply(code: Coding, focus: code, mode: code, request: Reference, response: Reference): CapabilityStatementMessagingEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementMessagingEvent]
  }
  @scala.inline
  implicit class CapabilityStatementMessagingEventOps[Self <: CapabilityStatementMessagingEvent] (val x: Self) extends AnyVal {
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
    def setCode(value: Coding): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: code): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setMode(value: code): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: Reference): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponse(value: Reference): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def set_category(value: Element): Self = this.set("_category", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_category: Self = this.set("_category", js.undefined)
    @scala.inline
    def set_documentation(value: Element): Self = this.set("_documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_documentation: Self = this.set("_documentation", js.undefined)
    @scala.inline
    def set_focus(value: Element): Self = this.set("_focus", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_focus: Self = this.set("_focus", js.undefined)
    @scala.inline
    def set_mode(value: Element): Self = this.set("_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_mode: Self = this.set("_mode", js.undefined)
    @scala.inline
    def setCategory(value: code): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setDocumentation(value: String): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentation: Self = this.set("documentation", js.undefined)
  }
  
}

