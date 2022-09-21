package typings.fastifyBusboy

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.fastifyBusboy.anon.FieldNameSize
import typings.fastifyBusboy.dicerMod.Dicer.Config
import typings.fastifyBusboy.fastifyBusboyStrings.error
import typings.fastifyBusboy.fastifyBusboyStrings.field
import typings.fastifyBusboy.fastifyBusboyStrings.fieldsLimit
import typings.fastifyBusboy.fastifyBusboyStrings.file
import typings.fastifyBusboy.fastifyBusboyStrings.filesLimit
import typings.fastifyBusboy.fastifyBusboyStrings.finish
import typings.fastifyBusboy.fastifyBusboyStrings.partsLimit
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@fastify/busboy", JSImport.Default)
  @js.native
  val default: BusboyConstructor = js.native
  
  @js.native
  trait Busboy extends Writable {
    
    def addListener[Event /* <: /* keyof @fastify/busboy.@fastify/busboy.BusboyEvents */ file | field | finish | partsLimit | filesLimit | fieldsLimit | error */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @fastify/busboy.@fastify/busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def off[Event /* <: /* keyof @fastify/busboy.@fastify/busboy.BusboyEvents */ file | field | finish | partsLimit | filesLimit | fieldsLimit | error */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @fastify/busboy.@fastify/busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def on[Event /* <: /* keyof @fastify/busboy.@fastify/busboy.BusboyEvents */ file | field | finish | partsLimit | filesLimit | fieldsLimit | error */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @fastify/busboy.@fastify/busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def once[Event /* <: /* keyof @fastify/busboy.@fastify/busboy.BusboyEvents */ file | field | finish | partsLimit | filesLimit | fieldsLimit | error */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @fastify/busboy.@fastify/busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def prependListener[Event /* <: /* keyof @fastify/busboy.@fastify/busboy.BusboyEvents */ file | field | finish | partsLimit | filesLimit | fieldsLimit | error */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @fastify/busboy.@fastify/busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def prependOnceListener[Event /* <: /* keyof @fastify/busboy.@fastify/busboy.BusboyEvents */ file | field | finish | partsLimit | filesLimit | fieldsLimit | error */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @fastify/busboy.@fastify/busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
    
    def removeListener[Event /* <: /* keyof @fastify/busboy.@fastify/busboy.BusboyEvents */ file | field | finish | partsLimit | filesLimit | fieldsLimit | error */](
      event: Event,
      listener: /* import warning: importer.ImportType#apply Failed type conversion: @fastify/busboy.@fastify/busboy.BusboyEvents[Event] */ js.Any
    ): this.type = js.native
  }
  @JSImport("@fastify/busboy", "Busboy")
  @js.native
  val Busboy: BusboyConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@fastify/busboy", "Busboy")
  @js.native
  open class BusboyCls protected ()
    extends typings.fastifyBusboy.mod.Busboy {
    def this(options: BusboyConfig) = this()
  }
  
  @JSImport("@fastify/busboy", "Dicer")
  @js.native
  open class Dicer protected ()
    extends typings.fastifyBusboy.dicerMod.Dicer {
    /**
      * Creates and returns a new Dicer instance with the following valid config settings:
      *
      * @param config The configuration to use
      */
    def this(config: Config) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@fastify/busboy", JSImport.Default)
  @js.native
  open class defaultCls protected ()
    extends typings.fastifyBusboy.mod.Busboy {
    def this(options: BusboyConfig) = this()
  }
  
  trait BusboyConfig extends StObject {
    
    /**
      * Default character set to use when one isn't defined.
      * @default 'utf8'
      */
    var defCharset: js.UndefOr[String] = js.undefined
    
    /**
      * highWaterMark to use for file streams.
      * @default ReadableStream default.
      */
    var fileHwm: js.UndefOr[Double] = js.undefined
    
    /**
      * These are the HTTP headers of the incoming request, which are used by individual parsers.
      */
    var headers: BusboyHeaders
    
    /**
      * `highWaterMark` to use for this Busboy instance.
      * @default WritableStream default.
      */
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    /**
      * Detect if a Part is a file.
      * 
      * By default a file is detected if contentType 
      * is application/octet-stream or fileName is not
      * undefined.
      * 
      * Modify this to handle e.g. Blobs.
      */
    var isPartAFile: js.UndefOr[
        js.Function3[
          /* fieldName */ js.UndefOr[String], 
          /* contentType */ js.UndefOr[String], 
          /* fileName */ js.UndefOr[String], 
          Boolean
        ]
      ] = js.undefined
    
    /**
      * Various limits on incoming data.
      */
    var limits: js.UndefOr[FieldNameSize] = js.undefined
    
    /**
      * If paths in the multipart 'filename' field shall be preserved.
      * @default false
      */
    var preservePath: js.UndefOr[Boolean] = js.undefined
  }
  object BusboyConfig {
    
    inline def apply(headers: BusboyHeaders): BusboyConfig = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[BusboyConfig]
    }
    
    extension [Self <: BusboyConfig](x: Self) {
      
      inline def setDefCharset(value: String): Self = StObject.set(x, "defCharset", value.asInstanceOf[js.Any])
      
      inline def setDefCharsetUndefined: Self = StObject.set(x, "defCharset", js.undefined)
      
      inline def setFileHwm(value: Double): Self = StObject.set(x, "fileHwm", value.asInstanceOf[js.Any])
      
      inline def setFileHwmUndefined: Self = StObject.set(x, "fileHwm", js.undefined)
      
      inline def setHeaders(value: BusboyHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setIsPartAFile(
        value: (/* fieldName */ js.UndefOr[String], /* contentType */ js.UndefOr[String], /* fileName */ js.UndefOr[String]) => Boolean
      ): Self = StObject.set(x, "isPartAFile", js.Any.fromFunction3(value))
      
      inline def setIsPartAFileUndefined: Self = StObject.set(x, "isPartAFile", js.undefined)
      
      inline def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      inline def setPreservePath(value: Boolean): Self = StObject.set(x, "preservePath", value.asInstanceOf[js.Any])
      
      inline def setPreservePathUndefined: Self = StObject.set(x, "preservePath", js.undefined)
    }
  }
  
  @js.native
  trait BusboyConstructor
    extends StObject
       with Instantiable1[/* options */ BusboyConfig, typings.fastifyBusboy.mod.Busboy] {
    
    def apply(options: BusboyConfig): typings.fastifyBusboy.mod.Busboy = js.native
  }
  
  trait BusboyEvents extends StObject {
    
    def error(error: Any): Unit
    
    /**
      * Emitted for each new non-file field found.
      */
    def field(
      fieldname: String,
      value: String,
      fieldnameTruncated: Boolean,
      valueTruncated: Boolean,
      transferEncoding: String,
      mimeType: String
    ): Unit
    
    /**
      * Emitted when specified `fields` limit has been reached. No more 'field' events will be emitted.
      */
    def fieldsLimit(): Unit
    
    /**
      * Emitted for each new file form field found.
      *
      * * Note: if you listen for this event, you should always handle the `stream` no matter if you care about the
      * file contents or not (e.g. you can simply just do `stream.resume();` if you want to discard the contents),
      * otherwise the 'finish' event will never fire on the Busboy instance. However, if you don't care about **any**
      * incoming files, you can simply not listen for the 'file' event at all and any/all files will be automatically
      * and safely discarded (these discarded files do still count towards `files` and `parts` limits).
      * * If a configured file size limit was reached, `stream` will both have a boolean property `truncated`
      * (best checked at the end of the stream) and emit a 'limit' event to notify you when this happens.
      *
      * @param listener.transferEncoding Contains the 'Content-Transfer-Encoding' value for the file stream.
      * @param listener.mimeType Contains the 'Content-Type' value for the file stream.
      */
    def file(
      fieldname: String,
      stream: BusboyFileStream,
      filename: String,
      transferEncoding: String,
      mimeType: String
    ): Unit
    
    /**
      *  Emitted when specified `files` limit has been reached. No more 'file' events will be emitted.
      */
    def filesLimit(): Unit
    
    def finish(): Unit
    
    /**
      * Emitted when specified `parts` limit has been reached. No more 'file' or 'field' events will be emitted.
      */
    def partsLimit(): Unit
  }
  object BusboyEvents {
    
    inline def apply(
      error: Any => Unit,
      field: (String, String, Boolean, Boolean, String, String) => Unit,
      fieldsLimit: () => Unit,
      file: (String, BusboyFileStream, String, String, String) => Unit,
      filesLimit: () => Unit,
      finish: () => Unit,
      partsLimit: () => Unit
    ): BusboyEvents = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), field = js.Any.fromFunction6(field), fieldsLimit = js.Any.fromFunction0(fieldsLimit), file = js.Any.fromFunction5(file), filesLimit = js.Any.fromFunction0(filesLimit), finish = js.Any.fromFunction0(finish), partsLimit = js.Any.fromFunction0(partsLimit))
      __obj.asInstanceOf[BusboyEvents]
    }
    
    extension [Self <: BusboyEvents](x: Self) {
      
      inline def setError(value: Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setField(value: (String, String, Boolean, Boolean, String, String) => Unit): Self = StObject.set(x, "field", js.Any.fromFunction6(value))
      
      inline def setFieldsLimit(value: () => Unit): Self = StObject.set(x, "fieldsLimit", js.Any.fromFunction0(value))
      
      inline def setFile(value: (String, BusboyFileStream, String, String, String) => Unit): Self = StObject.set(x, "file", js.Any.fromFunction5(value))
      
      inline def setFilesLimit(value: () => Unit): Self = StObject.set(x, "filesLimit", js.Any.fromFunction0(value))
      
      inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setPartsLimit(value: () => Unit): Self = StObject.set(x, "partsLimit", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait BusboyFileStream extends Readable {
    
    /**
      * The number of bytes that have been read so far.
      */
    var bytesRead: Double = js.native
    
    var truncated: Boolean = js.native
  }
  
  trait BusboyHeaders
    extends StObject
       with IncomingHttpHeaders {
    
    @JSName("content-type")
    var `content-type_BusboyHeaders`: String
  }
  object BusboyHeaders {
    
    inline def apply(`content-type`: String): BusboyHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BusboyHeaders]
    }
    
    extension [Self <: BusboyHeaders](x: Self) {
      
      inline def `setContent-type`(value: String): Self = StObject.set(x, "content-type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = BusboyConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: BusboyConstructor = default
}
