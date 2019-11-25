package typings.firefoxDashWebextDashBrowser

import org.scalablytyped.runtime.StringDictionary
import typings.firefoxDashWebextDashBrowser.browser._manifest.FirefoxSpecificProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Edge extends js.Object {
  var edge: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var gecko: js.UndefOr[FirefoxSpecificProperties] = js.undefined
}

object Anon_Edge {
  @scala.inline
  def apply(edge: StringDictionary[js.Any] = null, gecko: FirefoxSpecificProperties = null): Anon_Edge = {
    val __obj = js.Dynamic.literal()
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (gecko != null) __obj.updateDynamic("gecko")(gecko.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Edge]
  }
}

