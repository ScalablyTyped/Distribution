package typings.filesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface represents a file on a file system.
  */
@js.native
trait FileEntry
  extends StObject
     with FileSystemEntry {
  
  /**
    * Creates a new FileWriter associated with the file that this FileEntry represents.
    * @param successCallback A callback that is called with the new FileWriter.
    * @param errorCallback A callback that is called when errors happen.
    */
  def createWriter(successCallback: FileWriterCallback): Unit = js.native
  def createWriter(successCallback: FileWriterCallback, errorCallback: ErrorCallback): Unit = js.native
  
  /**
    * Returns a File that represents the current state of the file that this FileEntry represents.
    * @param successCallback A callback that is called with the File.
    * @param errorCallback A callback that is called when errors happen.
    */
  def file(successCallback: FileCallback): Unit = js.native
  def file(successCallback: FileCallback, errorCallback: ErrorCallback): Unit = js.native
}
