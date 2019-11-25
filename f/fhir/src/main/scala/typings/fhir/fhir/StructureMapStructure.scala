package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structure Definition used by this map
  */
trait StructureMapStructure extends BackboneElement {
  /**
    * Contains extended information for property 'alias'.
    */
  var _alias: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  /**
    * Name for type in this map
    */
  var alias: js.UndefOr[String] = js.undefined
  /**
    * Documentation on use of structure
    */
  var documentation: js.UndefOr[String] = js.undefined
  /**
    * source | queried | target | produced
    */
  var mode: code
  /**
    * Canonical URL for structure definition
    */
  var url: uri
}

object StructureMapStructure {
  @scala.inline
  def apply(
    mode: code,
    url: uri,
    _alias: Element = null,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _mode: Element = null,
    _url: Element = null,
    alias: String = null,
    documentation: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): StructureMapStructure = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (_alias != null) __obj.updateDynamic("_alias")(_alias.asInstanceOf[js.Any])
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_mode != null) __obj.updateDynamic("_mode")(_mode.asInstanceOf[js.Any])
    if (_url != null) __obj.updateDynamic("_url")(_url.asInstanceOf[js.Any])
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMapStructure]
  }
}

