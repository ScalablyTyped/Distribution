package typings
package ejDotWebDotAllLib.ejNs.PivotTreeMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceValue extends js.Object {
  /** Allows to set the axis name to place the measures items.
               * @Default {rows}
               */
  var axis: js.UndefOr[java.lang.String] = js.undefined
  /** This holds the list of unique names of measures to bind them from the OLAP cube.
               * @Default {[]}
               */
  var measures: js.UndefOr[js.Array[DataSourceValuesMeasure]] = js.undefined
}

