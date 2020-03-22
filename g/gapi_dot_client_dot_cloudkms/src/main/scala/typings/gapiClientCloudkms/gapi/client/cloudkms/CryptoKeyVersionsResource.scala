package typings.gapiClientCloudkms.gapi.client.cloudkms

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCloudkms.AnonAccesstoken
import typings.gapiClientCloudkms.AnonAlt
import typings.gapiClientCloudkms.AnonBearertoken
import typings.gapiClientCloudkms.AnonCallback
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
  def create(request: AnonAccesstoken): Request_[CryptoKeyVersion]
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
  def destroy(request: AnonAlt): Request_[CryptoKeyVersion]
  /** Returns metadata for a given CryptoKeyVersion. */
  def get(request: AnonAlt): Request_[CryptoKeyVersion]
  /** Lists CryptoKeyVersions. */
  def list(request: AnonBearertoken): Request_[ListCryptoKeyVersionsResponse]
  /**
    * Update a CryptoKeyVersion's metadata.
    *
    * state may be changed between
    * ENABLED and
    * DISABLED using this
    * method. See DestroyCryptoKeyVersion and RestoreCryptoKeyVersion to
    * move between other states.
    */
  def patch(request: AnonCallback): Request_[CryptoKeyVersion]
  /**
    * Restore a CryptoKeyVersion in the
    * DESTROY_SCHEDULED,
    * state.
    *
    * Upon restoration of the CryptoKeyVersion, state
    * will be set to DISABLED,
    * and destroy_time will be cleared.
    */
  def restore(request: AnonAlt): Request_[CryptoKeyVersion]
}

object CryptoKeyVersionsResource {
  @scala.inline
  def apply(
    create: AnonAccesstoken => Request_[CryptoKeyVersion],
    destroy: AnonAlt => Request_[CryptoKeyVersion],
    get: AnonAlt => Request_[CryptoKeyVersion],
    list: AnonBearertoken => Request_[ListCryptoKeyVersionsResponse],
    patch: AnonCallback => Request_[CryptoKeyVersion],
    restore: AnonAlt => Request_[CryptoKeyVersion]
  ): CryptoKeyVersionsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), destroy = js.Any.fromFunction1(destroy), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), restore = js.Any.fromFunction1(restore))
  
    __obj.asInstanceOf[CryptoKeyVersionsResource]
  }
}

