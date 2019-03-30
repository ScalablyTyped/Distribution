package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Order extends js.Object {
  var availGroupId: js.UndefOr[java.lang.String] = js.undefined
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var customId: js.UndefOr[java.lang.String] = js.undefined
  var dvdReleaseDate: js.UndefOr[Date] = js.undefined
  var estDates: js.UndefOr[DateRange] = js.undefined
  var events: js.UndefOr[js.Array[StateCompleted]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var movie: js.UndefOr[java.lang.String] = js.undefined
  var originalReleaseDate: js.UndefOr[Date] = js.undefined
  var priority: js.UndefOr[java.lang.String] = js.undefined
  var productionHouse: js.UndefOr[java.lang.String] = js.undefined
  var purchaseOrder: js.UndefOr[java.lang.String] = js.undefined
  var requirements: js.UndefOr[Requirements] = js.undefined
  var show: js.UndefOr[ShowDetails] = js.undefined
  var status: js.UndefOr[java.lang.String] = js.undefined
  var videoId: js.UndefOr[java.lang.String] = js.undefined
  var vodDates: js.UndefOr[DateRange] = js.undefined
}

object Order {
  @scala.inline
  def apply(
    availGroupId: java.lang.String = null,
    channelId: java.lang.String = null,
    contentType: java.lang.String = null,
    country: java.lang.String = null,
    customId: java.lang.String = null,
    dvdReleaseDate: Date = null,
    estDates: DateRange = null,
    events: js.Array[StateCompleted] = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    movie: java.lang.String = null,
    originalReleaseDate: Date = null,
    priority: java.lang.String = null,
    productionHouse: java.lang.String = null,
    purchaseOrder: java.lang.String = null,
    requirements: Requirements = null,
    show: ShowDetails = null,
    status: java.lang.String = null,
    videoId: java.lang.String = null,
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

