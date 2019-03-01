package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeosearchObject extends js.Object {
  var allowMultipleResults: js.UndefOr[scala.Boolean] = js.undefined
  var collapseAfterResult: js.UndefOr[scala.Boolean] = js.undefined
  var expanded: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[leafletLib.leafletMod.ControlPosition] = js.undefined
  var providers: js.UndefOr[js.Array[GeosearchProvider]] = js.undefined
  var searchBounds: js.UndefOr[leafletLib.leafletMod.LatLngBoundsExpression | scala.Null] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var useMapBounds: js.UndefOr[scala.Boolean | scala.Double] = js.undefined
  var zoomToResult: js.UndefOr[scala.Boolean] = js.undefined
}

object GeosearchObject {
  @scala.inline
  def apply(
    allowMultipleResults: js.UndefOr[scala.Boolean] = js.undefined,
    collapseAfterResult: js.UndefOr[scala.Boolean] = js.undefined,
    expanded: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: java.lang.String = null,
    position: leafletLib.leafletMod.ControlPosition = null,
    providers: js.Array[GeosearchProvider] = null,
    searchBounds: leafletLib.leafletMod.LatLngBoundsExpression = null,
    title: java.lang.String = null,
    useMapBounds: scala.Boolean | scala.Double = null,
    zoomToResult: js.UndefOr[scala.Boolean] = js.undefined
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

