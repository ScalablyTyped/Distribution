package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursor extends js.Object {
  /**
    * If the position is just before or just after the given values, relative
    * to the sort order defined by the query.
    */
  var before: js.UndefOr[Boolean] = js.undefined
  /**
    * The values that represent a position, in the order they appear in
    * the order by clause of a query.
    *
    * Can contain fewer values than specified in the order by clause.
    */
  var values: js.UndefOr[js.Array[Value]] = js.undefined
}

object Cursor {
  @scala.inline
  def apply(before: js.UndefOr[Boolean] = js.undefined, values: js.Array[Value] = null): Cursor = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(before)) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
}

