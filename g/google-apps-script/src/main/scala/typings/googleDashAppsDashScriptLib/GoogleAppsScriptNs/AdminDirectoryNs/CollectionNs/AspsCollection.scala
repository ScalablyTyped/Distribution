package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AspsCollection extends js.Object {
  // Get information about an ASP issued by a user.
  def get(userKey: java.lang.String, codeId: scala.Double): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Asp
  // List the ASPs issued by a user.
  def list(userKey: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Asps
  // Delete an ASP issued by a user.
  def remove(userKey: java.lang.String, codeId: scala.Double): scala.Unit
}

object AspsCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, scala.Double) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Asp,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Asps,
    remove: (java.lang.String, scala.Double) => scala.Unit
  ): AspsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[AspsCollection]
  }
}

