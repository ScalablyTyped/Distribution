package typings.googleDashMapsDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googleDashMapsDashReactMod {
  import typings.std.Exclude
  import typings.std.Pick

  type GoogleApiOptionsFunc = js.Function1[/* props */ js.Any, GoogleApiOptions]
  type Omit[T1, T2] = Pick[T1, Exclude[String, String]]
  type mapEventHandler = js.Function3[
    /* mapProps */ js.UndefOr[MapProps], 
    /* map */ js.UndefOr[typings.googlemaps.google.maps.Map], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
  type markerEventHandler = js.Function3[
    /* props */ js.UndefOr[MarkerProps], 
    /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
}
