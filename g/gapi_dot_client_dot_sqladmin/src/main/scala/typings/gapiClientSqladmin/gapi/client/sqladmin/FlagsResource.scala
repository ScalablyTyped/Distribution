package typings.gapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientSqladmin.AnonDatabaseVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagsResource extends js.Object {
  /** List all available database flags for Google Cloud SQL instances. */
  def list(request: AnonDatabaseVersion): Request_[FlagsListResponse]
}

object FlagsResource {
  @scala.inline
  def apply(list: AnonDatabaseVersion => Request_[FlagsListResponse]): FlagsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FlagsResource]
  }
}

