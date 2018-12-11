package typings
package gdalLib.gdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureFields extends js.Object {
  val feature: Feature = js.native
  def count(): scala.Double = js.native
  def forEach(callback: js.Function2[/* value */ js.Any, /* key */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def get(key: scala.Double): js.Any = js.native
  def getNames(): js.Array[java.lang.String] = js.native
  def indexOf(name: java.lang.String): scala.Double = js.native
  def map[T](callback: js.Function2[/* value */ js.Any, /* key */ java.lang.String, T]): js.Array[T] = js.native
  def reset(values: js.Object, value: js.Any): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(key: scala.Double, value: js.Any): scala.Unit = js.native
  def toArray(): js.Array[_] = js.native
  def toJSON(): java.lang.String = js.native
  def toObject(): js.Object = js.native
}

