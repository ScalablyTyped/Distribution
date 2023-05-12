package typings.fileType

import typings.fileType.coreMod.FileExtension
import typings.fileType.coreMod.FileTypeResult
import typings.fileType.coreMod.MimeType
import typings.fileType.coreMod.ReadableStreamWithFileType
import typings.fileType.coreMod.StreamOptions
import typings.node.nodeColonstreamMod.Readable
import typings.std.Blob
import typings.std.ReadonlySet
import typings.strtok3.libTypesMod.ITokenizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-type", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileTypeFromBlob(blob: Blob): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromBlob")(blob.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeFromBuffer(buffer: js.typedarray.ArrayBuffer): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  inline def fileTypeFromBuffer(buffer: js.typedarray.Uint8Array): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeFromFile(path: String): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeFromStream(stream: Readable): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeFromTokenizer(tokenizer: ITokenizer): js.Promise[js.UndefOr[FileTypeResult]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeFromTokenizer")(tokenizer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[FileTypeResult]]]
  
  inline def fileTypeStream(readableStream: Readable): js.Promise[ReadableStreamWithFileType] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeStream")(readableStream.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReadableStreamWithFileType]]
  inline def fileTypeStream(readableStream: Readable, options: StreamOptions): js.Promise[ReadableStreamWithFileType] = (^.asInstanceOf[js.Dynamic].applyDynamic("fileTypeStream")(readableStream.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReadableStreamWithFileType]]
  
  @JSImport("file-type", "supportedExtensions")
  @js.native
  val supportedExtensions: ReadonlySet[FileExtension] = js.native
  
  @JSImport("file-type", "supportedMimeTypes")
  @js.native
  val supportedMimeTypes: ReadonlySet[MimeType] = js.native
}
