package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredQuery extends js.Object {
  /** A end point for the query results. */
  var endAt: js.UndefOr[Cursor] = js.undefined
  /** The collections to query. */
  var from: js.UndefOr[js.Array[CollectionSelector]] = js.undefined
  /**
    * The maximum number of results to return.
    *
    * Applies after all other constraints.
    * Must be >= 0 if specified.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The number of results to skip.
    *
    * Applies before limit, but after all other constraints. Must be >= 0 if
    * specified.
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * The order to apply to the query results.
    *
    * Firestore guarantees a stable ordering through the following rules:
    *
    * &#42; Any field required to appear in `order_by`, that is not already
    * specified in `order_by`, is appended to the order in field name order
    * by default.
    * &#42; If an order on `__name__` is not specified, it is appended by default.
    *
    * Fields are appended with the same sort direction as the last order
    * specified, or 'ASCENDING' if no order was specified. For example:
    *
    * &#42; `SELECT &#42; FROM Foo ORDER BY A` becomes
    * `SELECT &#42; FROM Foo ORDER BY A, __name__`
    * &#42; `SELECT &#42; FROM Foo ORDER BY A DESC` becomes
    * `SELECT &#42; FROM Foo ORDER BY A DESC, __name__ DESC`
    * &#42; `SELECT &#42; FROM Foo WHERE A > 1` becomes
    * `SELECT &#42; FROM Foo WHERE A > 1 ORDER BY A, __name__`
    */
  var orderBy: js.UndefOr[js.Array[Order]] = js.undefined
  /** The projection to return. */
  var select: js.UndefOr[Projection] = js.undefined
  /** A starting point for the query results. */
  var startAt: js.UndefOr[Cursor] = js.undefined
  /** The filter to apply. */
  var where: js.UndefOr[Filter] = js.undefined
}

