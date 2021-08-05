package typings.easyXapiSupertest

import typings.easyXapiSupertest.NodeJS.ReadWriteStream
import typings.easyXapiSupertest.NodeJS.ReadableStream
import typings.easyXapiSupertest.NodeJS.WritableStream
import typings.easyXapiSupertest.anon.End
import typings.easyXapiSupertest.eventsMod.EventEmitter
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.easyXapiSupertest.NodeJS.EventEmitter because Already inherited
  - typings.easyXapiSupertest.NodeJS.ReadableStream because Already inherited
  - typings.easyXapiSupertest.NodeJS.ReadWriteStream because var conflicts: readable. Inlined  */ @JSImport("stream", "Duplex")
  @js.native
  class Duplex ()
    extends Readable
       with WritableStream {
    def this(opts: DuplexOptions) = this()
    
    def _write(data: String, encoding: String, callback: js.Function): Unit = js.native
    def _write(data: Buffer, encoding: String, callback: js.Function): Unit = js.native
  }
  
  @JSImport("stream", "PassThrough")
  @js.native
  class PassThrough () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("stream", "Readable")
  @js.native
  class Readable ()
    extends EventEmitter
       with ReadableStream {
    def this(opts: ReadableOptions) = this()
    
    def _read(size: Double): Unit = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: String): Boolean = js.native
  }
  
  @JSImport("stream", "Transform")
  @js.native
  class Transform ()
    extends EventEmitter
       with ReadWriteStream {
    def this(opts: TransformOptions) = this()
    
    def _flush(callback: js.Function): Unit = js.native
    
    def _transform(chunk: String, encoding: String, callback: js.Function): Unit = js.native
    def _transform(chunk: Buffer, encoding: String, callback: js.Function): Unit = js.native
    
    def push(chunk: js.Any): Boolean = js.native
    def push(chunk: js.Any, encoding: String): Boolean = js.native
  }
  
  @JSImport("stream", "Writable")
  @js.native
  class Writable ()
    extends EventEmitter
       with WritableStream {
    def this(opts: WritableOptions) = this()
    
    def _write(data: String, encoding: String, callback: js.Function): Unit = js.native
    def _write(data: Buffer, encoding: String, callback: js.Function): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.easyXapiSupertest.streamMod.WritableOptions because var conflicts: highWaterMark. Inlined decodeStrings */ trait DuplexOptions
    extends StObject
       with ReadableOptions {
    
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
  }
  object DuplexOptions {
    
    inline def apply(): DuplexOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplexOptions]
    }
    
    extension [Self <: DuplexOptions](x: Self) {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
    }
  }
  
  trait ReadableOptions extends StObject {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
  }
  object ReadableOptions {
    
    inline def apply(): ReadableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadableOptions]
    }
    
    extension [Self <: ReadableOptions](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    }
  }
  
  @js.native
  trait Stream extends EventEmitter {
    
    def pipe[T /* <: WritableStream */](destination: T): T = js.native
    def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.easyXapiSupertest.streamMod.WritableOptions because var conflicts: highWaterMark. Inlined decodeStrings */ trait TransformOptions
    extends StObject
       with ReadableOptions {
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
  }
  object TransformOptions {
    
    inline def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    extension [Self <: TransformOptions](x: Self) {
      
      inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
    }
  }
  
  trait WritableOptions extends StObject {
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
  }
  object WritableOptions {
    
    inline def apply(): WritableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WritableOptions]
    }
    
    extension [Self <: WritableOptions](x: Self) {
      
      inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
}
