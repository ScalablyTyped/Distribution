package typings.gapiDotClientDotStorage.gapi.client.storage

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotStorage.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountResource extends js.Object {
  /** Get the email address of this project's Google Cloud Storage service account. */
  def get(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[ServiceAccount]
}

object ServiceAccountResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[ServiceAccount]): ServiceAccountResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ServiceAccountResource]
  }
}

