package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Bing
import typings.devextreme.anon.Color
import typings.devextreme.anon.IconSrc
import typings.devextreme.anon.JQueryEventLocation
import typings.devextreme.anon.ModelOptions
import typings.devextreme.anon.Options
import typings.devextreme.anon.OriginalMap
import typings.devextreme.anon.OriginalRoute
import typings.devextreme.devextremeStrings.bing
import typings.devextreme.devextremeStrings.google
import typings.devextreme.devextremeStrings.googleStatic
import typings.devextreme.devextremeStrings.hybrid
import typings.devextreme.devextremeStrings.roadmap
import typings.devextreme.devextremeStrings.satellite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxMapOptions extends WidgetOptions[dxMap] {
  /** @name dxMap.Options.autoAdjust */
  var autoAdjust: js.UndefOr[Boolean] = js.native
  /** @name dxMap.Options.center */
  var center: js.UndefOr[js.Any | String | js.Array[Double]] = js.native
  /** @name dxMap.Options.controls */
  var controls: js.UndefOr[Boolean] = js.native
  /** @name dxMap.Options.key */
  var key: js.UndefOr[String | Bing] = js.native
  /** @name dxMap.Options.markerIconSrc */
  var markerIconSrc: js.UndefOr[String] = js.native
  /** @name dxMap.Options.markers */
  var markers: js.UndefOr[js.Array[IconSrc]] = js.native
  /** @name dxMap.Options.onClick */
  var onClick: js.UndefOr[(js.Function1[/* e */ JQueryEventLocation, _]) | String] = js.native
  /** @name dxMap.Options.onMarkerAdded */
  var onMarkerAdded: js.UndefOr[js.Function1[/* e */ Options, _]] = js.native
  /** @name dxMap.Options.onMarkerRemoved */
  var onMarkerRemoved: js.UndefOr[js.Function1[/* e */ ModelOptions, _]] = js.native
  /** @name dxMap.Options.onReady */
  var onReady: js.UndefOr[js.Function1[/* e */ OriginalMap, _]] = js.native
  /** @name dxMap.Options.onRouteAdded */
  var onRouteAdded: js.UndefOr[js.Function1[/* e */ OriginalRoute, _]] = js.native
  /** @name dxMap.Options.onRouteRemoved */
  var onRouteRemoved: js.UndefOr[js.Function1[/* e */ ModelOptions, _]] = js.native
  /** @name dxMap.Options.provider */
  var provider: js.UndefOr[bing | google | googleStatic] = js.native
  /** @name dxMap.Options.routes */
  var routes: js.UndefOr[js.Array[Color]] = js.native
  /** @name dxMap.Options.type */
  var `type`: js.UndefOr[hybrid | roadmap | satellite] = js.native
  /** @name dxMap.Options.zoom */
  var zoom: js.UndefOr[Double] = js.native
}

object dxMapOptions {
  @scala.inline
  def apply(): dxMapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxMapOptions]
  }
  @scala.inline
  implicit class dxMapOptionsOps[Self <: dxMapOptions] (val x: Self) extends AnyVal {
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
    def setAutoAdjust(value: Boolean): Self = this.set("autoAdjust", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoAdjust: Self = this.set("autoAdjust", js.undefined)
    @scala.inline
    def setCenterVarargs(value: Double*): Self = this.set("center", js.Array(value :_*))
    @scala.inline
    def setCenter(value: js.Any | String | js.Array[Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setControls(value: Boolean): Self = this.set("controls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteControls: Self = this.set("controls", js.undefined)
    @scala.inline
    def setKey(value: String | Bing): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMarkerIconSrc(value: String): Self = this.set("markerIconSrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerIconSrc: Self = this.set("markerIconSrc", js.undefined)
    @scala.inline
    def setMarkersVarargs(value: IconSrc*): Self = this.set("markers", js.Array(value :_*))
    @scala.inline
    def setMarkers(value: js.Array[IconSrc]): Self = this.set("markers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkers: Self = this.set("markers", js.undefined)
    @scala.inline
    def setOnClickFunction1(value: /* e */ JQueryEventLocation => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def setOnClick(value: (js.Function1[/* e */ JQueryEventLocation, _]) | String): Self = this.set("onClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnMarkerAdded(value: /* e */ Options => _): Self = this.set("onMarkerAdded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMarkerAdded: Self = this.set("onMarkerAdded", js.undefined)
    @scala.inline
    def setOnMarkerRemoved(value: /* e */ ModelOptions => _): Self = this.set("onMarkerRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnMarkerRemoved: Self = this.set("onMarkerRemoved", js.undefined)
    @scala.inline
    def setOnReady(value: /* e */ OriginalMap => _): Self = this.set("onReady", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnReady: Self = this.set("onReady", js.undefined)
    @scala.inline
    def setOnRouteAdded(value: /* e */ OriginalRoute => _): Self = this.set("onRouteAdded", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRouteAdded: Self = this.set("onRouteAdded", js.undefined)
    @scala.inline
    def setOnRouteRemoved(value: /* e */ ModelOptions => _): Self = this.set("onRouteRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnRouteRemoved: Self = this.set("onRouteRemoved", js.undefined)
    @scala.inline
    def setProvider(value: bing | google | googleStatic): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setRoutesVarargs(value: Color*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[Color]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    @scala.inline
    def setType(value: hybrid | roadmap | satellite): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}

