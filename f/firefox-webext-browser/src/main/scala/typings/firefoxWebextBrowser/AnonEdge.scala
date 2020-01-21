package typings.firefoxWebextBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxWebextBrowser.browser.manifest.FirefoxSpecificProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEdge extends js.Object {
  var edge: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.undefined
}

object AnonEdge {
  @scala.inline
  def apply(edge: StringDictionary[js.Any] = null, gecko: FirefoxSpecificProperties = null): AnonEdge = {
    val __obj = js.Dynamic.literal()
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (gecko != null) __obj.updateDynamic("gecko")(gecko.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEdge]
  }
}

