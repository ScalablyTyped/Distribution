package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCloudkms.anon.Accesstoken
import typings.gapiClientCloudkms.anon.Alt
import typings.gapiClientCloudkms.anon.Bearertoken
import typings.gapiClientCloudkms.anon.Callback
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
  def create(request: Accesstoken): Request[CryptoKeyVersion]
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
  def destroy(request: Alt): Request[CryptoKeyVersion]
  /** Returns metadata for a given CryptoKeyVersion. */
  def get(request: Alt): Request[CryptoKeyVersion]
  /** Lists CryptoKeyVersions. */
  def list(request: Bearertoken): Request[ListCryptoKeyVersionsResponse]
  /**
    * Update a CryptoKeyVersion's metadata.
    *
    * state may be changed between
    * ENABLED and
    * DISABLED using this
    * method. See DestroyCryptoKeyVersion and RestoreCryptoKeyVersion to
    * move between other states.
    */
  def patch(request: Callback): Request[CryptoKeyVersion]
  /**
    * Restore a CryptoKeyVersion in the
    * DESTROY_SCHEDULED,
    * state.
    *
    * Upon restoration of the CryptoKeyVersion, state
    * will be set to DISABLED,
    * and destroy_time will be cleared.
    */
  def restore(request: Alt): Request[CryptoKeyVersion]
}

object CryptoKeyVersionsResource {
  @scala.inline
  def apply(
    create: Accesstoken => Request[CryptoKeyVersion],
    destroy: Alt => Request[CryptoKeyVersion],
    get: Alt => Request[CryptoKeyVersion],
    list: Bearertoken => Request[ListCryptoKeyVersionsResponse],
    patch: Callback => Request[CryptoKeyVersion],
    restore: Alt => Request[CryptoKeyVersion]
  ): CryptoKeyVersionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), destroy = js.Any.fromFunction1(destroy), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), restore = js.Any.fromFunction1(restore))
    __obj.asInstanceOf[CryptoKeyVersionsResource]
  }
}

