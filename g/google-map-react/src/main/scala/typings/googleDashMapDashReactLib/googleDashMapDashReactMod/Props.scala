package typings
package googleDashMapDashReactLib.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var bootstrapURLKeys: js.UndefOr[BootstrapURLKeys] = js.undefined
  var center: js.UndefOr[Coords] = js.undefined
  var debounced: js.UndefOr[scala.Boolean] = js.undefined
  var defaultCenter: js.UndefOr[Coords] = js.undefined
  var defaultZoom: js.UndefOr[scala.Double] = js.undefined
  var distanceToMouse: js.UndefOr[
    js.Function3[
      /* pt */ Point, 
      /* mousePos */ Point, 
      /* markerProps */ js.UndefOr[js.Object], 
      scala.Double
    ]
  ] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var googleMapLoader: js.UndefOr[js.Function1[/* bootstrapURLKeys */ js.Any, scala.Unit]] = js.undefined
  var hoverDistance: js.UndefOr[scala.Double] = js.undefined
  var layerTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var margin: js.UndefOr[js.Array[_]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ ChangeEventValue, _]] = js.undefined
  var onChildClick: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, scala.Unit]] = js.undefined
  var onChildMouseDown: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, scala.Unit]
  ] = js.undefined
  var onChildMouseEnter: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, scala.Unit]] = js.undefined
  var onChildMouseLeave: js.UndefOr[js.Function2[/* hoverKey */ js.Any, /* childProps */ js.Any, scala.Unit]] = js.undefined
  var onChildMouseMove: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, scala.Unit]
  ] = js.undefined
  var onChildMouseUp: js.UndefOr[
    js.Function3[/* childKey */ js.Any, /* childProps */ js.Any, /* mouse */ js.Any, scala.Unit]
  ] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* value */ ClickEventValue, _]] = js.undefined
  var onDrag: js.UndefOr[js.Function1[/* args */ js.Any, scala.Unit]] = js.undefined
  var onGoogleApiLoaded: js.UndefOr[js.Function1[/* maps */ googleDashMapDashReactLib.Anon_Maps, scala.Unit]] = js.undefined
  var onMapTypeIdChange: js.UndefOr[js.Function1[/* args */ js.Any, scala.Unit]] = js.undefined
  var onTilesLoaded: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onZoomAnimationEnd: js.UndefOr[js.Function1[/* args */ js.Any, scala.Unit]] = js.undefined
  var onZoomAnimationStart: js.UndefOr[js.Function1[/* args */ js.Any, scala.Unit]] = js.undefined
  var options: js.UndefOr[MapOptions | (js.Function1[/* maps */ Maps, MapOptions])] = js.undefined
  var resetBoundsOnResize: js.UndefOr[scala.Boolean] = js.undefined
  var yesIWantToUseGoogleMapApiInternals: js.UndefOr[scala.Boolean] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

