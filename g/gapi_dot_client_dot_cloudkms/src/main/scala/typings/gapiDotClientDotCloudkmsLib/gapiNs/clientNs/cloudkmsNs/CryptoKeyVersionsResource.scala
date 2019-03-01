package typings
package gapiDotClientDotCloudkmsLib.gapiNs.clientNs.cloudkmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CryptoKeyVersionsResource extends js.Object {
  /**
    * Create a new CryptoKeyVersion in a CryptoKey.
    *
    * The server will assign the next sequential id. If unset,
    * state will be set to
    * ENABLED.
    */
  def create(request: gapiDotClientDotCloudkmsLib.Anon_Accesstoken): gapiDotClientLib.gapiNs.clientNs.Request[CryptoKeyVersion]
  /**
    * Schedule a CryptoKeyVersion for destruction.
    *
    * Upon calling this method, CryptoKeyVersion.state will be set to
    * DESTROY_SCHEDULED
    * and destroy_time will be set to a time 24
    * hours in the future, at which point the state
    * will be changed to
    * DESTROYED, and the key
    * material will be irrevocably destroyed.
    *
    * Before the destroy_time is reached,
    * RestoreCryptoKeyVersion may be called to reverse the process.
    */
  def destroy(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[CryptoKeyVersion]
  /** Returns metadata for a given CryptoKeyVersion. */
  def get(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[CryptoKeyVersion]
  /** Lists CryptoKeyVersions. */
  def list(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ListCryptoKeyVersionsResponse]
  /**
    * Update a CryptoKeyVersion's metadata.
    *
    * state may be changed between
    * ENABLED and
    * DISABLED using this
    * method. See DestroyCryptoKeyVersion and RestoreCryptoKeyVersion to
    * move between other states.
    */
  def patch(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallback): gapiDotClientLib.gapiNs.clientNs.Request[CryptoKeyVersion]
  /**
    * Restore a CryptoKeyVersion in the
    * DESTROY_SCHEDULED,
    * state.
    *
    * Upon restoration of the CryptoKeyVersion, state
    * will be set to DISABLED,
    * and destroy_time will be cleared.
    */
  def restore(request: gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt): gapiDotClientLib.gapiNs.clientNs.Request[CryptoKeyVersion]
}

object CryptoKeyVersionsResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_Accesstoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[CryptoKeyVersion]
    ],
    destroy: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CryptoKeyVersion]
    ],
    get: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CryptoKeyVersion]
    ],
    list: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListCryptoKeyVersionsResponse]
    ],
    patch: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAltBearertokenCallback, 
      gapiDotClientLib.gapiNs.clientNs.Request[CryptoKeyVersion]
    ],
    restore: js.Function1[
      gapiDotClientDotCloudkmsLib.Anon_AccesstokenAlt, 
      gapiDotClientLib.gapiNs.clientNs.Request[CryptoKeyVersion]
    ]
  ): CryptoKeyVersionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("restore")(restore)
    __obj.asInstanceOf[CryptoKeyVersionsResource]
  }
}

