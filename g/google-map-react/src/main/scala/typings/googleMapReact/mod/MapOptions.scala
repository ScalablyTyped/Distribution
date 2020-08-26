package typings.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  // Any options from https://developers.google.com/maps/documentation/javascript/reference/3/#MapOptions
  // excluding 'zoom' and 'center' which get set via props.
  var backgroundColor: js.UndefOr[String] = js.native
  var clickableIcons: js.UndefOr[Boolean] = js.native
  var controlSize: js.UndefOr[Double] = js.native
  var disableDefaultUI: js.UndefOr[Boolean] = js.native
  var disableDoubleClickZoom: js.UndefOr[Boolean] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var draggableCursor: js.UndefOr[String] = js.native
  var draggingCursor: js.UndefOr[String] = js.native
  var fullscreenControl: js.UndefOr[Boolean] = js.native
  var fullscreenControlOptions: js.UndefOr[typings.googleMapReact.anon.Position] = js.native
  var gestureHandling: js.UndefOr[String] = js.native
  var heading: js.UndefOr[Double] = js.native
  var keyboardShortcuts: js.UndefOr[Boolean] = js.native
  var mapTypeControl: js.UndefOr[Boolean] = js.native
  var mapTypeControlOptions: js.UndefOr[js.Any] = js.native
  var mapTypeId: js.UndefOr[String] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var minZoomOverride: js.UndefOr[Boolean] = js.native
  var noClear: js.UndefOr[Boolean] = js.native
  var options: js.UndefOr[js.Function1[/* maps */ Maps, Props]] = js.native
  var panControl: js.UndefOr[Boolean] = js.native
  var panControlOptions: js.UndefOr[typings.googleMapReact.anon.Position] = js.native
  var rotateControl: js.UndefOr[Boolean] = js.native
  var rotateControlOptions: js.UndefOr[typings.googleMapReact.anon.Position] = js.native
  var scaleControl: js.UndefOr[Boolean] = js.native
  var scaleControlOptions: js.UndefOr[js.Any] = js.native
  var scrollwheel: js.UndefOr[Boolean] = js.native
  var streetView: js.UndefOr[js.Any] = js.native
  var streetViewControl: js.UndefOr[Boolean] = js.native
  var streetViewControlOptions: js.UndefOr[typings.googleMapReact.anon.Position] = js.native
  var styles: js.UndefOr[js.Array[MapTypeStyle]] = js.native
  var tilt: js.UndefOr[Double] = js.native
  var zoomControl: js.UndefOr[Boolean] = js.native
  var zoomControlOptions: js.UndefOr[typings.googleMapReact.anon.Position] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setClickableIcons(value: Boolean): Self = this.set("clickableIcons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickableIcons: Self = this.set("clickableIcons", js.undefined)
    @scala.inline
    def setControlSize(value: Double): Self = this.set("controlSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControlSize: Self = this.set("controlSize", js.undefined)
    @scala.inline
    def setDisableDefaultUI(value: Boolean): Self = this.set("disableDefaultUI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDefaultUI: Self = this.set("disableDefaultUI", js.undefined)
    @scala.inline
    def setDisableDoubleClickZoom(value: Boolean): Self = this.set("disableDoubleClickZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDoubleClickZoom: Self = this.set("disableDoubleClickZoom", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setDraggableCursor(value: String): Self = this.set("draggableCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggableCursor: Self = this.set("draggableCursor", js.undefined)
    @scala.inline
    def setDraggingCursor(value: String): Self = this.set("draggingCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggingCursor: Self = this.set("draggingCursor", js.undefined)
    @scala.inline
    def setFullscreenControl(value: Boolean): Self = this.set("fullscreenControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenControl: Self = this.set("fullscreenControl", js.undefined)
    @scala.inline
    def setFullscreenControlOptions(value: typings.googleMapReact.anon.Position): Self = this.set("fullscreenControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullscreenControlOptions: Self = this.set("fullscreenControlOptions", js.undefined)
    @scala.inline
    def setGestureHandling(value: String): Self = this.set("gestureHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGestureHandling: Self = this.set("gestureHandling", js.undefined)
    @scala.inline
    def setHeading(value: Double): Self = this.set("heading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeading: Self = this.set("heading", js.undefined)
    @scala.inline
    def setKeyboardShortcuts(value: Boolean): Self = this.set("keyboardShortcuts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardShortcuts: Self = this.set("keyboardShortcuts", js.undefined)
    @scala.inline
    def setMapTypeControl(value: Boolean): Self = this.set("mapTypeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeControl: Self = this.set("mapTypeControl", js.undefined)
    @scala.inline
    def setMapTypeControlOptions(value: js.Any): Self = this.set("mapTypeControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeControlOptions: Self = this.set("mapTypeControlOptions", js.undefined)
    @scala.inline
    def setMapTypeId(value: String): Self = this.set("mapTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapTypeId: Self = this.set("mapTypeId", js.undefined)
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    @scala.inline
    def setMinZoomOverride(value: Boolean): Self = this.set("minZoomOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinZoomOverride: Self = this.set("minZoomOverride", js.undefined)
    @scala.inline
    def setNoClear(value: Boolean): Self = this.set("noClear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoClear: Self = this.set("noClear", js.undefined)
    @scala.inline
    def setOptions(value: /* maps */ Maps => Props): Self = this.set("options", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPanControl(value: Boolean): Self = this.set("panControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanControl: Self = this.set("panControl", js.undefined)
    @scala.inline
    def setPanControlOptions(value: typings.googleMapReact.anon.Position): Self = this.set("panControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePanControlOptions: Self = this.set("panControlOptions", js.undefined)
    @scala.inline
    def setRotateControl(value: Boolean): Self = this.set("rotateControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateControl: Self = this.set("rotateControl", js.undefined)
    @scala.inline
    def setRotateControlOptions(value: typings.googleMapReact.anon.Position): Self = this.set("rotateControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotateControlOptions: Self = this.set("rotateControlOptions", js.undefined)
    @scala.inline
    def setScaleControl(value: Boolean): Self = this.set("scaleControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleControl: Self = this.set("scaleControl", js.undefined)
    @scala.inline
    def setScaleControlOptions(value: js.Any): Self = this.set("scaleControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleControlOptions: Self = this.set("scaleControlOptions", js.undefined)
    @scala.inline
    def setScrollwheel(value: Boolean): Self = this.set("scrollwheel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollwheel: Self = this.set("scrollwheel", js.undefined)
    @scala.inline
    def setStreetView(value: js.Any): Self = this.set("streetView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetView: Self = this.set("streetView", js.undefined)
    @scala.inline
    def setStreetViewControl(value: Boolean): Self = this.set("streetViewControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetViewControl: Self = this.set("streetViewControl", js.undefined)
    @scala.inline
    def setStreetViewControlOptions(value: typings.googleMapReact.anon.Position): Self = this.set("streetViewControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreetViewControlOptions: Self = this.set("streetViewControlOptions", js.undefined)
    @scala.inline
    def setStylesVarargs(value: MapTypeStyle*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: js.Array[MapTypeStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTilt(value: Double): Self = this.set("tilt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTilt: Self = this.set("tilt", js.undefined)
    @scala.inline
    def setZoomControl(value: Boolean): Self = this.set("zoomControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomControl: Self = this.set("zoomControl", js.undefined)
    @scala.inline
    def setZoomControlOptions(value: typings.googleMapReact.anon.Position): Self = this.set("zoomControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomControlOptions: Self = this.set("zoomControlOptions", js.undefined)
  }
  
}

