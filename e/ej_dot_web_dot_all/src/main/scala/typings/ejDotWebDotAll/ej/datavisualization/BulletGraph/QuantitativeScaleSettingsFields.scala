package typings.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsFields extends js.Object {
  /** Specifies the category of the bullet graph.
    * @Default {null}
    */
  var category: js.UndefOr[String] = js.undefined
  /** Comparative measure render based on the values in the specified field.
    * @Default {null}
    */
  var comparativeMeasure: js.UndefOr[String] = js.undefined
  /** Specifies the dataSource for the bullet graph.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Feature measure render based on the values in the specified field.
    * @Default {null}
    */
  var featureMeasures: js.UndefOr[String] = js.undefined
  /** Specifies the query for fetching the values form data source to render the bullet graph.
    * @Default {null}
    */
  var query: js.UndefOr[String] = js.undefined
  /** Specifies the name of the table.
    * @Default {null}
    */
  var tableName: js.UndefOr[String] = js.undefined
}

object QuantitativeScaleSettingsFields {
  @scala.inline
  def apply(
    category: String = null,
    comparativeMeasure: String = null,
    dataSource: js.Any = null,
    featureMeasures: String = null,
    query: String = null,
    tableName: String = null
  ): QuantitativeScaleSettingsFields = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (comparativeMeasure != null) __obj.updateDynamic("comparativeMeasure")(comparativeMeasure.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (featureMeasures != null) __obj.updateDynamic("featureMeasures")(featureMeasures.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (tableName != null) __obj.updateDynamic("tableName")(tableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsFields]
  }
}

