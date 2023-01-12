package typings.easyXHeaders

import typings.easyXHeaders.NodeJS.ReadWriteStream
import typings.easyXHeaders.NodeJS.ReadableStream
import typings.easyXHeaders.NodeJS.WritableStream
import typings.easyXHeaders.anon.End
import typings.easyXHeaders.eventsMod.EventEmitter
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.easyXHeaders.NodeJS.EventEmitter because Already inherited
  - typings.easyXHeaders.NodeJS.ReadableStream because Already inherited
  - typings.easyXHeaders.NodeJS.ReadWriteStream because var conflicts: readable. Inlined  */ @JSImport("stream", "Duplex")
  @js.native
  open class Duplex ()
    extends Readable
       with WritableStream {
    def this(opts: DuplexOptions) = this()
    
    def _write(data: String, encoding: String, callback: js.Function): Unit = js.native
    def _write(data: Buffer, encoding: String, callback: js.Function): Unit = js.native
  }
  
  @JSImport("stream", "PassThrough")
  @js.native
  open class PassThrough () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("stream", "Readable")
  @js.native
  open class Readable ()
    extends EventEmitter
       with ReadableStream {
    def this(opts: ReadableOptions) = this()
    
    def _read(size: Double): Unit = js.native
    
    def push(chunk: Any): Boolean = js.native
    def push(chunk: Any, encoding: String): Boolean = js.native
  }
  
  @JSImport("stream", "Transform")
  @js.native
  open class Transform ()
    extends EventEmitter
       with ReadWriteStream {
    def this(opts: TransformOptions) = this()
    
    def _flush(callback: js.Function): Unit = js.native
    
    def _transform(chunk: String, encoding: String, callback: js.Function): Unit = js.native
    def _transform(chunk: Buffer, encoding: String, callback: js.Function): Unit = js.native
    
    def push(chunk: Any): Boolean = js.native
    def push(chunk: Any, encoding: String): Boolean = js.native
  }
  
  @JSImport("stream", "Writable")
  @js.native
  open class Writable ()
    extends EventEmitter
       with WritableStream {
    def this(opts: WritableOptions) = this()
    
    def _write(data: String, encoding: String, callback: js.Function): Unit = js.native
    def _write(data: Buffer, encoding: String, callback: js.Function): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.easyXHeaders.streamMod.WritableOptions because var conflicts: highWaterMark. Inlined decodeStrings */ trait DuplexOptions
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DuplexOptions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadableOptions] (val x: Self) extends AnyVal {
      
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
  - typings.easyXHeaders.streamMod.WritableOptions because var conflicts: highWaterMark. Inlined decodeStrings */ trait TransformOptions
    extends StObject
       with ReadableOptions {
    
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
  }
  object TransformOptions {
    
    inline def apply(): TransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransformOptions] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WritableOptions] (val x: Self) extends AnyVal {
      
      inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
}
