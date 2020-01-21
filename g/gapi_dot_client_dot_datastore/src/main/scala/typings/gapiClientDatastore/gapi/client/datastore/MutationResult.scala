package typings.gapiClientDatastore.gapi.client.datastore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationResult extends js.Object {
  /**
    * Whether a conflict was detected for this mutation. Always false when a
    * conflict detection strategy field is not set in the mutation.
    */
  var conflictDetected: js.UndefOr[Boolean] = js.undefined
  /**
    * The automatically allocated key.
    * Set only when the mutation allocated a key.
    */
  var key: js.UndefOr[Key] = js.undefined
  /**
    * The version of the entity on the server after processing the mutation. If
    * the mutation doesn't change anything on the server, then the version will
    * be the version of the current entity or, if no entity is present, a version
    * that is strictly greater than the version of any previous entity and less
    * than the version of any possible future entity.
    */
  var version: js.UndefOr[String] = js.undefined
}

object MutationResult {
  @scala.inline
  def apply(conflictDetected: js.UndefOr[Boolean] = js.undefined, key: Key = null, version: String = null): MutationResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(conflictDetected)) __obj.updateDynamic("conflictDetected")(conflictDetected.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutationResult]
  }
}

