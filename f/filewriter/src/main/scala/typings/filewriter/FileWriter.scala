package typings.filewriter

import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface expands on the FileSaver interface to allow for multiple write actions, rather than just saving a single Blob.
  */
@js.native
trait FileWriter extends FileSaver {
  
  /**
    * The length of the file. If the user does not have read access to the file, this must be the highest byte offset at which the user has written.
    */
  var length: Double = js.native
  
  /**
    * The byte offset at which the next write to the file will occur. This must be no greater than length.
    * A newly-created FileWriter must have position set to 0.
    */
  var position: Double = js.native
  
  /**
    * Seek sets the file position at which the next write will occur.
    * @param offset If nonnegative, an absolute byte offset into the file. If negative, an offset back from the end of the file.
    */
  def seek(offset: Double): Unit = js.native
  
  /**
    * Changes the length of the file to that specified. If shortening the file, data beyond the new length must be discarded. If extending the file, the existing data must be zero-padded up to the new length.
    * @param size The size to which the length of the file is to be adjusted, measured in bytes.
    */
  def truncate(size: Double): Unit = js.native
  
  /**
    * Write the supplied data to the file at position.
    * @param data The blob to write.
    */
  def write(data: Blob): Unit = js.native
}
