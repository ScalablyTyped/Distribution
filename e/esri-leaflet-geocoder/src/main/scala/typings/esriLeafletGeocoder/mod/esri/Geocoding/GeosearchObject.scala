package typings.esriLeafletGeocoder.mod.esri.Geocoding

import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.LatLngBoundsExpression
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
    searchBounds: js.UndefOr[Null | LatLngBoundsExpression] = js.undefined,
    title: String = null,
    useMapBounds: Boolean | Double = null,
    zoomToResult: js.UndefOr[Boolean] = js.undefined
  ): GeosearchObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMultipleResults)) __obj.updateDynamic("allowMultipleResults")(allowMultipleResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(collapseAfterResult)) __obj.updateDynamic("collapseAfterResult")(collapseAfterResult.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expanded)) __obj.updateDynamic("expanded")(expanded.get.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    if (!js.isUndefined(searchBounds)) __obj.updateDynamic("searchBounds")(searchBounds.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (useMapBounds != null) __obj.updateDynamic("useMapBounds")(useMapBounds.asInstanceOf[js.Any])
    if (!js.isUndefined(zoomToResult)) __obj.updateDynamic("zoomToResult")(zoomToResult.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeosearchObject]
  }
}

