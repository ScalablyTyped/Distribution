package typings.fflate.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fflate", "Unzip")
@js.native
/**
  * Creates a ZIP decompression stream
  * @param cb The callback to call whenever a file in the ZIP archive is found
  */
open class Unzip_ () extends StObject {
  def this(cb: UnzipFileHandler) = this()
  
  /* private */ var c: Any = js.native
  
  /* private */ var d: Any = js.native
  
  /* private */ var k: Any = js.native
  
  /* private */ var o: Any = js.native
  
  /**
    * The handler to call whenever a file is discovered
    */
  def onfile(file: UnzipFile): Unit = js.native
  /**
    * The handler to call whenever a file is discovered
    */
  @JSName("onfile")
  var onfile_Original: UnzipFileHandler = js.native
  
  /* private */ var p: Any = js.native
  
  /**
    * Pushes a chunk to be unzipped
    * @param chunk The chunk to push
    * @param final Whether this is the last chunk
    */
  def push(chunk: js.typedarray.Uint8Array): Any = js.native
  def push(chunk: js.typedarray.Uint8Array, `final`: Boolean): Any = js.native
  
  /**
    * Registers a decoder with the stream, allowing for files compressed with
    * the compression type provided to be expanded correctly
    * @param decoder The decoder constructor
    */
  def register(decoder: UnzipDecoderConstructor): Unit = js.native
}
