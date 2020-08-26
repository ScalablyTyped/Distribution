package typings.gapiClientBigquery.gapi.client.bigquery

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryParameterValue extends js.Object {
  /** [Optional] The array values, if this is an array type. */
  var arrayValues: js.UndefOr[js.Array[QueryParameterValue]] = js.native
  /** [Optional] The struct field values, in order of the struct type's declaration. */
  var structValues: js.UndefOr[Record[String, QueryParameterValue]] = js.native
  /** [Optional] The value of this value, if a simple scalar type. */
  var value: js.UndefOr[String] = js.native
}

object QueryParameterValue {
  @scala.inline
  def apply(): QueryParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryParameterValue]
  }
  @scala.inline
  implicit class QueryParameterValueOps[Self <: QueryParameterValue] (val x: Self) extends AnyVal {
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
    def setArrayValuesVarargs(value: QueryParameterValue*): Self = this.set("arrayValues", js.Array(value :_*))
    @scala.inline
    def setArrayValues(value: js.Array[QueryParameterValue]): Self = this.set("arrayValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayValues: Self = this.set("arrayValues", js.undefined)
    @scala.inline
    def setStructValues(value: Record[String, QueryParameterValue]): Self = this.set("structValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStructValues: Self = this.set("structValues", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

