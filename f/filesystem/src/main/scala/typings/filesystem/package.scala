package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object filesystem {
  
  /**
    * This interface is the callback used to look up DirectoryEntry objects.
    */
  type DirectoryEntryCallback = js.Function1[/* entry */ typings.filesystem.DirectoryEntry, scala.Unit]
  
  /**
    * When readEntries() succeeds, the following callback is made.
    */
  type EntriesCallback = js.Function1[/* entries */ js.Array[typings.filesystem.Entry], scala.Unit]
  
  /**
    * This interface is the callback used to look up Entry objects.
    */
  type EntryCallback = js.Function1[/* entry */ typings.filesystem.Entry, scala.Unit]
  
  /**
    * When an error occurs, the following callback is made.
    */
  type ErrorCallback = js.Function1[/* err */ typings.std.DOMError, scala.Unit]
  
  /**
    * This interface is the callback used to obtain a File.
    */
  type FileCallback = js.Function1[/* file */ typings.std.File, scala.Unit]
  
  /**
    * This interface is the callback used to look up FileEntry objects.
    */
  type FileEntryCallback = js.Function1[/* entry */ typings.filesystem.FileEntry, scala.Unit]
  
  /**
    * When requestFileSystem() succeeds, the following callback is made.
    */
  type FileSystemCallback = js.Function1[/* filesystem */ typings.filesystem.FileSystem, scala.Unit]
  
  /**
    * This interface is the callback used to create a FileWriter.
    */
  type FileWriterCallback = js.Function1[/* fileWriter */ typings.filewriter.FileWriter, scala.Unit]
  
  /**
    * This interface is the callback used to look up file and directory metadata.
    */
  type MetadataCallback = js.Function1[/* metadata */ typings.filesystem.Metadata, scala.Unit]
  
  /**
    * This interface is the generic callback used to indicate success of an asynchronous method.
    */
  type VoidCallback = js.Function0[scala.Unit]
}
