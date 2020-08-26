package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StructuredQuery extends js.Object {
  /** A end point for the query results. */
  var endAt: js.UndefOr[Cursor] = js.native
  /** The collections to query. */
  var from: js.UndefOr[js.Array[CollectionSelector]] = js.native
  /**
    * The maximum number of results to return.
    *
    * Applies after all other constraints.
    * Must be >= 0 if specified.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * The number of results to skip.
    *
    * Applies before limit, but after all other constraints. Must be >= 0 if
    * specified.
    */
  var offset: js.UndefOr[Double] = js.native
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
  var orderBy: js.UndefOr[js.Array[Order]] = js.native
  /** The projection to return. */
  var select: js.UndefOr[Projection] = js.native
  /** A starting point for the query results. */
  var startAt: js.UndefOr[Cursor] = js.native
  /** The filter to apply. */
  var where: js.UndefOr[Filter] = js.native
}

object StructuredQuery {
  @scala.inline
  def apply(): StructuredQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredQuery]
  }
  @scala.inline
  implicit class StructuredQueryOps[Self <: StructuredQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndAt(value: Cursor): Self = this.set("endAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndAt: Self = this.set("endAt", js.undefined)
    @scala.inline
    def setFromVarargs(value: CollectionSelector*): Self = this.set("from", js.Array(value :_*))
    @scala.inline
    def setFrom(value: js.Array[CollectionSelector]): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrderByVarargs(value: Order*): Self = this.set("orderBy", js.Array(value :_*))
    @scala.inline
    def setOrderBy(value: js.Array[Order]): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setSelect(value: Projection): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    @scala.inline
    def setStartAt(value: Cursor): Self = this.set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    @scala.inline
    def setWhere(value: Filter): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

