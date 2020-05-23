package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAndroidenterprise.anon.GroupLicenseId
import typings.gapiClientAndroidenterprise.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GrouplicensesResource extends js.Object {
  /** Retrieves details of an enterprise's group license for a product. */
  def get(request: GroupLicenseId): Request[GroupLicense]
  /** Retrieves IDs of all products for which the enterprise has a group license. */
  def list(request: Key): Request[GroupLicensesListResponse]
}

object GrouplicensesResource {
  @scala.inline
  def apply(get: GroupLicenseId => Request[GroupLicense], list: Key => Request[GroupLicensesListResponse]): GrouplicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[GrouplicensesResource]
  }
}

