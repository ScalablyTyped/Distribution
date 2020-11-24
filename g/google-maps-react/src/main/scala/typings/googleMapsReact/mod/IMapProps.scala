package typings.googleMapsReact.mod

import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.LatLngBoundsLiteral
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.MapOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMapProps extends MapOptions {
  
  var bounds: js.UndefOr[LatLngBounds | LatLngBoundsLiteral] = js.native
  
  var centerAroundCurrentLocation: js.UndefOr[Boolean] = js.native
  
  @JSName("center")
  var center_IMapProps: js.UndefOr[LatLngLiteral] = js.native
  
  var containerStyle: js.UndefOr[Style] = js.native
  
  var google: GoogleAPI = js.native
  
  var initialCenter: js.UndefOr[LatLngLiteral] = js.native
  
  var loaded: js.UndefOr[Boolean] = js.native
  
  var onBoundsChanged: js.UndefOr[mapEventHandler] = js.native
  
  var onCenterChanged: js.UndefOr[mapEventHandler] = js.native
  
  var onClick: js.UndefOr[mapEventHandler] = js.native
  
  var onDblclick: js.UndefOr[mapEventHandler] = js.native
  
  var onDragend: js.UndefOr[mapEventHandler] = js.native
  
  var onDragstart: js.UndefOr[mapEventHandler] = js.native
  
  var onHeadingChange: js.UndefOr[mapEventHandler] = js.native
  
  var onIdle: js.UndefOr[mapEventHandler] = js.native
  
  var onMaptypeidChanged: js.UndefOr[mapEventHandler] = js.native
  
  var onMousemove: js.UndefOr[mapEventHandler] = js.native
  
  var onMouseout: js.UndefOr[mapEventHandler] = js.native
  
  var onMouseover: js.UndefOr[mapEventHandler] = js.native
  
  var onProjectionChanged: js.UndefOr[mapEventHandler] = js.native
  
  var onReady: js.UndefOr[mapEventHandler] = js.native
  
  var onRecenter: js.UndefOr[mapEventHandler] = js.native
  
  var onResize: js.UndefOr[mapEventHandler] = js.native
  
  var onRightclick: js.UndefOr[mapEventHandler] = js.native
  
  var onTilesloaded: js.UndefOr[mapEventHandler] = js.native
  
  var onTiltChanged: js.UndefOr[mapEventHandler] = js.native
  
  var onZoomChanged: js.UndefOr[mapEventHandler] = js.native
  
  var style: js.UndefOr[Style] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object IMapProps {
  
  @scala.inline
  def apply(google: GoogleAPI): IMapProps = {
    val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMapProps]
  }
  
  @scala.inline
  implicit class IMapPropsOps[Self <: IMapProps] (val x: Self) extends AnyVal {
    
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
    def setGoogle(value: GoogleAPI): Self = this.set("google", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    
    @scala.inline
    def setCenter(value: LatLngLiteral): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setCenterAroundCurrentLocation(value: Boolean): Self = this.set("centerAroundCurrentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterAroundCurrentLocation: Self = this.set("centerAroundCurrentLocation", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: Style): Self = this.set("containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyle: Self = this.set("containerStyle", js.undefined)
    
    @scala.inline
    def setInitialCenter(value: LatLngLiteral): Self = this.set("initialCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialCenter: Self = this.set("initialCenter", js.undefined)
    
    @scala.inline
    def setLoaded(value: Boolean): Self = this.set("loaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoaded: Self = this.set("loaded", js.undefined)
    
    @scala.inline
    def setOnBoundsChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onBoundsChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnBoundsChanged: Self = this.set("onBoundsChanged", js.undefined)
    
    @scala.inline
    def setOnCenterChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onCenterChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnCenterChanged: Self = this.set("onCenterChanged", js.undefined)
    
    @scala.inline
    def setOnClick(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onClick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnDblclick(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onDblclick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDblclick: Self = this.set("onDblclick", js.undefined)
    
    @scala.inline
    def setOnDragend(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onDragend", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDragend: Self = this.set("onDragend", js.undefined)
    
    @scala.inline
    def setOnDragstart(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onDragstart", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnDragstart: Self = this.set("onDragstart", js.undefined)
    
    @scala.inline
    def setOnHeadingChange(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onHeadingChange", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnHeadingChange: Self = this.set("onHeadingChange", js.undefined)
    
    @scala.inline
    def setOnIdle(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onIdle", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnIdle: Self = this.set("onIdle", js.undefined)
    
    @scala.inline
    def setOnMaptypeidChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onMaptypeidChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnMaptypeidChanged: Self = this.set("onMaptypeidChanged", js.undefined)
    
    @scala.inline
    def setOnMousemove(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onMousemove", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnMousemove: Self = this.set("onMousemove", js.undefined)
    
    @scala.inline
    def setOnMouseout(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onMouseout", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnMouseout: Self = this.set("onMouseout", js.undefined)
    
    @scala.inline
    def setOnMouseover(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onMouseover", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnMouseover: Self = this.set("onMouseover", js.undefined)
    
    @scala.inline
    def setOnProjectionChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onProjectionChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnProjectionChanged: Self = this.set("onProjectionChanged", js.undefined)
    
    @scala.inline
    def setOnReady(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onReady", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    
    @scala.inline
    def setOnRecenter(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onRecenter", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRecenter: Self = this.set("onRecenter", js.undefined)
    
    @scala.inline
    def setOnResize(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onResize", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnResize: Self = this.set("onResize", js.undefined)
    
    @scala.inline
    def setOnRightclick(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onRightclick", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnRightclick: Self = this.set("onRightclick", js.undefined)
    
    @scala.inline
    def setOnTilesloaded(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onTilesloaded", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnTilesloaded: Self = this.set("onTilesloaded", js.undefined)
    
    @scala.inline
    def setOnTiltChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onTiltChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnTiltChanged: Self = this.set("onTiltChanged", js.undefined)
    
    @scala.inline
    def setOnZoomChanged(
      value: (/* mapProps */ js.UndefOr[IMapProps], /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[Element]], /* event */ js.Any) => js.Any
    ): Self = this.set("onZoomChanged", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnZoomChanged: Self = this.set("onZoomChanged", js.undefined)
    
    @scala.inline
    def setStyle(value: Style): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
