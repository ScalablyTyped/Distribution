package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurandalRouterBase[T] extends DurandalEventSupport[T] {
  /**
    * An observable surfacing the active routing instruction that is currently being processed or has recently finished processing.
    * The instruction object has `config`, `fragment`, `queryString`, `params` and `queryParams` properties.
    */
  @JSName("activeInstruction")
  var activeInstruction_Original: knockoutLib.KnockoutObservable[DurandalRouteInstruction] = js.native
  /**
    * The active item/screen based on the current navigation state.
    */
  var activeItem: DurandalActivator[_] = js.native
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
      (DurandalPromise[scala.Boolean | java.lang.String]) | scala.Boolean | java.lang.String
    ]
  ] = js.native
  /**
    * The route handlers that are registered. Each handler consists of a `routePattern` and a `callback`.
    */
  var handlers: js.Array[Anon_Callback] = js.native
  /**
    * Indicates that the router (or a child router) is currently in the process of navigating.
    */
  var isNavigating: knockoutLib.KnockoutComputed[scala.Boolean] = js.native
  /**
    * The route configurations that have been designated as displayable in a nav ui (nav:true).
    */
  var navigationModel: knockoutLib.KnockoutObservableArray[DurandalRouteConfiguration] = js.native
  /**
    * Parent router of the current child router.
    */
  var parent: js.UndefOr[DurandalRouter] = js.native
  /**
    * The route configs that are registered.
    */
  var routes: js.Array[DurandalRouteConfiguration] = js.native
  /**
    * An observable surfacing the active routing instruction that is currently being processed or has recently finished processing.
    * The instruction object has `config`, `fragment`, `queryString`, `params` and `queryParams` properties.
    */
  def activeInstruction(): DurandalRouteInstruction = js.native
  /**
    * An observable surfacing the active routing instruction that is currently being processed or has recently finished processing.
    * The instruction object has `config`, `fragment`, `queryString`, `params` and `queryParams` properties.
    */
  def activeInstruction(value: DurandalRouteInstruction): scala.Unit = js.native
  /**
    * Builds an observable array designed to bind a navigation UI to. The model will exist in the `navigationModel` property.
    * @param {number} defaultOrder The default order to use for navigation visible routes that don't specify an order. The defualt is 100.
    * @chainable
    */
  def buildNavigationModel(): T = js.native
  def buildNavigationModel(defaultOrder: scala.Double): T = js.native
  /**
    * Converts a route to a hash suitable for binding to a link's href.
    * @param {string} route
    * @returns {string} The hash.
    */
  def convertRouteToHash(route: java.lang.String): java.lang.String = js.native
  /**
    * Converts a route to a module id. This is only called if no module id is supplied as part of the route mapping.
    * @param {string} route
    * @returns {string} The module id.
    */
  def convertRouteToModuleId(route: java.lang.String): java.lang.String = js.native
  /**
    * Converts a route to a displayable title. This is only called if no title is specified as part of the route mapping.
    * @method convertRouteToTitle
    * @param {string} route
    * @returns {string} The title.
    */
  def convertRouteToTitle(route: java.lang.String): java.lang.String = js.native
  /**
    * Creates a child router.
    * @returns {Router} The child router.
    */
  def createChildRouter(): T = js.native
  /**
    * Attempt to load the specified URL fragment. If a route succeeds with a match, returns `true`. If no defined routes matches the fragment, returns `false`.
    * @param {string} fragment The URL fragment to find a match for.
    * @returns {boolean} True if a match was found, false otherwise.
    */
  def loadUrl(fragment: java.lang.String): scala.Boolean = js.native
  /**
    * Makes all configured routes and/or module ids relative to a certain base url.
    * @param {RelativeRouteSettings} settings If an object, you can specify `route` and `moduleId` separately. In place of specifying route, you can set `fromParent:true` to make routes automatically relative to the parent router's active route.
    * @chainable
    */
  def makeRelative(settings: DurandalRelativeRouteSettings): T = js.native
  /**
    * Makes all configured routes and/or module ids relative to a certain base url.
    * @param {string} settings The value is used as the base for routes and module ids.
    * @chainable
    */
  def makeRelative(settings: java.lang.String): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {RouteConfiguration} config The route's configuration.
    * @chainable
    */
  def map(config: DurandalRouteConfiguration): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {RouteConfiguration[]} configs An array of route configurations.
    * @chainable
    */
  def map(configs: js.Array[DurandalRouteConfiguration]): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {string} route A route.
    * @chainable
    */
  def map(route: java.lang.String): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {string} route A route pattern.
    * @param {RouteConfiguration} config The route's configuration.
    * @chainable
    */
  def map(route: java.lang.String, config: DurandalRouteConfiguration): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {string} route A route pattern.
    * @param {string} moduleId The module id to map the route to.
    * @chainable
    */
  def map(route: java.lang.String, moduleId: java.lang.String): T = js.native
  /**
    * Maps route patterns to modules.
    * @method map
    * @param {RegExp} route A route pattern.
    * @param {RouteConfiguration} config The route's configuration.
    * @chainable
    */
  def map(route: stdLib.RegExp, config: DurandalRouteConfiguration): T = js.native
  /**
    * Maps route patterns to modules.
    * @param {RegExp} route A route pattern.
    * @param {string} moduleId The module id to map the route to.
    * @chainable
    */
  def map(route: stdLib.RegExp, moduleId: java.lang.String): T = js.native
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
  def mapUnknownRoutes(callback: js.Function1[/* instruction */ DurandalRouteInstruction, scala.Unit]): T = js.native
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
  def mapUnknownRoutes(notFoundModuleId: java.lang.String): T = js.native
  def mapUnknownRoutes(notFoundModuleId: java.lang.String, replaceRoute: java.lang.String): T = js.native
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
  def navigate(fragment: java.lang.String): scala.Boolean = js.native
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
  def navigate(fragment: java.lang.String, options: DurandalNavigationOptions): scala.Boolean = js.native
  def navigate(fragment: java.lang.String, trigger: scala.Boolean): scala.Boolean = js.native
  /**
    * Navigates back in the browser history.
    */
  def navigateBack(): scala.Unit = js.native
  /**
    * Parses a query string into an object.
    * @param {string} queryString The query string to parse.
    * @returns {object} An object keyed according to the query string parameters.
    */
  def parseQueryString(queryString: java.lang.String): js.Object = js.native
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
  def route(routePattern: stdLib.RegExp, callback: js.Function1[/* fragment */ java.lang.String, scala.Unit]): scala.Unit = js.native
  /**
    * Updates the document title based on the activated module instance, the routing instruction and the app.title.
    * @param {object} instance The activated module.
    * @param {object} instruction The routing instruction associated with the action. It has a `config` property that references the original route mapping config.
    */
  def updateDocumentTitle(instance: js.Object, instruction: DurandalRouteInstruction): scala.Unit = js.native
}

