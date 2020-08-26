package typings.gifwrap.omggifMod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GifReader extends Instantiable1[/* buffer */ ByteArray, GifReader] {
  var height: Double = js.native
  var width: Double = js.native
  def decodeAndBlitFrameBGRA(frameNumber: Double, pixels: js.Array[Double]): Unit = js.native
  def decodeAndBlitFrameRGBA(frameNumber: Double, pixels: js.Array[Double]): Unit = js.native
  def frameInfo(frameNumber: Double): FrameInfo = js.native
  def loopCount(): Double = js.native
  def numFrames(): Double = js.native
}

