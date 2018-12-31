package typings
package gapiDotClientDotAnalyticsreportingLib.gapiNs.clientNs.analyticsreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderBy extends js.Object {
  /**
    * The field which to sort by. The default sort order is ascending. Example:
    * `ga:browser`.
    * Note, that you can only specify one field for sort here. For example,
    * `ga:browser, ga:city` is not valid.
    */
  var fieldName: js.UndefOr[java.lang.String] = js.undefined
  /** The order type. The default orderType is `VALUE`. */
  var orderType: js.UndefOr[java.lang.String] = js.undefined
  /** The sorting order for the field. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
}

