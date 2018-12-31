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

