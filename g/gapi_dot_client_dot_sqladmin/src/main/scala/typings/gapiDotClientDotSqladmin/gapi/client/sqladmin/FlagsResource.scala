package typings.gapiDotClientDotSqladmin.gapi.client.sqladmin

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotSqladmin.Anon_AltDatabaseVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlagsResource extends js.Object {
  /** List all available database flags for Google Cloud SQL instances. */
  def list(request: Anon_AltDatabaseVersion): Request[FlagsListResponse]
}

object FlagsResource {
  @scala.inline
  def apply(list: Anon_AltDatabaseVersion => Request[FlagsListResponse]): FlagsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[FlagsResource]
  }
}

