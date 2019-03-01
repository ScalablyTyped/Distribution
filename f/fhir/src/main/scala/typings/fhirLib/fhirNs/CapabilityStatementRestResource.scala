package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource served on the REST interface
  */
trait CapabilityStatementRestResource extends BackboneElement {
  /**
    * Contains extended information for property 'conditionalCreate'.
    */
  var _conditionalCreate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'conditionalDelete'.
    */
  var _conditionalDelete: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'conditionalRead'.
    */
  var _conditionalRead: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'conditionalUpdate'.
    */
  var _conditionalUpdate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'readHistory'.
    */
  var _readHistory: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'referencePolicy'.
    */
  var _referencePolicy: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'searchInclude'.
    */
  var _searchInclude: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'searchRevInclude'.
    */
  var _searchRevInclude: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'updateCreate'.
    */
  var _updateCreate: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'versioning'.
    */
  var _versioning: js.UndefOr[Element] = js.undefined
  /**
    * If allows/uses conditional create
    */
  var conditionalCreate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * not-supported | single | multiple - how conditional delete is supported
    */
  var conditionalDelete: js.UndefOr[code] = js.undefined
  /**
    * not-supported | modified-since | not-match | full-support
    */
  var conditionalRead: js.UndefOr[code] = js.undefined
  /**
    * If allows/uses conditional update
    */
  var conditionalUpdate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional information about the use of the resource type
    */
  var documentation: js.UndefOr[markdown] = js.undefined
  /**
    * What operations are supported?
    */
  var interaction: js.Array[CapabilityStatementRestResourceInteraction]
  /**
    * Base System profile for all uses of resource
    */
  var profile: js.UndefOr[Reference] = js.undefined
  /**
    * Whether vRead can return past versions
    */
  var readHistory: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * literal | logical | resolves | enforced | local
    */
  var referencePolicy: js.UndefOr[js.Array[code]] = js.undefined
  /**
    * _include values supported by the server
    */
  var searchInclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Search parameters supported by implementation
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.undefined
  /**
    * _revinclude values supported by the server
    */
  var searchRevInclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A resource type that is supported
    */
  var `type`: code
  /**
    * If update can commit to a new identity
    */
  var updateCreate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * no-version | versioned | versioned-update
    */
  var versioning: js.UndefOr[code] = js.undefined
}

object CapabilityStatementRestResource {
  @scala.inline
  def apply(
    interaction: js.Array[CapabilityStatementRestResourceInteraction],
    `type`: code,
    _conditionalCreate: Element = null,
    _conditionalDelete: Element = null,
    _conditionalRead: Element = null,
    _conditionalUpdate: Element = null,
    _documentation: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _readHistory: Element = null,
    _referencePolicy: js.Array[Element] = null,
    _searchInclude: js.Array[Element] = null,
    _searchRevInclude: js.Array[Element] = null,
    _type: Element = null,
    _updateCreate: Element = null,
    _versioning: Element = null,
    conditionalCreate: js.UndefOr[scala.Boolean] = js.undefined,
    conditionalDelete: code = null,
    conditionalRead: code = null,
    conditionalUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: markdown = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    profile: Reference = null,
    readHistory: js.UndefOr[scala.Boolean] = js.undefined,
    referencePolicy: js.Array[code] = null,
    searchInclude: js.Array[java.lang.String] = null,
    searchParam: js.Array[CapabilityStatementRestResourceSearchParam] = null,
    searchRevInclude: js.Array[java.lang.String] = null,
    updateCreate: js.UndefOr[scala.Boolean] = js.undefined,
    versioning: code = null
  ): CapabilityStatementRestResource = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("interaction")(interaction)
    if (_conditionalCreate != null) __obj.updateDynamic("_conditionalCreate")(_conditionalCreate)
    if (_conditionalDelete != null) __obj.updateDynamic("_conditionalDelete")(_conditionalDelete)
    if (_conditionalRead != null) __obj.updateDynamic("_conditionalRead")(_conditionalRead)
    if (_conditionalUpdate != null) __obj.updateDynamic("_conditionalUpdate")(_conditionalUpdate)
    if (_documentation != null) __obj.updateDynamic("_documentation")(_documentation)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_readHistory != null) __obj.updateDynamic("_readHistory")(_readHistory)
    if (_referencePolicy != null) __obj.updateDynamic("_referencePolicy")(_referencePolicy)
    if (_searchInclude != null) __obj.updateDynamic("_searchInclude")(_searchInclude)
    if (_searchRevInclude != null) __obj.updateDynamic("_searchRevInclude")(_searchRevInclude)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_updateCreate != null) __obj.updateDynamic("_updateCreate")(_updateCreate)
    if (_versioning != null) __obj.updateDynamic("_versioning")(_versioning)
    if (!js.isUndefined(conditionalCreate)) __obj.updateDynamic("conditionalCreate")(conditionalCreate)
    if (conditionalDelete != null) __obj.updateDynamic("conditionalDelete")(conditionalDelete)
    if (conditionalRead != null) __obj.updateDynamic("conditionalRead")(conditionalRead)
    if (!js.isUndefined(conditionalUpdate)) __obj.updateDynamic("conditionalUpdate")(conditionalUpdate)
    if (documentation != null) __obj.updateDynamic("documentation")(documentation)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (!js.isUndefined(readHistory)) __obj.updateDynamic("readHistory")(readHistory)
    if (referencePolicy != null) __obj.updateDynamic("referencePolicy")(referencePolicy)
    if (searchInclude != null) __obj.updateDynamic("searchInclude")(searchInclude)
    if (searchParam != null) __obj.updateDynamic("searchParam")(searchParam)
    if (searchRevInclude != null) __obj.updateDynamic("searchRevInclude")(searchRevInclude)
    if (!js.isUndefined(updateCreate)) __obj.updateDynamic("updateCreate")(updateCreate)
    if (versioning != null) __obj.updateDynamic("versioning")(versioning)
    __obj.asInstanceOf[CapabilityStatementRestResource]
  }
}

