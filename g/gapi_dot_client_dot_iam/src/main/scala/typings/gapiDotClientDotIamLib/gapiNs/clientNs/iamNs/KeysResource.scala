package typings
package gapiDotClientDotIamLib.gapiNs.clientNs.iamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysResource extends js.Object {
  /**
    * Creates a ServiceAccountKey
    * and returns it.
    */
  def create(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccountKey]
  /** Deletes a ServiceAccountKey. */
  def delete(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertoken): gapiDotClientLib.gapiNs.clientNs.Request[js.Object]
  /**
    * Gets the ServiceAccountKey
    * by key id.
    */
  def get(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyName): gapiDotClientLib.gapiNs.clientNs.Request[ServiceAccountKey]
  /** Lists ServiceAccountKeys. */
  def list(request: gapiDotClientDotIamLib.Anon_AccesstokenAltBearertokenCallbackFieldsKeyKeyTypes): gapiDotClientLib.gapiNs.clientNs.Request[ListServiceAccountKeysResponse]
}

