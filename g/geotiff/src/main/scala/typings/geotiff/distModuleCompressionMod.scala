package typings.geotiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleCompressionMod {
  
  @JSImport("geotiff/dist-module/compression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addDecoder(cases: Any, importFn: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addDecoder")(cases.asInstanceOf[js.Any], importFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getDecoder(fileDirectory: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDecoder")(fileDirectory.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
