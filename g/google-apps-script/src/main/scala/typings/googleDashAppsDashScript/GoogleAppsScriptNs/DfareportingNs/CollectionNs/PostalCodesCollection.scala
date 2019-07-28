package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.PostalCode
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.PostalCodesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalCodesCollection extends js.Object {
  // Gets one postal code by ID.
  def get(profileId: String, code: String): PostalCode
  // Retrieves a list of postal codes.
  def list(profileId: String): PostalCodesListResponse
}

object PostalCodesCollection {
  @scala.inline
  def apply(get: (String, String) => PostalCode, list: String => PostalCodesListResponse): PostalCodesCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PostalCodesCollection]
  }
}

