package typings.googleCloudPubsub

import typings.grpcGrpcJs.buildSrcCallInterfaceMod.StatusObject
import typings.grpcGrpcJs.buildSrcConstantsMod.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcPullRetryMod {
  
  @JSImport("@google-cloud/pubsub/build/src/pull-retry", "PullRetry")
  @js.native
  open class PullRetry () extends StObject
  /* static members */
  object PullRetry {
    
    @JSImport("@google-cloud/pubsub/build/src/pull-retry", "PullRetry")
    @js.native
    val ^ : js.Any = js.native
    
    inline def resetFailures(err: StatusObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("resetFailures")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
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
    inline def retry(err: StatusObject): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("@google-cloud/pubsub/build/src/pull-retry", "RETRY_CODES")
  @js.native
  val RETRY_CODES: js.Array[Status] = js.native
}
