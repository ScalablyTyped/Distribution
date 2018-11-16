package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Definition of the content of the value set (CLD)
     */

trait ValueSetCompose extends BackboneElement {
  /**
           * Contains extended information for property 'inactive'.
           */
  var _inactive: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'lockedDate'.
           */
  var _lockedDate: js.UndefOr[Element] = js.undefined
  /**
           * Explicitly exclude codes from a code system or other value sets
           */
  var exclude: js.UndefOr[js.Array[ValueSetComposeInclude]] = js.undefined
  /**
           * Whether inactive codes are in the value set
           */
  var inactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Include one or more codes from a code system or other value set(s)
           */
  var include: js.Array[ValueSetComposeInclude]
  /**
           * Fixed date for version-less references (transitive)
           */
  var lockedDate: js.UndefOr[date] = js.undefined
}

