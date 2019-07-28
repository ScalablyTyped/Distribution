package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Privileges
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivilegesCollection extends js.Object {
  // Retrieves a paginated list of all privileges for a customer.
  def list(customer: String): Privileges
}

object PrivilegesCollection {
  @scala.inline
  def apply(list: String => Privileges): PrivilegesCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[PrivilegesCollection]
  }
}

