package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about security of implementation
  */
@js.native
trait CapabilityStatementRestSecurity extends BackboneElement {
  /**
    * Contains extended information for property 'cors'.
    */
  var _cors: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Certificates associated with security profiles
    */
  var certificate: js.UndefOr[js.Array[CapabilityStatementRestSecurityCertificate]] = js.native
  /**
    * Adds CORS Headers (http://enable-cors.org/)
    */
  var cors: js.UndefOr[Boolean] = js.native
  /**
    * General description of how security works
    */
  var description: js.UndefOr[String] = js.native
  /**
    * OAuth | SMART-on-FHIR | NTLM | Basic | Kerberos | Certificates
    */
  var service: js.UndefOr[js.Array[CodeableConcept]] = js.native
}

object CapabilityStatementRestSecurity {
  @scala.inline
  def apply(): CapabilityStatementRestSecurity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementRestSecurity]
  }
  @scala.inline
  implicit class CapabilityStatementRestSecurityOps[Self <: CapabilityStatementRestSecurity] (val x: Self) extends AnyVal {
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
    def set_cors(value: Element): Self = this.set("_cors", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_cors: Self = this.set("_cors", js.undefined)
    @scala.inline
    def set_description(value: Element): Self = this.set("_description", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_description: Self = this.set("_description", js.undefined)
    @scala.inline
    def setCertificateVarargs(value: CapabilityStatementRestSecurityCertificate*): Self = this.set("certificate", js.Array(value :_*))
    @scala.inline
    def setCertificate(value: js.Array[CapabilityStatementRestSecurityCertificate]): Self = this.set("certificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificate: Self = this.set("certificate", js.undefined)
    @scala.inline
    def setCors(value: Boolean): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setServiceVarargs(value: CodeableConcept*): Self = this.set("service", js.Array(value :_*))
    @scala.inline
    def setService(value: js.Array[CodeableConcept]): Self = this.set("service", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
  }
  
}

