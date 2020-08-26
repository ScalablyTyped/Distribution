package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Certificates associated with security profiles
  */
@js.native
trait CapabilityStatementRestSecurityCertificate extends BackboneElement {
  /**
    * Contains extended information for property 'blob'.
    */
  var _blob: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Actual certificate
    */
  var blob: js.UndefOr[base64Binary] = js.native
  /**
    * Mime type for certificates
    */
  var `type`: js.UndefOr[code] = js.native
}

object CapabilityStatementRestSecurityCertificate {
  @scala.inline
  def apply(): CapabilityStatementRestSecurityCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CapabilityStatementRestSecurityCertificate]
  }
  @scala.inline
  implicit class CapabilityStatementRestSecurityCertificateOps[Self <: CapabilityStatementRestSecurityCertificate] (val x: Self) extends AnyVal {
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
    def set_blob(value: Element): Self = this.set("_blob", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_blob: Self = this.set("_blob", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setBlob(value: base64Binary): Self = this.set("blob", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlob: Self = this.set("blob", js.undefined)
    @scala.inline
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

