package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If this describes a specific instance
  */
trait CapabilityStatementImplementation extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Describes this specific instance
    */
  var description: String
  /**
    * Base URL for the installation
    */
  var url: js.UndefOr[uri] = js.undefined
}

object CapabilityStatementImplementation {
  @scala.inline
  def apply(
    description: String,
    _description: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _url: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    url: uri = null
  ): CapabilityStatementImplementation = {
    val __obj = js.Dynamic.literal(description = description)
    if (_description != null) __obj.updateDynamic("_description")(_description)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[CapabilityStatementImplementation]
  }
}

