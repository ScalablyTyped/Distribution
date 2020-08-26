package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used when the value set is "expanded"
  */
@js.native
trait ValueSetExpansion extends BackboneElement {
  /**
    * Contains extended information for property 'identifier'.
    */
  var _identifier: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'offset'.
    */
  var _offset: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'timestamp'.
    */
  var _timestamp: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'total'.
    */
  var _total: js.UndefOr[Element] = js.native
  /**
    * Codes in the value set
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.native
  /**
    * Uniquely identifies this expansion
    */
  var identifier: uri = js.native
  /**
    * Offset at which this resource starts
    */
  var offset: js.UndefOr[integer] = js.native
  /**
    * Parameter that controlled the expansion process
    */
  var parameter: js.UndefOr[js.Array[ValueSetExpansionParameter]] = js.native
  /**
    * Time ValueSet expansion happened
    */
  var timestamp: dateTime = js.native
  /**
    * Total number of codes in the expansion
    */
  var total: js.UndefOr[integer] = js.native
}

object ValueSetExpansion {
  @scala.inline
  def apply(identifier: uri, timestamp: dateTime): ValueSetExpansion = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueSetExpansion]
  }
  @scala.inline
  implicit class ValueSetExpansionOps[Self <: ValueSetExpansion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIdentifier(value: uri): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: dateTime): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def set_identifier(value: Element): Self = this.set("_identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_identifier: Self = this.set("_identifier", js.undefined)
    @scala.inline
    def set_offset(value: Element): Self = this.set("_offset", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_offset: Self = this.set("_offset", js.undefined)
    @scala.inline
    def set_timestamp(value: Element): Self = this.set("_timestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_timestamp: Self = this.set("_timestamp", js.undefined)
    @scala.inline
    def set_total(value: Element): Self = this.set("_total", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_total: Self = this.set("_total", js.undefined)
    @scala.inline
    def setContainsVarargs(value: ValueSetExpansionContains*): Self = this.set("contains", js.Array(value :_*))
    @scala.inline
    def setContains(value: js.Array[ValueSetExpansionContains]): Self = this.set("contains", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    @scala.inline
    def setOffset(value: integer): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setParameterVarargs(value: ValueSetExpansionParameter*): Self = this.set("parameter", js.Array(value :_*))
    @scala.inline
    def setParameter(value: js.Array[ValueSetExpansionParameter]): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    @scala.inline
    def setTotal(value: integer): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

