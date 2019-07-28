package typings.googleDashAppsDashScript.GoogleAppsScriptNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminGroupsMigrationNs.CollectionNs.ArchiveCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminGroupsMigration extends js.Object {
  var Archive: js.UndefOr[ArchiveCollection] = js.undefined
}

object AdminGroupsMigration {
  @scala.inline
  def apply(Archive: ArchiveCollection = null): AdminGroupsMigration = {
    val __obj = js.Dynamic.literal()
    if (Archive != null) __obj.updateDynamic("Archive")(Archive)
    __obj.asInstanceOf[AdminGroupsMigration]
  }
}

