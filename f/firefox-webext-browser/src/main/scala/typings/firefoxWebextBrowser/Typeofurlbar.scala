package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.types.Setting
import typings.firefoxWebextBrowser.browser.urlbar.Query
import typings.firefoxWebextBrowser.browser.urlbar.Result
import typings.firefoxWebextBrowser.browser.urlbar.UrlbarOnBehaviorRequestedEvent
import typings.firefoxWebextBrowser.browser.urlbar.UrlbarOnQueryCanceledEvent
import typings.firefoxWebextBrowser.browser.urlbar.UrlbarOnResultsRequestedEvent
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.inactive
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.restricting
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
  val onBehaviorRequested: UrlbarOnBehaviorRequestedEvent[js.Function1[/* query */ Query, active | inactive | restricting]]
  /**
    * This event is fired for the given provider when a query is canceled. The listener should stop any ongoing fetch
    * or creation of results and clean up its resources.
    * @param query The query that was canceled.
    */
  val onQueryCanceled: UrlbarOnQueryCanceledEvent[js.Function1[/* query */ Query, Unit]]
  /**
    * When a query starts, this event is fired for the given provider if the provider is active for the query and
    * there are no other providers that are restricting. Its purpose is to request the provider's results for the
    * query. The listener should return a list of results in response.
    * @param query The query for which results are requested.
    * @returns The results that the provider fetched for the query.
    */
  val onResultsRequested: UrlbarOnResultsRequestedEvent[js.Function1[/* query */ Query, js.Array[Result]]]
  /* urlbar properties */
  /** Enables or disables the open-view-on-focus mode. */
  val openViewOnFocus: Setting
}

object Typeofurlbar {
  @scala.inline
  def apply(
    contextualTip: TypeofcontextualTip,
    engagementTelemetry: Setting,
    onBehaviorRequested: UrlbarOnBehaviorRequestedEvent[js.Function1[/* query */ Query, active | inactive | restricting]],
    onQueryCanceled: UrlbarOnQueryCanceledEvent[js.Function1[/* query */ Query, Unit]],
    onResultsRequested: UrlbarOnResultsRequestedEvent[js.Function1[/* query */ Query, js.Array[Result]]],
    openViewOnFocus: Setting
  ): Typeofurlbar = {
    val __obj = js.Dynamic.literal(contextualTip = contextualTip.asInstanceOf[js.Any], engagementTelemetry = engagementTelemetry.asInstanceOf[js.Any], onBehaviorRequested = onBehaviorRequested.asInstanceOf[js.Any], onQueryCanceled = onQueryCanceled.asInstanceOf[js.Any], onResultsRequested = onResultsRequested.asInstanceOf[js.Any], openViewOnFocus = openViewOnFocus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Typeofurlbar]
  }
}

