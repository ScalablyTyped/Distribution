package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Concept in target system for element
     */

trait ConceptMapGroupElementTarget extends BackboneElement {
  /**
           * Contains extended information for property 'code'.
           */
  var _code: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'comment'.
           */
  var _comment: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'display'.
           */
  var _display: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'equivalence'.
           */
  var _equivalence: js.UndefOr[Element] = js.undefined
  /**
           * Code that identifies the target element
           */
  var code: js.UndefOr[code] = js.undefined
  /**
           * Description of status/issues in mapping
           */
  var comment: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Other elements required for this mapping (from context)
           */
  var dependsOn: js.UndefOr[js.Array[ConceptMapGroupElementTargetDependsOn]] = js.undefined
  /**
           * Display for the code
           */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
           * relatedto | equivalent | equal | wider | subsumes | narrower | specializes | inexact | unmatched | disjoint
           */
  var equivalence: js.UndefOr[code] = js.undefined
  /**
           * Other concepts that this mapping also produces
           */
  var product: js.UndefOr[js.Array[ConceptMapGroupElementTargetDependsOn]] = js.undefined
}

