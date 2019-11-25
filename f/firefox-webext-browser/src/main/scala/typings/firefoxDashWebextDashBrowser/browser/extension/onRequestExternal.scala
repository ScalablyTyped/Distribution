package typings.firefoxDashWebextDashBrowser.browser.extension

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import typings.firefoxDashWebextDashBrowser.browser.runtime.MessageSender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a request is sent from another extension.
  * @param request The request sent by the calling script.
  * @param sendResponse Function to call when you have a response. The argument should be any JSON-ifiable object,
  *     or undefined if there is no response.
  * @deprecated Please use `runtime.onMessageExternal`.
  */
@JSGlobal("browser.extension.onRequestExternal")
@js.native
object onRequestExternal
  extends TopLevel[
      js.UndefOr[
        WebExtEvent[
          js.Function3[
            /* request */ js.Any, 
            /* sender */ MessageSender, 
            /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], Unit], 
            Unit
          ]
        ]
      ]
    ]

