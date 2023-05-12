package typings.geotiff

import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeCompressionPackbitsMod {
  
  @JSImport("geotiff/dist-node/compression/packbits", JSImport.Default)
  @js.native
  open class default () extends PackbitsDecoder
  
  @js.native
  trait PackbitsDecoder
    extends typings.geotiff.distNodeCompressionBasedecoderMod.default {
    
    def decodeBlock(buffer: Any): ArrayBufferLike = js.native
  }
}
