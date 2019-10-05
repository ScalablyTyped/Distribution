package typings.geometryDashDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMMatrix
  extends typings.geometryDashDom.GeometryDom.DOMMatrixReadOnly {
  def invertSelf(): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def multiplySelf(other: typings.geometryDashDom.GeometryDom.DOMMatrix): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def preMultiplySelf(other: typings.geometryDashDom.GeometryDom.DOMMatrix): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateAxisAngleSelf(x: Double, y: Double, z: Double, angle: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateFromVectorSelf(x: Double, y: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateSelf(angle: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateSelf(angle: Double, originX: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def rotateSelf(angle: Double, originX: Double, originY: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3dSelf(scale: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scale3dSelf(scale: Double, originX: Double, originY: Double, originZ: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleNonUniformSelf(scaleX: Double, scaleY: Double, scaleZ: Double, originX: Double, originY: Double, originZ: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleSelf(scale: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleSelf(scale: Double, originX: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def scaleSelf(scale: Double, originX: Double, originY: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def setMatrixValue(transformList: typings.geometryDashDom.GeometryDom.DOMMatrix): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def skewXSelf(sx: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def skewYSelf(sy: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
  def translateSelf(tx: Double, ty: Double, tz: Double): typings.geometryDashDom.GeometryDom.DOMMatrix = js.native
}

