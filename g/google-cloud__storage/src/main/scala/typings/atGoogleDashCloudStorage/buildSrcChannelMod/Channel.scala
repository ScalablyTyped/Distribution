package typings.atGoogleDashCloudStorage.buildSrcChannelMod

import typings.atGoogleDashCloudCommon.atGoogleDashCloudCommonMod.ServiceObject
import typings.atGoogleDashCloudCommon.buildSrcServiceDashObjectMod.Metadata
import typings.atGoogleDashCloudStorage.buildSrcStorageMod.Storage
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
  extends ServiceObject[js.Any] {
  def this(storage: Storage, id: String, resourceId: String) = this()
  def stop(): js.Promise[Metadata] = js.native
  def stop(callback: StopCallback): Unit = js.native
}

