package typings.filepond.mod

import typings.filepond.anon.Index
import typings.filepond.anon.IndexNumber
import typings.filepond.anon.Output
import typings.std.Blob
import typings.std.Element
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof filepond.filepond.FilePondOptions ]: -? filepond.filepond.FilePondOptions[P]} */ @JSImport("filepond", "FilePond")
@js.native
class FilePond () extends StObject {
  
  /**
    * Adds an event listener to the given event.
    * @param event Name of the event, prefixed with `Filepond:`
    * @param fn Event handler
    */
  def addEventListener(event: FilePondEventPrefixed, fn: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  
  def addFile(source: String): js.Promise[FilePondFile] = js.native
  def addFile(source: String, options: Index with Partial[typings.filepond.anon.File]): js.Promise[FilePondFile] = js.native
  /**
    * Adds a file.
    * @param options.index The index that the file should be added at.
    */
  def addFile(source: ActualFileObject): js.Promise[FilePondFile] = js.native
  def addFile(source: ActualFileObject, options: Index with Partial[typings.filepond.anon.File]): js.Promise[FilePondFile] = js.native
  def addFile(source: Blob): js.Promise[FilePondFile] = js.native
  def addFile(source: Blob, options: Index with Partial[typings.filepond.anon.File]): js.Promise[FilePondFile] = js.native
  
  /**
    * Adds multiple files.
    * @param options.index The index that the files should be added at.
    */
  def addFiles(source: js.Array[ActualFileObject | Blob | String]): js.Promise[js.Array[FilePondFile]] = js.native
  def addFiles(source: js.Array[ActualFileObject | Blob | String], options: IndexNumber): js.Promise[js.Array[FilePondFile]] = js.native
  
  /** Appends FilePond to the given element.  */
  def appendTo(element: Element): Unit = js.native
  
  /**
    * Manually trigger the browse files panel.
    *
    * Only works if the call originates from the user.
    */
  def browse(): Unit = js.native
  
  /** Destroys this FilePond instance. */
  def destroy(): Unit = js.native
  
  /**
    * The root element of the Filepond instance.
    */
  val element: Element | Null = js.native
  
  /**
    * Returns a file. If no parameter is provided, returns the first file in the list.
    * @param query The file id, or index
    */
  def getFile(): FilePondFile = js.native
  def getFile(query: String): FilePondFile = js.native
  def getFile(query: Double): FilePondFile = js.native
  
  /** Returns all files. */
  def getFiles(): js.Array[FilePondFile] = js.native
  
  /** Inserts the FilePond instance after the supplied element. */
  def insertAfter(element: Element): Unit = js.native
  
  /** Inserts the FilePond instance before the supplied element. */
  def insertBefore(element: Element): Unit = js.native
  
  /** Returns true if the current instance is attached to the supplied element. */
  def isAttachedTo(element: Element): Unit = js.native
  
  def moveFile(query: String, index: Double): Unit = js.native
  def moveFile(query: Double, index: Double): Unit = js.native
  /**
    * Moves a file. Select file with query and supply target index.
    * @param query The file reference, id, or index.
    * @param index The index to move the file to.
    */
  def moveFile(query: FilePondFile, index: Double): Unit = js.native
  
  /**
    * Stop listening to an event.
    * @param event Name of the event
    * @param fn Event handler, signature is identical to the callback method
    */
  def off(event: FilePondEvent, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  /**
    * Listen to an event.
    * @param event Name of the event
    * @param fn Event handler, signature is identical to the callback method
    */
  def on(event: FilePondEvent, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  /**
    * Listen to an event once and remove the handler.
    * @param event Name of the event
    * @param fn Event handler, signature is identical to the callback method
    */
  def onOnce(event: FilePondEvent, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  
  /**
    * Starts preparing the file matching the given query, returns a Promise, the Promise is resolved with the file item and the output file { file, output }
    * @param query The file reference, id, or index
    */
  def prepareFile(): js.Promise[Output] = js.native
  def prepareFile(query: String): js.Promise[Output] = js.native
  def prepareFile(query: Double): js.Promise[Output] = js.native
  def prepareFile(query: FilePondFile): js.Promise[Output] = js.native
  
  /**
    * Processes multiple files. If no parameter is provided, processes all files.
    * @param query Array containing file reference(s), id(s), or index(es)
    */
  def prepareFiles(): js.Promise[js.Array[Output]] = js.native
  def prepareFiles(query: js.Array[Double | FilePondFile | String]): js.Promise[js.Array[Output]] = js.native
  
  /**
    * Processes a file. If no parameter is provided, processes the first file in the list.
    * @param query The file reference, id, or index
    */
  def processFile(): js.Promise[FilePondFile] = js.native
  def processFile(query: String): js.Promise[FilePondFile] = js.native
  def processFile(query: Double): js.Promise[FilePondFile] = js.native
  def processFile(query: FilePondFile): js.Promise[FilePondFile] = js.native
  
  /**
    * Processes multiple files. If no parameter is provided, processes all files.
    * @param query The file reference(s), id(s), or index(es)
    */
  def processFiles(): js.Promise[js.Array[FilePondFile]] = js.native
  def processFiles(query: js.Array[Double | FilePondFile | String]): js.Promise[js.Array[FilePondFile]] = js.native
  
  /**
    * Removes a file.
    * @param query The file reference, id, or index. If no query is provided, removes the first file in the list.
    * @param options Options for removal
    */
  def removeFile(): Unit = js.native
  /**
    * Removes the first file in the list.
    * @param options Options for removal
    */
  def removeFile(options: RemoveFileOptions): Unit = js.native
  def removeFile(query: js.UndefOr[scala.Nothing], options: RemoveFileOptions): Unit = js.native
  def removeFile(query: String): Unit = js.native
  def removeFile(query: String, options: RemoveFileOptions): Unit = js.native
  def removeFile(query: Double): Unit = js.native
  def removeFile(query: Double, options: RemoveFileOptions): Unit = js.native
  def removeFile(query: FilePondFile): Unit = js.native
  def removeFile(query: FilePondFile, options: RemoveFileOptions): Unit = js.native
  
  /**
    * Removes files matching the query.
    * @param query Array containing file references, ids, and/or indexes. If no array is provided, all files are removed
    * @param options Options for removal
    */
  def removeFiles(): Unit = js.native
  /**
    * Removes all files.
    * @param options Options for removal
    */
  def removeFiles(options: RemoveFileOptions): Unit = js.native
  def removeFiles(query: js.UndefOr[scala.Nothing], options: RemoveFileOptions): Unit = js.native
  def removeFiles(query: js.Array[FilePondFile | String | Double]): Unit = js.native
  def removeFiles(query: js.Array[FilePondFile | String | Double], options: RemoveFileOptions): Unit = js.native
  
  /** Replaces the supplied element with FilePond. */
  def replaceElement(element: Element): Unit = js.native
  
  /** If FilePond replaced the original element, this restores the original element to its original glory. */
  def restoreElement(element: Element): Unit = js.native
  
  /** Override multiple options at once. */
  def setOptions(options: FilePondOptions): Unit = js.native
  
  /**
    * Sort the items in the files list.
    * @param compare The comparison function
    */
  def sort(compare: js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double]): Unit = js.native
  
  /**
    * Returns the current status of the FilePond instance.
    * @default Status.EMPTY
    */
  val status: Status = js.native
}
