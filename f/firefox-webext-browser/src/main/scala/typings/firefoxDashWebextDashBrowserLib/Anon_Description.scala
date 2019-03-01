package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /** The new description for the command. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the command. */
  var name: java.lang.String
  var shortcut: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.KeyName] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(
    name: java.lang.String,
    description: java.lang.String = null,
    shortcut: firefoxDashWebextDashBrowserLib.browserNs.underscoreManifestNs.KeyName = null
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut)
    __obj.asInstanceOf[Anon_Description]
  }
}

