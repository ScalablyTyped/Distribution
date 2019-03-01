package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableList extends js.Object {
  /** List of all requested tables. */
  var items: js.UndefOr[js.Array[Table]] = js.undefined
  /** The kind of item this is. For table list, this is always fusiontables#tableList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Token used to access the next page of this result. No token is displayed if there are no more pages left. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object TableList {
  @scala.inline
  def apply(
    items: js.Array[Table] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): TableList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[TableList]
  }
}

