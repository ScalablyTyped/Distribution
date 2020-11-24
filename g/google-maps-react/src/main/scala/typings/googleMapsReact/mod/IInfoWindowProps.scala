package typings.googleMapsReact.mod

import typings.googleMapsReact.anon.Typeofgoogle
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.Size
import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<googlemaps.google.maps.InfoWindowOptions> */
@js.native
trait IInfoWindowProps extends js.Object {
  
  var content: js.UndefOr[String | Node] = js.native
  
  var disableAutoPan: js.UndefOr[Boolean] = js.native
  
  var google: Typeofgoogle = js.native
  
  var map: typings.googlemaps.google.maps.Map[Element] = js.native
  
  var mapCenter: js.UndefOr[LatLng | LatLngLiteral] = js.native
  
  var marker: typings.googlemaps.google.maps.Marker = js.native
  
  var maxWidth: js.UndefOr[Double] = js.native
  
  var pixelOffset: js.UndefOr[Size] = js.native
  
  var position: js.UndefOr[LatLng | LatLngLiteral] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
  
  var zIndex: js.UndefOr[Double] = js.native
}
object IInfoWindowProps {
  
  @scala.inline
  def apply(
    google: Typeofgoogle,
    map: typings.googlemaps.google.maps.Map[Element],
    marker: typings.googlemaps.google.maps.Marker
  ): IInfoWindowProps = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoWindowProps]
  }
  
  @scala.inline
  implicit class IInfoWindowPropsOps[Self <: IInfoWindowProps] (val x: Self) extends AnyVal {
    
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
    def setGoogle(value: Typeofgoogle): Self = this.set("google", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: typings.googlemaps.google.maps.Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: typings.googlemaps.google.maps.Marker): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String | Node): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDisableAutoPan(value: Boolean): Self = this.set("disableAutoPan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAutoPan: Self = this.set("disableAutoPan", js.undefined)
    
    @scala.inline
    def setMapCenter(value: LatLng | LatLngLiteral): Self = this.set("mapCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapCenter: Self = this.set("mapCenter", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    
    @scala.inline
    def setPixelOffset(value: Size): Self = this.set("pixelOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixelOffset: Self = this.set("pixelOffset", js.undefined)
    
    @scala.inline
    def setPosition(value: LatLng | LatLngLiteral): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
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
