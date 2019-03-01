package typings
package fhirLib.fhirNs

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
  var alias: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Documentation on use of structure
    */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
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
    alias: java.lang.String = null,
    documentation: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): StructureMapStructure = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("url")(url)
    if (_alias != null) __obj.updateDynamic("_alias")(_alias)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (_url != null) __obj.updateDynamic("_url")(_url)
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[StructureMapStructure]
  }
}

