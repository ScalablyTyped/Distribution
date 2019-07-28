package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Page/Section in the Guide
  */
trait ImplementationGuidePage extends BackboneElement {
  /**
    * Contains extended information for property 'format'.
    */
  var _format: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'kind'.
    */
  var _kind: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'package'.
    */
  var _package: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'source'.
    */
  var _source: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Format of the page (e.g. html, markdown, etc.)
    */
  var format: js.UndefOr[code] = js.undefined
  /**
    * page | example | list | include | directory | dictionary | toc | resource
    */
  var kind: code
  /**
    * Name of package to include
    */
  var `package`: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Nested Pages / Sections
    */
  var page: js.UndefOr[js.Array[ImplementationGuidePage]] = js.undefined
  /**
    * Where to find that page
    */
  var source: uri
  /**
    * Short title shown for navigational assistance
    */
  var title: String
  /**
    * Kind of resource to include in the list
    */
  var `type`: js.UndefOr[js.Array[code]] = js.undefined
}

object ImplementationGuidePage {
  @scala.inline
  def apply(
    kind: code,
    source: uri,
    title: String,
    _fhir_comments: js.Array[Element] = null,
    _format: Element = null,
    _id: Element = null,
    _kind: Element = null,
    _package: js.Array[Element] = null,
    _source: Element = null,
    _title: Element = null,
    _type: js.Array[Element] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    format: code = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    `package`: js.Array[String] = null,
    page: js.Array[ImplementationGuidePage] = null,
    `type`: js.Array[code] = null
  ): ImplementationGuidePage = {
    val __obj = js.Dynamic.literal(kind = kind, source = source, title = title)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_format != null) __obj.updateDynamic("_format")(_format)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_kind != null) __obj.updateDynamic("_kind")(_kind)
    if (_package != null) __obj.updateDynamic("_package")(_package)
    if (_source != null) __obj.updateDynamic("_source")(_source)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (page != null) __obj.updateDynamic("page")(page)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ImplementationGuidePage]
  }
}

