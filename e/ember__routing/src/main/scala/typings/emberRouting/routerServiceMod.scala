package typings.emberRouting

import typings.emberRouting.emberRoutingStrings.routeDidChange
import typings.emberRouting.emberRoutingStrings.routeWillChange
import typings.emberRouting.routeInfoMod.RouteInfo
import typings.emberRouting.transitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/routing/router-service", JSImport.Namespace)
@js.native
object routerServiceMod extends js.Object {
  @js.native
  trait RouterService
    extends typings.emberObject.mod.default {
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
      options: AnonQueryParams
    ): Boolean = js.native
    def isActive(
      routeName: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      options: AnonQueryParams
    ): Boolean = js.native
    def isActive(routeName: String, modelsA: RouteModel, modelsB: RouteModel, options: AnonQueryParams): Boolean = js.native
    def isActive(routeName: String, models: RouteModel): Boolean = js.native
    def isActive(routeName: String, models: RouteModel, options: AnonQueryParams): Boolean = js.native
    def isActive(routeName: String, options: AnonQueryParams): Boolean = js.native
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
      options: AnonQueryParams
    ): Transition = js.native
    def replaceWith(
      routeNameOrUrl: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      options: AnonQueryParams
    ): Transition = js.native
    def replaceWith(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel, options: AnonQueryParams): Transition = js.native
    def replaceWith(routeNameOrUrl: String, models: RouteModel): Transition = js.native
    def replaceWith(routeNameOrUrl: String, models: RouteModel, options: AnonQueryParams): Transition = js.native
    def replaceWith(routeNameOrUrl: String, options: AnonQueryParams): Transition = js.native
    def transitionTo(options: AnonQueryParams): Transition = js.native
    // https://emberjs.com/api/ember/release/classes/RouterService/methods/isActive?anchor=transitionTo
    /**
      * Transition the application into another route. The route may
      * be either a single route or route path:
      *
      * See [transitionTo](https://api.emberjs.com/ember/release/classes/Route/methods/transitionTo?anchor=transitionTo) for more info.
      *
      * Calling `transitionTo` from the Router service will cause default query parameter values to be included in the URL.
      * This behavior is different from calling `transitionTo` on a route or `transitionToRoute` on a controller.
      * See the [Router Service RFC](https://github.com/emberjs/rfcs/blob/master/text/0095-router-service.md#query-parameter-semantics) for more info.
      *
      * In the following example we use the Router service to navigate to a route with a
      * specific model from a Component.
      *
      * ```app/components/example.js
      * import Component from '@glimmer/component';
      * import { action } from '@ember/object';
      * import { inject as service } from '@ember/service';
      *
      * export default class extends Component {
      *   @service router;
      *
      *   @action
      *   goToComments(post) {
      *     this.router.transitionTo('comments', post);
      *   }
      * }
      * ```
      *
      * @param routeNameOrUrl the name of the route or a URL
      * @param models         the model(s) or identifier(s) to be used while
      *                       transitioning to the route.
      * @param options        optional hash with a queryParams property
      *                       containing a mapping of query parameters. May be
      *                       supplied as the only parameter to trigger a
      *                       query-parameter-only transition.
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
      options: AnonQueryParams
    ): Transition = js.native
    def transitionTo(
      routeNameOrUrl: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      options: AnonQueryParams
    ): Transition = js.native
    def transitionTo(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel, options: AnonQueryParams): Transition = js.native
    def transitionTo(routeNameOrUrl: String, models: RouteModel): Transition = js.native
    def transitionTo(routeNameOrUrl: String, models: RouteModel, options: AnonQueryParams): Transition = js.native
    def transitionTo(routeNameOrUrl: String, options: AnonQueryParam): Transition = js.native
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
      options: AnonQueryParams
    ): String = js.native
    def urlFor(
      routeName: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      options: AnonQueryParams
    ): String = js.native
    def urlFor(routeName: String, modelsA: RouteModel, modelsB: RouteModel, options: AnonQueryParams): String = js.native
    def urlFor(routeName: String, models: RouteModel): String = js.native
    def urlFor(routeName: String, models: RouteModel, options: AnonQueryParams): String = js.native
    def urlFor(routeName: String, options: AnonQueryParams): String = js.native
  }
  
  @js.native
  class default () extends RouterService
  
  // tslint:disable-next-line:strict-export-declare-modifiers
  type RouteModel = js.Object | String | Double
}

