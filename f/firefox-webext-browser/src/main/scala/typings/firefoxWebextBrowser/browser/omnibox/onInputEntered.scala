package typings.firefoxWebextBrowser.browser.omnibox

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** User has accepted what is typed into the omnibox. */
@JSGlobal("browser.omnibox.onInputEntered")
@js.native
object onInputEntered
  extends TopLevel[
      WebExtEvent[
        js.Function2[/* text */ String, /* disposition */ OnInputEnteredDisposition, Unit]
      ]
    ]

