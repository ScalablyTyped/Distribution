package typings
package gapiDotClientDotSqladminLib.gapiNs.clientNs.sqladminNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasesListResponse extends js.Object {
  /** List of database resources in the instance. */
  var items: js.UndefOr[js.Array[Database]] = js.undefined
  /** This is always sql#databasesList. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object DatabasesListResponse {
  @scala.inline
  def apply(items: js.Array[Database] = null, kind: java.lang.String = null): DatabasesListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[DatabasesListResponse]
  }
}

