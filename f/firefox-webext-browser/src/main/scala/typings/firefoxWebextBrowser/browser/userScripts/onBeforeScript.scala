package typings.firefoxWebextBrowser.browser.userScripts

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonDefineGlobals
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* userScripts events */
/**
  * Event called when a new userScript global has been created
  *
  * Allowed in: Content scripts only
  */
@JSGlobal("browser.userScripts.onBeforeScript")
@js.native
object onBeforeScript
  extends TopLevel[WebExtEvent[js.Function1[/* userScript */ AnonDefineGlobals, Unit]]]

