package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Asp
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs.Asps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AspsCollection extends js.Object {
  // Get information about an ASP issued by a user.
  def get(userKey: String, codeId: Double): Asp
  // List the ASPs issued by a user.
  def list(userKey: String): Asps
  // Delete an ASP issued by a user.
  def remove(userKey: String, codeId: Double): Unit
}

object AspsCollection {
  @scala.inline
  def apply(get: (String, Double) => Asp, list: String => Asps, remove: (String, Double) => Unit): AspsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
  
    __obj.asInstanceOf[AspsCollection]
  }
}

