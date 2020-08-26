package typings.gapiClientPhotoslibrary.gapi.client.photoslibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapEnrichment extends js.Object {
  /** Destination location for this enrichemt item. */
  var destination: js.UndefOr[Location] = js.native
  /** Origin location for this enrichment item. */
  var origin: js.UndefOr[Location] = js.native
}

object MapEnrichment {
  @scala.inline
  def apply(): MapEnrichment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapEnrichment]
  }
  @scala.inline
  implicit class MapEnrichmentOps[Self <: MapEnrichment] (val x: Self) extends AnyVal {
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
    def setDestination(value: Location): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setOrigin(value: Location): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
  }
  
}

