package typings.firefoxWebextBrowser.browser.devtools.inspectedWindow

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a new revision of the resource is committed (e.g. user saves an edited version of the resource in the
  * Developer Tools).
  * @param content New content of the resource.
  * @deprecated Unsupported on Firefox at this time.
  */
@JSGlobal("browser.devtools.inspectedWindow.onResourceContentCommitted")
@js.native
object onResourceContentCommitted
  extends TopLevel[
      js.UndefOr[WebExtEvent[js.Function2[/* resource */ Resource, /* content */ String, Unit]]]
    ]

