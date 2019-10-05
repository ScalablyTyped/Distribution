package typings.firefoxDashWebextDashBrowser.browser.history

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.Anon_TitleUrlString
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when the title of a URL is changed in the browser history. */
@JSGlobal("browser.history.onTitleChanged")
@js.native
object onTitleChanged
  extends TopLevel[WebExtEvent[js.Function1[/* changed */ Anon_TitleUrlString, Unit]]]

