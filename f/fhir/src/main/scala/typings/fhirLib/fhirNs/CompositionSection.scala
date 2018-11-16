package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Composition is broken into sections
     */

trait CompositionSection extends BackboneElement {
  /**
           * Contains extended information for property 'mode'.
           */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'title'.
           */
  var _title: js.UndefOr[Element] = js.undefined
  /**
           * Classification of section (recommended)
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Why the section is empty
           */
  var emptyReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * A reference to data that supports this section
           */
  var entry: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * working | snapshot | changes
           */
  var mode: js.UndefOr[code] = js.undefined
  /**
           * Order of section entries
           */
  var orderedBy: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Nested Section
           */
  var section: js.UndefOr[js.Array[CompositionSection]] = js.undefined
  /**
           * Text summary of the section, for human interpretation
           */
  var text: js.UndefOr[Narrative] = js.undefined
  /**
           * Label for section (e.g. for ToC)
           */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

