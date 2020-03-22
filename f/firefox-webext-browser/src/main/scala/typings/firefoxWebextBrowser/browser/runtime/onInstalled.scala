package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.AnonPreviousVersion
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the extension is first installed, when the extension is updated to a new version, and when the
  * browser is updated to a new version.
  */
@JSGlobal("browser.runtime.onInstalled")
@js.native
object onInstalled
  extends TopLevel[WebExtEvent[js.Function1[/* details */ AnonPreviousVersion, Unit]]]

