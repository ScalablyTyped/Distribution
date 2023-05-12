package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeCompressionDeflateMod {
  
  @JSImport("geotiff/dist-node/compression/deflate", JSImport.Default)
  @js.native
  open class default () extends DeflateDecoder
  
  @js.native
  trait DeflateDecoder
    extends typings.geotiff.distNodeCompressionBasedecoderMod.default {
    
    def decodeBlock(buffer: Any): Any = js.native
  }
}
