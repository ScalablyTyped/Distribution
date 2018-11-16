package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Data type and Profile for this element
     */

trait ElementDefinitionType extends Element {
  /**
           * Contains extended information for property 'aggregation'.
           */
  var _aggregation: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'code'.
           */
  var _code: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'profile'.
           */
  var _profile: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'targetProfile'.
           */
  var _targetProfile: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'versioning'.
           */
  var _versioning: js.UndefOr[Element] = js.undefined
  /**
           * contained | referenced | bundled - how aggregated
           */
  var aggregation: js.UndefOr[js.Array[code]] = js.undefined
  /**
           * Data type or Resource (reference to definition)
           */
  var code: uri
  /**
           * Profile (StructureDefinition) to apply (or IG)
           */
  var profile: js.UndefOr[uri] = js.undefined
  /**
           * Profile (StructureDefinition) to apply to reference target (or IG)
           */
  var targetProfile: js.UndefOr[uri] = js.undefined
  /**
           * either | independent | specific
           */
  var versioning: js.UndefOr[code] = js.undefined
}

