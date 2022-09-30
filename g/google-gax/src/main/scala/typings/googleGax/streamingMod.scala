package typings.googleGax

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.googleGax.apitypesMod.APICallback
import typings.googleGax.apitypesMod.CancellableStream
import typings.googleGax.apitypesMod.GRPCCallResult
import typings.googleGax.apitypesMod.SimpleCallbackFunction
import typings.googleGax.gaxMod.RetryRequestOptions
import typings.googleGax.googleGaxBooleans.`false`
import typings.node.streamMod.Duplex
import typings.node.streamMod.DuplexOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamingMod {
  
  @JSImport("google-gax/build/src/streamingCalls/streaming", "StreamProxy")
  @js.native
  open class StreamProxy protected ()
    extends StObject
       with DuplexifyConstructor
       with GRPCCallResult {
    /**
      * StreamProxy is a proxy to gRPC-streaming method.
      *
      * @private
      * @constructor
      * @param {StreamType} type - the type of gRPC stream.
      * @param {ApiCallback} callback - the callback for further API call.
      */
    def this(`type`: StreamType, callback: APICallback) = this()
    def this(`type`: StreamType, callback: APICallback, rest: Boolean) = this()
    
    /* private */ var _callback: Any = js.native
    
    /* private */ var _isCancelCalled: Any = js.native
    
    /* private */ var _responseHasSent: Any = js.native
    
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /**
      * Forward events from an API request stream to the user's stream.
      * @param {Stream} stream - The API request stream.
      */
    def forwardEvents(stream: Stream): Unit = js.native
    
    var rest: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies the target stream.
      * @param {ApiCall} apiCall - the API function to be called.
      * @param {Object} argument - the argument to be passed to the apiCall.
      */
    def setStream(apiCall: SimpleCallbackFunction, argument: js.Object): Unit = js.native
    def setStream(apiCall: SimpleCallbackFunction, argument: js.Object, retryRequestOptions: RetryRequestOptions): Unit = js.native
    
    var stream: js.UndefOr[CancellableStream] = js.native
    
    var `type`: StreamType = js.native
  }
  
  @js.native
  sealed trait StreamType extends StObject
  @JSImport("google-gax/build/src/streamingCalls/streaming", "StreamType")
  @js.native
  object StreamType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[StreamType & Double] = js.native
    
    /** Both client and server stream objects. */
    @js.native
    sealed trait BIDI_STREAMING
      extends StObject
         with StreamType
    /* 3 */ val BIDI_STREAMING: typings.googleGax.streamingMod.StreamType.BIDI_STREAMING & Double = js.native
    
    /** Client streams requests, server returns a single response. */
    @js.native
    sealed trait CLIENT_STREAMING
      extends StObject
         with StreamType
    /* 2 */ val CLIENT_STREAMING: typings.googleGax.streamingMod.StreamType.CLIENT_STREAMING & Double = js.native
    
    /** Client sends a single request, server streams responses. */
    @js.native
    sealed trait SERVER_STREAMING
      extends StObject
         with StreamType
    /* 1 */ val SERVER_STREAMING: typings.googleGax.streamingMod.StreamType.SERVER_STREAMING & Double = js.native
  }
  
  @js.native
  trait Duplexify extends Duplex {
    
    val destroyed: Boolean = js.native
    
    def setReadable(): Unit = js.native
    def setReadable(readable: Readable): Unit = js.native
    @JSName("setReadable")
    def setReadable_false(readable: `false`): Unit = js.native
    
    def setWritable(): Unit = js.native
    def setWritable(writable: Writable): Unit = js.native
    @JSName("setWritable")
    def setWritable_false(writable: `false`): Unit = js.native
  }
  
  @js.native
  trait DuplexifyConstructor
    extends StObject
       with Instantiable0[Duplexify]
       with Instantiable1[`false` | (/* writable */ Writable), Duplexify]
       with Instantiable2[
          `false` | (/* writable */ Null) | (/* writable */ Unit) | (/* writable */ Writable), 
          `false` | (/* readable */ Readable), 
          Duplexify
        ]
       with Instantiable3[
          `false` | (/* writable */ Null) | (/* writable */ Unit) | (/* writable */ Writable), 
          `false` | (/* readable */ Null) | (/* readable */ Readable) | (/* readable */ Unit), 
          /* options */ DuplexifyOptions, 
          Duplexify
        ] {
    
    def apply(): Duplexify = js.native
    def apply(writable: Null, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Null, readable: Unit, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Null, readable: `false`): Duplexify = js.native
    def apply(writable: Null, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Null, readable: Readable): Duplexify = js.native
    def apply(writable: Null, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Unit, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Unit, readable: Unit, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Unit, readable: `false`): Duplexify = js.native
    def apply(writable: Unit, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Unit, readable: Readable): Duplexify = js.native
    def apply(writable: Unit, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: `false`): Duplexify = js.native
    def apply(writable: `false`, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: `false`, readable: Unit, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: `false`, readable: `false`): Duplexify = js.native
    def apply(writable: `false`, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: `false`, readable: Readable): Duplexify = js.native
    def apply(writable: `false`, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Writable): Duplexify = js.native
    def apply(writable: Writable, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Writable, readable: Unit, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Writable, readable: `false`): Duplexify = js.native
    def apply(writable: Writable, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    def apply(writable: Writable, readable: Readable): Duplexify = js.native
    def apply(writable: Writable, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    
    def obj(): Duplexify = js.native
    def obj(writable: Null, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Null, readable: Unit, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Null, readable: Readable): Duplexify = js.native
    def obj(writable: Null, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Unit, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Unit, readable: Unit, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Unit, readable: Readable): Duplexify = js.native
    def obj(writable: Unit, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Writable): Duplexify = js.native
    def obj(writable: Writable, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Writable, readable: Unit, options: DuplexifyOptions): Duplexify = js.native
    def obj(writable: Writable, readable: Readable): Duplexify = js.native
    def obj(writable: Writable, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: Null, readable: `false`): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: Null, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: Unit, readable: `false`): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: Unit, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: Null, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: Unit, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: `false`): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: Readable): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: `false`, readable: Readable, options: DuplexifyOptions): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: Writable, readable: `false`): Duplexify = js.native
    @JSName("obj")
    def obj_false(writable: Writable, readable: `false`, options: DuplexifyOptions): Duplexify = js.native
  }
  
  trait DuplexifyOptions
    extends StObject
       with DuplexOptions {
    
    var end: js.UndefOr[Boolean] = js.undefined
  }
  object DuplexifyOptions {
    
    inline def apply(): DuplexifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DuplexifyOptions]
    }
    
    extension [Self <: DuplexifyOptions](x: Self) {
      
      inline def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    }
  }
}
