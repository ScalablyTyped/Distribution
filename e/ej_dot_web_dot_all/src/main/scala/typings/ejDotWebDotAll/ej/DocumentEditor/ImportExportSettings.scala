package typings.ejDotWebDotAll.ej.DocumentEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportExportSettings extends js.Object {
  /** Gets or sets URL of Web API that should be used to parse the document while loading.
    */
  var importUrl: js.UndefOr[String] = js.undefined
}

object ImportExportSettings {
  @scala.inline
  def apply(importUrl: String = null): ImportExportSettings = {
    val __obj = js.Dynamic.literal()
    if (importUrl != null) __obj.updateDynamic("importUrl")(importUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportExportSettings]
  }
}

