package typings.googleCloudCommon

import typings.googleCloudCommon.serviceObjectMod.MetadataCallback
import typings.googleCloudCommon.serviceObjectMod.ServiceObject
import typings.googleCloudCommon.serviceObjectMod.ServiceObjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common/build/src/operation", JSImport.Namespace)
@js.native
object operationMod extends js.Object {
  @js.native
  class Operation[T] protected () extends ServiceObject[T] {
    /**
      * An Operation object allows you to interact with APIs that take longer to
      * process things.
      *
      * @constructor
      * @alias module:common/operation
      *
      * @param {object} config - Configuration object.
      * @param {module:common/service|module:common/serviceObject|module:common/grpcService|module:common/grpcServiceObject} config.parent - The parent object.
      */
    def this(config: ServiceObjectConfig) = this()
    var completeListeners: Double = js.native
    var hasActiveListeners: Boolean = js.native
    /**
      * Begin listening for events on the operation. This method keeps track of how
      * many "complete" listeners are registered and removed, making sure polling
      * is handled automatically.
      *
      * As long as there is one active "complete" listener, the connection is open.
      * When there are no more listeners, the polling stops.
      *
      * @private
      */
    /* protected */ def listenForEvents_(): Unit = js.native
    /**
      * Poll for a status update. Returns null for an incomplete
      * status, and metadata for a complete status.
      *
      * @private
      */
    /* protected */ def poll_(callback: MetadataCallback): Unit = js.native
    /**
      * Wraps the `complete` and `error` events in a Promise.
      *
      * @return {promise}
      */
    def promise(): js.Promise[_] = js.native
    /**
      * Poll `getMetadata` to check the operation's status. This runs a loop to
      * ping the API on an interval.
      *
      * Note: This method is automatically called once a "complete" event handler
      * is registered on the operation.
      *
      * @private
      */
    /* protected */ def startPolling_(): js.Promise[Unit] = js.native
  }
  
}

