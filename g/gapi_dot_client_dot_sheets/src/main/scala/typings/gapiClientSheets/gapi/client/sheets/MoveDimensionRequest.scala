package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveDimensionRequest extends js.Object {
  /**
    * The zero-based start index of where to move the source data to,
    * based on the coordinates &#42;before&#42; the source data is removed
    * from the grid.  Existing data will be shifted down or right
    * (depending on the dimension) to make room for the moved dimensions.
    * The source dimensions are removed from the grid, so the
    * the data may end up in a different index than specified.
    *
    * For example, given `A1..A5` of `0, 1, 2, 3, 4` and wanting to move
    * `"1"` and `"2"` to between `"3"` and `"4"`, the source would be
    * `ROWS [1..3)`,and the destination index would be `"4"`
    * (the zero-based index of row 5).
    * The end result would be `A1..A5` of `0, 3, 1, 2, 4`.
    */
  var destinationIndex: js.UndefOr[Double] = js.native
  /** The source dimensions to move. */
  var source: js.UndefOr[DimensionRange] = js.native
}

object MoveDimensionRequest {
  @scala.inline
  def apply(): MoveDimensionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoveDimensionRequest]
  }
  @scala.inline
  implicit class MoveDimensionRequestOps[Self <: MoveDimensionRequest] (val x: Self) extends AnyVal {
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
    def setDestinationIndex(value: Double): Self = this.set("destinationIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationIndex: Self = this.set("destinationIndex", js.undefined)
    @scala.inline
    def setSource(value: DimensionRange): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

