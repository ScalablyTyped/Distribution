package typings.geometryDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrix extends DOMMatrixReadOnly {
  def invertSelf(): DOMMatrix = js.native
  def multiplySelf(other: DOMMatrix): DOMMatrix = js.native
  def preMultiplySelf(other: DOMMatrix): DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): DOMMatrix = js.native
  def rotateFromVectorSelf(x: Double, y: Double): DOMMatrix = js.native
  def rotateSelf(angle: Double): DOMMatrix = js.native
  def rotateSelf(angle: Double, originX: Double): DOMMatrix = js.native
  def rotateSelf(angle: Double, originX: Double, originY: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double): DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double): DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double): DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double): DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double): DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double, originZ: Double): DOMMatrix = js.native
  def scaleSelf(scale: Double): DOMMatrix = js.native
  def scaleSelf(scale: Double, originX: Double): DOMMatrix = js.native
  def scaleSelf(scale: Double, originX: Double, originY: Double): DOMMatrix = js.native
  def setMatrixValue(transformList: DOMMatrix): DOMMatrix = js.native
  def skewXSelf(sx: Double): DOMMatrix = js.native
  def skewYSelf(sy: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double): DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double, tz: Double): DOMMatrix = js.native
}

