package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SearchSettings extends js.Object {
  /** This specify the grid to search for the value in particular columns that is mentioned in the field.
               * @Default {[]}
               */
  var fields: js.UndefOr[js.Any] = js.undefined
  /** It enables or disables case-sensitivity while searching the search key in grid.
               * @Default {true}
               */
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  /** This specifies the grid to search the particular data that is mentioned in the key.
               */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** It specifies the grid to search the records based on operator.
               * @Default {contains}
               */
  var operator: js.UndefOr[java.lang.String] = js.undefined
}

