package typings
package glDashTexture2dLib.glDashTexture2dMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Texture extends js.Object {
  val format: glDashTexture2dLib.GLenum = js.native
  val gl: stdLib.WebGLRenderingContext = js.native
  val handle: stdLib.WebGLTexture = js.native
  var magFilter: glDashTexture2dLib.GLenum = js.native
  var minFilter: glDashTexture2dLib.GLenum = js.native
  var mipSamples: glDashTexture2dLib.GLenum = js.native
  var shape: js.Tuple2[scala.Double, scala.Double] = js.native
  val `type`: glDashTexture2dLib.GLenum = js.native
  var wrap: js.Tuple2[glDashTexture2dLib.GLenum, glDashTexture2dLib.GLenum] = js.native
  def bind(): scala.Double = js.native
  def bind(id: scala.Double): scala.Double = js.native
  def dispose(): scala.Unit = js.native
  def generateMipmap(): scala.Unit = js.native
  def setPixels(data: InputType): scala.Unit = js.native
  def setPixels(data: InputType, offset: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
  def setPixels(
    data: InputType,
    offset: js.Tuple2[scala.Double, scala.Double],
    mipLevel: glDashTexture2dLib.GLenum
  ): scala.Unit = js.native
  def setPixels(data: RawObject): scala.Unit = js.native
  def setPixels(data: RawObject, offset: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
  def setPixels(
    data: RawObject,
    offset: js.Tuple2[scala.Double, scala.Double],
    mipLevel: glDashTexture2dLib.GLenum
  ): scala.Unit = js.native
  def setPixels(data: ndarrayLib.ndarrayMod.ndarray[scala.Double]): scala.Unit = js.native
  def setPixels(data: ndarrayLib.ndarrayMod.ndarray[scala.Double], offset: js.Tuple2[scala.Double, scala.Double]): scala.Unit = js.native
  def setPixels(
    data: ndarrayLib.ndarrayMod.ndarray[scala.Double],
    offset: js.Tuple2[scala.Double, scala.Double],
    mipLevel: glDashTexture2dLib.GLenum
  ): scala.Unit = js.native
}

