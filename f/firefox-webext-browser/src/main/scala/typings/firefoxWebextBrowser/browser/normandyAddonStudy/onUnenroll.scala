package typings.firefoxWebextBrowser.browser.normandyAddonStudy

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* normandyAddonStudy events */
/**
  * Fired when a user unenrolls from a study but before the addon is uninstalled.
  * @param reason The reason why the study is ending.
  */
@JSGlobal("browser.normandyAddonStudy.onUnenroll")
@js.native
object onUnenroll
  extends TopLevel[WebExtEvent[js.Function1[/* reason */ String, Unit]]]

