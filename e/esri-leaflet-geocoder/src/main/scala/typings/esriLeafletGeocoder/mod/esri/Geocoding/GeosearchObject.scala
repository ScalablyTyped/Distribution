package typings.esriLeafletGeocoder.mod.esri.Geocoding

import typings.leaflet.mod.ControlPosition
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeosearchObject extends js.Object {
  var allowMultipleResults: js.UndefOr[Boolean] = js.native
  var collapseAfterResult: js.UndefOr[Boolean] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var position: js.UndefOr[ControlPosition] = js.native
  var providers: js.UndefOr[js.Array[GeosearchProvider]] = js.native
  var searchBounds: js.UndefOr[LatLngBoundsExpression | Null] = js.native
  var title: js.UndefOr[String] = js.native
  var useMapBounds: js.UndefOr[Boolean | Double] = js.native
  var zoomToResult: js.UndefOr[Boolean] = js.native
}

object GeosearchObject {
  @scala.inline
  def apply(): GeosearchObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeosearchObject]
  }
  @scala.inline
  implicit class GeosearchObjectOps[Self <: GeosearchObject] (val x: Self) extends AnyVal {
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
    def setAllowMultipleResults(value: Boolean): Self = this.set("allowMultipleResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultipleResults: Self = this.set("allowMultipleResults", js.undefined)
    @scala.inline
    def setCollapseAfterResult(value: Boolean): Self = this.set("collapseAfterResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseAfterResult: Self = this.set("collapseAfterResult", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPosition(value: ControlPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setProvidersVarargs(value: GeosearchProvider*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[GeosearchProvider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    @scala.inline
    def setSearchBoundsVarargs(value: LatLngTuple*): Self = this.set("searchBounds", js.Array(value :_*))
    @scala.inline
    def setSearchBounds(value: LatLngBoundsExpression): Self = this.set("searchBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchBounds: Self = this.set("searchBounds", js.undefined)
    @scala.inline
    def setSearchBoundsNull: Self = this.set("searchBounds", null)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setUseMapBounds(value: Boolean | Double): Self = this.set("useMapBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseMapBounds: Self = this.set("useMapBounds", js.undefined)
    @scala.inline
    def setZoomToResult(value: Boolean): Self = this.set("zoomToResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomToResult: Self = this.set("zoomToResult", js.undefined)
  }
  
}

