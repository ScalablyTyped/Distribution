package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FoundInPageResult extends js.Object {
  /**
    * Position of the active match.
    */
  var activeMatchOrdinal: Double = js.native
  var finalUpdate: Boolean = js.native
  /**
    * Number of Matches.
    */
  var matches: Double = js.native
  var requestId: Double = js.native
  /**
    * Coordinates of first match region.
    */
  var selectionArea: Rectangle = js.native
}

object FoundInPageResult {
  @scala.inline
  def apply(
    activeMatchOrdinal: Double,
    finalUpdate: Boolean,
    matches: Double,
    requestId: Double,
    selectionArea: Rectangle
  ): FoundInPageResult = {
    val __obj = js.Dynamic.literal(activeMatchOrdinal = activeMatchOrdinal.asInstanceOf[js.Any], finalUpdate = finalUpdate.asInstanceOf[js.Any], matches = matches.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], selectionArea = selectionArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoundInPageResult]
  }
  @scala.inline
  implicit class FoundInPageResultOps[Self <: FoundInPageResult] (val x: Self) extends AnyVal {
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
    def setActiveMatchOrdinal(value: Double): Self = this.set("activeMatchOrdinal", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinalUpdate(value: Boolean): Self = this.set("finalUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatches(value: Double): Self = this.set("matches", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: Double): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionArea(value: Rectangle): Self = this.set("selectionArea", value.asInstanceOf[js.Any])
  }
  
}

