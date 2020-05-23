package typings.firefoxWebextBrowser.global.browser

import typings.firefoxWebextBrowser.WebExtEvent
import typings.firefoxWebextBrowser.browser.types.Setting
import typings.firefoxWebextBrowser.browser.urlbar.Query
import typings.firefoxWebextBrowser.browser.urlbar.Result
import typings.firefoxWebextBrowser.browser.urlbar.UrlbarOnBehaviorRequestedEvent
import typings.firefoxWebextBrowser.browser.urlbar.UrlbarOnQueryCanceledEvent
import typings.firefoxWebextBrowser.browser.urlbar.UrlbarOnResultsRequestedEvent
import typings.firefoxWebextBrowser.browser.urlbar.contextualTip.ContextualTip
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.active
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.inactive
import typings.firefoxWebextBrowser.firefoxWebextBrowserStrings.restricting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Use the `browser.urlbar` API to experiment with new features in the URLBar. Restricted to Mozilla privileged
  * WebExtensions.
  *
  * Permissions: `urlbar`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.urlbar")
@js.native
object urlbar extends js.Object {
  /** Enables or disables the engagement telemetry. */
  val engagementTelemetry: Setting = js.native
  /* urlbar events */
  /**
    * Before a query starts, this event is fired for the given provider. Its purpose is to request the provider's
    * behavior for the query. The listener should return a behavior in response. By default, providers are inactive,
    * so if your provider should always be inactive, you don't need to listen for this event.
    * @param query The query for which the behavior is requested.
    * @returns The behavior of the provider for the query.
    */
  val onBehaviorRequested: UrlbarOnBehaviorRequestedEvent[js.Function1[/* query */ Query, active | inactive | restricting]] = js.native
  /**
    * This event is fired for the given provider when a query is canceled. The listener should stop any ongoing fetch
    * or creation of results and clean up its resources.
    * @param query The query that was canceled.
    */
  val onQueryCanceled: UrlbarOnQueryCanceledEvent[js.Function1[/* query */ Query, Unit]] = js.native
  /**
    * When a query starts, this event is fired for the given provider if the provider is active for the query and
    * there are no other providers that are restricting. Its purpose is to request the provider's results for the
    * query. The listener should return a list of results in response.
    * @param query The query for which results are requested.
    * @returns The results that the provider fetched for the query.
    */
  val onResultsRequested: UrlbarOnResultsRequestedEvent[js.Function1[/* query */ Query, js.Array[Result]]] = js.native
  /* urlbar properties */
  /** Enables or disables the open-view-on-focus mode. */
  val openViewOnFocus: Setting = js.native
  /**
    * A contextual tip appears in the urlbar's view (its search results panel) and has an icon, text, optional button, and
    * an optional link. Use the `browser.urlbar.contextualTip` API to experiment with the contextual tip. Restricted to
    * Mozilla privileged WebExtensions.
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  @js.native
  object contextualTip extends js.Object {
    /* urlbar.contextualTip events */
    /**
      * Fired when the user clicks the contextual tip's button.
      * @param windowId The id of the window where the contextual tip's button was clicked.
      */
    val onButtonClicked: WebExtEvent[js.Function1[/* windowId */ Double, Unit]] = js.native
    /**
      * Fired when the user clicks the contextual tip's link.
      * @param windowId The id of the window where the contextual tip's link was clicked.
      */
    val onLinkClicked: WebExtEvent[js.Function1[/* windowId */ Double, Unit]] = js.native
    /** Hides the contextual tip (it will still be in the DOM). */
    def remove(): Unit = js.native
    /* urlbar.contextualTip functions */
    /**
      * Sets the contextual tip in the most recent browser winodw with the given icon, title, button title, and link
      * title. If the urlbar's view is not already open, then it will be opened so the contextual tip will be visible.
      * Note that when the urlbar's view is closed, the contextual tip is hidden and will not appear again.
      * `browser.urlbar.contextualTip.set` must be called each time a contextual tip should appear.
      * @param details Specifies the contextual tip's texts.
      */
    def set(details: ContextualTip): Unit = js.native
  }
  
}

