package typings.gapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request
import typings.gapiClientIam.anon.Bearertoken
import typings.gapiClientIam.anon.KeyTypes
import typings.gapiClientIam.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysResource extends js.Object {
  /**
    * Creates a ServiceAccountKey
    * and returns it.
    */
  def create(request: Bearertoken): Request[ServiceAccountKey]
  /** Deletes a ServiceAccountKey. */
  def delete(request: Bearertoken): Request[js.Object]
  /**
    * Gets the ServiceAccountKey
    * by key id.
    */
  def get(request: Name): Request[ServiceAccountKey]
  /** Lists ServiceAccountKeys. */
  def list(request: KeyTypes): Request[ListServiceAccountKeysResponse]
}

object KeysResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[ServiceAccountKey],
    delete: Bearertoken => Request[js.Object],
    get: Name => Request[ServiceAccountKey],
    list: KeyTypes => Request[ListServiceAccountKeysResponse]
  ): KeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[KeysResource]
  }
}

