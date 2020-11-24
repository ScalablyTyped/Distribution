package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Order extends js.Object {
  
  var availGroupId: js.UndefOr[String] = js.native
  
  var channelId: js.UndefOr[String] = js.native
  
  var contentType: js.UndefOr[String] = js.native
  
  var country: js.UndefOr[String] = js.native
  
  var customId: js.UndefOr[String] = js.native
  
  var dvdReleaseDate: js.UndefOr[Date] = js.native
  
  var estDates: js.UndefOr[DateRange] = js.native
  
  var events: js.UndefOr[js.Array[StateCompleted]] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var movie: js.UndefOr[String] = js.native
  
  var originalReleaseDate: js.UndefOr[Date] = js.native
  
  var priority: js.UndefOr[String] = js.native
  
  var productionHouse: js.UndefOr[String] = js.native
  
  var purchaseOrder: js.UndefOr[String] = js.native
  
  var requirements: js.UndefOr[Requirements] = js.native
  
  var show: js.UndefOr[ShowDetails] = js.native
  
  var status: js.UndefOr[String] = js.native
  
  var videoId: js.UndefOr[String] = js.native
  
  var vodDates: js.UndefOr[DateRange] = js.native
}
object Order {
  
  @scala.inline
  def apply(): Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Order]
  }
  
  @scala.inline
  implicit class OrderOps[Self <: Order] (val x: Self) extends AnyVal {
    
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
    def setAvailGroupId(value: String): Self = this.set("availGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailGroupId: Self = this.set("availGroupId", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCustomId(value: String): Self = this.set("customId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomId: Self = this.set("customId", js.undefined)
    
    @scala.inline
    def setDvdReleaseDate(value: Date): Self = this.set("dvdReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDvdReleaseDate: Self = this.set("dvdReleaseDate", js.undefined)
    
    @scala.inline
    def setEstDates(value: DateRange): Self = this.set("estDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstDates: Self = this.set("estDates", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: StateCompleted*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[StateCompleted]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMovie(value: String): Self = this.set("movie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMovie: Self = this.set("movie", js.undefined)
    
    @scala.inline
    def setOriginalReleaseDate(value: Date): Self = this.set("originalReleaseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalReleaseDate: Self = this.set("originalReleaseDate", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setProductionHouse(value: String): Self = this.set("productionHouse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductionHouse: Self = this.set("productionHouse", js.undefined)
    
    @scala.inline
    def setPurchaseOrder(value: String): Self = this.set("purchaseOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePurchaseOrder: Self = this.set("purchaseOrder", js.undefined)
    
    @scala.inline
    def setRequirements(value: Requirements): Self = this.set("requirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequirements: Self = this.set("requirements", js.undefined)
    
    @scala.inline
    def setShow(value: ShowDetails): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
    
    @scala.inline
    def setVodDates(value: DateRange): Self = this.set("vodDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVodDates: Self = this.set("vodDates", js.undefined)
  }
}
