package typings
package ejDotWebDotAllLib.ejNs.PivotGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceValue extends js.Object {
  /** Allows to set the axis name to place the measures items.
    * @Default {rows}
    */
  var axis: js.UndefOr[java.lang.String] = js.undefined
  /** Allows the user to set the display caption for an item for Relational datasource.
    */
  var fieldCaption: js.UndefOr[java.lang.String] = js.undefined
  /** Allows the user to bind the item by using its unique name as field name for Relational datasource.
    */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** Allows to set the formula for calculation of values for calculated members in Relational datasource.
    */
  var formula: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates whether the field is a calculated field or not with Relational datasource.
    * @Default {false}
    */
  var isCalculatedField: js.UndefOr[scala.Boolean] = js.undefined
  /** This holds the list of unique names of measures to bind them from the OLAP cube.
    * @Default {[]}
    */
  var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.undefined
}

