package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about security of implementation
  */
trait CapabilityStatementRestSecurity extends BackboneElement {
  /**
    * Contains extended information for property 'cors'.
    */
  var _cors: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Certificates associated with security profiles
    */
  var certificate: js.UndefOr[js.Array[CapabilityStatementRestSecurityCertificate]] = js.undefined
  /**
    * Adds CORS Headers (http://enable-cors.org/)
    */
  var cors: js.UndefOr[Boolean] = js.undefined
  /**
    * General description of how security works
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * OAuth | SMART-on-FHIR | NTLM | Basic | Kerberos | Certificates
    */
  var service: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
}

object CapabilityStatementRestSecurity {
  @scala.inline
  def apply(
    _cors: Element = null,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    certificate: js.Array[CapabilityStatementRestSecurityCertificate] = null,
    cors: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    service: js.Array[CodeableConcept] = null
  ): CapabilityStatementRestSecurity = {
    val __obj = js.Dynamic.literal()
    if (_cors != null) __obj.updateDynamic("_cors")(_cors.asInstanceOf[js.Any])
    if (_description != null) __obj.updateDynamic("_description")(_description.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestSecurity]
  }
}

