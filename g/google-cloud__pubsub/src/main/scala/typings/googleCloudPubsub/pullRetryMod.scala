package typings.googleCloudPubsub

import typings.grpcGrpcJs.callStreamMod.StatusObject
import typings.grpcGrpcJs.constantsMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pullRetryMod {
  
  @JSImport("@google-cloud/pubsub/build/src/pull-retry", "PullRetry")
  @js.native
  class PullRetry () extends StObject {
    
    /**
      * Generates a timeout that can be used for applying a backoff based on the
      * current number of failed requests.
      *
      * @see {@link https://cloud.google.com/iot/docs/how-tos/exponential-backoff}
      * @private
      * @returns {number}
      */
    def createTimeout(): Double = js.native
    
    /* private */ var failures: js.Any = js.native
    
    /**
      * Determines if a request grpc.status should be retried.
      *
      * Deadlines behave kind of unexpectedly on streams, rather than using it as
      * an indicator of when to give up trying to connect, it actually dictates
      * how long the stream should stay open. Because of this, it is virtually
      * impossible to determine whether or not a deadline error is the result of
      * the server closing the stream or if we timed out waiting for a connection.
      *
      * @private
      * @param {object} grpc.status The request grpc.status.
      * @returns {boolean}
      */
    def retry(err: StatusObject): Boolean = js.native
  }
  
  @JSImport("@google-cloud/pubsub/build/src/pull-retry", "RETRY_CODES")
  @js.native
  val RETRY_CODES: js.Array[Status] = js.native
}
