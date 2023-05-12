package typings.geotiff

import typings.std.ArrayBufferLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeGeotiffwriterMod {
  
  @JSImport("geotiff/dist-node/geotiffwriter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def writeGeotiff(data: Any, metadata: Any): ArrayBufferLike = (^.asInstanceOf[js.Dynamic].applyDynamic("writeGeotiff")(data.asInstanceOf[js.Any], metadata.asInstanceOf[js.Any])).asInstanceOf[ArrayBufferLike]
}
