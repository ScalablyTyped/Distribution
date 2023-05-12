package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleSourceHttputilsMod {
  
  @JSImport("geotiff/dist-module/source/httputils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseByteRanges(responseArrayBuffer: js.typedarray.ArrayBuffer, boundary: String): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteRanges")(responseArrayBuffer.asInstanceOf[js.Any], boundary.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def parseContentRange(rawContentRange: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentRange")(rawContentRange.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def parseContentType(rawContentType: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentType")(rawContentType.asInstanceOf[js.Any]).asInstanceOf[Any]
}
