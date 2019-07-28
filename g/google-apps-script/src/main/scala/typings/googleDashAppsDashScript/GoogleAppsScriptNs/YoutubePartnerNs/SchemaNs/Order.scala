package typings.googleDashAppsDashScript.GoogleAppsScriptNs.YoutubePartnerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var availGroupId: js.UndefOr[String] = js.undefined
  var channelId: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var customId: js.UndefOr[String] = js.undefined
  var dvdReleaseDate: js.UndefOr[Date] = js.undefined
  var estDates: js.UndefOr[DateRange] = js.undefined
  var events: js.UndefOr[js.Array[StateCompleted]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var movie: js.UndefOr[String] = js.undefined
  var originalReleaseDate: js.UndefOr[Date] = js.undefined
  var priority: js.UndefOr[String] = js.undefined
  var productionHouse: js.UndefOr[String] = js.undefined
  var purchaseOrder: js.UndefOr[String] = js.undefined
  var requirements: js.UndefOr[Requirements] = js.undefined
  var show: js.UndefOr[ShowDetails] = js.undefined
  var status: js.UndefOr[String] = js.undefined
  var videoId: js.UndefOr[String] = js.undefined
  var vodDates: js.UndefOr[DateRange] = js.undefined
}

object Order {
  @scala.inline
  def apply(
    availGroupId: String = null,
    channelId: String = null,
    contentType: String = null,
    country: String = null,
    customId: String = null,
    dvdReleaseDate: Date = null,
    estDates: DateRange = null,
    events: js.Array[StateCompleted] = null,
    id: String = null,
    kind: String = null,
    movie: String = null,
    originalReleaseDate: Date = null,
    priority: String = null,
    productionHouse: String = null,
    purchaseOrder: String = null,
    requirements: Requirements = null,
    show: ShowDetails = null,
    status: String = null,
    videoId: String = null,
    vodDates: DateRange = null
  ): Order = {
    val __obj = js.Dynamic.literal()
    if (availGroupId != null) __obj.updateDynamic("availGroupId")(availGroupId)
    if (channelId != null) __obj.updateDynamic("channelId")(channelId)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (country != null) __obj.updateDynamic("country")(country)
    if (customId != null) __obj.updateDynamic("customId")(customId)
    if (dvdReleaseDate != null) __obj.updateDynamic("dvdReleaseDate")(dvdReleaseDate)
    if (estDates != null) __obj.updateDynamic("estDates")(estDates)
    if (events != null) __obj.updateDynamic("events")(events)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (movie != null) __obj.updateDynamic("movie")(movie)
    if (originalReleaseDate != null) __obj.updateDynamic("originalReleaseDate")(originalReleaseDate)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (productionHouse != null) __obj.updateDynamic("productionHouse")(productionHouse)
    if (purchaseOrder != null) __obj.updateDynamic("purchaseOrder")(purchaseOrder)
    if (requirements != null) __obj.updateDynamic("requirements")(requirements)
    if (show != null) __obj.updateDynamic("show")(show)
    if (status != null) __obj.updateDynamic("status")(status)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    if (vodDates != null) __obj.updateDynamic("vodDates")(vodDates)
    __obj.asInstanceOf[Order]
  }
}

