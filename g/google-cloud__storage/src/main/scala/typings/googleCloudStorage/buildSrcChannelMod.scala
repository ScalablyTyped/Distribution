package typings.googleCloudStorage

import typings.googleCloudStorage.buildSrcNodejsCommonMod.ServiceObject
import typings.googleCloudStorage.buildSrcNodejsCommonServiceObjectMod.Metadata
import typings.googleCloudStorage.buildSrcStorageMod.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcChannelMod {
  
  /**
    * Create a channel object to interact with a Cloud Storage channel.
    *
    * See {@link https://cloud.google.com/storage/docs/object-change-notification| Object Change Notification}
    *
    * @class
    *
    * @param {string} id The ID of the channel.
    * @param {string} resourceId The resource ID of the channel.
    *
    * @example
    * ```
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const channel = storage.channel('id', 'resource-id');
    * ```
    */
  @JSImport("@google-cloud/storage/build/src/channel", "Channel")
  @js.native
  open class Channel protected () extends ServiceObject[Any] {
    def this(storage: Storage, id: String, resourceId: String) = this()
    
    def stop(): js.Promise[Metadata] = js.native
    def stop(callback: StopCallback): Unit = js.native
  }
  
  type StopCallback = js.Function2[/* err */ js.Error | Null, /* apiResponse */ js.UndefOr[Metadata], Unit]
}
