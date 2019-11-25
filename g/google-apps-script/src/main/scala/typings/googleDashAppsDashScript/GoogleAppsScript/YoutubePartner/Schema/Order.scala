package typings.googleDashAppsDashScript.GoogleAppsScript.YoutubePartner.Schema

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
    if (availGroupId != null) __obj.updateDynamic("availGroupId")(availGroupId.asInstanceOf[js.Any])
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (customId != null) __obj.updateDynamic("customId")(customId.asInstanceOf[js.Any])
    if (dvdReleaseDate != null) __obj.updateDynamic("dvdReleaseDate")(dvdReleaseDate.asInstanceOf[js.Any])
    if (estDates != null) __obj.updateDynamic("estDates")(estDates.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (movie != null) __obj.updateDynamic("movie")(movie.asInstanceOf[js.Any])
    if (originalReleaseDate != null) __obj.updateDynamic("originalReleaseDate")(originalReleaseDate.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (productionHouse != null) __obj.updateDynamic("productionHouse")(productionHouse.asInstanceOf[js.Any])
    if (purchaseOrder != null) __obj.updateDynamic("purchaseOrder")(purchaseOrder.asInstanceOf[js.Any])
    if (requirements != null) __obj.updateDynamic("requirements")(requirements.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    if (vodDates != null) __obj.updateDynamic("vodDates")(vodDates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Order]
  }
}

