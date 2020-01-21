package typings.firefoxWebextBrowser.browser.urlbar

import org.scalablytyped.runtime.TopLevel
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.inactive
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.restricting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* urlbar events */
/**
  * Before a query starts, this event is fired for the given provider. Its purpose is to request the provider's
  * behavior for the query. The listener should return a behavior in response. By default, providers are inactive,
  * so if your provider should always be inactive, you don't need to listen for this event.
  * @param query The query for which the behavior is requested.
  * @returns The behavior of the provider for the query.
  */
@JSGlobal("browser.urlbar.onBehaviorRequested")
@js.native
object onBehaviorRequested
  extends TopLevel[
      UrlbarOnBehaviorRequestedEvent[js.Function1[/* query */ Query, active | inactive | restricting]]
    ]

