package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Map element to another set of definitions
  */
trait ElementDefinitionMapping extends Element {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'identity'.
    */
  var _identity: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'map'.
    */
  var _map: js.UndefOr[Element] = js.undefined
  /**
    * Comments about the mapping or its use
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Reference to mapping declaration
    */
  var identity: id
  /**
    * Computable language of mapping
    */
  var language: js.UndefOr[code] = js.undefined
  /**
    * Details of the mapping
    */
  var map: String
}

object ElementDefinitionMapping {
  @scala.inline
  def apply(
    identity: id,
    map: String,
    _comment: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _identity: Element = null,
    _language: Element = null,
    _map: Element = null,
    comment: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    language: code = null
  ): ElementDefinitionMapping = {
    val __obj = js.Dynamic.literal(identity = identity, map = map)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_identity != null) __obj.updateDynamic("_identity")(_identity)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_map != null) __obj.updateDynamic("_map")(_map)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[ElementDefinitionMapping]
  }
}

