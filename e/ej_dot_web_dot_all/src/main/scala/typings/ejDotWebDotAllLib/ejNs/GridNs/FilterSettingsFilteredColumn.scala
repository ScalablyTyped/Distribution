package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FilterSettingsFilteredColumn extends js.Object {
  /** Gets or sets a value that indicates whether to define the field name of the column to be filter.
               */
  var field: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to define the matchCase of given value to be filter.
               */
  var matchCase: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to define the filter condition to filtered column. See operator
               */
  var operator: js.UndefOr[ejDotWebDotAllLib.ejNs.FilterOperators | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to define the predicate as and/or.
               */
  var predicate: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates whether to define the value to be filtered in a column.
               */
  var value: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

