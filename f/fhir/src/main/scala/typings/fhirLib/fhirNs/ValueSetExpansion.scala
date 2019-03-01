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

object ValueSetExpansion {
  @scala.inline
  def apply(
    identifier: uri,
    timestamp: dateTime,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _identifier: Element = null,
    _offset: Element = null,
    _timestamp: Element = null,
    _total: Element = null,
    contains: js.Array[ValueSetExpansionContains] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    offset: js.UndefOr[integer] = js.undefined,
    parameter: js.Array[ValueSetExpansionParameter] = null,
    total: js.UndefOr[integer] = js.undefined
  ): ValueSetExpansion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("timestamp")(timestamp)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_identifier != null) __obj.updateDynamic("_identifier")(_identifier)
    if (_offset != null) __obj.updateDynamic("_offset")(_offset)
    if (_timestamp != null) __obj.updateDynamic("_timestamp")(_timestamp)
    if (_total != null) __obj.updateDynamic("_total")(_total)
    if (contains != null) __obj.updateDynamic("contains")(contains)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[ValueSetExpansion]
  }
}

