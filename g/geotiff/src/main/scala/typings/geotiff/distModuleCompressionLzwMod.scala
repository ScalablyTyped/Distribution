package typings.geotiff

import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleCompressionLzwMod {
  
  @JSImport("geotiff/dist-module/compression/lzw", JSImport.Default)
  @js.native
  open class default () extends LZWDecoder
  
  @js.native
  trait LZWDecoder
    extends typings.geotiff.distModuleCompressionBasedecoderMod.default {
    
    def decodeBlock(buffer: Any): ArrayBufferLike = js.native
  }
}
