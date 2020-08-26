package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomRichMediaEvents extends js.Object {
  /** List of custom rich media event IDs. Dimension values must be all of type dfa:richMediaEventTypeIdAndName. */
  var filteredEventIds: js.UndefOr[js.Array[DimensionValue]] = js.native
  /** The kind of resource this is, in this case dfareporting#customRichMediaEvents. */
  var kind: js.UndefOr[String] = js.native
}

object CustomRichMediaEvents {
  @scala.inline
  def apply(): CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomRichMediaEvents]
  }
  @scala.inline
  implicit class CustomRichMediaEventsOps[Self <: CustomRichMediaEvents] (val x: Self) extends AnyVal {
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
    def setFilteredEventIdsVarargs(value: DimensionValue*): Self = this.set("filteredEventIds", js.Array(value :_*))
    @scala.inline
    def setFilteredEventIds(value: js.Array[DimensionValue]): Self = this.set("filteredEventIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilteredEventIds: Self = this.set("filteredEventIds", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

