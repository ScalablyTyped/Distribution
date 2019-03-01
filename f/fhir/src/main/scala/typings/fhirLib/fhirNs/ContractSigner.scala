package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contract Signatory
  */
trait ContractSigner extends BackboneElement {
  /**
    * Contract Signatory Party
    */
  var party: Reference
  /**
    * Contract Documentation Signature
    */
  var signature: js.Array[Signature]
  /**
    * Contract Signatory Role
    */
  var `type`: Coding
}

object ContractSigner {
  @scala.inline
  def apply(
    party: Reference,
    signature: js.Array[Signature],
    `type`: Coding,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): ContractSigner = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("party")(party)
    __obj.updateDynamic("signature")(signature)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ContractSigner]
  }
}

