package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Framebuffer extends js.Object {
  var color: stdLib.WebGLTexture
  var handle: stdLib.WebGLFramebuffer
  def bind(): scala.Unit
  def dispose(): scala.Unit
  def syncSize(w: scala.Double, h: scala.Double): scala.Unit
}

