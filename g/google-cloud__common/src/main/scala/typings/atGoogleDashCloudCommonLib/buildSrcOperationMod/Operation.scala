package typings
package atGoogleDashCloudCommonLib.buildSrcOperationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/common/build/src/operation", "Operation")
@js.native
class Operation protected ()
  extends atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.ServiceObject[js.Object] {
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
  def this(config: atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.ServiceObjectConfig) = this()
  var completeListeners: scala.Double = js.native
  var hasActiveListeners: scala.Boolean = js.native
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
  /* protected */ def `listenForEvents_`(): scala.Unit = js.native
  /**
       * Poll for a status update. Returns null for an incomplete
       * status, and metadata for a complete status.
       *
       * @private
       */
  /* protected */ def `poll_`(callback: atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.GetMetadataCallback): scala.Unit = js.native
  /**
       * Wraps the `complete` and `error` events in a Promise.
       *
       * @return {promise}
       */
  def promise(): stdLib.Promise[js.Object] = js.native
  /**
       * Poll `getMetadata` to check the operation's status. This runs a loop to
       * ping the API on an interval.
       *
       * Note: This method is automatically called once a "complete" event handler
       * is registered on the operation.
       *
       * @private
       */
  /* protected */ def `startPolling_`(): stdLib.Promise[scala.Unit] = js.native
}

