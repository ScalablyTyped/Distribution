package typings.filepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("filepond", "FilePondFile")
@js.native
class FilePondFile () extends js.Object {
  
  /** Aborts loading of this file */
  def abortLoad(): Unit = js.native
  
  /** Aborts processing of this file */
  def abortProcessing(): Unit = js.native
  
  /** Returns the File object. */
  var file: ActualFileObject = js.native
  
  /** Returns the file extensions. */
  var fileExtension: String = js.native
  
  /** Returns the size of the file. */
  var fileSize: Double = js.native
  
  /** Returns the type of the file. */
  var fileType: String = js.native
  
  /** Returns the full name of the file. */
  var filename: String = js.native
  
  /** Returns the name of the file without extension. */
  var filenameWithoutExtension: String = js.native
  
  /**
    * Retrieve metadata saved to the file, pass a key to retrieve
    * a specific part of the metadata (e.g. 'crop' or 'resize').
    * If no key is passed, the entire metadata object is returned.
    */
  def getMetadata(): js.Any = js.native
  def getMetadata(key: String): js.Any = js.native
  
  /** Returns the ID of the file. */
  var id: String = js.native
  
  /** Returns the origin of the file. */
  var origin: FileOrigin = js.native
  
  /** Returns the server id of the file. */
  var serverId: String = js.native
  
  /** Add additional metadata to the file */
  def setMetadata(key: String, value: js.Any): Unit = js.native
  
  /** Returns the source of the file. */
  var source: ActualFileObject | String = js.native
  
  /** Returns the current status of the file. */
  var status: FileStatus = js.native
}
