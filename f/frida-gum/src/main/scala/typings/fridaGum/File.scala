package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides basic filesystem access.
  */
@js.native
trait File extends StObject {
  
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
    * Reads up to `n` bytes from the file, or the rest of the file if
    * unspecified. Returns an empty buffer when the end of the file is
    * reached.
    *
    * @param n The maximum number of bytes to read.
    */
  def readBytes(): ArrayBuffer = js.native
  def readBytes(n: Double): ArrayBuffer = js.native
  
  /**
    * Reads one line of text from the file, with the newline included. Returns
    * an empty string when the end of the file is reached.
    *
    * Ensures that the data is valid UTF-8 and throws an error otherwise.
    */
  def readLine(): String = js.native
  
  /**
    * Reads up to `n` bytes from the file into a string. If `n` is omitted,
    * the rest of the file is read. Returns an empty string when the end of the
    * file is reached.
    *
    * Ensures that the data is valid UTF-8 and throws an error otherwise.
    *
    * @param n The maximum number of bytes to read.
    */
  def readText(): String = js.native
  def readText(n: Double): String = js.native
  
  /**
    * Changes the current file position to the specified `offset`, in bytes.
    * Returns the resulting offset.
    *
    * @param offset The byte offset to seek to.
    * @param whence What the offset is relative to (default: `File.SEEK_SET`).
    */
  def seek(offset: Double): Double = js.native
  def seek(offset: Double, whence: Double): Double = js.native
  
  /**
    * Returns the current file position, in bytes.
    */
  def tell(): Double = js.native
  
  /**
    * Synchronously writes `data` to the file.
    *
    * @param data Data to write.
    */
  def write(data: String): Unit = js.native
  def write(data: js.Array[Double]): Unit = js.native
  def write(data: ArrayBuffer): Unit = js.native
}
