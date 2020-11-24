package typings.googleCloudStorage.hmacKeyMod

import typings.googleCloudCommon.mod.ServiceObject
import typings.googleCloudStorage.storageMod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/storage/build/src/hmacKey", "HmacKey")
@js.native
class HmacKey protected ()
  extends ServiceObject[js.UndefOr[HmacKeyMetadata]] {
  /**
    * @typedef {object} HmacKeyOptions
    * @property {string} [projectId] The project ID of the project that owns
    *     the service account of the requested HMAC key. If not provided,
    *     the project ID used to instantiate the Storage client will be used.
    */
  /**
    * Constructs an HmacKey object.
    *
    * Note: this only create a local reference to an HMAC key, to create
    * an HMAC key, use {@link Storage#createHmacKey}.
    *
    * @param {Storage} storage The Storage instance this HMAC key is
    *     attached to.
    * @param {string} accessId The unique accessId for this HMAC key.
    * @param {HmacKeyOptions} options Constructor configurations.
    * @example
    * const {Storage} = require('@google-cloud/storage');
    * const storage = new Storage();
    * const hmacKey = storage.hmacKey('access-id');
    */
  def this(storage: Storage, accessId: String) = this()
  def this(storage: Storage, accessId: String, options: HmacKeyOptions) = this()
  
  @JSName("metadata")
  var metadata_HmacKey: js.UndefOr[HmacKeyMetadata] = js.native
}
