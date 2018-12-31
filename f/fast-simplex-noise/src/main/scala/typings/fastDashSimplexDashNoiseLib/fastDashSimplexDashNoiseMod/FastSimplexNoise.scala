package typings
package fastDashSimplexDashNoiseLib.fastDashSimplexDashNoiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastSimplexNoise extends js.Object {
  val amplitude: scala.Double
  val frequency: scala.Double
  val octaves: scala.Double
  val perm: stdLib.Uint8Array
  val permMod12: stdLib.Uint8Array
  val persistence: scala.Double
  def cylindrical(circumference: scala.Double, coords: js.Array[scala.Double]): scala.Double
  def cylindrical2D(circumference: scala.Double, x: scala.Double, y: scala.Double): scala.Double
  def cylindrical3D(circumference: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): scala.Double
  def dot(gs: js.Array[scala.Double], coords: js.Array[scala.Double]): scala.Double
  def random(): scala.Double
  def raw(coords: js.Array[scala.Double]): scala.Double
  def raw2D(x: scala.Double, y: scala.Double): scala.Double
  def raw3D(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double
  def raw4D(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Double
  def scale(value: scala.Double): scala.Double
  def scaled(coords: js.Array[scala.Double]): scala.Double
  def scaled2D(x: scala.Double, y: scala.Double): scala.Double
  def scaled3D(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double
  def scaled4D(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Double
  def spherical(circumference: scala.Double, coords: js.Array[scala.Double]): scala.Double
  def spherical2D(circumference: scala.Double, x: scala.Double, y: scala.Double): scala.Double
  def spherical3D(circumference: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): scala.Double
}

