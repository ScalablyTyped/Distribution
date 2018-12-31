package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSettingList extends js.Object {
  /** All requested style settings. */
  var items: js.UndefOr[js.Array[StyleSetting]] = js.undefined
  /** The kind of item this is. For a style list, this is always fusiontables#styleSettingList . */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token used to access the next page of this result. No token is displayed if there are no more styles left. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Total number of styles for the table. */
  var totalItems: js.UndefOr[scala.Double] = js.undefined
}

