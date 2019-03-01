package typings
package ejDotWebDotAllLib.ejNs.DocumentEditorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportExportSettings extends js.Object {
  /** Gets or sets URL of Web API that should be used to parse the document while loading.
    */
  var importUrl: js.UndefOr[java.lang.String] = js.undefined
}

object ImportExportSettings {
  @scala.inline
  def apply(importUrl: java.lang.String = null): ImportExportSettings = {
    val __obj = js.Dynamic.literal()
    if (importUrl != null) __obj.updateDynamic("importUrl")(importUrl)
    __obj.asInstanceOf[ImportExportSettings]
  }
}

