package typings.geotiff

import typings.geotiff.distNodeSourceBasesourceMod.BaseSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSourceFileMod {
  
  @JSImport("geotiff/dist-node/source/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeFileSource(path: Any): FileSource = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFileSource")(path.asInstanceOf[js.Any]).asInstanceOf[FileSource]
  
  @js.native
  trait FileSource extends BaseSource {
    
    var openRequest: js.Promise[Any] = js.native
    
    var path: Any = js.native
  }
}
