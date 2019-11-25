package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who is asking for task to be done
  */
trait TaskRequester extends BackboneElement {
  /**
    * Individual asking for task
    */
  var agent: Reference
  /**
    * Organization individual is acting for
    */
  var onBehalfOf: js.UndefOr[Reference] = js.undefined
}

object TaskRequester {
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
  ): TaskRequester = {
    val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (onBehalfOf != null) __obj.updateDynamic("onBehalfOf")(onBehalfOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRequester]
  }
}

