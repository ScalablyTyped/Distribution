package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleCompressionLercMod {
  
  @JSImport("geotiff/dist-module/compression/lerc", JSImport.Default)
  @js.native
  open class default protected () extends LercDecoder {
    def this(fileDirectory: Any) = this()
  }
  
  @js.native
  trait LercDecoder
    extends typings.geotiff.distModuleCompressionBasedecoderMod.default {
    
    var addCompression: Any = js.native
    
    def decodeBlock(buffer: Any): Any = js.native
    
    var planarConfiguration: Any = js.native
    
    var samplesPerPixel: Any = js.native
  }
}
