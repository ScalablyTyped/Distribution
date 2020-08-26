package typings.gapiClientSpanner.gapi.client.spanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyRange extends js.Object {
  /**
    * If the end is closed, then the range includes all rows whose
    * first `len(end_closed)` key columns exactly match `end_closed`.
    */
  var endClosed: js.UndefOr[js.Array[_]] = js.native
  /**
    * If the end is open, then the range excludes rows whose first
    * `len(end_open)` key columns exactly match `end_open`.
    */
  var endOpen: js.UndefOr[js.Array[_]] = js.native
  /**
    * If the start is closed, then the range includes all rows whose
    * first `len(start_closed)` key columns exactly match `start_closed`.
    */
  var startClosed: js.UndefOr[js.Array[_]] = js.native
  /**
    * If the start is open, then the range excludes rows whose first
    * `len(start_open)` key columns exactly match `start_open`.
    */
  var startOpen: js.UndefOr[js.Array[_]] = js.native
}

object KeyRange {
  @scala.inline
  def apply(): KeyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyRange]
  }
  @scala.inline
  implicit class KeyRangeOps[Self <: KeyRange] (val x: Self) extends AnyVal {
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
    def setEndClosedVarargs(value: js.Any*): Self = this.set("endClosed", js.Array(value :_*))
    @scala.inline
    def setEndClosed(value: js.Array[_]): Self = this.set("endClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndClosed: Self = this.set("endClosed", js.undefined)
    @scala.inline
    def setEndOpenVarargs(value: js.Any*): Self = this.set("endOpen", js.Array(value :_*))
    @scala.inline
    def setEndOpen(value: js.Array[_]): Self = this.set("endOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndOpen: Self = this.set("endOpen", js.undefined)
    @scala.inline
    def setStartClosedVarargs(value: js.Any*): Self = this.set("startClosed", js.Array(value :_*))
    @scala.inline
    def setStartClosed(value: js.Array[_]): Self = this.set("startClosed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartClosed: Self = this.set("startClosed", js.undefined)
    @scala.inline
    def setStartOpenVarargs(value: js.Any*): Self = this.set("startOpen", js.Array(value :_*))
    @scala.inline
    def setStartOpen(value: js.Array[_]): Self = this.set("startOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartOpen: Self = this.set("startOpen", js.undefined)
  }
  
}

