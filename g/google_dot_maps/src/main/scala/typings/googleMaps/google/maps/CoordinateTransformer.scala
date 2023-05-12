package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CoordinateTransformer extends StObject {
  
  def fromLatLngAltitude(latLngAltitude: LatLngAltitude): js.typedarray.Float64Array = js.native
  def fromLatLngAltitude(latLngAltitude: LatLngAltitudeLiteral): js.typedarray.Float64Array = js.native
  def fromLatLngAltitude(latLngAltitude: LatLngAltitudeLiteral, rotations: js.typedarray.Float32Array): js.typedarray.Float64Array = js.native
  def fromLatLngAltitude(
    latLngAltitude: LatLngAltitudeLiteral,
    rotations: js.typedarray.Float32Array,
    scale: js.typedarray.Float32Array
  ): js.typedarray.Float64Array = js.native
  def fromLatLngAltitude(latLngAltitude: LatLngAltitudeLiteral, rotations: Unit, scale: js.typedarray.Float32Array): js.typedarray.Float64Array = js.native
  def fromLatLngAltitude(latLngAltitude: LatLngAltitude, rotations: js.typedarray.Float32Array): js.typedarray.Float64Array = js.native
  def fromLatLngAltitude(
    latLngAltitude: LatLngAltitude,
    rotations: js.typedarray.Float32Array,
    scale: js.typedarray.Float32Array
  ): js.typedarray.Float64Array = js.native
  def fromLatLngAltitude(latLngAltitude: LatLngAltitude, rotations: Unit, scale: js.typedarray.Float32Array): js.typedarray.Float64Array = js.native
  
  def getCameraParams(): CameraParams = js.native
}
