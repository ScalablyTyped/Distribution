package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeCompressionRawMod {
  
  @JSImport("geotiff/dist-node/compression/raw", JSImport.Default)
  @js.native
  open class default () extends RawDecoder
  
  @js.native
  trait RawDecoder
    extends typings.geotiff.distNodeCompressionBasedecoderMod.default {
    
    def decodeBlock(buffer: Any): Any = js.native
  }
}
