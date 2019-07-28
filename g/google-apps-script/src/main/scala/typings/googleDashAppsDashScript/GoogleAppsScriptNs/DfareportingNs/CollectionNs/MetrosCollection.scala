package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs.MetrosListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetrosCollection extends js.Object {
  // Retrieves a list of metros.
  def list(profileId: String): MetrosListResponse
}

object MetrosCollection {
  @scala.inline
  def apply(list: String => MetrosListResponse): MetrosCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[MetrosCollection]
  }
}

