package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

import typings.leaflet.leafletMod.ControlPosition
import typings.leaflet.leafletMod.LatLngBoundsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeosearchObject extends js.Object {
  var allowMultipleResults: js.UndefOr[Boolean] = js.undefined
  var collapseAfterResult: js.UndefOr[Boolean] = js.undefined
  var expanded: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[ControlPosition] = js.undefined
  var providers: js.UndefOr[js.Array[GeosearchProvider]] = js.undefined
  var searchBounds: js.UndefOr[LatLngBoundsExpression | Null] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var useMapBounds: js.UndefOr[Boolean | Double] = js.undefined
  var zoomToResult: js.UndefOr[Boolean] = js.undefined
}

object GeosearchObject {
  @scala.inline
  def apply(
    allowMultipleResults: js.UndefOr[Boolean] = js.undefined,
    collapseAfterResult: js.UndefOr[Boolean] = js.undefined,
    expanded: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    position: ControlPosition = null,
    providers: js.Array[GeosearchProvider] = null,
    searchBounds: LatLngBoundsExpression = null,
    title: String = null,
    useMapBounds: Boolean | Double = null,
    zoomToResult: js.UndefOr[Boolean] = js.undefined
  ): GeosearchObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultipleResults)) __obj.updateDynamic("allowMultipleResults")(allowMultipleResults)
    if (!js.isUndefined(collapseAfterResult)) __obj.updateDynamic("collapseAfterResult")(collapseAfterResult)
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (position != null) __obj.updateDynamic("position")(position)
    if (providers != null) __obj.updateDynamic("providers")(providers)
    if (searchBounds != null) __obj.updateDynamic("searchBounds")(searchBounds.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (useMapBounds != null) __obj.updateDynamic("useMapBounds")(useMapBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomToResult)) __obj.updateDynamic("zoomToResult")(zoomToResult)
    __obj.asInstanceOf[GeosearchObject]
  }
}

