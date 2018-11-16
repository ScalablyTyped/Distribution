package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataSourceFilter extends js.Object {
  /** Allows you to set the display name for an item.
               */
  var fieldCaption: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to bind the item by using its unique name as field name.
               */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** Applies filter to the field members.
               * @Default {null}
               */
  var filterItems: js.UndefOr[DataSourceFiltersFilterItems] = js.undefined
}

