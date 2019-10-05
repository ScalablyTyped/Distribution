package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * External specification mapped to
  */
trait DataElementMapping extends BackboneElement {
  /**
    * Contains extended information for property 'comment'.
    */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'identity'.
    */
  var _identity: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.undefined
  /**
    * Versions, issues, scope limitations, etc.
    */
  var comment: js.UndefOr[String] = js.undefined
  /**
    * Internal id when this mapping is used
    */
  var identity: id
  /**
    * Names what this mapping refers to
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Identifies what this mapping refers to
    */
  var uri: js.UndefOr[typings.fhir.fhir.uri] = js.undefined
}

object DataElementMapping {
  @scala.inline
  def apply(
    identity: id,
    _comment: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _identity: Element = null,
    _name: Element = null,
    _uri: Element = null,
    comment: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    name: String = null,
    uri: uri = null
  ): DataElementMapping = {
    val __obj = js.Dynamic.literal(identity = identity)
    if (_comment != null) __obj.updateDynamic("_comment")(_comment)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_identity != null) __obj.updateDynamic("_identity")(_identity)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_uri != null) __obj.updateDynamic("_uri")(_uri)
    if (comment != null) __obj.updateDynamic("comment")(comment)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    __obj.asInstanceOf[DataElementMapping]
  }
}

