package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used when the value set is "expanded"
  */
trait ValueSetExpansion extends BackboneElement {
  /**
    * Contains extended information for property 'identifier'.
    */
  var _identifier: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'offset'.
    */
  var _offset: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'timestamp'.
    */
  var _timestamp: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'total'.
    */
  var _total: js.UndefOr[Element] = js.undefined
  /**
    * Codes in the value set
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.undefined
  /**
    * Uniquely identifies this expansion
    */
  var identifier: uri
  /**
    * Offset at which this resource starts
    */
  var offset: js.UndefOr[integer] = js.undefined
  /**
    * Parameter that controlled the expansion process
    */
  var parameter: js.UndefOr[js.Array[ValueSetExpansionParameter]] = js.undefined
  /**
    * Time ValueSet expansion happened
    */
  var timestamp: dateTime
  /**
    * Total number of codes in the expansion
    */
  var total: js.UndefOr[integer] = js.undefined
}

