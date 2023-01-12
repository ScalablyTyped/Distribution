package typings.fsCapacitor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  object default {
    
    @JSImport("fs-capacitor/dist", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("fs-capacitor/dist", "default.ReadAfterDestroyedError")
    @js.native
    def ReadAfterDestroyedError: Instantiable0[typings.fsCapacitor.distMod.ReadAfterDestroyedError] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("fs-capacitor/dist", "default.ReadAfterDestroyedError")
    @js.native
    open class ReadAfterDestroyedErrorCls () extends ReadAfterDestroyedError
    
    inline def ReadAfterDestroyedError_=(x: Instantiable0[ReadAfterDestroyedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadAfterDestroyedError")(x.asInstanceOf[js.Any])
    
    @JSImport("fs-capacitor/dist", "default.ReadAfterReleasedError")
    @js.native
    def ReadAfterReleasedError: Instantiable0[typings.fsCapacitor.distMod.ReadAfterReleasedError] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("fs-capacitor/dist", "default.ReadAfterReleasedError")
    @js.native
    open class ReadAfterReleasedErrorCls () extends ReadAfterReleasedError
    
    inline def ReadAfterReleasedError_=(x: Instantiable0[ReadAfterReleasedError]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadAfterReleasedError")(x.asInstanceOf[js.Any])
    
    @JSImport("fs-capacitor/dist", "default.ReadStream")
    @js.native
    def ReadStream: Instantiable2[
        /* writeStream */ WriteStream, 
        /* options */ js.UndefOr[ReadStreamOptions], 
        typings.fsCapacitor.distMod.ReadStream
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("fs-capacitor/dist", "default.ReadStream")
    @js.native
    open class ReadStreamCls protected () extends ReadStream {
      def this(writeStream: WriteStream) = this()
      def this(writeStream: WriteStream, options: ReadStreamOptions) = this()
    }
    
    inline def ReadStream_=(
      x: Instantiable2[
          /* writeStream */ WriteStream, 
          /* options */ js.UndefOr[ReadStreamOptions], 
          ReadStream
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReadStream")(x.asInstanceOf[js.Any])
    
    @JSImport("fs-capacitor/dist", "default.WriteStream")
    @js.native
    def WriteStream: Instantiable1[
        /* options */ js.UndefOr[WriteStreamOptions], 
        typings.fsCapacitor.distMod.WriteStream
      ] = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSImport("fs-capacitor/dist", "default.WriteStream")
    @js.native
    open class WriteStreamCls () extends WriteStream {
      def this(options: WriteStreamOptions) = this()
    }
    
    inline def WriteStream_=(x: Instantiable1[/* options */ js.UndefOr[WriteStreamOptions], WriteStream]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WriteStream")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("fs-capacitor/dist", "ReadAfterDestroyedError")
  @js.native
  open class ReadAfterDestroyedError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("fs-capacitor/dist", "ReadAfterReleasedError")
  @js.native
  open class ReadAfterReleasedError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("fs-capacitor/dist", "ReadStream")
  @js.native
  open class ReadStream protected () extends Readable {
    def this(writeStream: WriteStream) = this()
    def this(writeStream: WriteStream, options: ReadStreamOptions) = this()
    
    /* private */ var _pos: Any = js.native
    
    /* private */ var _writeStream: Any = js.native
  }
  
  @JSImport("fs-capacitor/dist", "WriteStream")
  @js.native
  open class WriteStream () extends Writable {
    def this(options: WriteStreamOptions) = this()
    
    def _cleanup(callback: js.Function1[/* error */ Null | js.Error, Unit]): Unit = js.native
    
    def _cleanupSync(): Unit = js.native
    
    def _destroy(error: Unit, callback: js.Function1[/* error */ js.UndefOr[Null | js.Error], Any]): Unit = js.native
    
    /* private */ var _fd: Any = js.native
    
    /* private */ var _path: Any = js.native
    
    /* private */ var _pos: Any = js.native
    
    /* private */ var _readStreams: Any = js.native
    
    /* private */ var _released: Any = js.native
    
    def _write(
      chunk: Buffer,
      encoding: String,
      callback: js.Function1[/* error */ js.UndefOr[Null | js.Error], Any]
    ): Unit = js.native
    
    def createReadStream(): ReadStream = js.native
    def createReadStream(options: ReadStreamOptions): ReadStream = js.native
    
    def release(): Unit = js.native
  }
  
  trait ReadStreamOptions extends StObject {
    
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
  }
  object ReadStreamOptions {
    
    inline def apply(): ReadStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadStreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReadStreamOptions] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
  
  trait WriteStreamOptions extends StObject {
    
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var tmpdir: js.UndefOr[js.Function0[String]] = js.undefined
  }
  object WriteStreamOptions {
    
    inline def apply(): WriteStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriteStreamOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WriteStreamOptions] (val x: Self) extends AnyVal {
      
      inline def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setTmpdir(value: () => String): Self = StObject.set(x, "tmpdir", js.Any.fromFunction0(value))
      
      inline def setTmpdirUndefined: Self = StObject.set(x, "tmpdir", js.undefined)
    }
  }
}
