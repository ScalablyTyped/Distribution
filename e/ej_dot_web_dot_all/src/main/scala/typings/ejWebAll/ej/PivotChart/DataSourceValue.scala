package typings.ejWebAll.ej.PivotChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceValue extends js.Object {
  /** Allows you to set the axis name to place the measures items.
    * @Default {rows}
    */
  var axis: js.UndefOr[String] = js.native
  /** Allows you to set the display caption for the item of the relational datasource.
    */
  var fieldCaption: js.UndefOr[String] = js.native
  /** Allows you to bind the item by using its unique name as field name for the relational datasource.
    */
  var fieldName: js.UndefOr[String] = js.native
  /** Allows you to set the formula to calculate the values for calculated members in the relational datasource.
    */
  var formula: js.UndefOr[String] = js.native
  /** Indicates whether the field is a calculated field with the relational datasource or not.
    * @Default {false}
    */
  var isCalculatedField: js.UndefOr[Boolean] = js.native
  /** Holds the list of unique names of measures to bind them from the OLAP cube.
    * @Default {[]}
    */
  var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.native
}

object DataSourceValue {
  @scala.inline
  def apply(): DataSourceValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceValue]
  }
  @scala.inline
  implicit class DataSourceValueOps[Self <: DataSourceValue] (val x: Self) extends AnyVal {
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
    def setAxis(value: String): Self = this.set("axis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    @scala.inline
    def setFieldCaption(value: String): Self = this.set("fieldCaption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldCaption: Self = this.set("fieldCaption", js.undefined)
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    @scala.inline
    def setIsCalculatedField(value: Boolean): Self = this.set("isCalculatedField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCalculatedField: Self = this.set("isCalculatedField", js.undefined)
    @scala.inline
    def setMeasuresVarargs(value: DataSourceValuesMeasure*): Self = this.set("measures", js.Array(value :_*))
    @scala.inline
    def setMeasures(value: js.Array[DataSourceValuesMeasure]): Self = this.set("measures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeasures: Self = this.set("measures", js.undefined)
  }
  
}

