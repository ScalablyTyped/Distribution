package typings.gapiClientStorage.gapi.client.storage

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientStorage.AnonAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountResource extends js.Object {
  /** Get the email address of this project's Google Cloud Storage service account. */
  def get(request: AnonAltFieldsKeyOauthtokenPrettyPrint): Request_[ServiceAccount]
}

object ServiceAccountResource {
  @scala.inline
  def apply(get: AnonAltFieldsKeyOauthtokenPrettyPrint => Request_[ServiceAccount]): ServiceAccountResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[ServiceAccountResource]
  }
}

