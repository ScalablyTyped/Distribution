package typings.atGoogleDashCloudStorage.atGoogleDashCloudStorageMod

import typings.atGoogleDashCloudStorage.buildSrcHmacKeyMod.HmacKeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/storage", "HmacKey")
@js.native
class HmacKey protected ()
  extends typings.atGoogleDashCloudStorage.buildSrcHmacKeyMod.HmacKey {
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
  def this(storage: typings.atGoogleDashCloudStorage.buildSrcStorageMod.Storage, accessId: String) = this()
  def this(
    storage: typings.atGoogleDashCloudStorage.buildSrcStorageMod.Storage,
    accessId: String,
    options: HmacKeyOptions
  ) = this()
}

