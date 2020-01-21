package typings.firefoxWebextBrowser.browser.omnibox

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User has changed what is typed into the omnibox.
  * @param suggest A callback passed to the onInputChanged event used for sending suggestions back to the browser.
  */
@JSGlobal("browser.omnibox.onInputChanged")
@js.native
object onInputChanged
  extends TopLevel[
      WebExtEvent[
        js.Function2[
          /* text */ String, 
          /* suggest */ js.Function1[/* suggestResults */ js.Array[SuggestResult], Unit], 
          Unit
        ]
      ]
    ]

