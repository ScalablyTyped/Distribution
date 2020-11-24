package typings.filepond.anon

import typings.filepond.filepondStrings.after
import typings.filepond.filepondStrings.before
import typings.filepond.filepondStrings.circle
import typings.filepond.filepondStrings.compact
import typings.filepond.filepondStrings.integrated
import typings.filepond.mod.ActualFileObject
import typings.filepond.mod.CaptureAttribute
import typings.filepond.mod.FilePondErrorDescription
import typings.filepond.mod.FilePondEvent
import typings.filepond.mod.FilePondEventPrefixed
import typings.filepond.mod.FilePondFile
import typings.filepond.mod.FilePondInitialFile
import typings.filepond.mod.FilePondOptions
import typings.filepond.mod.RemoveFileOptions
import typings.filepond.mod.Status
import typings.std.Blob
import typings.std.Element
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined filepond.filepond.FilePond */
@js.native
trait FilePond extends js.Object {
  
  /**
    * Adds an event listener to the given event.
    * @param event Name of the event, prefixed with `Filepond:`
    * @param fn Event handler
    */
  def addEventListener(event: FilePondEventPrefixed, fn: js.Function1[/* e */ js.Any, Unit]): Unit = js.native
  
  def addFile(source: String): js.Promise[FilePondFile] = js.native
  def addFile(source: String, options: Index with Partial[File]): js.Promise[FilePondFile] = js.native
  /**
    * Adds a file.
    * @param options.index The index that the file should be added at.
    */
  def addFile(source: ActualFileObject): js.Promise[FilePondFile] = js.native
  def addFile(source: ActualFileObject, options: Index with Partial[File]): js.Promise[FilePondFile] = js.native
  def addFile(source: Blob): js.Promise[FilePondFile] = js.native
  def addFile(source: Blob, options: Index with Partial[File]): js.Promise[FilePondFile] = js.native
  
  /**
    * Adds multiple files.
    * @param options.index The index that the files should be added at.
    */
  def addFiles(source: js.Array[ActualFileObject | Blob | String]): js.Promise[js.Array[FilePondFile]] = js.native
  def addFiles(source: js.Array[ActualFileObject | Blob | String], options: IndexNumber): js.Promise[js.Array[FilePondFile]] = js.native
  
  var allowBrowse: Boolean = js.native
  
  var allowDirectoriesOnly: Boolean = js.native
  
  var allowDrop: Boolean = js.native
  
  var allowMultiple: Boolean = js.native
  
  var allowPaste: Boolean = js.native
  
  var allowProcess: Boolean = js.native
  
  var allowReorder: Boolean = js.native
  
  var allowReplace: Boolean = js.native
  
  var allowRevert: Boolean = js.native
  
  var allowSyncAcceptAttribute: Boolean = js.native
  
  /** Appends FilePond to the given element.  */
  def appendTo(element: Element): Unit = js.native
  
  def beforeAddFile(item: FilePondFile): Boolean | js.Promise[Boolean] = js.native
  @JSName("beforeAddFile")
  var beforeAddFile_Original: js.Function1[/* item */ FilePondFile, Boolean | js.Promise[Boolean]] = js.native
  
  def beforeDropFile(file: String): Boolean = js.native
  def beforeDropFile(file: FilePondFile): Boolean = js.native
  @JSName("beforeDropFile")
  var beforeDropFile_Original: js.Function1[/* file */ FilePondFile | String, Boolean] = js.native
  
  def beforeRemoveFile(item: FilePondFile): Boolean | js.Promise[Boolean] = js.native
  @JSName("beforeRemoveFile")
  var beforeRemoveFile_Original: js.Function1[/* item */ FilePondFile, Boolean | js.Promise[Boolean]] = js.native
  
  /**
    * Manually trigger the browse files panel.
    *
    * Only works if the call originates from the user.
    */
  def browse(): Unit = js.native
  
  var captureMethod: CaptureAttribute = js.native
  
  var checkValidity: Boolean = js.native
  
  var chunkForce: Boolean = js.native
  
  var chunkRetryDelays: js.Array[Double] = js.native
  
  var chunkSize: Double = js.native
  
  var chunkUploads: Boolean = js.native
  
  var className: String = js.native
  
  /** Destroys this FilePond instance. */
  def destroy(): Unit = js.native
  
  var disabled: Boolean = js.native
  
  var dropOnElement: Boolean = js.native
  
  var dropOnPage: Boolean = js.native
  
  var dropValidation: Boolean = js.native
  
