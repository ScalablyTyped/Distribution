package typings.glShader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attribute extends js.Object {
  
  var location: js.Array[Double] | Double = js.native
  
  def pointer(): Double = js.native
  def pointer(
    `type`: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    stride: js.UndefOr[scala.Nothing],
    offset: Double
  ): Double = js.native
  def pointer(`type`: js.UndefOr[scala.Nothing], normalized: js.UndefOr[scala.Nothing], stride: Double): Double = js.native
  def pointer(
    `type`: js.UndefOr[scala.Nothing],
    normalized: js.UndefOr[scala.Nothing],
    stride: Double,
    offset: Double
  ): Double = js.native
  def pointer(`type`: js.UndefOr[scala.Nothing], normalized: Boolean): Double = js.native
  def pointer(
    `type`: js.UndefOr[scala.Nothing],
    normalized: Boolean,
    stride: js.UndefOr[scala.Nothing],
    offset: Double
  ): Double = js.native
  def pointer(`type`: js.UndefOr[scala.Nothing], normalized: Boolean, stride: Double): Double = js.native
  def pointer(`type`: js.UndefOr[scala.Nothing], normalized: Boolean, stride: Double, offset: Double): Double = js.native
  def pointer(`type`: Double): Double = js.native
  def pointer(
    `type`: Double,
    normalized: js.UndefOr[scala.Nothing],
    stride: js.UndefOr[scala.Nothing],
    offset: Double
  ): Double = js.native
  def pointer(`type`: Double, normalized: js.UndefOr[scala.Nothing], stride: Double): Double = js.native
  def pointer(`type`: Double, normalized: js.UndefOr[scala.Nothing], stride: Double, offset: Double): Double = js.native
  def pointer(`type`: Double, normalized: Boolean): Double = js.native
  def pointer(`type`: Double, normalized: Boolean, stride: js.UndefOr[scala.Nothing], offset: Double): Double = js.native
  def pointer(`type`: Double, normalized: Boolean, stride: Double): Double = js.native
  def pointer(`type`: Double, normalized: Boolean, stride: Double, offset: Double): Double = js.native
}
