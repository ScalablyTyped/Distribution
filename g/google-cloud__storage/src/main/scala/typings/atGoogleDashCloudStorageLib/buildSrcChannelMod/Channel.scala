package typings
package atGoogleDashCloudStorageLib.buildSrcChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Create a channel object to interact with a Cloud Storage channel.
 *
 * @see [Object Change Notification]{@link https://cloud.google.com/storage/docs/object-change-notification}
 *
 * @class
 *
 * @param {string} id The ID of the channel.
 * @param {string} resourceId The resource ID of the channel.
 *
 * @example
 * const {Storage} = require('@google-cloud/storage');
 * const storage = new Storage();
 * const channel = storage.channel('id', 'resource-id');
 */
@JSImport("@google-cloud/storage/build/src/channel", "Channel")
@js.native
class Channel protected ()
  extends atGoogleDashCloudCommonLib.commonMod.ServiceObject[js.Object] {
  def this(storage: atGoogleDashCloudStorageLib.buildSrcStorageMod.Storage, id: java.lang.String, resourceId: java.lang.String) = this()
  /**
       * @typedef {array} StopResponse
       * @property {object} 0 The full API response.
       */
  /**
       * Stop this channel.
       *
       * @param {StopCallback} [callback] Callback function.
       * @returns {Promise<StopResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const channel = storage.channel('id', 'resource-id');
       * channel.stop(function(err, apiResponse) {
       *   if (!err) {
       *     // Channel stopped successfully.
       *   }
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * channel.stop().then(function(data) {
       *   const apiResponse = data[0];
       * });
       */
  def stop(): js.Promise[requestLib.requestMod.requestNs.Response] = js.native
  def stop(callback: StopCallback): scala.Unit = js.native
}

