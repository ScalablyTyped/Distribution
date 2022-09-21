package typings.formData

import org.scalablytyped.runtime.StringDictionary
import typings.formData.formDataStrings.httpColon
import typings.formData.formDataStrings.httpsColon
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.IncomingMessage
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("form-data", JSImport.Namespace)
  @js.native
  open class ^ () extends FormData {
    def this(options: Options) = this()
  }
  
  trait AppendOptions extends StObject {
    
    var contentType: js.UndefOr[String] = js.undefined
    
    var filename: js.UndefOr[String] = js.undefined
    
    var filepath: js.UndefOr[String] = js.undefined
    
    var header: js.UndefOr[String | Headers] = js.undefined
    
    var knownLength: js.UndefOr[Double] = js.undefined
  }
  object AppendOptions {
    
    inline def apply(): AppendOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppendOptions]
    }
    
    extension [Self <: AppendOptions](x: Self) {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setFilepath(value: String): Self = StObject.set(x, "filepath", value.asInstanceOf[js.Any])
      
      inline def setFilepathUndefined: Self = StObject.set(x, "filepath", js.undefined)
      
      inline def setHeader(value: String | Headers): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setKnownLength(value: Double): Self = StObject.set(x, "knownLength", value.asInstanceOf[js.Any])
      
      inline def setKnownLengthUndefined: Self = StObject.set(x, "knownLength", js.undefined)
    }
  }
  
  @js.native
  trait FormData extends Readable {
    
    def append(key: String, value: Any): Unit = js.native
    def append(key: String, value: Any, options: String): Unit = js.native
    def append(key: String, value: Any, options: AppendOptions): Unit = js.native
    
    def getBoundary(): String = js.native
    
    def getBuffer(): Buffer = js.native
    
    def getHeaders(): Headers = js.native
    def getHeaders(userHeaders: Headers): Headers = js.native
    
    def getLength(callback: js.Function2[/* err */ js.Error | Null, /* length */ Double, Unit]): Unit = js.native
    
    def getLengthSync(): Double = js.native
    
    def hasKnownLength(): Boolean = js.native
    
    def setBoundary(boundary: String): Unit = js.native
    
    def submit(params: String): ClientRequest = js.native
    def submit(
      params: String,
      callback: js.Function2[/* error */ js.Error | Null, /* response */ IncomingMessage, Unit]
    ): ClientRequest = js.native
    def submit(params: SubmitOptions): ClientRequest = js.native
    def submit(
      params: SubmitOptions,
      callback: js.Function2[/* error */ js.Error | Null, /* response */ IncomingMessage, Unit]
    ): ClientRequest = js.native
  }
  
  type Headers = StringDictionary[Any]
  
  trait Options
    extends StObject
       with ReadableOptions {
    
    var dataSize: js.UndefOr[Double] = js.undefined
    
    var maxDataSize: js.UndefOr[Double] = js.undefined
    
    var pauseStreams: js.UndefOr[Boolean] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
    
    var writable: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDataSize(value: Double): Self = StObject.set(x, "dataSize", value.asInstanceOf[js.Any])
      
      inline def setDataSizeUndefined: Self = StObject.set(x, "dataSize", js.undefined)
      
      inline def setMaxDataSize(value: Double): Self = StObject.set(x, "maxDataSize", value.asInstanceOf[js.Any])
      
      inline def setMaxDataSizeUndefined: Self = StObject.set(x, "maxDataSize", js.undefined)
      
      inline def setPauseStreams(value: Boolean): Self = StObject.set(x, "pauseStreams", value.asInstanceOf[js.Any])
      
      inline def setPauseStreamsUndefined: Self = StObject.set(x, "pauseStreams", js.undefined)
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
      
      inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      inline def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  // Extracted because @types/node doesn't export interfaces.
  trait ReadableOptions extends StObject {
    
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    var destroy: js.UndefOr[
        js.ThisFunction2[
          /* this */ Readable, 
          /* error */ js.Error | Null, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
          Unit
        ]
      ] = js.undefined
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var read: js.UndefOr[js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]] = js.undefined
  }
  object ReadableOptions {
    
    inline def apply(): ReadableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadableOptions]
    }
    
    extension [Self <: ReadableOptions](x: Self) {
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      inline def setDestroy(
        value: js.ThisFunction2[
              /* this */ Readable, 
              /* error */ js.Error | Null, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
              Unit
            ]
      ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setRead(value: js.ThisFunction1[/* this */ Readable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
  
  trait SubmitOptions
    extends StObject
       with ClientRequestArgs {
    
    @JSName("protocol")
    var protocol_SubmitOptions: js.UndefOr[httpsColon | httpColon] = js.undefined
  }
  object SubmitOptions {
    
    inline def apply(): SubmitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubmitOptions]
    }
    
    extension [Self <: SubmitOptions](x: Self) {
      
      inline def setProtocol(value: httpsColon | httpColon): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    }
  }
}
