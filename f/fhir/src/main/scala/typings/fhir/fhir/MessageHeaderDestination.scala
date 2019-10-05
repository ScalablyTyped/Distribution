package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message destination application(s)
  */
trait MessageHeaderDestination extends BackboneElement {
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Actual destination address or id
    */
  var endpoint: uri
  /**
    * Name of system
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Particular delivery destination within the destination
    */
  var target: js.UndefOr[Reference] = js.undefined
}

object MessageHeaderDestination {
  @scala.inline
  def apply(
    endpoint: uri,
    _endpoint: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    target: Reference = null
  ): MessageHeaderDestination = {
    val __obj = js.Dynamic.literal(endpoint = endpoint)
    if (_endpoint != null) __obj.updateDynamic("_endpoint")(_endpoint)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[MessageHeaderDestination]
  }
}

