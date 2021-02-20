package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GDALDrivers extends StObject {
  
  def count(): Double = js.native
  
  def forEach(callback: js.Function2[/* driver */ Driver, /* i */ Double, Unit]): Unit = js.native
  
  def get(index: String): Driver = js.native
  def get(index: Double): Driver = js.native
  
  def getNames(): js.Array[String] = js.native
  
  def map[T](callback: js.Function2[/* driver */ Driver, /* i */ Double, T]): js.Array[T] = js.native
}
