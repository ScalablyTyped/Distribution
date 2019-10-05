package typings.googleDashAppsDashScript.GoogleAppsScript

import typings.googleDashAppsDashScript.GoogleAppsScript.AdminGroupsMigration.Collection.ArchiveCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("AdminGroupsMigration")
trait AdminGroupsMigration_ extends js.Object {
  var Archive: js.UndefOr[ArchiveCollection] = js.undefined
}

object AdminGroupsMigration_ {
  @scala.inline
  def apply(Archive: ArchiveCollection = null): AdminGroupsMigration_ = {
    val __obj = js.Dynamic.literal()
    if (Archive != null) __obj.updateDynamic("Archive")(Archive)
    __obj.asInstanceOf[AdminGroupsMigration_]
  }
}

