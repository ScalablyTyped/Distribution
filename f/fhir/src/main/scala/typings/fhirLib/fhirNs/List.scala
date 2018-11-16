package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Information summarized from a list of other resources
     */

trait List extends DomainResource {
  /**
           * Contains extended information for property 'date'.
           */
  var _date: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'mode'.
           */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'status'.
           */
  var _status: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'title'.
           */
  var _title: js.UndefOr[Element] = js.undefined
  /**
           * What the purpose of this list is
           */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * When the list was prepared
           */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
           * Why list is empty
           */
  var emptyReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Context in which list created
           */
  var encounter: js.UndefOr[Reference] = js.undefined
  /**
           * Entries in the list
           */
  var entry: js.UndefOr[js.Array[ListEntry]] = js.undefined
  /**
           * Business identifier
           */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
           * working | snapshot | changes
           */
  var mode: code
  /**
           * Comments about the list
           */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
           * What order the list has
           */
  var orderedBy: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Who and/or what defined the list contents (aka Author)
           */
  var source: js.UndefOr[Reference] = js.undefined
  /**
           * current | retired | entered-in-error
           */
  var status: code
  /**
           * If all resources have the same subject
           */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
           * Descriptive name for the list
           */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

