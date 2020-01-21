package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.WebExtEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a message is sent from another extension/app. Cannot be used in a content script.
  * @param message The message sent by the calling script.
  * @param sendResponse Function to call (at most once) when you have a response. The argument should be any
  *     JSON-ifiable object. If you have more than one `onMessage` listener in the same document, then only one may
  *     send a response. This function becomes invalid when the event listener returns, unless you return true from
  *     the event listener to indicate you wish to send a response asynchronously (this will keep the message
  *     channel open to the other end until `sendResponse` is called).
  * @returns Return true from the event listener if you wish to call `sendResponse` after the event listener
  *     returns.
  */
@JSGlobal("browser.runtime.onMessageExternal")
@js.native
object onMessageExternal
  extends TopLevel[
      WebExtEvent[
        js.Function3[
          /* message */ js.Any, 
          /* sender */ MessageSender, 
          /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], Unit], 
          Boolean | js.Promise[js.Any] | Unit
        ]
      ]
    ]

