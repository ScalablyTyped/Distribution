package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who/what is requesting procedure or diagnostic
  */
trait ProcedureRequestRequester extends BackboneElement {
  /**
    * Individual making the request
    */
  var agent: Reference
  /**
    * Organization agent is acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}

object ProcedureRequestRequester {
  @scala.inline
  def apply(
    agent: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    onBehalfOf: Reference = null
  ): ProcedureRequestRequester = {
    val __obj = js.Dynamic.literal(agent = agent)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (onBehalfOf != null) __obj.updateDynamic("onBehalfOf")(onBehalfOf)
    __obj.asInstanceOf[ProcedureRequestRequester]
  }
}

