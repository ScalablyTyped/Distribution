package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fine-uploader/lib/core", "FineUploaderBasic")
@js.native
class FineUploaderBasic () extends js.Object {
  /**
           * The FineUploader Core only constructor
           */
  def this(fineuploaderOptions: CoreOptions) = this()
  /**
           * FineUploader's Promise implementation
           */
  def Promise(): scala.Unit = js.native
  /**
           * Add a class to this element.
           *
           * @param string className : The name of the class to add to the element
           */
  def addClass(className: java.lang.String): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(files: BlobWrapper): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(files: BlobWrapper, params: js.Any): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(files: BlobWrapper, params: js.Any, endpoint: java.lang.String): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(files: CanvasWrapper): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(files: CanvasWrapper, params: js.Any): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(files: CanvasWrapper, params: js.Any, endpoint: java.lang.String): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(files: js.Array[stdLib.Blob | stdLib.File | stdLib.HTMLCanvasElement | stdLib.HTMLInputElement]): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(
    files: js.Array[stdLib.Blob | stdLib.File | stdLib.HTMLCanvasElement | stdLib.HTMLInputElement],
    params: js.Any
  ): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(
    files: js.Array[stdLib.Blob | stdLib.File | stdLib.HTMLCanvasElement | stdLib.HTMLInputElement],
    params: js.Any,
    endpoint: java.lang.String
  ): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(files: stdLib.FileList): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(files: stdLib.FileList, params: js.Any): scala.Unit = js.native
  /**
           * Submit one or more files to the uploader
           *
           * @param any[] files : An array of `File`s, `<input>`s, `Blob`s, `BlobWrapper` objects, `<canvas>`es, or `CanvasWrapper` objects. You may also pass in a `FileList`.
           * @param any params : A set of parameters to send with the file to be added
           * @param string endpoint : The endpoint to send this file to
           */
  def addFiles(files: stdLib.FileList, params: js.Any, endpoint: java.lang.String): scala.Unit = js.native
  /**
           * Submit one or more canned/initial files to the uploader
           *
           * @param any[] initialFiles : An array of objects that describe files already on the server
           */
  def addInitialFiles(initialFiles: js.Array[_]): scala.Unit = js.native
  /**
           * Attach an event handler to this element for a specific DOM event.
           *
           * @param string event : A valid `DOM Event`
           * @param function handler : A function that will be invoked whenever the respective event occurs
           * @returns function : Call this function to detach the event
           */
  def attach(event: java.lang.String, handler: js.Function0[_ | scala.Unit]): js.Function0[_ | scala.Unit] = js.native
  /**
           * Shim for `Function.prototype.bind`
           *
           * Creates a new function that, when called, has its `this` keyword set to the provided context.
           * Pass comma-separated values after the `context` parameter for all arguments to be passed into the new function (when invoked).
           * You can still pass in additional arguments during invocation.
           *
           * @param function oldFunc : The function that will be bound to
           * @param Object context : The context the function will assume
           * @returns function : A new function, same as the old one, but bound to the passed in `context`
           */
  def bind(oldFunc: js.Function0[_ | scala.Unit], context: js.Any): js.Function0[_] = js.native
  /**
           * Cancel the queued or currently uploading item which corresponds to the id
           *
           * @param number id : The file's id
           */
  def cancel(id: scala.Double): scala.Unit = js.native
  /**
           * Cancels all queued or currently uploading items
           */
  def cancelAll(): scala.Unit = js.native
  /* ====================================== UTILITY METHODS ======================================= */
  
  
  /**
           * Returns an array of all immediate children of this element.
           *
           * @param HTMLElement element : An HTMLElement or an already wrapped qq object
           * @returns HTMLElement[] : An array of HTMLElements who are children of the `element` parameter
           */
  def children(element: stdLib.HTMLElement): js.Array[stdLib.HTMLElement] = js.native
  /**
           * Clears the internal list of stored items. Only applies when autoUpload is false
           */
  def clearStoredFiles(): scala.Unit = js.native
  /**
           * Clears all text for this element
           */
  def clearText(): scala.Unit = js.native
  /**
           * Returns true if the element contains the passed element.
           *
           * @param HTMLElement element : An HTMLElement or an already wrapped qq object
           * @returns boolean : The result of the contains test
           */
  def contains(element: stdLib.HTMLElement): scala.Boolean = js.native
  /**
           * Attempts to continue a paused upload
           *
           * @param number id : A file id
           * @returns boolean : `true` if attempt was successful.
           */
  def continueUpload(id: scala.Double): scala.Boolean = js.native
  /**
           * Add CSS style(s) to this element.
           *
           * @param Object styles : An object with styles to apply to this element
           * @returns Object : Returns the current context to allow method chaining
           */
  def css(styles: js.Any): this.type = js.native
  /**
           * Send a delete request to the server for the corresponding file id
           *
           * @param number id : The file's id
           */
  def deleteFile(id: scala.Double): scala.Unit = js.native
  /**
           * Detach an already attached event handler from this element for a specific DOM event
           *
           * @param string event : A valid `DOM Event`
           * @param function originalHandler : A function that will be detached from this event
           * @returns Object : Call this function to detach the event
           */
  def detach(event: java.lang.String, originalHandler: js.Function0[_ | scala.Unit]): this.type = js.native
  /**
           * Draws a thumbnail
           *
           * @param number id : The id of the image file
           * @param HTMLElement targetContainer : The element where the image preview will be drawn. Must be either an <img> or <canvas> element
           * @param number maxSize : The maximum dimensions (for width and height) you will allow this image to scale to
           * @param boolean fromServer : true if the image data will come as a response from the server rather than be generated client-side
           * @param CustomResizerCallBack customResizer : Ignored if the current browser does not support image previews.
           *                                              If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a `Promise`.
           *                                              Once the resize is complete, your promise must be fulfilled.
           *                                              You may, of course, reject your returned `Promise` is the resize fails in some way.
           * @returns Promise: Fulfilled by passing the container back into the success callback after the thumbnail has been rendered.
           *                   If the thumbnail cannot be rendered, failure callbacks will be invoked instead, passing an object with `container` and `error` properties.
           */
  def drawThumbnail(id: scala.Double, targetContainer: stdLib.HTMLElement): PromiseOptions = js.native
  /**
           * Draws a thumbnail
           *
           * @param number id : The id of the image file
           * @param HTMLElement targetContainer : The element where the image preview will be drawn. Must be either an <img> or <canvas> element
           * @param number maxSize : The maximum dimensions (for width and height) you will allow this image to scale to
           * @param boolean fromServer : true if the image data will come as a response from the server rather than be generated client-side
           * @param CustomResizerCallBack customResizer : Ignored if the current browser does not support image previews.
           *                                              If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a `Promise`.
           *                                              Once the resize is complete, your promise must be fulfilled.
           *                                              You may, of course, reject your returned `Promise` is the resize fails in some way.
           * @returns Promise: Fulfilled by passing the container back into the success callback after the thumbnail has been rendered.
           *                   If the thumbnail cannot be rendered, failure callbacks will be invoked instead, passing an object with `container` and `error` properties.
           */
  def drawThumbnail(id: scala.Double, targetContainer: stdLib.HTMLElement, maxSize: scala.Double): PromiseOptions = js.native
  /**
           * Draws a thumbnail
           *
           * @param number id : The id of the image file
           * @param HTMLElement targetContainer : The element where the image preview will be drawn. Must be either an <img> or <canvas> element
           * @param number maxSize : The maximum dimensions (for width and height) you will allow this image to scale to
           * @param boolean fromServer : true if the image data will come as a response from the server rather than be generated client-side
           * @param CustomResizerCallBack customResizer : Ignored if the current browser does not support image previews.
           *                                              If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a `Promise`.
           *                                              Once the resize is complete, your promise must be fulfilled.
           *                                              You may, of course, reject your returned `Promise` is the resize fails in some way.
           * @returns Promise: Fulfilled by passing the container back into the success callback after the thumbnail has been rendered.
           *                   If the thumbnail cannot be rendered, failure callbacks will be invoked instead, passing an object with `container` and `error` properties.
           */
  def drawThumbnail(
    id: scala.Double,
    targetContainer: stdLib.HTMLElement,
    maxSize: scala.Double,
    fromServer: scala.Boolean
  ): PromiseOptions = js.native
  /**
           * Draws a thumbnail
           *
           * @param number id : The id of the image file
           * @param HTMLElement targetContainer : The element where the image preview will be drawn. Must be either an <img> or <canvas> element
           * @param number maxSize : The maximum dimensions (for width and height) you will allow this image to scale to
           * @param boolean fromServer : true if the image data will come as a response from the server rather than be generated client-side
           * @param CustomResizerCallBack customResizer : Ignored if the current browser does not support image previews.
           *                                              If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a `Promise`.
           *                                              Once the resize is complete, your promise must be fulfilled.
           *                                              You may, of course, reject your returned `Promise` is the resize fails in some way.
           * @returns Promise: Fulfilled by passing the container back into the success callback after the thumbnail has been rendered.
           *                   If the thumbnail cannot be rendered, failure callbacks will be invoked instead, passing an object with `container` and `error` properties.
           */
  def drawThumbnail(
    id: scala.Double,
    targetContainer: stdLib.HTMLElement,
    maxSize: scala.Double,
    fromServer: scala.Boolean,
    customResizer: CustomResizerCallBack
  ): PromiseOptions = js.native
  /**
           * Iterates through a collection, passing the key and value into the provided callback. `return false;` to stop iteration.
           *
           * @param Array or Object :
           * @param function callback : A function that will be called for each item returned by looping through the iterable. This function takes an index and an item.
           */
  def each(
    iterable: js.Any,
    callback: js.Function2[/* index */ scala.Double, /* item */ js.Any, _ | scala.Unit]
  ): js.Function0[_ | scala.Unit] = js.native
  /**
           * Iterates through a collection, passing the key and value into the provided callback. `return false;` to stop iteration.
           *
           * @param Array or Object :
           * @param function callback : A function that will be called for each item returned by looping through the iterable. This function takes an index and an item.
           */
  def each(
    iterable: js.Array[_],
    callback: js.Function2[/* index */ scala.Double, /* item */ js.Any, _ | scala.Unit]
  ): js.Function0[_ | scala.Unit] = js.native
  /**
           * Shallowly copies the parameters of secondobj to firstobj. if extendnested is true then a deep-copy is performed.
           *
           * @param Object firstObj : The object to copy parameters to
           * @param Object secondObj : The object to copy parameters from
           * @param boolean extendNested : If `true` then a deep-copy is performed, else a shallow copy
           * @returns Object : The new object created by the extension
           */
  def extend(firstObj: js.Any, secondObj: js.Any): js.Any = js.native
  /**
           * Shallowly copies the parameters of secondobj to firstobj. if extendnested is true then a deep-copy is performed.
           *
           * @param Object firstObj : The object to copy parameters to
           * @param Object secondObj : The object to copy parameters from
           * @param boolean extendNested : If `true` then a deep-copy is performed, else a shallow copy
           * @returns Object : The new object created by the extension
           */
  def extend(firstObj: js.Any, secondObj: js.Any, extendNested: scala.Boolean): js.Any = js.native
  /**
           * Returns a string, swapping argument values with the associated occurrence of `{}` in the passed string
           *
           * @param string message : the string to be formatted
           * @returns string : the formatted string
           */
  def format(message: java.lang.String): java.lang.String = js.native
  /**
           * Returns the button container element associated with a file
           *
           * @param number id : The file id
           * @returns HTMLElement : The button container element associated with a file, or `undefined` if the file was not submitted via a Fine Uploader controlled upload button.
           */
  def getButton(id: scala.Double): stdLib.HTMLElement = js.native
  /**
           * Returns an array of all descendants of this element that contain a specific class name.
           *
           * @param string className : The name of the class to look for in each element
           * @returns HTMLElement[] : An array of `HTMLElements
           */
  def getByClass(className: java.lang.String): js.Array[stdLib.HTMLElement] = js.native
  /**
           * Returns the endpoint associated with a particular file, or the current catch-all endpoint for all files (if no ID is specified).
           *
           * @param number id : The ID of the associated file
           * @return string | string[] : endpoint associated with a particular file, or the current catch-all endpoint for all files (if no ID is specified).
           */
  def getEndpoint(): java.lang.String | js.Array[java.lang.String] = js.native
  /**
           * Returns the endpoint associated with a particular file, or the current catch-all endpoint for all files (if no ID is specified).
           *
           * @param number id : The ID of the associated file
           * @return string | string[] : endpoint associated with a particular file, or the current catch-all endpoint for all files (if no ID is specified).
           */
  def getEndpoint(id: scala.Double): java.lang.String | js.Array[java.lang.String] = js.native
  /**
           * Return the extension for the filename, if any
           *
           * @param string filename : The file's name to rip the extension off of
           * @returns string : The extension name
           */
  def getExtension(filename: java.lang.String): java.lang.String = js.native
  /**
           * Returns the file identified by the id. File API browsers only
           *
           * @param number id : The file id
           * @returns File | Blob : A `File` or `Blob` object
           */
  def getFile(id: scala.Double): stdLib.File | stdLib.Blob = js.native
  /**
           * Returns the number of items that are either currently uploading or waiting for an available connection (`qq.status.QUEUED`).
           *
           * If called inside of a cancel event handler, then this method will return a value that includes the upload associated with the cancel event handler.
           * This is because the upload will not be canceled until the event handler returns.
           *
           * @returns number : The number of items that are currently uploading or queued
           */
  def getInProgress(): scala.Double = js.native
  /**
           * Returns the name of the file with the associated id
           *
           * @param number id : The file id
           * @returns string : Returns the name of the file identified by the id.
           */
  def getName(id: scala.Double): java.lang.String = js.native
  /**
           * Get the number of items that have been successfully uploaded and have not been deleted
           *
           * @returns number : The number of items that have been successfully uploaded and not deleted
           */
  def getNetUploads(): scala.Double = js.native
  /**
           * Get the ID of the parent file for this scaled file
           *
           * @param number scaledFileId : The ID of a scaled image file
           * @returns number : Returns the ID of the scaled image's parent file. `null` if this is not a scaled image or a parent cannot be located
           */
  def getParentId(scaledFileId: scala.Double): scala.Double = js.native
  /**
           * Returns the number of remaining allowed items that may be submitted for upload based on `validation.itemLimit`.
           */
  def getRemainingAllowedItems(): scala.Double = js.native
  /**
           * Returns an array of potentially resumable items
           *
           * @returns ResumableFileObject[] : An array of resumable items
           */
  def getResumableFilesData(): js.Array[ResumableFileObject] | ResumableFileObject = js.native
  /**
           * Returns the size of the item with the associated id
           *
           * @param number id : The file id
           * @returns number : The size of the file with the corresponding id
           */
  def getSize(id: scala.Double): scala.Double = js.native
  /**
           * Returns a version4 uuid
           *
           * @returns string : A version 4 unique identifier
           */
  def getUniqueId(): java.lang.String = js.native
  /**
           * Return information about all the items that have been submitted to the uploader
           *
           * @param UploadFilter filter : An object which indicates which keys and values must be present in an upload to be returned
           * @return FoundUploadItems | FoundUploadItems [] : A list of items or a single item that has been filtered/found.
           *                                                  This returns an array only when there is a potential for the operation to return more than one file in the result set.
           *                                                  This excludes queries for a specific, single ID or UUID. All other queries will return an array
           */
  def getUploads(): FoundUploadItems | js.Array[FoundUploadItems] = js.native
  /**
           * Return information about all the items that have been submitted to the uploader
           *
           * @param UploadFilter filter : An object which indicates which keys and values must be present in an upload to be returned
           * @return FoundUploadItems | FoundUploadItems [] : A list of items or a single item that has been filtered/found.
           *                                                  This returns an array only when there is a potential for the operation to return more than one file in the result set.
           *                                                  This excludes queries for a specific, single ID or UUID. All other queries will return an array
           */
  def getUploads(filter: UploadFilter): FoundUploadItems | js.Array[FoundUploadItems] = js.native
  /**
           * Returns the UUID of the item with the associated id
           *
           * @param number id : The file id
           * @returns string : A level 4 UUID which identifies the corresponding file
           */
  def getUuid(id: scala.Double): java.lang.String = js.native
  /**
           * Returns `true` if the attribute exists on the element and the value of the attribute is not 'false' case-insensitive.
           *
           * @param string attributeName : An attribute to test for
           * @returns boolean : The result of the `hasAttribute` test
           */
  def hasAttribute(attributeName: java.lang.String): scala.Boolean = js.native
  /**
           * Returns `true` if the element has the class name
           *
           * @param string className : The name of the class to look for in each element
           * @returns boolean : Result of the `hasClass` test
           */
  def hasClass(className: java.lang.String): scala.Boolean = js.native
  /**
           * Hide this element.
           *
           * @returns Object : Returns the current context to allow method chaining
           */
  def hide(): this.type = js.native
  /**
           * Returns the index of `item` in the `Array` starting the search from `startingindex`
           *
           * @param any[] array : the array to search in
           * @param Object item : the item to search for
           * @param number startingIndex : the index to search from
           * @returns number : The index of `item` in the array
           */
  def indexOf(array: js.Array[_], item: js.Any): scala.Double = js.native
  /**
           * Returns the index of `item` in the `Array` starting the search from `startingindex`
           *
           * @param any[] array : the array to search in
           * @param Object item : the item to search for
           * @param number startingIndex : the index to search from
           * @returns number : The index of `item` in the array
           */
  def indexOf(array: js.Array[_], item: js.Any, startingIndex: scala.Double): scala.Double = js.native
  /**
           * Inserts the element directly before the passed element in the DOM.
           *
           * @param HTMLElement element : the `element` before which an element has to be inserted
           */
  def insertBefore(element: stdLib.HTMLElement): scala.Unit = js.native
  /**
           * Check if the parameter is function
           *
           * @param Object func : The object to test
           * @returns boolean : Whether the parameter is a function or not
           */
  def isFunction(func: js.Any): scala.Boolean = js.native
  /**
           * Check if the parameter is object
           *
           * @param Object obj : The thing to test
           * @returns boolean : Whether the parameter is a object or not
           */
  def isObject(obj: js.Any): scala.Boolean = js.native
  /**
           * Returns true if the file can be auto-resumed, false otherwise.
           *
           * @param number id : The file id
           * @returns boolean : True if the file can be resumed and has a resume record, false otherwise
           */
  def isResumable(id: scala.Double): scala.Boolean = js.native
  /**
           * Check if the parameter is string
           *
           * @param Object str : The object to test
           * @returns boolean : Whether the parameter is a string or not
           */
  def isString(str: js.Any): scala.Boolean = js.native
  /**
           * Output a message to the console, if possible
           *
           * @param string message : The message to print
           * @param string level : The level to output the message at
           */
  def log(message: java.lang.String): scala.Unit = js.native
  /**
           * Output a message to the console, if possible
           *
           * @param string message : The message to print
           * @param string level : The level to output the message at
           */
  def log(message: java.lang.String, level: java.lang.String): scala.Unit = js.native
  /**
           * Attempts to pause an in-progress upload
           *
           * @param number id : The file id
           * @returns boolean : `true` if the attempt was successful. `false` otherwise
           */
  def pauseUpload(id: scala.Double): scala.Boolean = js.native
  /**
           * Prevent the browser's default action on an event
           *
           * @param string event : The name of the default event to prevent
           */
  def preventDefault(event: java.lang.String): scala.Unit = js.native
  /**
           * Removes the element from the DOM.
           */
  def remove(): scala.Unit = js.native
  /**
           * Remove the provided class from the element.
           *
           * @param string className : The name of the class to look for in each element
           * @returns Object : Returns the current context to allow method chaining
           */
  def removeClass(className: java.lang.String): this.type = js.native
  /**
           * Remove internal reference to the associated Blob/File object.
           *
           * For Blobs that are created via JavaScript in the browser, this will free up all consumed memory.
           */
  def removeFileRef(id: scala.Double): scala.Unit = js.native
  /**
           * Reset Fine Uploader
           */
  def reset(): scala.Unit = js.native
  /**
           * Attempt to upload a specific item again
           *
           * @param number id : The file id
           */
  def retry(id: scala.Double): scala.Unit = js.native
  /**
           * Generates a scaled version of a submitted image file
           *
           * @param number id : The id of the image file
           * @param ScaleImageOptions option : Information about the scaled image to generate
           * @returns PromiseOptions : Fulfilled by passing the scaled image as a `Blob` back into the success callback after the original image has been scaled.
           *                         If the scaled image cannot be generated, the failure callback will be invoked instead
           */
  def scaleImage(id: scala.Double, options: ScaleImageOptions): PromiseOptions = js.native
  /**
           * Set custom headers for an upload request. Pass in a file id to make the headers specific to that file
           *
           * @param any customHeaders : The custom headers to include in the upload request. Fine Uploader may also send some other required headers
           * @param number id : The file id
           */
  def setCustomHeaders(customHeaders: js.Any): scala.Unit = js.native
  /**
           * Set custom headers for an upload request. Pass in a file id to make the headers specific to that file
           *
           * @param any customHeaders : The custom headers to include in the upload request. Fine Uploader may also send some other required headers
           * @param number id : The file id
           */
  def setCustomHeaders(customHeaders: js.Any, id: scala.Double): scala.Unit = js.native
  /**
           * Set custom resume data for a potentially resumable file.
           * This data will be stored with the file's resume record and will be accessible in the `onResume` event handler and via the `getResumableFilesData` API method.
           *
           * @param number id : The file id
           * @param Object customResumeData : The custom resume data to store with the file's resume record
           */
  def setCustomResumeData(id: scala.Double, customResumeData: js.Object): scala.Unit = js.native
  /**
           * Set custom headers for a delete file request. Pass in a file id to make the headers specific to that file
           *
           * @param any customHeaders : The custom headers to include in the upload request. Fine Uploader may also send some other required headers
           * @param number id : The file id
           */
  def setDeleteFileCustomHeaders(customHeaders: js.Any): scala.Unit = js.native
  /**
           * Set custom headers for a delete file request. Pass in a file id to make the headers specific to that file
           *
           * @param any customHeaders : The custom headers to include in the upload request. Fine Uploader may also send some other required headers
           * @param number id : The file id
           */
  def setDeleteFileCustomHeaders(customHeaders: js.Any, id: scala.Double): scala.Unit = js.native
  /**
           * Modify the location where delete requests should be directed. Pass in a file id to change the endpoint for that specific item
           *
           * @param string path : A valid URI where delete requests will be sent
           * @param number | HTMLElement identifier : An integer or HTMLElement corresponding to a file
           */
  def setDeleteFileEndpoint(path: java.lang.String): scala.Unit = js.native
  /**
           * Modify the location where delete requests should be directed. Pass in a file id to change the endpoint for that specific item
           *
           * @param string path : A valid URI where delete requests will be sent
           * @param number | HTMLElement identifier : An integer or HTMLElement corresponding to a file
           */
  def setDeleteFileEndpoint(path: java.lang.String, identifier: scala.Double): scala.Unit = js.native
  /**
           * Modify the location where delete requests should be directed. Pass in a file id to change the endpoint for that specific item
           *
           * @param string path : A valid URI where delete requests will be sent
           * @param number | HTMLElement identifier : An integer or HTMLElement corresponding to a file
           */
  def setDeleteFileEndpoint(path: java.lang.String, identifier: stdLib.HTMLElement): scala.Unit = js.native
  /**
           * Set the parameters for a delete request. Pass in a file id to make the parameters specific to that file
           *
           * @param any params : The parameters to include in the delete request
           * @param number id : The file id
           */
  def setDeleteFileParams(params: js.Any): scala.Unit = js.native
  /**
           * Set the parameters for a delete request. Pass in a file id to make the parameters specific to that file
           *
           * @param any params : The parameters to include in the delete request
           * @param number id : The file id
           */
  def setDeleteFileParams(params: js.Any, id: scala.Double): scala.Unit = js.native
  /**
           * Modify the location where upload requests should be directed. Pass in a file id to change the endpoint for that specific item
           *
           * @param string path : A valid URI where upload requests will be sent
           * @param number | HTMLElement identifier : An integer or HTMLElement corresponding to a file
           */
  def setEndpoint(path: java.lang.String): scala.Unit = js.native
  /**
           * Modify the location where upload requests should be directed. Pass in a file id to change the endpoint for that specific item
           *
           * @param string path : A valid URI where upload requests will be sent
           * @param number | HTMLElement identifier : An integer or HTMLElement corresponding to a file
           */
  def setEndpoint(path: java.lang.String, identifier: scala.Double): scala.Unit = js.native
  /**
           * Modify the location where upload requests should be directed. Pass in a file id to change the endpoint for that specific item
           *
           * @param string path : A valid URI where upload requests will be sent
           * @param number | HTMLElement identifier : An integer or HTMLElement corresponding to a file
           */
  def setEndpoint(path: java.lang.String, identifier: stdLib.HTMLElement): scala.Unit = js.native
  /**
           * Bind a `<form>` to Fine Uploader dynamically
           *
           * @param HTMLFormElement | string formElementOrId : A form element or a form element's ID
           */
  def setForm(formElementOrId: java.lang.String): scala.Unit = js.native
  /**
           * Bind a `<form>` to Fine Uploader dynamically
           *
           * @param HTMLFormElement | string formElementOrId : A form element or a form element's ID
           */
  def setForm(formElementOrId: stdLib.HTMLFormElement): scala.Unit = js.native
  /**
           * Change the `validation.itemLimit` option set during construction/initialization
           *
           * @param number newItemLimit : The new file count limit
           */
  def setItemLimit(newItemLimit: scala.Double): scala.Unit = js.native
  /**
           * Change the name of a file
           *
           * @param number id: The file id
           * @param string name : The new file name
           */
  def setName(id: scala.Double, name: java.lang.String): scala.Unit = js.native
  /**
           * Set the parameters for an upload request. Pass in a file id to make the parameters specific to that file
           *
           * @param any params : The parameters to include in the upload request
           * @param number id : The file id
           */
  def setParams(params: js.Any): scala.Unit = js.native
  /**
           * Set the parameters for an upload request. Pass in a file id to make the parameters specific to that file
           *
           * @param any params : The parameters to include in the upload request
           * @param number id : The file id
           */
  def setParams(params: js.Any, id: scala.Double): scala.Unit = js.native
  /**
           * Modify the status of an file.
           * The status values correspond to those found in the qq.status object.
           * Currently, the following status values may be set via this method:
           * - qq.status.DELETED
           * - qq.status.DELETE_FAILED
           *
           * @param number id : The file id
           * @param string newStatus : The new qq.status value.
           */
  def setStatus(id: scala.Double, newStatus: java.lang.String): scala.Unit = js.native
  /**
           * Sets the inner text for this element.
           *
           * @param string text : The text to set
           */
  def setText(text: java.lang.String): scala.Unit = js.native
  /**
           * Change the UUID of a file
           *
           * @param number id : The file id
           * @param string uuid : The new file UUID
           */
  def setUuid(id: scala.Double, uuid: java.lang.String): scala.Unit = js.native
  /**
           * Creates and returns a new <div> element
           *
           * @param string str : Valid HTML that can be parsed by a browser.
           * @returns HTMLElement : An newly created `HTMLElement` from the input
           */
  def toElement(str: java.lang.String): stdLib.HTMLElement = js.native
  /**
           * Removes whitespace from the ends of a string. Shim for `String.prototype.trim`
           *
           * @param string str : The string to remove whitespace from
           * @returns string : The new string sans whitespace
           */
  def trimstr(str: java.lang.String): java.lang.String = js.native
  /**
           * Begin uploading all queued items. Throws a `NoFilesError` if there are no items to upload
           */
  def uploadStoredFiles(): scala.Unit = js.native
}

