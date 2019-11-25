package typings.firefoxDashWebextDashBrowser.browser.extension

import org.scalablytyped.runtime.TopLevel
import typings.firefoxDashWebextDashBrowser.WebExtEvent
import typings.firefoxDashWebextDashBrowser.browser.runtime.MessageSender
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* extension events */
/**
  * Fired when a request is sent from either an extension process or a content script.
  * @param request The request sent by the calling script.
  * @param sendResponse Function to call (at most once) when you have a response. The argument should be any
  *     JSON-ifiable object, or undefined if there is no response. If you have more than one `onRequest` listener in
  *     the same document, then only one may send a response.
  * @deprecated Please use `runtime.onMessage`.
  */
@JSGlobal("browser.extension.onRequest")
@js.native
object onRequest
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

