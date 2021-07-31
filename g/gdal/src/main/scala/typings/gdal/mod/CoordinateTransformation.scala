package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gdal", "CoordinateTransformation")
@js.native
class CoordinateTransformation protected () extends StObject {
  def this(source: SpatialReference, target: Dataset) = this()
  def this(source: SpatialReference, target: SpatialReference) = this()
  
  def transformPoint(x: Double, y: Double): XYZ = js.native
  def transformPoint(x: Double, y: Double, z: Double): XYZ = js.native
}
