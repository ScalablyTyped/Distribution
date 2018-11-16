package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Parameters for the operation/query
     */

trait OperationDefinitionParameter extends BackboneElement {
  /**
           * Contains extended information for property 'documentation'.
           */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'max'.
           */
  var _max: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'min'.
           */
  var _min: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'searchType'.
           */
  var _searchType: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'use'.
           */
  var _use: js.UndefOr[Element] = js.undefined
  /**
           * ValueSet details if this is coded
           */
  var binding: js.UndefOr[OperationDefinitionParameterBinding] = js.undefined
  /**
           * Description of meaning/use
           */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Maximum Cardinality (a number or *)
           */
  var max: java.lang.String
  /**
           * Minimum Cardinality
           */
  var min: integer
  /**
           * Name in Parameters.parameter.name or in URL
           */
  var name: code
  /**
           * Parts of a nested Parameter
           */
  var part: js.UndefOr[js.Array[OperationDefinitionParameter]] = js.undefined
  /**
           * Profile on the type
           */
  var profile: js.UndefOr[Reference] = js.undefined
  /**
           * number | date | string | token | reference | composite | quantity | uri
           */
  var searchType: js.UndefOr[code] = js.undefined
  /**
           * What type this parameter has
           */
  var `type`: js.UndefOr[code] = js.undefined
  /**
           * in | out
           */
  var use: code
}

