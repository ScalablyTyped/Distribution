package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Capabilities  that are assumed to function correctly on the FHIR server being tested
  */
@js.native
trait TestScriptMetadataCapability extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'destination'.
    */
  var _destination: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'link'.
    */
  var _link: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'origin'.
    */
  var _origin: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'validated'.
    */
  var _validated: js.UndefOr[Element] = js.native
  /**
    * Required Capability Statement
    */
  var capabilities: Reference = js.native
  /**
    * The expected capabilities of the server
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Which server these requirements apply to
    */
  var destination: js.UndefOr[integer] = js.native
  /**
    * Links to the FHIR specification
    */
  var link: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Which origin server these requirements apply to
    */
  var origin: js.UndefOr[js.Array[integer]] = js.native
  /**
    * Are the capabilities required?
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Are the capabilities validated?
    */
  var validated: js.UndefOr[Boolean] = js.native
}

object TestScriptMetadataCapability {
  @scala.inline
  def apply(capabilities: Reference): TestScriptMetadataCapability = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptMetadataCapability]
  }
  @scala.inline
  implicit class TestScriptMetadataCapabilityOps[Self <: TestScriptMetadataCapability] (val x: Self) extends AnyVal {
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
    def setCapabilities(value: Reference): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def set_destination(value: Element): Self = this.set("_destination", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_destination: Self = this.set("_destination", js.undefined)
    @scala.inline
    def set_linkVarargs(value: Element*): Self = this.set("_link", js.Array(value :_*))
    @scala.inline
    def set_link(value: js.Array[Element]): Self = this.set("_link", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_link: Self = this.set("_link", js.undefined)
    @scala.inline
    def set_originVarargs(value: Element*): Self = this.set("_origin", js.Array(value :_*))
    @scala.inline
    def set_origin(value: js.Array[Element]): Self = this.set("_origin", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_origin: Self = this.set("_origin", js.undefined)
    @scala.inline
    def set_required(value: Element): Self = this.set("_required", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_required: Self = this.set("_required", js.undefined)
    @scala.inline
    def set_validated(value: Element): Self = this.set("_validated", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_validated: Self = this.set("_validated", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDestination(value: integer): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setLinkVarargs(value: uri*): Self = this.set("link", js.Array(value :_*))
    @scala.inline
    def setLink(value: js.Array[uri]): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setOriginVarargs(value: integer*): Self = this.set("origin", js.Array(value :_*))
    @scala.inline
    def setOrigin(value: js.Array[integer]): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setValidated(value: Boolean): Self = this.set("validated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidated: Self = this.set("validated", js.undefined)
  }
  
}

