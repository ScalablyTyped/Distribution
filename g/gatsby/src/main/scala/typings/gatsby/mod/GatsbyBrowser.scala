package typings.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GatsbyBrowser extends js.Object {
  var disableCorePrefetching: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.undefined
  var onClientEntry: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.undefined
  var onInitialClientRender: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.undefined
  var onPostPrefetchPathname: js.UndefOr[js.Function2[/* args */ PrefetchPathnameArgs, /* options */ PluginOptions, _]] = js.undefined
  var onPreRouteUpdate: js.UndefOr[js.Function2[/* args */ RouteUpdateArgs, /* options */ PluginOptions, _]] = js.undefined
  var onPrefetchPathname: js.UndefOr[js.Function2[/* args */ PrefetchPathnameArgs, /* options */ PluginOptions, _]] = js.undefined
  var onRouteUpdate: js.UndefOr[js.Function2[/* args */ RouteUpdateArgs, /* options */ PluginOptions, _]] = js.undefined
  var onRouteUpdateDelayed: js.UndefOr[js.Function2[/* args */ RouteUpdateDelayedArgs, /* options */ PluginOptions, _]] = js.undefined
  var onServiceWorkerActive: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.undefined
  var onServiceWorkerInstalled: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.undefined
  var onServiceWorkerRedundant: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.undefined
  var onServiceWorkerUpdateFound: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.undefined
  var onServiceWorkerUpdateReady: js.UndefOr[js.Function2[/* args */ ServiceWorkerArgs, /* options */ PluginOptions, _]] = js.undefined
  var registerServiceWorker: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.undefined
  var replaceComponentRenderer: js.UndefOr[
    js.Function2[/* args */ ReplaceComponentRendererArgs, /* options */ PluginOptions, _]
  ] = js.undefined
  var replaceHydrateFunction: js.UndefOr[js.Function2[/* args */ BrowserPluginArgs, /* options */ PluginOptions, _]] = js.undefined
  var shouldUpdateScroll: js.UndefOr[js.Function2[/* args */ ShouldUpdateScrollArgs, /* options */ PluginOptions, _]] = js.undefined
  var wrapPageElement: js.UndefOr[
    js.Function2[
      /* args */ WrapPageElementBrowserArgs[js.Object, js.Object], 
      /* options */ PluginOptions, 
      _
    ]
  ] = js.undefined
  var wrapRootElement: js.UndefOr[
    js.Function2[/* args */ WrapRootElementBrowserArgs, /* options */ PluginOptions, _]
  ] = js.undefined
}

object GatsbyBrowser {
  @scala.inline
  def apply(
    disableCorePrefetching: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => _ = null,
    onClientEntry: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => _ = null,
    onInitialClientRender: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => _ = null,
    onPostPrefetchPathname: (/* args */ PrefetchPathnameArgs, /* options */ PluginOptions) => _ = null,
    onPreRouteUpdate: (/* args */ RouteUpdateArgs, /* options */ PluginOptions) => _ = null,
    onPrefetchPathname: (/* args */ PrefetchPathnameArgs, /* options */ PluginOptions) => _ = null,
    onRouteUpdate: (/* args */ RouteUpdateArgs, /* options */ PluginOptions) => _ = null,
    onRouteUpdateDelayed: (/* args */ RouteUpdateDelayedArgs, /* options */ PluginOptions) => _ = null,
    onServiceWorkerActive: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => _ = null,
    onServiceWorkerInstalled: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => _ = null,
    onServiceWorkerRedundant: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => _ = null,
    onServiceWorkerUpdateFound: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => _ = null,
    onServiceWorkerUpdateReady: (/* args */ ServiceWorkerArgs, /* options */ PluginOptions) => _ = null,
    registerServiceWorker: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => _ = null,
    replaceComponentRenderer: (/* args */ ReplaceComponentRendererArgs, /* options */ PluginOptions) => _ = null,
    replaceHydrateFunction: (/* args */ BrowserPluginArgs, /* options */ PluginOptions) => _ = null,
    shouldUpdateScroll: (/* args */ ShouldUpdateScrollArgs, /* options */ PluginOptions) => _ = null,
    wrapPageElement: (/* args */ WrapPageElementBrowserArgs[js.Object, js.Object], /* options */ PluginOptions) => _ = null,
    wrapRootElement: (/* args */ WrapRootElementBrowserArgs, /* options */ PluginOptions) => _ = null
  ): GatsbyBrowser = {
    val __obj = js.Dynamic.literal()
    if (disableCorePrefetching != null) __obj.updateDynamic("disableCorePrefetching")(js.Any.fromFunction2(disableCorePrefetching))
    if (onClientEntry != null) __obj.updateDynamic("onClientEntry")(js.Any.fromFunction2(onClientEntry))
    if (onInitialClientRender != null) __obj.updateDynamic("onInitialClientRender")(js.Any.fromFunction2(onInitialClientRender))
    if (onPostPrefetchPathname != null) __obj.updateDynamic("onPostPrefetchPathname")(js.Any.fromFunction2(onPostPrefetchPathname))
    if (onPreRouteUpdate != null) __obj.updateDynamic("onPreRouteUpdate")(js.Any.fromFunction2(onPreRouteUpdate))
    if (onPrefetchPathname != null) __obj.updateDynamic("onPrefetchPathname")(js.Any.fromFunction2(onPrefetchPathname))
    if (onRouteUpdate != null) __obj.updateDynamic("onRouteUpdate")(js.Any.fromFunction2(onRouteUpdate))
    if (onRouteUpdateDelayed != null) __obj.updateDynamic("onRouteUpdateDelayed")(js.Any.fromFunction2(onRouteUpdateDelayed))
    if (onServiceWorkerActive != null) __obj.updateDynamic("onServiceWorkerActive")(js.Any.fromFunction2(onServiceWorkerActive))
    if (onServiceWorkerInstalled != null) __obj.updateDynamic("onServiceWorkerInstalled")(js.Any.fromFunction2(onServiceWorkerInstalled))
    if (onServiceWorkerRedundant != null) __obj.updateDynamic("onServiceWorkerRedundant")(js.Any.fromFunction2(onServiceWorkerRedundant))
    if (onServiceWorkerUpdateFound != null) __obj.updateDynamic("onServiceWorkerUpdateFound")(js.Any.fromFunction2(onServiceWorkerUpdateFound))
    if (onServiceWorkerUpdateReady != null) __obj.updateDynamic("onServiceWorkerUpdateReady")(js.Any.fromFunction2(onServiceWorkerUpdateReady))
    if (registerServiceWorker != null) __obj.updateDynamic("registerServiceWorker")(js.Any.fromFunction2(registerServiceWorker))
    if (replaceComponentRenderer != null) __obj.updateDynamic("replaceComponentRenderer")(js.Any.fromFunction2(replaceComponentRenderer))
    if (replaceHydrateFunction != null) __obj.updateDynamic("replaceHydrateFunction")(js.Any.fromFunction2(replaceHydrateFunction))
    if (shouldUpdateScroll != null) __obj.updateDynamic("shouldUpdateScroll")(js.Any.fromFunction2(shouldUpdateScroll))
    if (wrapPageElement != null) __obj.updateDynamic("wrapPageElement")(js.Any.fromFunction2(wrapPageElement))
    if (wrapRootElement != null) __obj.updateDynamic("wrapRootElement")(js.Any.fromFunction2(wrapRootElement))
    __obj.asInstanceOf[GatsbyBrowser]
  }
}

