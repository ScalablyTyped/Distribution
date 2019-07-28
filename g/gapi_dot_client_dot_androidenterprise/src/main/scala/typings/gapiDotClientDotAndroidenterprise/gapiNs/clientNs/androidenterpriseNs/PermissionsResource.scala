package typings.gapiDotClientDotAndroidenterprise.gapiNs.clientNs.androidenterpriseNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAndroidenterprise.Anon_AltFieldsKeyLanguage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionsResource extends js.Object {
  /** Retrieves details of an Android app permission for display to an enterprise admin. */
  def get(request: Anon_AltFieldsKeyLanguage): Request[Permission]
}

object PermissionsResource {
  @scala.inline
  def apply(get: Anon_AltFieldsKeyLanguage => Request[Permission]): PermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[PermissionsResource]
  }
}

