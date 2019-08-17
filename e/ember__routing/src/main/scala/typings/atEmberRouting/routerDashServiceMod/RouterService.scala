package typings.atEmberRouting.routerDashServiceMod

import typings.atEmberRouting.Anon_QueryParam
import typings.atEmberRouting.Anon_QueryParams
import typings.atEmberRouting.atEmberRoutingStrings.routeDidChange
import typings.atEmberRouting.atEmberRoutingStrings.routeWillChange
import typings.atEmberRouting.dashPrivateRouteDashInfoMod.RouteInfo
import typings.atEmberRouting.dashPrivateTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterService
  extends typings.atEmberService.atEmberServiceMod.default {
  //
  /**
    * A `RouteInfo` that represents the current leaf route.
    * It is guaranteed to change whenever a route transition happens
    * (even when that transition only changes parameters and doesn't change the active route)
    */
  val currentRoute: RouteInfo = js.native
  /**
    * Name of the current route.
    * This property represent the logical name of the route,
    * which is comma separated.
    * For the following router:
    * ```app/router.js
    * Router.map(function() {
    * this.route('about');
    * this.route('blog', function () {
    *     this.route('post', { path: ':post_id' });
    * });
    * });
    * ```
    * It will return:
    * * `index` when you visit `/`
    * * `about` when you visit `/about`
    * * `blog.index` when you visit `/blog`
    * * `blog.post` when you visit `/blog/some-post-id`
    */
  val currentRouteName: String = js.native
  //
  /**
    * Current URL for the application.
    * This property represent the URL path for this route.
    * For the following router:
    * ```app/router.js
    * Router.map(function() {
    * this.route('about');
    * this.route('blog', function () {
    *     this.route('post', { path: ':post_id' });
    * });
    * });
    * ```
    * It will return:
    * * `/` when you visit `/`
    * * `/about` when you visit `/about`
    * * `/blog` when you visit `/blog`
    * * `/blog/some-post-id` when you visit `/blog/some-post-id`
    */
  val currentURL: String = js.native
  //
  /**
    * Determines whether a route is active.
    *
    * @param routeName the name of the route
    * @param models    the model(s) or identifier(s) to be used while
    *                  transitioning to the route
    * @param options   optional hash with a queryParams property containing a
    *                  mapping of query parameters
    */
  def isActive(routeName: String): Boolean = js.native
  def isActive(routeName: String, modelsA: RouteModel, modelsB: RouteModel): Boolean = js.native
  def isActive(routeName: String, modelsA: RouteModel, modelsB: RouteModel, modelsC: RouteModel): Boolean = js.native
  def isActive(
    routeName: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    modelsD: RouteModel
  ): Boolean = js.native
  def isActive(
    routeName: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    modelsD: RouteModel,
    options: Anon_QueryParams
  ): Boolean = js.native
  def isActive(
    routeName: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    options: Anon_QueryParams
  ): Boolean = js.native
  def isActive(routeName: String, modelsA: RouteModel, modelsB: RouteModel, options: Anon_QueryParams): Boolean = js.native
  def isActive(routeName: String, models: RouteModel): Boolean = js.native
  def isActive(routeName: String, models: RouteModel, options: Anon_QueryParams): Boolean = js.native
  def isActive(routeName: String, options: Anon_QueryParams): Boolean = js.native
  // https://api.emberjs.com/ember/3.6/classes/RouterService/events/routeDidChange?anchor=routeDidChange
  /**
    * Register a callback for an event.
    *
    * The `routeWillChange` event is fired at the beginning of any attempted transition with a `Transition` object as the sole argument.
    * This action can be used for aborting, redirecting, or decorating the transition from the currently active routes.
    *
    * The `routeDidChange` event only fires once a transition has settled.
    * This includes aborts and error substates.
    * Like the `routeWillChange` event it recieves a `Transition` as the sole argument.
    *
    * @param name     the name of the event
    * @param callback the callback to execute
    */
  @JSName("on")
  def on_routeDidChange(name: routeDidChange, callback: js.Function1[/* transition */ Transition, Unit]): RouterService = js.native
  @JSName("on")
  def on_routeWillChange(name: routeWillChange, callback: js.Function1[/* transition */ Transition, Unit]): RouterService = js.native
  // https://emberjs.com/api/ember/2.18/classes/RouterService/methods/isActive?anchor=replaceWith
  /**
    * Transition into another route while replacing the current URL, if
    * possible. The route may be either a single route or route path.
    *
    * @param routeNameOrUrl the name of the route or a URL
    * @param models         the model(s) or identifier(s) to be used while
    *                       transitioning to the route.
    * @param options        optional hash with a queryParams property
    *                       containing a mapping of query parameters
    * @returns              the Transition object associated with this attempted transition
    */
  def replaceWith(routeNameOrUrl: String): Transition = js.native
  def replaceWith(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel): Transition = js.native
  def replaceWith(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel, modelsC: RouteModel): Transition = js.native
  def replaceWith(
    routeNameOrUrl: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    modelsD: RouteModel
  ): Transition = js.native
  def replaceWith(
    routeNameOrUrl: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    modelsD: RouteModel,
    options: Anon_QueryParams
  ): Transition = js.native
  def replaceWith(
    routeNameOrUrl: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    options: Anon_QueryParams
  ): Transition = js.native
  def replaceWith(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel, options: Anon_QueryParams): Transition = js.native
  def replaceWith(routeNameOrUrl: String, models: RouteModel): Transition = js.native
  def replaceWith(routeNameOrUrl: String, models: RouteModel, options: Anon_QueryParams): Transition = js.native
  def replaceWith(routeNameOrUrl: String, options: Anon_QueryParams): Transition = js.native
  // https://emberjs.com/api/ember/2.18/classes/RouterService/methods/isActive?anchor=transitionTo
  /**
    * Transition the application into another route. The route may be
    * either a single route or route path
    *
    * @param routeNameOrUrl the name of the route or a URL
    * @param models         the model(s) or identifier(s) to be used while
    *                       transitioning to the route.
    * @param options        optional hash with a queryParams property
    *                       containing a mapping of query parameters
    * @returns              the Transition object associated with this attempted transition
    */
  def transitionTo(routeNameOrUrl: String): Transition = js.native
  def transitionTo(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel): Transition = js.native
  def transitionTo(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel, modelsC: RouteModel): Transition = js.native
  def transitionTo(
    routeNameOrUrl: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    modelsD: RouteModel
  ): Transition = js.native
  def transitionTo(
    routeNameOrUrl: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    modelsD: RouteModel,
    options: Anon_QueryParams
  ): Transition = js.native
  def transitionTo(
    routeNameOrUrl: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    options: Anon_QueryParams
  ): Transition = js.native
  def transitionTo(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel, options: Anon_QueryParams): Transition = js.native
  def transitionTo(routeNameOrUrl: String, models: RouteModel): Transition = js.native
  def transitionTo(routeNameOrUrl: String, models: RouteModel, options: Anon_QueryParams): Transition = js.native
  def transitionTo(routeNameOrUrl: String, options: Anon_QueryParam): Transition = js.native
  // https://emberjs.com/api/ember/2.18/classes/RouterService/methods/isActive?anchor=urlFor
  /**
    * Generate a URL based on the supplied route name.
    *
    * @param routeName the name of the route or a URL
    * @param models    the model(s) or identifier(s) to be used while
    *                  transitioning to the route.
    * @param options   optional hash with a queryParams property containing
    *                  a mapping of query parameters
    * @returns         the string representing the generated URL
    */
  def urlFor(routeName: String): String = js.native
  def urlFor(routeName: String, modelsA: RouteModel, modelsB: RouteModel): String = js.native
  def urlFor(routeName: String, modelsA: RouteModel, modelsB: RouteModel, modelsC: RouteModel): String = js.native
  def urlFor(
    routeName: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    modelsD: RouteModel
  ): String = js.native
  def urlFor(
    routeName: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    modelsD: RouteModel,
    options: Anon_QueryParams
  ): String = js.native
  def urlFor(
    routeName: String,
    modelsA: RouteModel,
    modelsB: RouteModel,
    modelsC: RouteModel,
    options: Anon_QueryParams
  ): String = js.native
  def urlFor(routeName: String, modelsA: RouteModel, modelsB: RouteModel, options: Anon_QueryParams): String = js.native
  def urlFor(routeName: String, models: RouteModel): String = js.native
  def urlFor(routeName: String, models: RouteModel, options: Anon_QueryParams): String = js.native
  def urlFor(routeName: String, options: Anon_QueryParams): String = js.native
}

