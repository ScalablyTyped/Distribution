package typings.gifEncoder.mod

import typings.gifEncoder.anon.HighWaterMark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gif-encoder", JSImport.Namespace)
@js.native
class ^ protected () extends GIFEncoder {
  def this(
    /**
    * Width, in pixels, of the GIF to output.
    */
  width: Double,
    /**
    * Height, in pixels, of the GIF to output.
    */
  height: Double
  ) = this()
  def this(
    /**
    * Width, in pixels, of the GIF to output.
    */
  width: Double,
    /**
    * Height, in pixels, of the GIF to output.
    */
  height: Double,
    options: HighWaterMark
  ) = this()
}
