package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatasetLayers extends StObject {
  
  def copy(src_lyr_name: String, dst_lyr_name: String): Layer = js.native
  def copy(src_lyr_name: String, dst_lyr_name: String, options: js.Array[String]): Layer = js.native
  def copy(src_lyr_name: String, dst_lyr_name: String, options: js.Object): Layer = js.native
  
  def count(): Double = js.native
  
  def create(name: String, srs: SpatialReference, geomType: Double, creation_options: js.Array[String]): Layer = js.native
  def create(name: String, srs: SpatialReference, geomType: Double, creation_options: js.Object): Layer = js.native
  def create(name: String, srs: SpatialReference, geomType: Geometry, creation_options: js.Array[String]): Layer = js.native
  def create(name: String, srs: SpatialReference, geomType: Geometry, creation_options: js.Object): Layer = js.native
  
  val ds: Dataset = js.native
  
  def forEach(callback: js.Function2[/* layer */ Layer, /* i */ Double, Unit]): Unit = js.native
  
  def get(key: String): Layer = js.native
  def get(key: Double): Layer = js.native
  
  def map[T](callback: js.Function2[/* layer */ Layer, /* i */ Double, T]): js.Array[T] = js.native
  
  def remove(index: Double): Unit = js.native
}
