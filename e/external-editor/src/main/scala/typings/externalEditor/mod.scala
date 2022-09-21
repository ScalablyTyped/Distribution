package typings.externalEditor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("external-editor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("external-editor", "CreateFileError")
  @js.native
  open class CreateFileError protected ()
    extends typings.externalEditor.createFileErrorMod.CreateFileError {
    def this(originalError: js.Error) = this()
  }
  
  @JSImport("external-editor", "ExternalEditor")
  @js.native
  open class ExternalEditor () extends StObject {
    def this(text: String) = this()
    def this(text: String, fileOptions: IFileOptions) = this()
    def this(text: Unit, fileOptions: IFileOptions) = this()
    
    def cleanup(): Unit = js.native
    
    /* private */ var createTemporaryFile: Any = js.native
    
    /* private */ var determineEditor: Any = js.native
    
    var editor: IEditorParams = js.native
    
    /* private */ var fileOptions: Any = js.native
    
    var lastExitStatus: Double = js.native
    
    val last_exit_status: Double = js.native
    
    /* private */ var launchEditor: Any = js.native
    
    /* private */ var launchEditorAsync: Any = js.native
    
    /* private */ var readTemporaryFile: Any = js.native
    
    /* private */ var removeTemporaryFile: Any = js.native
    
    def run(): String = js.native
    
    def runAsync(callback: StringCallback): Unit = js.native
    
    var tempFile: String = js.native
    
    val temp_file: String = js.native
    
    var text: String = js.native
  }
  /* static members */
  object ExternalEditor {
    
    @JSImport("external-editor", "ExternalEditor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("external-editor", "ExternalEditor.splitStringBySpace")
    @js.native
    def splitStringBySpace: Any = js.native
    inline def splitStringBySpace_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("splitStringBySpace")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("external-editor", "LaunchEditorError")
  @js.native
  open class LaunchEditorError protected ()
    extends typings.externalEditor.launchEditorErrorMod.LaunchEditorError {
    def this(originalError: js.Error) = this()
  }
  
  @JSImport("external-editor", "ReadFileError")
  @js.native
  open class ReadFileError protected ()
    extends typings.externalEditor.readFileErrorMod.ReadFileError {
    def this(originalError: js.Error) = this()
  }
  
  @JSImport("external-editor", "RemoveFileError")
  @js.native
  open class RemoveFileError protected ()
    extends typings.externalEditor.removeFileErrorMod.RemoveFileError {
    def this(originalError: js.Error) = this()
  }
  
  inline def edit(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("edit")().asInstanceOf[String]
  inline def edit(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("edit")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def edit(text: String, fileOptions: IFileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("edit")(text.asInstanceOf[js.Any], fileOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def edit(text: Unit, fileOptions: IFileOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("edit")(text.asInstanceOf[js.Any], fileOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def editAsync(text: String, callback: StringCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("editAsync")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def editAsync(text: String, callback: StringCallback, fileOptions: IFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("editAsync")(text.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], fileOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait IEditorParams extends StObject {
    
    var args: js.Array[String]
    
    var bin: String
  }
  object IEditorParams {
    
    inline def apply(args: js.Array[String], bin: String): IEditorParams = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], bin = bin.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEditorParams]
    }
    
    extension [Self <: IEditorParams](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFileOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.undefined
    
    var mode: js.UndefOr[Double] = js.undefined
    
    var postfix: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var template: js.UndefOr[String] = js.undefined
  }
  object IFileOptions {
    
    inline def apply(): IFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFileOptions]
    }
    
    extension [Self <: IFileOptions](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPostfix(value: String): Self = StObject.set(x, "postfix", value.asInstanceOf[js.Any])
      
      inline def setPostfixUndefined: Self = StObject.set(x, "postfix", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  type StringCallback = js.Function2[/* err */ js.Error, /* result */ String, Unit]
  
  type VoidCallback = js.Function0[Unit]
}
