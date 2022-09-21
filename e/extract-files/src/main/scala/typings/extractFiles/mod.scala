package typings.extractFiles

import typings.extractFiles.anon.Clone
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("extract-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("extract-files", "ReactNativeFile")
  @js.native
  open class ReactNativeFile protected () extends StObject {
    def this(options: ReactNativeFileOptions) = this()
    
    var name: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var uri: String = js.native
  }
  
  inline def extractFiles[TFile](value: Any): Clone[TFile] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFiles")(value.asInstanceOf[js.Any]).asInstanceOf[Clone[TFile]]
  inline def extractFiles[TFile](value: Any, path: String): Clone[TFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFiles")(value.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Clone[TFile]]
  inline def extractFiles[TFile](value: Any, path: String, isExtractableFile: js.Function1[/* value */ Any, /* is TFile */ Boolean]): Clone[TFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFiles")(value.asInstanceOf[js.Any], path.asInstanceOf[js.Any], isExtractableFile.asInstanceOf[js.Any])).asInstanceOf[Clone[TFile]]
  inline def extractFiles[TFile](value: Any, path: Unit, isExtractableFile: js.Function1[/* value */ Any, /* is TFile */ Boolean]): Clone[TFile] = (^.asInstanceOf[js.Dynamic].applyDynamic("extractFiles")(value.asInstanceOf[js.Any], path.asInstanceOf[js.Any], isExtractableFile.asInstanceOf[js.Any])).asInstanceOf[Clone[TFile]]
  
  inline def isExtractableFile(value: Any): /* is extract-files.extract-files.ExtractableFile */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtractableFile")(value.asInstanceOf[js.Any]).asInstanceOf[/* is extract-files.extract-files.ExtractableFile */ Boolean]
  
  type ExtractableFile = File | Blob | ReactNativeFile
  
  trait ReactNativeFileOptions extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var uri: String
  }
  object ReactNativeFileOptions {
    
    inline def apply(uri: String): ReactNativeFileOptions = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactNativeFileOptions]
    }
    
    extension [Self <: ReactNativeFileOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