  /**
    * The root element of the Filepond instance.
    */
  val element: Element | Null = js.native
  
  var files: js.Array[FilePondInitialFile | ActualFileObject | Blob | String] = js.native
  
  var forceRevert: Boolean = js.native
  
  /**
    * Returns a file. If no parameter is provided, returns the first file in the list.
    * @param query The file id, or index
    */
  def getFile(): FilePondFile = js.native
  def getFile(query: String): FilePondFile = js.native
  def getFile(query: Double): FilePondFile = js.native
  
  /** Returns all files. */
  def getFiles(): js.Array[FilePondFile] = js.native
  
  var iconDone: String = js.native
  
  var iconProcess: String = js.native
  
  var iconRemove: String = js.native
  
  var iconRetry: String = js.native
  
  var iconUndo: String = js.native
  
  var id: String = js.native
  
  var ignoredFiles: js.Array[String] = js.native
  
  /** Inserts the FilePond instance after the supplied element. */
  def insertAfter(element: Element): Unit = js.native
  
  /** Inserts the FilePond instance before the supplied element. */
  def insertBefore(element: Element): Unit = js.native
  
  var instantUpload: Boolean = js.native
  
  /** Returns true if the current instance is attached to the supplied element. */
  def isAttachedTo(element: Element): Unit = js.native
  
  var itemInsertInterval: Double = js.native
  
  var itemInsertLocation: before | after | (js.Function2[/* a */ FilePondFile, /* b */ FilePondFile, Double]) = js.native
  
  var itemInsertLocationFreedom: Boolean = js.native
  
  var labelButtonAbortItemLoad: String = js.native
  
  var labelButtonAbortItemProcessing: String = js.native
  
  var labelButtonProcessItem: String = js.native
  
  var labelButtonRemoveItem: String = js.native
  
  var labelButtonRetryItemLoad: String = js.native
  
  var labelButtonRetryItemProcessing: String = js.native
  
  var labelButtonUndoItemProcessing: String = js.native
  
  var labelDecimalSeparator: String = js.native
  
  var labelFileAdded: String = js.native
  
  var labelFileCountPlural: String = js.native
  
  var labelFileCountSingular: String = js.native
  
  var labelFileLoadError: (js.Function1[/* error */ js.Any, String]) | String = js.native
  
  var labelFileLoading: String = js.native
  
  var labelFileProcessing: String = js.native
  
  var labelFileProcessingAborted: String = js.native
  
  var labelFileProcessingComplete: String = js.native
  
  var labelFileProcessingError: (js.Function1[/* error */ js.Any, String]) | String = js.native
  
  var labelFileProcessingRevertError: (js.Function1[/* error */ js.Any, String]) | String = js.native
  
  var labelFileRemoveError: (js.Function1[/* error */ js.Any, String]) | String = js.native
  
  var labelFileRemoved: String = js.native
  
  var labelFileSizeNotAvailable: String = js.native
  
  var labelFileWaitingForSize: String = js.native
  
  var labelIdle: String = js.native
  
  var labelInvalidField: String = js.native
  
  var labelTapToCancel: String = js.native
  
  var labelTapToRetry: String = js.native
  
  var labelTapToUndo: String = js.native
  
  var labelThousandsSeparator: String = js.native
  
  var maxFiles: Double = js.native
  
  var maxParallelUploads: Double = js.native
  
  def moveFile(query: String, index: Double): Unit = js.native
  def moveFile(query: Double, index: Double): Unit = js.native
  /**
    * Moves a file. Select file with query and supply target index.
    * @param query The file reference, id, or index.
    * @param index The index to move the file to.
    */
  def moveFile(query: FilePondFile, index: Double): Unit = js.native
  
  var name: String = js.native
  
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
  
  def onactivatefile(file: FilePondFile): Unit = js.native
  @JSName("onactivatefile")
  var onactivatefile_Original: js.Function1[/* file */ FilePondFile, Unit] = js.native
  
