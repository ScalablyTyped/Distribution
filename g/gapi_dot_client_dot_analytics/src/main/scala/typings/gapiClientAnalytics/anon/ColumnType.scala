package typings.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnType extends js.Object {
  /** Column Type. Either DIMENSION or METRIC. */
  var columnType: js.UndefOr[String] = js.native
  /**
    * Data type. Dimension column headers have only STRING as the data type. Metric column headers have data types for metric values such as INTEGER, DOUBLE,
    * CURRENCY etc.
    */
  var dataType: js.UndefOr[String] = js.native
  /** Column name. */
  var name: js.UndefOr[String] = js.native
}

object ColumnType {
  @scala.inline
  def apply(): ColumnType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnType]
  }
  @scala.inline
  implicit class ColumnTypeOps[Self <: ColumnType] (val x: Self) extends AnyVal {
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
    def setColumnType(value: String): Self = this.set("columnType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnType: Self = this.set("columnType", js.undefined)
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

