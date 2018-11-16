package typings
package fastDashSimplexDashNoiseLib.fastDashSimplexDashNoiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-simplex-noise", JSImport.Default)
@js.native
class default () extends FastSimplexNoise {
  def this(options: Options) = this()
  /* CompleteClass */
  override val amplitude: scala.Double = js.native
  /* CompleteClass */
  override val frequency: scala.Double = js.native
  /* CompleteClass */
  override val octaves: scala.Double = js.native
  /* CompleteClass */
  override val perm: stdLib.Uint8Array = js.native
  /* CompleteClass */
  override val permMod12: stdLib.Uint8Array = js.native
  /* CompleteClass */
  override val persistence: scala.Double = js.native
  /* CompleteClass */
  override def cylindrical(circumference: scala.Double, coords: js.Array[scala.Double]): scala.Double = js.native
  /* CompleteClass */
  override def cylindrical2D(circumference: scala.Double, x: scala.Double, y: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def cylindrical3D(circumference: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def dot(gs: js.Array[scala.Double], coords: js.Array[scala.Double]): scala.Double = js.native
  /* CompleteClass */
  override def random(): scala.Double = js.native
  /* CompleteClass */
  override def raw(coords: js.Array[scala.Double]): scala.Double = js.native
  /* CompleteClass */
  override def raw2D(x: scala.Double, y: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def raw3D(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def raw4D(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def scale(value: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def scaled(coords: js.Array[scala.Double]): scala.Double = js.native
  /* CompleteClass */
  override def scaled2D(x: scala.Double, y: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def scaled3D(x: scala.Double, y: scala.Double, z: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def scaled4D(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def spherical(circumference: scala.Double, coords: js.Array[scala.Double]): scala.Double = js.native
  /* CompleteClass */
  override def spherical2D(circumference: scala.Double, x: scala.Double, y: scala.Double): scala.Double = js.native
  /* CompleteClass */
  override def spherical3D(circumference: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): scala.Double = js.native
}

@JSImport("fast-simplex-noise", JSImport.Default)
@js.native
object default extends js.Object {
  var G2: scala.Double = js.native
  var G3: scala.Double = js.native
  var G4: scala.Double = js.native
  var GRAD3D: js.Array[js.Array[scala.Double]] = js.native
  var GRAD4D: js.Array[js.Array[scala.Double]] = js.native
}