  def onaddfile(error: Null, file: FilePondFile): Unit = js.native
  def onaddfile(error: FilePondErrorDescription, file: FilePondFile): Unit = js.native
  @JSName("onaddfile")
  var onaddfile_Original: js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit] = js.native
  
  def onaddfileprogress(file: FilePondFile, progress: Double): Unit = js.native
  @JSName("onaddfileprogress")
  var onaddfileprogress_Original: js.Function2[/* file */ FilePondFile, /* progress */ Double, Unit] = js.native
  
  def onaddfilestart(file: FilePondFile): Unit = js.native
  @JSName("onaddfilestart")
  var onaddfilestart_Original: js.Function1[/* file */ FilePondFile, Unit] = js.native
  
  def onerror(error: FilePondErrorDescription): Unit = js.native
  def onerror(error: FilePondErrorDescription, file: js.UndefOr[scala.Nothing], status: js.Any): Unit = js.native
  def onerror(error: FilePondErrorDescription, file: FilePondFile): Unit = js.native
  def onerror(error: FilePondErrorDescription, file: FilePondFile, status: js.Any): Unit = js.native
  @JSName("onerror")
  var onerror_Original: js.Function3[
    /* error */ FilePondErrorDescription, 
    /* file */ js.UndefOr[FilePondFile], 
    /* status */ js.UndefOr[js.Any], 
    Unit
  ] = js.native
  
  def oninit(): Unit = js.native
  @JSName("oninit")
  var oninit_Original: js.Function0[Unit] = js.native
  
  def onpreparefile(file: FilePondFile, output: js.Any): Unit = js.native
  @JSName("onpreparefile")
  var onpreparefile_Original: js.Function2[/* file */ FilePondFile, /* output */ js.Any, Unit] = js.native
  
  def onprocessfile(error: Null, file: FilePondFile): Unit = js.native
  def onprocessfile(error: FilePondErrorDescription, file: FilePondFile): Unit = js.native
  @JSName("onprocessfile")
  var onprocessfile_Original: js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit] = js.native
  
  def onprocessfileabort(file: FilePondFile): Unit = js.native
  @JSName("onprocessfileabort")
  var onprocessfileabort_Original: js.Function1[/* file */ FilePondFile, Unit] = js.native
  
  def onprocessfileprogress(file: FilePondFile, progress: Double): Unit = js.native
  @JSName("onprocessfileprogress")
  var onprocessfileprogress_Original: js.Function2[/* file */ FilePondFile, /* progress */ Double, Unit] = js.native
  
  def onprocessfilerevert(file: FilePondFile): Unit = js.native
  @JSName("onprocessfilerevert")
  var onprocessfilerevert_Original: js.Function1[/* file */ FilePondFile, Unit] = js.native
  
  def onprocessfiles(): Unit = js.native
  @JSName("onprocessfiles")
  var onprocessfiles_Original: js.Function0[Unit] = js.native
  
  def onprocessfilestart(file: FilePondFile): Unit = js.native
  @JSName("onprocessfilestart")
  var onprocessfilestart_Original: js.Function1[/* file */ FilePondFile, Unit] = js.native
  
  def onremovefile(error: Null, file: FilePondFile): Unit = js.native
  def onremovefile(error: FilePondErrorDescription, file: FilePondFile): Unit = js.native
  @JSName("onremovefile")
  var onremovefile_Original: js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit] = js.native
  
  def onreorderfiles(files: js.Array[FilePondFile]): Unit = js.native
  @JSName("onreorderfiles")
  var onreorderfiles_Original: js.Function1[/* files */ js.Array[FilePondFile], Unit] = js.native
  
  def onupdatefiles(files: js.Array[FilePondFile]): Unit = js.native
  @JSName("onupdatefiles")
  var onupdatefiles_Original: js.Function1[/* files */ js.Array[FilePondFile], Unit] = js.native
  
  def onwarning(error: js.Any): Unit = js.native
  def onwarning(error: js.Any, file: js.UndefOr[scala.Nothing], status: js.Any): Unit = js.native
  def onwarning(error: js.Any, file: FilePondFile): Unit = js.native
  def onwarning(error: js.Any, file: FilePondFile, status: js.Any): Unit = js.native
  @JSName("onwarning")
  var onwarning_Original: js.Function3[
    /* error */ js.Any, 
    /* file */ js.UndefOr[FilePondFile], 
    /* status */ js.UndefOr[js.Any], 
    Unit
  ] = js.native
  
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
  
  var required: Boolean = js.native
  
  /** If FilePond replaced the original element, this restores the original element to its original glory. */
  def restoreElement(element: Element): Unit = js.native
  
  var server: String | Fetch = js.native
  
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
  
  var styleButtonProcessItemPosition: String = js.native
  
  var styleButtonRemoveItemAlign: Boolean = js.native
  
  var styleButtonRemoveItemPosition: String = js.native
  
  var styleItemPanelAspectRatio: String = js.native
  
  var styleLoadIndicatorPosition: String = js.native
  
  var stylePanelAspectRatio: String = js.native
  
  var stylePanelLayout: integrated | compact | circle = js.native
  
  var styleProgressIndicatorPosition: String = js.native
}
