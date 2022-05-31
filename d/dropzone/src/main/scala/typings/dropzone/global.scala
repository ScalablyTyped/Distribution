package typings.dropzone

import typings.dropzone.mod.DropzoneOptions
import typings.dropzone.mod.global.HTMLElement
import typings.std.Blob
import typings.std.File
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Dropzone {
    
    @JSGlobal("Dropzone")
    @js.native
    class ^ protected ()
      extends typings.dropzone.mod.^ {
      def this(container: String) = this()
      def this(container: HTMLElement) = this()
      def this(container: String, options: DropzoneOptions) = this()
      def this(container: HTMLElement, options: DropzoneOptions) = this()
    }
    
    @JSGlobal("Dropzone")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Dropzone.ACCEPTED")
    @js.native
    def ACCEPTED: String = js.native
    inline def ACCEPTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCEPTED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropzone.ADDED")
    @js.native
    def ADDED: String = js.native
    inline def ADDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropzone.CANCELED")
    @js.native
    def CANCELED: String = js.native
    inline def CANCELED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANCELED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropzone.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropzone.PROCESSING")
    @js.native
    def PROCESSING: String = js.native
    inline def PROCESSING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROCESSING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropzone.QUEUED")
    @js.native
    def QUEUED: String = js.native
    inline def QUEUED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QUEUED")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropzone.SUCCESS")
    @js.native
    def SUCCESS: String = js.native
    inline def SUCCESS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SUCCESS")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropzone.UPLOADING")
    @js.native
    def UPLOADING: String = js.native
    inline def UPLOADING_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UPLOADING")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropzone.autoDiscover")
    @js.native
    def autoDiscover: Boolean = js.native
    inline def autoDiscover_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoDiscover")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropzone.blacklistedBrowsers")
    @js.native
    def blacklistedBrowsers: js.Array[RegExp] = js.native
    inline def blacklistedBrowsers_=(x: js.Array[RegExp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blacklistedBrowsers")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSGlobal("Dropzone.confirm")
    @js.native
    def confirm: js.Function3[
        /* question */ String, 
        /* accepted */ js.Function0[Unit], 
        /* rejected */ js.UndefOr[js.Function0[Unit]], 
        Unit
      ] = js.native
    inline def confirm_=(
      x: js.Function3[
          /* question */ String, 
          /* accepted */ js.Function0[Unit], 
          /* rejected */ js.UndefOr[js.Function0[Unit]], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("confirm")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def createElement(string: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(string.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    
    /* static member */
    inline def dataURItoBlob(dataURI: String): Blob = ^.asInstanceOf[js.Dynamic].applyDynamic("dataURItoBlob")(dataURI.asInstanceOf[js.Any]).asInstanceOf[Blob]
    
    /* static member */
    inline def discover(): js.Array[typings.dropzone.mod.Dropzone] = ^.asInstanceOf[js.Dynamic].applyDynamic("discover")().asInstanceOf[js.Array[typings.dropzone.mod.Dropzone]]
    
    /* static member */
    inline def elementInside(element: HTMLElement, container: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("elementInside")(element.asInstanceOf[js.Any], container.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def forElement(element: String): typings.dropzone.mod.Dropzone = ^.asInstanceOf[js.Dynamic].applyDynamic("forElement")(element.asInstanceOf[js.Any]).asInstanceOf[typings.dropzone.mod.Dropzone]
    inline def forElement(element: HTMLElement): typings.dropzone.mod.Dropzone = ^.asInstanceOf[js.Dynamic].applyDynamic("forElement")(element.asInstanceOf[js.Any]).asInstanceOf[typings.dropzone.mod.Dropzone]
    
    /* static member */
    inline def getElement(element: String): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def getElement(element: String, name: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    inline def getElement(element: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
    inline def getElement(element: HTMLElement, name: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("getElement")(element.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /* static member */
    inline def getElements(elements: String): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
    inline def getElements(elements: js.Array[String | HTMLElement]): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
    inline def getElements(elements: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getElements")(elements.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
    
    /* static member */
    @JSGlobal("Dropzone.instances")
    @js.native
    def instances: js.Array[typings.dropzone.mod.Dropzone] = js.native
    inline def instances_=(x: js.Array[typings.dropzone.mod.Dropzone]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instances")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def isBrowserSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBrowserSupported")().asInstanceOf[Boolean]
    
    /* static member */
    inline def isValidFile(file: File, acceptedFiles: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidFile")(file.asInstanceOf[js.Any], acceptedFiles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /* static member */
    inline def optionsForElement(element: HTMLElement): js.UndefOr[DropzoneOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("optionsForElement")(element.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DropzoneOptions]]
    
    /* static member */
    @JSGlobal("Dropzone.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
