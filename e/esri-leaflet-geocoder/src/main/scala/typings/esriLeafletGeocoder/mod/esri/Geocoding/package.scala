package typings.esriLeafletGeocoder.mod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Geocoding {
  
  type GeosearchCallback = js.Function2[/* error */ js.UndefOr[js.Any], /* results */ js.Any, scala.Unit]
  
  type GeosearchConstructor = org.scalablytyped.runtime.Instantiable1[
    /* options */ js.UndefOr[typings.esriLeafletGeocoder.mod.esri.Geocoding.GeosearchObject], 
    typings.esriLeafletGeocoder.mod.esri.Geocoding.Geosearch_
  ]
  
  type Geosearch_ = typings.esriLeafletGeocoder.mod.esri.Geocoding.GeosearchControl with typings.leaflet.mod.Evented
}
