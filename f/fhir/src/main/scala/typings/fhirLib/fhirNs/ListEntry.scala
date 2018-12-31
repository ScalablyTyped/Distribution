package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entries in the list
  */
trait ListEntry extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'deleted'.
    */
  var _deleted: js.UndefOr[Element] = js.undefined
  /**
    * When item added to list
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * If this item is actually marked as deleted
    */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Status/Workflow information about this item
    */
  var flag: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Actual entry
    */
  var item: Reference
}

