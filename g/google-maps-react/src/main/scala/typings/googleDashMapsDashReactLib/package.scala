package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object googleDashMapsDashReactLib {
  type Omit[T1, T2] = stdLib.Pick[T1, stdLib.Exclude[java.lang.String, java.lang.String]]
  type mapEventHandler = js.Function3[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify MapProps */ /* mapProps */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify MapProps */ js.Any
    ], 
    /* map */ js.UndefOr[googlemapsLib.googleNs.mapsNs.Map], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
  type markerEventHandler = js.Function3[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify MarkerProps */ /* props */ js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify MarkerProps */ js.Any
    ], 
    /* marker */ js.UndefOr[googlemapsLib.googleNs.mapsNs.Marker], 
    /* event */ js.UndefOr[js.Any], 
    js.Any
  ]
}
