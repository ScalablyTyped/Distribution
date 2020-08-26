package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuantitativeScaleSettingsFields extends js.Object {
  /** Specifies the category of the bullet graph.
    * @Default {null}
    */
  var category: js.UndefOr[String] = js.native
  /** Comparative measure render based on the values in the specified field.
    * @Default {null}
    */
  var comparativeMeasure: js.UndefOr[String] = js.native
  /** Specifies the dataSource for the bullet graph.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Feature measure render based on the values in the specified field.
    * @Default {null}
    */
  var featureMeasures: js.UndefOr[String] = js.native
  /** Specifies the query for fetching the values form data source to render the bullet graph.
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.native
  /** Specifies the name of the table.
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.native
}

object QuantitativeScaleSettingsFields {
  @scala.inline
  def apply(): QuantitativeScaleSettingsFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuantitativeScaleSettingsFields]
  }
  @scala.inline
  implicit class QuantitativeScaleSettingsFieldsOps[Self <: QuantitativeScaleSettingsFields] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setComparativeMeasure(value: String): Self = this.set("comparativeMeasure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComparativeMeasure: Self = this.set("comparativeMeasure", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setFeatureMeasures(value: String): Self = this.set("featureMeasures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureMeasures: Self = this.set("featureMeasures", js.undefined)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setTableName(value: String): Self = this.set("tableName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableName: Self = this.set("tableName", js.undefined)
  }
  
}

