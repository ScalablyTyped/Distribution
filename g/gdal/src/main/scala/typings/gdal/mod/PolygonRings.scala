package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonRings extends StObject {
  
  def add(ring: js.Array[LinearRing]): Unit = js.native
  def add(ring: LinearRing): Unit = js.native
  
  def count(): Double = js.native
  
  def forEach(callback: js.Function2[/* ring */ LinearRing, /* i */ Double, Unit]): Unit = js.native
  
  def get(index: Double): LinearRing = js.native
  
  val layer: Layer = js.native
  
  def map[T](callback: js.Function2[/* ring */ LinearRing, /* i */ Double, T]): js.Array[T] = js.native
  
  def remove(index: Double): Unit = js.native
  
  def toArray(): js.Array[LinearRing] = js.native
}
