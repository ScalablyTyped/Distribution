package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Search related information
     */

trait BundleEntrySearch extends BackboneElement {
  /**
           * Contains extended information for property 'mode'.
           */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'score'.
           */
  var _score: js.UndefOr[Element] = js.undefined
  /**
           * match | include | outcome - why this is in the result set
           */
  var mode: js.UndefOr[code] = js.undefined
  /**
           * Search ranking (between 0 and 1)
           */
  var score: js.UndefOr[decimal] = js.undefined
}

