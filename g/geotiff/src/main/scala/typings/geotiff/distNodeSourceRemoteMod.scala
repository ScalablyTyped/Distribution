package typings.geotiff

import typings.geotiff.anon.AllowFullFile
import typings.geotiff.anon.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSourceRemoteMod {
  
  @JSImport("geotiff/dist-node/source/remote", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeFetchSource(url: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFetchSource")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeFetchSource(url: Any, param1: AllowFullFile): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFetchSource")(url.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeHttpSource(url: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeHttpSource")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeHttpSource(url: Any, param1: Headers): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeHttpSource")(url.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeRemoteSource(url: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeRemoteSource")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeRemoteSource(url: String, param1: js.Object): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRemoteSource")(url.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeXHRSource(url: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeXHRSource")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeXHRSource(url: Any, param1: Headers): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeXHRSource")(url.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Any]
}
