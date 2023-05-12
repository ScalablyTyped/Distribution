package typings.geotiff

import typings.geotiff.distNodeSourceBasesourceMod.BaseSource
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeSourceFilereaderMod {
  
  @JSImport("geotiff/dist-node/source/filereader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeFileReaderSource(file: Blob): FileReaderSource = ^.asInstanceOf[js.Dynamic].applyDynamic("makeFileReaderSource")(file.asInstanceOf[js.Any]).asInstanceOf[FileReaderSource]
  
  @js.native
  trait FileReaderSource extends BaseSource {
    
    var file: Any = js.native
  }
}
