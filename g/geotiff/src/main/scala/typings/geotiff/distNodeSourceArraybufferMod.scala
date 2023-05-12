package typings.geotiff

import typings.geotiff.distNodeSourceBasesourceMod.BaseSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSourceArraybufferMod {
  
  @JSImport("geotiff/dist-node/source/arraybuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeBufferSource(arrayBuffer: Any): ArrayBufferSource = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBufferSource")(arrayBuffer.asInstanceOf[js.Any]).asInstanceOf[ArrayBufferSource]
  
  @js.native
  trait ArrayBufferSource extends BaseSource {
    
    var arrayBuffer: Any = js.native
  }
}
