package typings.extractFiles

import typings.extractFiles.anon.Clone
import typings.std.Blob
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("extract-files", "ReactNativeFile")
  @js.native
  class ReactNativeFile protected () extends StObject {
    def this(options: ReactNativeFileOptions) = this()
    
    var name: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var uri: String = js.native
  }
  
  @JSImport("extract-files", "extractFiles")
  @js.native
  def extractFiles[TFile](value: js.Any): Clone[TFile] = js.native
  @JSImport("extract-files", "extractFiles")
  @js.native
  def extractFiles[TFile](
    value: js.Any,
    path: js.UndefOr[scala.Nothing],
    isExtractableFile: js.Function1[/* value */ js.Any, /* is TFile */ Boolean]
  ): Clone[TFile] = js.native
  @JSImport("extract-files", "extractFiles")
  @js.native
  def extractFiles[TFile](value: js.Any, path: String): Clone[TFile] = js.native
  @JSImport("extract-files", "extractFiles")
  @js.native
  def extractFiles[TFile](
    value: js.Any,
    path: String,
    isExtractableFile: js.Function1[/* value */ js.Any, /* is TFile */ Boolean]
  ): Clone[TFile] = js.native
  
  @JSImport("extract-files", "isExtractableFile")
  @js.native
  def isExtractableFile(value: js.Any): /* is extract-files.extract-files.ExtractableFile */ Boolean = js.native
  
  type ExtractableFile = File | Blob | ReactNativeFile
  
  @js.native
  trait ReactNativeFileOptions extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var uri: String = js.native
  }
  object ReactNativeFileOptions {
    
    @scala.inline
    def apply(uri: String): ReactNativeFileOptions = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactNativeFileOptions]
    }
    
    @scala.inline
    implicit class ReactNativeFileOptionsMutableBuilder[Self <: ReactNativeFileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
