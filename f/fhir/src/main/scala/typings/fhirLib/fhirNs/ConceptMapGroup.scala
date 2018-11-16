package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Same source and target systems
     */

trait ConceptMapGroup extends BackboneElement {
  /**
           * Contains extended information for property 'source'.
           */
  var _source: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'sourceVersion'.
           */
  var _sourceVersion: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'target'.
           */
  var _target: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'targetVersion'.
           */
  var _targetVersion: js.UndefOr[Element] = js.undefined
  /**
           * Mappings for a concept from the source set
           */
  var element: js.Array[ConceptMapGroupElement]
  /**
           * Code System (if value set crosses code systems)
           */
  var source: js.UndefOr[uri] = js.undefined
  /**
           * Specific version of the  code system
           */
  var sourceVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
           * System of the target (if necessary)
           */
  var target: js.UndefOr[uri] = js.undefined
  /**
           * Specific version of the  code system
           */
  var targetVersion: js.UndefOr[java.lang.String] = js.undefined
  /**
           * When no match in the mappings
           */
  var unmapped: js.UndefOr[ConceptMapGroupUnmapped] = js.undefined
}

