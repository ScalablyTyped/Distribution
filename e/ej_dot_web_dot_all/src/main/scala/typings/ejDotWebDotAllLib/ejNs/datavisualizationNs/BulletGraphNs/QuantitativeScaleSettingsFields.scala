package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.BulletGraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsFields extends js.Object {
  /** Specifies the category of the bullet graph.
    * @Default {null}
    */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /** Comparative measure render based on the values in the specified field.
    * @Default {null}
    */
  var comparativeMeasure: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the dataSource for the bullet graph.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Feature measure render based on the values in the specified field.
    * @Default {null}
    */
  var featureMeasures: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the query for fetching the values form data source to render the bullet graph.
    * @Default {null}
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the name of the table.
    * @Default {null}
    */
  var tableName: js.UndefOr[java.lang.String] = js.undefined
}

object QuantitativeScaleSettingsFields {
  @scala.inline
  def apply(
    category: java.lang.String = null,
    comparativeMeasure: java.lang.String = null,
    dataSource: js.Any = null,
    featureMeasures: java.lang.String = null,
    query: java.lang.String = null,
    tableName: java.lang.String = null
  ): QuantitativeScaleSettingsFields = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category)
    if (comparativeMeasure != null) __obj.updateDynamic("comparativeMeasure")(comparativeMeasure)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (featureMeasures != null) __obj.updateDynamic("featureMeasures")(featureMeasures)
    if (query != null) __obj.updateDynamic("query")(query)
    if (tableName != null) __obj.updateDynamic("tableName")(tableName)
    __obj.asInstanceOf[QuantitativeScaleSettingsFields]
  }
}

