package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.types.Setting
import typings.firefoxDashWebextDashBrowser.browser.urlbar.Query
import typings.firefoxDashWebextDashBrowser.browser.urlbar.Result
import typings.firefoxDashWebextDashBrowser.browser.urlbar._UrlbarOnBehaviorRequestedEvent
import typings.firefoxDashWebextDashBrowser.browser.urlbar._UrlbarOnQueryCanceledEvent
import typings.firefoxDashWebextDashBrowser.browser.urlbar._UrlbarOnResultsRequestedEvent
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.active
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.inactive
import typings.firefoxDashWebextDashBrowser.firefoxDashWebextDashBrowserStrings.restricting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofurlbar extends js.Object {
  /**
    * A contextual tip appears in the urlbar's view (its search results panel) and has an icon, text, optional button, and
    * an optional link. Use the `browser.urlbar.contextualTip` API to experiment with the contextual tip. Restricted to
    * Mozilla privileged WebExtensions.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  val contextualTip: TypeofcontextualTip
  /** Enables or disables the engagement telemetry. */
  val engagementTelemetry: Setting
  /* urlbar events */
  /**
    * Before a query starts, this event is fired for the given provider. Its purpose is to request the provider's
    * behavior for the query. The listener should return a behavior in response. By default, providers are inactive,
    * so if your provider should always be inactive, you don't need to listen for this event.
    * @param query The query for which the behavior is requested.
    * @returns The behavior of the provider for the query.
    */
  val onBehaviorRequested: _UrlbarOnBehaviorRequestedEvent[js.Function1[/* query */ Query, active | inactive | restricting]]
  /**
    * This event is fired for the given provider when a query is canceled. The listener should stop any ongoing fetch
    * or creation of results and clean up its resources.
    * @param query The query that was canceled.
    */
  val onQueryCanceled: _UrlbarOnQueryCanceledEvent[js.Function1[/* query */ Query, Unit]]
  /**
    * When a query starts, this event is fired for the given provider if the provider is active for the query and
    * there are no other providers that are restricting. Its purpose is to request the provider's results for the
    * query. The listener should return a list of results in response.
    * @param query The query for which results are requested.
    * @returns The results that the provider fetched for the query.
    */
  val onResultsRequested: _UrlbarOnResultsRequestedEvent[js.Function1[/* query */ Query, js.Array[Result]]]
  /* urlbar properties */
  /** Enables or disables the open-view-on-focus mode. */
  val openViewOnFocus: Setting
}

object Typeofurlbar {
  @scala.inline
  def apply(
    contextualTip: TypeofcontextualTip,
    engagementTelemetry: Setting,
    onBehaviorRequested: _UrlbarOnBehaviorRequestedEvent[js.Function1[/* query */ Query, active | inactive | restricting]],
    onQueryCanceled: _UrlbarOnQueryCanceledEvent[js.Function1[/* query */ Query, Unit]],
    onResultsRequested: _UrlbarOnResultsRequestedEvent[js.Function1[/* query */ Query, js.Array[Result]]],
    openViewOnFocus: Setting
  ): Typeofurlbar = {
    val __obj = js.Dynamic.literal(contextualTip = contextualTip, engagementTelemetry = engagementTelemetry, onBehaviorRequested = onBehaviorRequested, onQueryCanceled = onQueryCanceled, onResultsRequested = onResultsRequested, openViewOnFocus = openViewOnFocus)
  
    __obj.asInstanceOf[Typeofurlbar]
  }
}

