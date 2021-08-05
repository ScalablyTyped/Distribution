package typings.fileType

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.ReadableStream
import typings.std.Set
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("file-type/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	Supported file extensions.
  	*/
  @JSImport("file-type/browser", "extensions")
  @js.native
  val extensions: Set[typings.fileType.coreMod.FileExtension] = js.native
  
  inline def fromBlob(blob: Blob): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBlob")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  
  /**
  	Detect the file type of a `Buffer`, `Uint8Array`, or `ArrayBuffer`.
  	The file type is detected by checking the [magic number](https://en.wikipedia.org/wiki/Magic_number_(programming)#Magic_numbers_in_files) of the buffer.
  	If file access is available, it is recommended to use `.fromFile()` instead.
  	@param buffer - A buffer representing file data. It works best if the buffer contains the entire file, it may work with a smaller portion as well.
  	@returns The detected file type and MIME type, or `undefined` when there is no match.
  	*/
  inline def fromBuffer(buffer: Buffer): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  inline def fromBuffer(buffer: ArrayBuffer): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  inline def fromBuffer(buffer: Uint8Array): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  
  inline def fromStream(stream: ReadableStream[js.Any]): js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[typings.fileType.coreMod.FileTypeResult]]]
  
  /**
  	Supported MIME types.
  	*/
  @JSImport("file-type/browser", "mimeTypes")
  @js.native
  val mimeTypes: js.Array[typings.fileType.coreMod.MimeType] = js.native
  
  type FileExtension = typings.fileType.coreMod.FileExtension
  
  type FileTypeResult = typings.fileType.coreMod.FileTypeResult
  
  type MimeType = typings.fileType.coreMod.MimeType
}
