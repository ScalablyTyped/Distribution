package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Element values that are used to distinguish the slices
  */
trait ElementDefinitionSlicingDiscriminator extends Element {
  /**
    * Contains extended information for property 'path'.
    */
  var _path: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Path to element value
    */
  var path: String
  /**
    * value | exists | pattern | type | profile
    */
  var `type`: code
}

object ElementDefinitionSlicingDiscriminator {
  @scala.inline
  def apply(
    path: String,
    `type`: code,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _path: Element = null,
    _type: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null
  ): ElementDefinitionSlicingDiscriminator = {
    val __obj = js.Dynamic.literal(path = path)
    __obj.updateDynamic("type")(`type`)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_path != null) __obj.updateDynamic("_path")(_path)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[ElementDefinitionSlicingDiscriminator]
  }
}

