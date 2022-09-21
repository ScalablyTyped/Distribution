package typings.filewriter

import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("FileSaver")
  @js.native
  open class FileSaver protected ()
    extends StObject
       with typings.filewriter.FileSaver {
    /**
      * When the FileSaver constructor is called, the user agent must return a new FileSaver object with readyState set to INIT.
      * This constructor must be visible when the script's global object is either a Window object or an object implementing the WorkerUtils interface.
      */
    def this(data: Blob) = this()
  }
}
