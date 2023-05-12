package typings.geotiff

import typings.geotiff.distModuleSourceBasesourceMod.BaseSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleSourceFileMod {
  
  @JSImport("geotiff/dist-module/source/file", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeFileSource(path: Any): FileSource = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFileSource")(path.asInstanceOf[js.Any]).asInstanceOf[FileSource]
  
  @js.native
  trait FileSource extends BaseSource {
    
    var openRequest: js.Promise[Any] = js.native
    
    var path: Any = js.native
  }
}
