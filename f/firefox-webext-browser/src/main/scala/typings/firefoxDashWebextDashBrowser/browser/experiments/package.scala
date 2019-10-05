package typings.firefoxDashWebextDashBrowser.browser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object experiments {
  import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.startup

  type APIEvent = startup
  type APIEvents = js.Array[APIEvent]
  type APIPath = js.Array[String]
  type APIPaths = js.Array[APIPath]
  type ExperimentURL = String
}
