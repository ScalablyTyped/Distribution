package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminGroupsMigration extends js.Object {
  var Archive: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsMigrationNs.CollectionNs.ArchiveCollection
  ] = js.undefined
}

object AdminGroupsMigration {
  @scala.inline
  def apply(
    Archive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminGroupsMigrationNs.CollectionNs.ArchiveCollection = null
  ): AdminGroupsMigration = {
    val __obj = js.Dynamic.literal()
    if (Archive != null) __obj.updateDynamic("Archive")(Archive)
    __obj.asInstanceOf[AdminGroupsMigration]
  }
}

