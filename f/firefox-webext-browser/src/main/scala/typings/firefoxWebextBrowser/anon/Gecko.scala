package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.manifest.FirefoxSpecificProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gecko extends js.Object {
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.undefined
}

object Gecko {
  @scala.inline
  def apply(gecko: FirefoxSpecificProperties = null): Gecko = {
    val __obj = js.Dynamic.literal()
    if (gecko != null) __obj.updateDynamic("gecko")(gecko.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gecko]
  }
}

