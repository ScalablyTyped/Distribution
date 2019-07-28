package typings.gdal.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFields extends js.Object {
  val feature: Feature = js.native
  def count(): Double = js.native
  def forEach(callback: js.Function2[/* value */ js.Any, /* key */ String, Unit]): Unit = js.native
  def get(key: String): js.Any = js.native
  def get(key: Double): js.Any = js.native
  def getNames(): js.Array[String] = js.native
  def indexOf(name: String): Double = js.native
  def map[T](callback: js.Function2[/* value */ js.Any, /* key */ String, T]): js.Array[T] = js.native
  def reset(values: js.Object, value: js.Any): Unit = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: Double, value: js.Any): Unit = js.native
  def toArray(): js.Array[_] = js.native
  def toJSON(): String = js.native
  def toObject(): js.Object = js.native
}

