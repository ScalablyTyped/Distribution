package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If this is a reply to prior message
  */
@js.native
trait MessageHeaderResponse extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'identifier'.
    */
  var _identifier: js.UndefOr[Element] = js.native
  /**
    * ok | transient-error | fatal-error
    */
  var code: typings.fhir.fhir.code = js.native
  /**
    * Specific list of hints/warnings/errors
    */
  var details: js.UndefOr[Reference] = js.native
  /**
    * Id of original message
    */
  var identifier: id = js.native
}

object MessageHeaderResponse {
  @scala.inline
  def apply(code: code, identifier: id): MessageHeaderResponse = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageHeaderResponse]
  }
  @scala.inline
  implicit class MessageHeaderResponseOps[Self <: MessageHeaderResponse] (val x: Self) extends AnyVal {
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
    def setCode(value: code): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: id): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def set_code(value: Element): Self = this.set("_code", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_code: Self = this.set("_code", js.undefined)
    @scala.inline
    def set_identifier(value: Element): Self = this.set("_identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_identifier: Self = this.set("_identifier", js.undefined)
    @scala.inline
    def setDetails(value: Reference): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
  }
  
}

