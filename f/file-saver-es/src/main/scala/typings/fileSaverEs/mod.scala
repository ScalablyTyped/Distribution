package typings.fileSaverEs

import typings.fileSaverEs.anon.FnCall
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-saver-es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def saveAs(data: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def saveAs(data: String, filename: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: String, filename: String, disableAutoBOM: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], disableAutoBOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: String, filename: String, options: FileSaverOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: String, filename: Unit, disableAutoBOM: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], disableAutoBOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def saveAs(data: String, filename: Unit, options: FileSaverOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
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
  
  object global {
    
    trait Window extends StObject {
      
      def saveAs(data: String): Unit
      def saveAs(data: String, filename: String): Unit
      def saveAs(data: String, filename: String, disableAutoBOM: Boolean): Unit
      def saveAs(data: String, filename: String, options: FileSaverOptions): Unit
      def saveAs(data: String, filename: Unit, disableAutoBOM: Boolean): Unit
      def saveAs(data: String, filename: Unit, options: FileSaverOptions): Unit
      // This module doesn't expose a callable function directly via a CommonJS export so if only the declaration
      // `export as namespace saveAs;` is used it would require users to use this module as `window.saveAs.saveAs(...)`.
      // But the module actually still exposes the `saveAs` function directly on `Window` so the code below is needed
      // to allow to ergonomically use this module as `window.saveAs(...)`.
      def saveAs(data: Blob): Unit
      def saveAs(data: Blob, filename: String): Unit
      def saveAs(data: Blob, filename: String, disableAutoBOM: Boolean): Unit
      def saveAs(data: Blob, filename: String, options: FileSaverOptions): Unit
      def saveAs(data: Blob, filename: Unit, disableAutoBOM: Boolean): Unit
      def saveAs(data: Blob, filename: Unit, options: FileSaverOptions): Unit
      // This module doesn't expose a callable function directly via a CommonJS export so if only the declaration
      // `export as namespace saveAs;` is used it would require users to use this module as `window.saveAs.saveAs(...)`.
      // But the module actually still exposes the `saveAs` function directly on `Window` so the code below is needed
      // to allow to ergonomically use this module as `window.saveAs(...)`.
      @JSName("saveAs")
      var saveAs_Original: FnCall
    }
    object Window {
      
      inline def apply(saveAs: FnCall): Window = {
        val __obj = js.Dynamic.literal(saveAs = saveAs.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setSaveAs(value: FnCall): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
      }
    }
  }
}
