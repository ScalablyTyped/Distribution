package typings.googleMapsReact.mod

import typings.googlemaps.google.maps.Animation
import typings.googlemaps.google.maps.Icon
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.MarkerLabel
import typings.googlemaps.google.maps.MarkerShape
import typings.googlemaps.google.maps.Point
import typings.googlemaps.google.maps.StreetViewPanorama
import typings.googlemaps.google.maps.Symbol
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<googlemaps.google.maps.MarkerOptions> */
@js.native
trait IMarkerProps extends js.Object {
  
  var anchorPoint: js.UndefOr[Point] = js.native
  
  var animation: js.UndefOr[Animation] = js.native
  
  var clickable: js.UndefOr[Boolean] = js.native
  
  var crossOnDrag: js.UndefOr[Boolean] = js.native
  
  var cursor: js.UndefOr[String] = js.native
  
  var draggable: js.UndefOr[Boolean] = js.native
  
  var icon: js.UndefOr[String | Icon | Symbol] = js.native
  
  var label: js.UndefOr[String | MarkerLabel] = js.native
  
  var map: js.UndefOr[typings.googlemaps.google.maps.Map[Element] | StreetViewPanorama] = js.native
  
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.native
  
  var onClick: js.UndefOr[markerEventHandler] = js.native
  
  var onMouseover: js.UndefOr[markerEventHandler] = js.native
  
  var opacity: js.UndefOr[Double] = js.native
  
  var optimized: js.UndefOr[Boolean] = js.native
  
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
  
  var shape: js.UndefOr[MarkerShape] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object IMarkerProps {
  
  @scala.inline
  def apply(): IMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMarkerProps]
  }
  
  @scala.inline
  implicit class IMarkerPropsOps[Self <: IMarkerProps] (val x: Self) extends AnyVal {
    
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
    def setAnchorPoint(value: Point): Self = this.set("anchorPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorPoint: Self = this.set("anchorPoint", js.undefined)
    
    @scala.inline
    def setAnimation(value: Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    
    @scala.inline
    def setCrossOnDrag(value: Boolean): Self = this.set("crossOnDrag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossOnDrag: Self = this.set("crossOnDrag", js.undefined)
    
    @scala.inline
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setIcon(value: String | Icon | Symbol): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLabel(value: String | MarkerLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMap(value: typings.googlemaps.google.maps.Map[Element] | StreetViewPanorama): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setMapCenter(value: LatLng | LatLngLiteral): Self = this.set("mapCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapCenter: Self = this.set("mapCenter", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], /* event */ js.Any) => js.Any
    ): Self = this.set("onClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnMouseover(
      value: (/* props */ js.UndefOr[IMarkerProps], /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], /* event */ js.Any) => js.Any
    ): Self = this.set("onMouseover", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnMouseover: Self = this.set("onMouseover", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setOptimized(value: Boolean): Self = this.set("optimized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptimized: Self = this.set("optimized", js.undefined)
    
    @scala.inline
    def setPosition(value: LatLng | LatLngLiteral): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShape(value: MarkerShape): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
