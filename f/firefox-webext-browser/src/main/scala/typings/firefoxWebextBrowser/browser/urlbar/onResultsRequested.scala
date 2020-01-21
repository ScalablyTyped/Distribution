package typings.firefoxWebextBrowser.browser.urlbar

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When a query starts, this event is fired for the given provider if the provider is active for the query and
  * there are no other providers that are restricting. Its purpose is to request the provider's results for the
  * query. The listener should return a list of results in response.
  * @param query The query for which results are requested.
  * @returns The results that the provider fetched for the query.
  */
@JSGlobal("browser.urlbar.onResultsRequested")
@js.native
object onResultsRequested
  extends TopLevel[UrlbarOnResultsRequestedEvent[js.Function1[/* query */ Query, js.Array[Result]]]]

