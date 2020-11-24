package typings.googleCloudStorage

import typings.googleCloudCommon.mod.ServiceObject
import typings.googleCloudCommon.serviceObjectMod.Metadata
import typings.googleCloudStorage.storageMod.Storage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/storage/build/src/channel", JSImport.Namespace)
@js.native
object channelMod extends js.Object {
  
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
  @js.native
  class Channel protected ()
    extends ServiceObject[js.Any] {
    def this(storage: Storage, id: String, resourceId: String) = this()
    
    def stop(): js.Promise[Metadata] = js.native
    def stop(callback: StopCallback): Unit = js.native
  }
  
  type StopCallback = js.Function2[/* err */ Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
}
