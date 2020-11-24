package typings.filewriter

import org.scalablytyped.runtime.Instantiable1
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class FileSaver protected ()
    extends typings.filewriter.FileSaver {
    /**
      * When the FileSaver constructor is called, the user agent must return a new FileSaver object with readyState set to INIT.
      * This constructor must be visible when the script's global object is either a Window object or an object implementing the WorkerUtils interface.
      */
    def this(data: Blob) = this()
  }
  @js.native
  object FileSaver
    extends /**
    * When the FileSaver constructor is called, the user agent must return a new FileSaver object with readyState set to INIT.
    * This constructor must be visible when the script's global object is either a Window object or an object implementing the WorkerUtils interface.
    */
  Instantiable1[/* data */ Blob, typings.filewriter.FileSaver]
}
