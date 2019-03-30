package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Groupsmigration_v1 extends js.Object {
  var Archive: js.UndefOr[
    googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsmigrationUnderscoreV1Ns.CollectionNs.ArchiveCollection
  ] = js.undefined
}

object Groupsmigration_v1 {
  @scala.inline
  def apply(
    Archive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.GroupsmigrationUnderscoreV1Ns.CollectionNs.ArchiveCollection = null
  ): Groupsmigration_v1 = {
    val __obj = js.Dynamic.literal()
    if (Archive != null) __obj.updateDynamic("Archive")(Archive)
    __obj.asInstanceOf[Groupsmigration_v1]
  }
}

