package typings.gifwrap.omggifMod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GifWriter
  extends Instantiable3[/* buffer */ ByteArray, /* width */ Double, /* height */ Double, GifWriter]
     with Instantiable4[
      /* buffer */ ByteArray, 
      /* width */ Double, 
      /* height */ Double, 
      /* gopts */ GlobalOptions, 
      GifWriter
    ] {
  
  def addFrame(x: Double, y: Double, width: Double, height: Double, indexedPixels: js.Array[Double]): Double = js.native
  def addFrame(
    x: Double,
    y: Double,
    width: Double,
    height: Double,
    indexedPixels: js.Array[Double],
    opts: FrameOptions
  ): Double = js.native
  
  def end(): Double = js.native
  
   // returns size of buffer at end of frame
  def getOutputBuffer(): ByteArray = js.native
  
  def getOutputBufferPosition(): Double = js.native
  
  def setOutputBuffer(buffer: ByteArray): Unit = js.native
  
  def setOutputBufferPosition(position: Double): Unit = js.native
}
