package typings.firefoxDashWebextDashBrowser.browser.runtime

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* runtime events */
/**
  * Fired when a profile that has this extension installed first starts up. This event is not fired for incognito
  * profiles.
  */
@JSGlobal("browser.runtime.onStartup")
@js.native
object onStartup
  extends TopLevel[WebExtEvent[js.Function0[Unit]]]

