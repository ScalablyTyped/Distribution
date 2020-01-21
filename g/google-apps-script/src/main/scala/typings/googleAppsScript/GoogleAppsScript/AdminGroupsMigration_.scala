package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.AdminGroupsMigration.Collection.ArchiveCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminGroupsMigration_ extends js.Object {
  var Archive: js.UndefOr[ArchiveCollection] = js.undefined
}

object AdminGroupsMigration_ {
  @scala.inline
  def apply(Archive: ArchiveCollection = null): AdminGroupsMigration_ = {
    val __obj = js.Dynamic.literal()
    if (Archive != null) __obj.updateDynamic("Archive")(Archive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminGroupsMigration_]
  }
}

