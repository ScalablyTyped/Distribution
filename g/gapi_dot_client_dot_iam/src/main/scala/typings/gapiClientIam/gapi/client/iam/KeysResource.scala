package typings.gapiClientIam.gapi.client.iam

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientIam.AnonAccesstokenAltBearertoken
import typings.gapiClientIam.AnonAccesstokenAltBearertokenCallbackFieldsKeyKeyTypes
import typings.gapiClientIam.AnonAccesstokenAltBearertokenCallbackFieldsKeyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysResource extends js.Object {
  /**
    * Creates a ServiceAccountKey
    * and returns it.
    */
  def create(request: AnonAccesstokenAltBearertoken): Request_[ServiceAccountKey]
  /** Deletes a ServiceAccountKey. */
  def delete(request: AnonAccesstokenAltBearertoken): Request_[js.Object]
  /**
    * Gets the ServiceAccountKey
    * by key id.
    */
  def get(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyName): Request_[ServiceAccountKey]
  /** Lists ServiceAccountKeys. */
  def list(request: AnonAccesstokenAltBearertokenCallbackFieldsKeyKeyTypes): Request_[ListServiceAccountKeysResponse]
}

object KeysResource {
  @scala.inline
  def apply(
    create: AnonAccesstokenAltBearertoken => Request_[ServiceAccountKey],
    delete: AnonAccesstokenAltBearertoken => Request_[js.Object],
    get: AnonAccesstokenAltBearertokenCallbackFieldsKeyName => Request_[ServiceAccountKey],
    list: AnonAccesstokenAltBearertokenCallbackFieldsKeyKeyTypes => Request_[ListServiceAccountKeysResponse]
  ): KeysResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[KeysResource]
  }
}

