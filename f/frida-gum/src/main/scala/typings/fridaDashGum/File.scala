package typings.fridaDashGum

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides basic filesystem access.
  */
@JSGlobal("File")
@js.native
class File protected () extends js.Object {
  /**
    * Opens or creates the file at `filePath` with `mode` specifying how
    * it should be opened. For example `"wb"` to open the file for writing
    * in binary mode. This is the same format as `fopen()` from the C
    * standard library.
    *
    * @param filePath Path to file to open or create.
    * @param mode Mode to use.
    */
  def this(filePath: String, mode: String) = this()
  /**
    * Closes the file. You should call this function when you’re done with
    * the file unless you are fine with this happening when the object is
    * garbage-collected or the script is unloaded.
    */
  def close(): Unit = js.native
  /**
    * Flushes any buffered data to the underlying file.
    */
  def flush(): Unit = js.native
  /**
    * Synchronously writes `data` to the file.
    *
    * @param data Data to write.
    */
  def write(data: String): Unit = js.native
  def write(data: ArrayBuffer): Unit = js.native
}

