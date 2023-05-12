package typings.geotiff

import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeCompressionLzwMod {
  
  @JSImport("geotiff/dist-node/compression/lzw", JSImport.Default)
  @js.native
  open class default () extends LZWDecoder
  
  @js.native
  trait LZWDecoder
    extends typings.geotiff.distNodeCompressionBasedecoderMod.default {
    
    def decodeBlock(buffer: Any): ArrayBufferLike = js.native
  }
}
