package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googleDashMapsDashReactLib {
  type Omit[T1, T2] = stdLib.Pick[T1, stdLib.Exclude[java.lang.String, java.lang.String]]
  type mapEventHandler = js.Function3[
    /* mapProps */ js.UndefOr[js.Any], 
    /* map */ js.UndefOr[googlemapsLib.googleNs.mapsNs.Map], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
  type markerEventHandler = js.Function3[
    /* props */ js.UndefOr[js.Any], 
    /* marker */ js.UndefOr[googlemapsLib.googleNs.mapsNs.Marker], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
}
