package typings.durandal

import typings.durandal.anon.Callback
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurandalRouterBase[T]
  extends StObject
     with DurandalEventSupport[T] {
  
  /**
    * An observable surfacing the active routing instruction that is currently being processed or has recently finished processing.
    * The instruction object has `config`, `fragment`, `queryString`, `params` and `queryParams` properties.
    */
  var activeInstruction: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<DurandalRouteInstruction> */ js.Any = js.native
  
  /**
    * The active item/screen based on the current navigation state.
    */
  var activeItem: DurandalActivator[js.Any] = js.native
  
  /**
    * Builds an observable array designed to bind a navigation UI to. The model will exist in the `navigationModel` property.
    * @param {number} defaultOrder The default order to use for navigation visible routes that don't specify an order. The defualt is 100.
    * @chainable
    */
  def buildNavigationModel(): T = js.native
  def buildNavigationModel(defaultOrder: Double): T = js.native
  
  /**
    * Converts a route to a hash suitable for binding to a link's href.
    * @param {string} route
    * @returns {string} The hash.
    */
  def convertRouteToHash(route: String): String = js.native
  
  /**
    * Converts a route to a module id. This is only called if no module id is supplied as part of the route mapping.
    * @param {string} route
    * @returns {string} The module id.
    */
  def convertRouteToModuleId(route: String): String = js.native
  
  /**
    * Converts a route to a displayable title. This is only called if no title is specified as part of the route mapping.
    * @method convertRouteToTitle
    * @param {string} route
    * @returns {string} The title.
    */
  def convertRouteToTitle(route: String): String = js.native
  
  /**
    * Creates a child router.
    * @returns {Router} The child router.
    */
  def createChildRouter(): T = js.native
  
  /**
    * Inspects routes and modules before activation. Can be used to protect access by cancelling navigation or redirecting.
    * @param {object} instance The module instance that is about to be activated by the router.
    * @param {object} instruction The route instruction. The instruction object has config, fragment, queryString, params and queryParams properties.
    * @returns {Promise|Boolean|String} If a boolean, determines whether or not the route should activate or be cancelled. If a string, causes a redirect to the specified route. Can also be a promise for either of these value types.
    */
  var guardRoute: js.UndefOr[
    js.Function2[
      /* instance */ js.Object, 
      /* instruction */ DurandalRouteInstruction, 
      (DurandalPromise[Boolean | String]) | Boolean | String
    ]
  ] = js.native
  
  /**
    * The route handlers that are registered. Each handler consists of a `routePattern` and a `callback`.
    */
  var handlers: js.Array[Callback] = js.native
  
  /**
    * Indicates that the router (or a child router) is currently in the process of navigating.
    */
  var isNavigating: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutComputed<boolean> */ js.Any = js.native
  
  /**
    * Attempt to load the specified URL fragment. If a route succeeds with a match, returns `true`. If no defined routes matches the fragment, returns `false`.
    * @param {string} fragment The URL fragment to find a match for.
    * @returns {boolean} True if a match was found, false otherwise.
    */
  def loadUrl(fragment: String): Boolean = js.native
  
  /**
    * Makes all configured routes and/or module ids relative to a certain base url.
    * @param {string} settings The value is used as the base for routes and module ids.
    * @chainable
    */
  def makeRelative(settings: String): T = js.native
  /**
    * Makes all configured routes and/or module ids relative to a certain base url.
    * @param {RelativeRouteSettings} settings If an object, you can specify `route` and `moduleId` separately. In place of specifying route, you can set `fromParent:true` to make routes automatically relative to the parent router's active route.
    * @chainable
    */
  def makeRelative(settings: DurandalRelativeRouteSettings): T = js.native
  
  /**
    * Maps route patterns to modules.
    * @param {RouteConfiguration[]} configs An array of route configurations.
    * @chainable
    */
  def map(configs: js.Array[DurandalRouteConfiguration]): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {RouteConfiguration} config The route's configuration.
    * @chainable
    */
  def map(config: DurandalRouteConfiguration): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {string} route A route.
    * @chainable
    */
  def map(route: String): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {string} route A route pattern.
    * @param {RouteConfiguration} config The route's configuration.
    * @chainable
    */
  def map(route: String, config: DurandalRouteConfiguration): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {string} route A route pattern.
    * @param {string} moduleId The module id to map the route to.
    * @chainable
    */
  def map(route: String, moduleId: String): T = js.native
  /**
    * Maps route patterns to modules.
    * @method map
    * @param {RegExp} route A route pattern.
    * @param {RouteConfiguration} config The route's configuration.
    * @chainable
    */
  def map(route: RegExp, config: DurandalRouteConfiguration): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {RegExp} route A route pattern.
    * @param {string} moduleId The module id to map the route to.
    * @chainable
    */
  def map(route: RegExp, moduleId: String): T = js.native
  
  /**
    * Configures the router to map unknown routes to modules at the same path.
    * @chainable
    */
  def mapUnknownRoutes(): T = js.native
  /**
    * Configures how the router will handle unknown routes.
    * @param {function} callback Called back with the route instruction containing the route info. The function can then modify the instruction by adding a moduleId and the router will take over from there.
    * @chainable
    */
  def mapUnknownRoutes(callback: js.Function1[/* instruction */ DurandalRouteInstruction, Unit]): T = js.native
  /**
    * Configures how the router will handle unknown routes.
    * @param {RouteConfiguration} config The route configuration to use for unknown routes.
    * @chainable
    */
  def mapUnknownRoutes(config: DurandalRouteConfiguration): T = js.native
  /**
    * Configures the router use the specified module id for all unknown routes.
    * @param {string} notFoundModuleId Represents the module id to route all unknown routes to.
    * @param {string} [replaceRoute] Optionally provide a route to replace the url with.
    * @chainable
    */
  def mapUnknownRoutes(notFoundModuleId: String): T = js.native
  def mapUnknownRoutes(notFoundModuleId: String, replaceRoute: String): T = js.native
  
  /**
    * Save a fragment into the hash history, or replace the URL state if the
    * 'replace' option is passed. You are responsible for properly URL-encoding
    * the fragment in advance.
    * The options object can contain `trigger: false` if you wish to not have the
    * route callback be fired, or `replace: true`, if
    * you wish to modify the current URL without adding an entry to the history.
    * @param {string} fragment The url fragment to navigate to.
    * @param {object|boolean} options An options object with optional trigger and replace flags. You can also pass a boolean directly to set the trigger option. Trigger is `true` by default.
    * @return {boolean} Returns true/false from loading the url.
    */
  def navigate(fragment: String): Boolean = js.native
  /**
    * Save a fragment into the hash history, or replace the URL state if the
    * 'replace' option is passed. You are responsible for properly URL-encoding
    * the fragment in advance.
    * The options object can contain `trigger: false` if you wish to not have the
    * route callback be fired, or `replace: true`, if
    * you wish to modify the current URL without adding an entry to the history.
    * @param {string} fragment The url fragment to navigate to.
    * @param {object|boolean} options An options object with optional trigger and replace flags. You can also pass a boolean directly to set the trigger option. Trigger is `true` by default.
    * @return {boolean} Returns true/false from loading the url.
    */
  def navigate(fragment: String, options: DurandalNavigationOptions): Boolean = js.native
  def navigate(fragment: String, trigger: Boolean): Boolean = js.native
  
  /**
    * Navigates back in the browser history.
    */
  def navigateBack(): Unit = js.native
  
  /**
    * The route configurations that have been designated as displayable in a nav ui (nav:true).
    */
  var navigationModel: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArray<DurandalRouteConfiguration> */ js.Any = js.native
  
  /**
    * Parent router of the current child router.
    */
  var parent: js.UndefOr[DurandalRouter] = js.native
  
  /**
    * Parses a query string into an object.
    * @param {string} queryString The query string to parse.
    * @returns {object} An object keyed according to the query string parameters.
    */
  def parseQueryString(queryString: String): js.Object = js.native
  
  /**
    * Resets the router by removing handlers, routes, event handlers and previously configured options.
    * @chainable
    */
  def reset(): T = js.native
  
  /**
    * Add a route to be tested when the url fragment changes.
    * @param {RegEx} routePattern The route pattern to test against.
    * @param {function} callback The callback to execute when the route pattern is matched.
    */
  def route(routePattern: RegExp, callback: js.Function1[/* fragment */ String, Unit]): Unit = js.native
  
  /**
    * The route configs that are registered.
    */
  var routes: js.Array[DurandalRouteConfiguration] = js.native
  
  /**
    * Updates the document title based on the activated module instance, the routing instruction and the app.title.
    * @param {object} instance The activated module.
    * @param {object} instruction The routing instruction associated with the action. It has a `config` property that references the original route mapping config.
    */
  def updateDocumentTitle(instance: js.Object, instruction: DurandalRouteInstruction): Unit = js.native
}
