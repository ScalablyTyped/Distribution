package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The party(s) that are responsible for covering the payment of this account, and what order should they be applied to the account
     */

trait AccountCoverage extends BackboneElement {
  /**
           * Contains extended information for property 'priority'.
           */
  var _priority: js.UndefOr[Element] = js.undefined
  /**
           * The party(s) that are responsible for covering the payment of this account
           */
  var coverage: Reference
  /**
           * The priority of the coverage in the context of this account
           */
  var priority: js.UndefOr[positiveInt] = js.undefined
}

