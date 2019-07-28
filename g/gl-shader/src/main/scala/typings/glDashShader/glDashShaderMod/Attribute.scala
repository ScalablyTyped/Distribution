package typings.glDashShader.glDashShaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attribute extends js.Object {
  var location: js.Array[Double] | Double = js.native
  def pointer(): Double = js.native
  def pointer(`type`: Double): Double = js.native
  def pointer(`type`: Double, normalized: Boolean): Double = js.native
  def pointer(`type`: Double, normalized: Boolean, stride: Double): Double = js.native
  def pointer(`type`: Double, normalized: Boolean, stride: Double, offset: Double): Double = js.native
}

