package typings.fileType

import typings.fileType.coreMod.FileExtension
import typings.fileType.coreMod.FileTypeResult
import typings.fileType.coreMod.MimeType
import typings.std.Blob
import typings.std.ReadableStream
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("file-type/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileTypeFromBlob(blob: Blob): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromBlob")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeFromBuffer(buffer: js.typedarray.ArrayBuffer): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  inline def fileTypeFromBuffer(buffer: js.typedarray.Uint8Array): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeFromStream(stream: ReadableStream[Any]): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  @JSImport("file-type/browser", "supportedExtensions")
  @js.native
  val supportedExtensions: ReadonlySet[FileExtension] = js.native
  
  @JSImport("file-type/browser", "supportedMimeTypes")
  @js.native
  val supportedMimeTypes: ReadonlySet[MimeType] = js.native
}
