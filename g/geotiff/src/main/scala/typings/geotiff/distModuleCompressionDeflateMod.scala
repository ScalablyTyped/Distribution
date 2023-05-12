package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleCompressionDeflateMod {
  
  @JSImport("geotiff/dist-module/compression/deflate", JSImport.Default)
  @js.native
  open class default () extends DeflateDecoder
  
  @js.native
  trait DeflateDecoder
    extends typings.geotiff.distModuleCompressionBasedecoderMod.default {
    
    def decodeBlock(buffer: Any): Any = js.native
  }
}
