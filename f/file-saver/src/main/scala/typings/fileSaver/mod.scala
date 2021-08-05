package typings.fileSaver

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-saver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object global {
    
    @JSGlobal("saveAs")
    @js.native
    val saveAs: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof FileSaver.saveAs */ js.Any = js.native
    
    trait Window extends StObject {
      
      var saveAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
    }
    object Window {
      
      inline def apply(
        saveAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
      ): Window = {
        val __obj = js.Dynamic.literal(saveAs = saveAs.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setSaveAs(
          value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
        ): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
      }
    }
  }
  
  inline def saveAs(data: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def saveAs(data: String, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: String, filename: String, disableAutoBOM: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], disableAutoBOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: String, filename: String, options: FileSaverOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: String, filename: Unit, disableAutoBOM: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], disableAutoBOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: String, filename: Unit, options: FileSaverOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * FileSaver.js implements the saveAs() FileSaver interface in browsers that do not natively support it.
    * @param data - The actual file data blob or URL.
    * @param filename - The optional name of the file to be downloaded. If omitted, the name used in the file data will be used. If none is provided "download" will be used.
    * @param options - Optional FileSaver.js config
    */
  /**
    * FileSaver.js implements the saveAs() FileSaver interface in browsers that do not natively support it.
    * @param data - The actual file data blob or URL.
    * @param filename - The optional name of the file to be downloaded. If omitted, the name used in the file data will be used. If none is provided "download" will be used.
    * @param disableAutoBOM - Optional & defaults to `false`. Set to `true` if you want FileSaver.js to automatically provide Unicode text encoding hints
    * @deprecated use `{ autoBom: false }` as the third argument
    */
  // tslint:disable-next-line:unified-signatures
  inline def saveAs(data: Blob): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def saveAs(data: Blob, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: Blob, filename: String, disableAutoBOM: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], disableAutoBOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: Blob, filename: String, options: FileSaverOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: Blob, filename: Unit, disableAutoBOM: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], disableAutoBOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: Blob, filename: Unit, options: FileSaverOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FileSaverOptions extends StObject {
    
    /**
      * Automatically provide Unicode text encoding hints
      * @default false
      */
    var autoBom: Boolean
  }
  object FileSaverOptions {
    
    inline def apply(autoBom: Boolean): FileSaverOptions = {
      val __obj = js.Dynamic.literal(autoBom = autoBom.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSaverOptions]
    }
    
    extension [Self <: FileSaverOptions](x: Self) {
      
      inline def setAutoBom(value: Boolean): Self = StObject.set(x, "autoBom", value.asInstanceOf[js.Any])
    }
  }
}
