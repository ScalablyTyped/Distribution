package typings.googleCloudPubsub

import typings.googleCloudPubsub.subscriberMod.Subscriber
import typings.grpcGrpcJs.callMod.ServiceError
import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.node.streamMod.PassThrough
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageStreamMod {
  
  @JSImport("@google-cloud/pubsub/build/src/message-stream", "ChannelError")
  @js.native
  class ChannelError protected ()
    extends StObject
       with ServiceError {
    def this(err: Error) = this()
    
    /* CompleteClass */
    var code: Status = js.native
    
    /* CompleteClass */
    var details: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var metadata: Metadata = js.native
    @JSName("metadata")
    var metadata_ChannelError: typings.googleGax.mod.grpc.Metadata = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/message-stream", "MessageStream")
  @js.native
  class MessageStream protected () extends PassThrough {
    def this(sub: Subscriber) = this()
    def this(sub: Subscriber, options: MessageStreamOptions) = this()
    
    /**
      * Adds a StreamingPull stream to the combined stream.
      *
      * @private
      *
      * @param {stream} stream The StreamingPull stream.
      */
    /* private */ var _addStream: js.Any = js.native
    
    /* private */ var _fillHandle: js.Any = js.native
    
    /**
      * Attempts to create and cache the desired number of StreamingPull requests.
      * gRPC does not supply a way to confirm that a stream is connected, so our
      * best bet is to open the streams and use the client.waitForReady() method to
      * confirm everything is ok.
      *
      * @private
      *
      * @returns {Promise}
      */
    /* private */ var _fillStreamPool: js.Any = js.native
    
    /**
      * It is critical that we keep as few `PullResponse` objects in memory as
      * possible to reduce the number of potential redeliveries. Because of this we
      * want to bypass gax for StreamingPull requests to avoid creating a Duplexify
      * stream, doing so essentially doubles the size of our readable buffer.
      *
      * @private
      *
      * @returns {Promise.<object>}
      */
    /* private */ var _getClient: js.Any = js.native
    
    /**
      * Since we do not use the streams to ack/modAck messages, they will close
      * by themselves unless we periodically send empty messages.
      *
      * @private
      */
    /* private */ var _keepAlive: js.Any = js.native
    
    /* private */ var _keepAliveHandle: js.Any = js.native
    
    /**
      * Once the stream has nothing left to read, we'll remove it and attempt to
      * refill our stream pool if needed.
      *
      * @private
      *
      * @param {Duplex} stream The ended stream.
      * @param {object} status The stream status.
      */
    /* private */ var _onEnd: js.Any = js.native
    
    /**
      * gRPC will usually emit a status as a ServiceError via `error` event before
      * it emits the status itself. In order to cut back on emitted errors, we'll
      * wait a tick on error and ignore it if the status has been received.
      *
      * @private
      *
      * @param {stream} stream The stream that errored.
      * @param {Error} err The error.
      */
    /* private */ var _onError: js.Any = js.native
    
    /**
      * gRPC streams will emit a status event once the connection has been
      * terminated. This is preferable to end/close events because we'll receive
      * information as to why the stream closed and if it is safe to open another.
      *
      * @private
      *
      * @param {stream} stream The stream that was closed.
      * @param {object} status The status message stating why it was closed.
      */
    /* private */ var _onStatus: js.Any = js.native
    
    /* private */ var _options: js.Any = js.native
    
    /**
      * Removes a stream from the combined stream.
      *
      * @private
      *
      * @param {stream} stream The stream to remove.
      */
    /* private */ var _removeStream: js.Any = js.native
    
    /* private */ var _retrier: js.Any = js.native
    
    /**
      * Neither gRPC or gax allow for the highWaterMark option to be specified.
      * However using the default value (16) it is possible to end up with a lot of
      * PullResponse objects stored in internal buffers. If this were to happen
      * and the client were slow to process messages, we could potentially see a
      * very large number of redeliveries happen before the messages even made it
      * to the client.
      *
      * @private
      *
      * @param {Duplex} stream The duplex stream to adjust the
      *     highWaterMarks for.
      */
    /* private */ var _setHighWaterMark: js.Any = js.native
    
    /* private */ var _streams: js.Any = js.native
    
    /* private */ var _subscriber: js.Any = js.native
    
    /**
      * Promisified version of gRPCs Client#waitForReady function.
      *
      * @private
      *
      * @param {object} client The gRPC client to wait for.
      * @returns {Promise}
      */
    /* private */ var _waitForClientReady: js.Any = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/message-stream", "StatusError")
  @js.native
  class StatusError protected ()
    extends StObject
       with ServiceError {
    def this(status: StatusObject) = this()
    
    /* CompleteClass */
    var code: Status = js.native
    
    /* CompleteClass */
    var details: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var metadata: Metadata = js.native
    @JSName("metadata")
    var metadata_StatusError: typings.googleGax.mod.grpc.Metadata = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait MessageStreamOptions extends StObject {
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var maxStreams: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object MessageStreamOptions {
    
    inline def apply(): MessageStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageStreamOptions]
    }
    
    extension [Self <: MessageStreamOptions](x: Self) {
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setMaxStreams(value: Double): Self = StObject.set(x, "maxStreams", value.asInstanceOf[js.Any])
      
      inline def setMaxStreamsUndefined: Self = StObject.set(x, "maxStreams", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
