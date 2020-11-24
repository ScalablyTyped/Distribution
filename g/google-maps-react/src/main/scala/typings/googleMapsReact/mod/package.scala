package typings.googleMapsReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GoogleApiOptionsFunc = js.Function1[/* props */ js.Any, typings.googleMapsReact.mod.IGoogleApiOptions]
  
  type Omit[T1, T2] = typings.std.Pick[
    T1, 
    typings.std.Exclude[/* keyof T1 */ java.lang.String, /* keyof T2 */ java.lang.String]
  ]
  
  type Style = js.Object
  
  type mapEventHandler = js.Function3[
    /* mapProps */ js.UndefOr[typings.googleMapsReact.mod.IMapProps], 
    /* map */ js.UndefOr[typings.googlemaps.google.maps.Map[typings.std.Element]], 
    /* event */ js.Any, 
    js.Any
  ]
  
  type markerEventHandler = js.Function3[
    /* props */ js.UndefOr[typings.googleMapsReact.mod.IMarkerProps], 
    /* marker */ js.UndefOr[typings.googlemaps.google.maps.Marker], 
    /* event */ js.Any, 
    js.Any
  ]
}
