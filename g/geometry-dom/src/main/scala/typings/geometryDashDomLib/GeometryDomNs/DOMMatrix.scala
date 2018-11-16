package typings
package geometryDashDomLib.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrix extends DOMMatrixReadOnly {
  def invertSelf(): DOMMatrix = js.native
  def multiplySelf(other: DOMMatrix): DOMMatrix = js.native
  def preMultiplySelf(other: DOMMatrix): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: scala.Double, y: scala.Double, z: scala.Double, angle: scala.Double): DOMMatrix = js.native
  def rotateFromVectorSelf(x: scala.Double, y: scala.Double): DOMMatrix = js.native
  def rotateSelf(angle: scala.Double): DOMMatrix = js.native
  def rotateSelf(angle: scala.Double, originX: scala.Double): DOMMatrix = js.native
  def rotateSelf(angle: scala.Double, originX: scala.Double, originY: scala.Double): DOMMatrix = js.native
  def scale3dSelf(scale: scala.Double): DOMMatrix = js.native
  def scale3dSelf(scale: scala.Double, originX: scala.Double): DOMMatrix = js.native
  def scale3dSelf(scale: scala.Double, originX: scala.Double, originY: scala.Double): DOMMatrix = js.native
  def scale3dSelf(scale: scala.Double, originX: scala.Double, originY: scala.Double, originZ: scala.Double): DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: scala.Double): DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: scala.Double, scaleY: scala.Double): DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: scala.Double, scaleY: scala.Double, scaleZ: scala.Double): DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: scala.Double, scaleY: scala.Double, scaleZ: scala.Double, originX: scala.Double): DOMMatrix = js.native
  def scaleNonUniformSelf(
    scaleX: scala.Double,
    scaleY: scala.Double,
    scaleZ: scala.Double,
    originX: scala.Double,
    originY: scala.Double
  ): DOMMatrix = js.native
  def scaleNonUniformSelf(
    scaleX: scala.Double,
    scaleY: scala.Double,
    scaleZ: scala.Double,
    originX: scala.Double,
    originY: scala.Double,
    originZ: scala.Double
  ): DOMMatrix = js.native
  def scaleSelf(scale: scala.Double): DOMMatrix = js.native
  def scaleSelf(scale: scala.Double, originX: scala.Double): DOMMatrix = js.native
  def scaleSelf(scale: scala.Double, originX: scala.Double, originY: scala.Double): DOMMatrix = js.native
  def setMatrixValue(transformList: DOMMatrix): DOMMatrix = js.native
  def skewXSelf(sx: scala.Double): DOMMatrix = js.native
  def skewYSelf(sy: scala.Double): DOMMatrix = js.native
  def translateSelf(tx: scala.Double, ty: scala.Double): DOMMatrix = js.native
  def translateSelf(tx: scala.Double, ty: scala.Double, tz: scala.Double): DOMMatrix = js.native
}

