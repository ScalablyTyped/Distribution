package typings.gdal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeatureFields extends StObject {
  
  def count(): Double = js.native
  
  val feature: Feature = js.native
  
  def forEach(callback: js.Function2[/* value */ Any, /* key */ String, Unit]): Unit = js.native
  
  def get(key: String): Any = js.native
  def get(key: Double): Any = js.native
  
  def getNames(): js.Array[String] = js.native
  
  def indexOf(name: String): Double = js.native
  
  def map[T](callback: js.Function2[/* value */ Any, /* key */ String, T]): js.Array[T] = js.native
  
  def reset(values: js.Object, value: Any): Unit = js.native
  
  def set(key: String, value: Any): Unit = js.native
  def set(key: Double, value: Any): Unit = js.native
  
  def toArray(): js.Array[Any] = js.native
  
  def toJSON(): String = js.native
  
  def toObject(): js.Object = js.native
}
