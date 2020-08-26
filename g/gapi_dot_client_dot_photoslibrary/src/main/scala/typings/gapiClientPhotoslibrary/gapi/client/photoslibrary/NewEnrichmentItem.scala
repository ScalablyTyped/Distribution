package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewEnrichmentItem extends js.Object {
  /** Location to be added to the album. */
  var locationEnrichment: js.UndefOr[LocationEnrichment] = js.native
  /** Map to be added to the album. */
  var mapEnrichment: js.UndefOr[MapEnrichment] = js.native
  /** Text to be added to the album. */
  var textEnrichment: js.UndefOr[TextEnrichment] = js.native
}

object NewEnrichmentItem {
  @scala.inline
  def apply(): NewEnrichmentItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewEnrichmentItem]
  }
  @scala.inline
  implicit class NewEnrichmentItemOps[Self <: NewEnrichmentItem] (val x: Self) extends AnyVal {
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
    def setLocationEnrichment(value: LocationEnrichment): Self = this.set("locationEnrichment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationEnrichment: Self = this.set("locationEnrichment", js.undefined)
    @scala.inline
    def setMapEnrichment(value: MapEnrichment): Self = this.set("mapEnrichment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapEnrichment: Self = this.set("mapEnrichment", js.undefined)
    @scala.inline
    def setTextEnrichment(value: TextEnrichment): Self = this.set("textEnrichment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextEnrichment: Self = this.set("textEnrichment", js.undefined)
  }
  
}

