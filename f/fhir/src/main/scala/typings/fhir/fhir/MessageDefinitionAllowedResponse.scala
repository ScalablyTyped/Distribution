package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Responses to this message
  */
@js.native
trait MessageDefinitionAllowedResponse extends BackboneElement {
  /**
    * Contains extended information for property 'situation'.
    */
  var _situation: js.UndefOr[Element] = js.native
  /**
    * Reference to allowed message definition response
    */
  var message: Reference = js.native
  /**
    * When should this response be used
    */
  var situation: js.UndefOr[markdown] = js.native
}

object MessageDefinitionAllowedResponse {
  @scala.inline
  def apply(message: Reference): MessageDefinitionAllowedResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageDefinitionAllowedResponse]
  }
  @scala.inline
  implicit class MessageDefinitionAllowedResponseOps[Self <: MessageDefinitionAllowedResponse] (val x: Self) extends AnyVal {
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
    def setMessage(value: Reference): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def set_situation(value: Element): Self = this.set("_situation", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_situation: Self = this.set("_situation", js.undefined)
    @scala.inline
    def setSituation(value: markdown): Self = this.set("situation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSituation: Self = this.set("situation", js.undefined)
  }
  
}

