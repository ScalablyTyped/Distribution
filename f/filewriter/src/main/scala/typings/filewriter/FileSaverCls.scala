package typings.filewriter

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FileSaver")
@js.native
class FileSaverCls protected () extends FileSaver {
  /**
    * When the FileSaver constructor is called, the user agent must return a new FileSaver object with readyState set to INIT.
    * This constructor must be visible when the script's global object is either a Window object or an object implementing the WorkerUtils interface.
    */
  def this(data: Blob) = this()
}

