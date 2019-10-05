package typings.gapiDotClientDotIam.gapi.client.iam

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotIam.Anon_AccesstokenAltBearertoken
import typings.gapiDotClientDotIam.Anon_AccesstokenAltBearertokenCallbackFieldsKeyKeyTypes
import typings.gapiDotClientDotIam.Anon_AccesstokenAltBearertokenCallbackFieldsKeyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysResource extends js.Object {
  /**
    * Creates a ServiceAccountKey
    * and returns it.
    */
  def create(request: Anon_AccesstokenAltBearertoken): Request[ServiceAccountKey]
  /** Deletes a ServiceAccountKey. */
  def delete(request: Anon_AccesstokenAltBearertoken): Request[js.Object]
  /**
    * Gets the ServiceAccountKey
    * by key id.
    */
  def get(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyName): Request[ServiceAccountKey]
  /** Lists ServiceAccountKeys. */
  def list(request: Anon_AccesstokenAltBearertokenCallbackFieldsKeyKeyTypes): Request[ListServiceAccountKeysResponse]
}

object KeysResource {
  @scala.inline
  def apply(
    create: Anon_AccesstokenAltBearertoken => Request[ServiceAccountKey],
    delete: Anon_AccesstokenAltBearertoken => Request[js.Object],
    get: Anon_AccesstokenAltBearertokenCallbackFieldsKeyName => Request[ServiceAccountKey],
    list: Anon_AccesstokenAltBearertokenCallbackFieldsKeyKeyTypes => Request[ListServiceAccountKeysResponse]
  ): KeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[KeysResource]
  }
}

