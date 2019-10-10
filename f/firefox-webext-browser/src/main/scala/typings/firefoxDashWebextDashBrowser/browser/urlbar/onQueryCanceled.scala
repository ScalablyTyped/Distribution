package typings.firefoxDashWebextDashBrowser.browser.urlbar

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is fired for the given provider when a query is canceled. The listener should stop any ongoing fetch
  * or creation of results and clean up its resources.
  * @param query The query that was canceled.
  */
@JSGlobal("browser.urlbar.onQueryCanceled")
@js.native
object onQueryCanceled
  extends TopLevel[_UrlbarOnQueryCanceledEvent[js.Function1[/* query */ Query, Unit]]]

