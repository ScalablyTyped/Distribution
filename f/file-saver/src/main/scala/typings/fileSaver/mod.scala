package typings.fileSaver

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("saveAs")
    @js.native
    val saveAs: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof FileSaver.saveAs */ js.Any = js.native
    
    @js.native
    trait Window extends StObject {
      
      var saveAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any = js.native
    }
    object Window {
      
      @scala.inline
      def apply(
        saveAs: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
      ): Window = {
        val __obj = js.Dynamic.literal(saveAs = saveAs.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSaveAs(
          value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FileSaver.saveAs */ js.Any
        ): Self = StObject.set(x, "saveAs", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: String): Unit = js.native
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: String, filename: js.UndefOr[scala.Nothing], disableAutoBOM: Boolean): Unit = js.native
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: String, filename: js.UndefOr[scala.Nothing], options: FileSaverOptions): Unit = js.native
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: String, filename: String): Unit = js.native
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: String, filename: String, disableAutoBOM: Boolean): Unit = js.native
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: String, filename: String, options: FileSaverOptions): Unit = js.native
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
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: Blob): Unit = js.native
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: Blob, filename: js.UndefOr[scala.Nothing], disableAutoBOM: Boolean): Unit = js.native
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: Blob, filename: js.UndefOr[scala.Nothing], options: FileSaverOptions): Unit = js.native
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: Blob, filename: String): Unit = js.native
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: Blob, filename: String, disableAutoBOM: Boolean): Unit = js.native
  @JSImport("file-saver", "saveAs")
  @js.native
  def saveAs(data: Blob, filename: String, options: FileSaverOptions): Unit = js.native
  
  @js.native
  trait FileSaverOptions extends StObject {
    
    /**
      * Automatically provide Unicode text encoding hints
      * @default false
      */
    var autoBom: Boolean = js.native
  }
  object FileSaverOptions {
    
    @scala.inline
    def apply(autoBom: Boolean): FileSaverOptions = {
      val __obj = js.Dynamic.literal(autoBom = autoBom.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSaverOptions]
    }
    
    @scala.inline
    implicit class FileSaverOptionsMutableBuilder[Self <: FileSaverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoBom(value: Boolean): Self = StObject.set(x, "autoBom", value.asInstanceOf[js.Any])
    }
  }
}
