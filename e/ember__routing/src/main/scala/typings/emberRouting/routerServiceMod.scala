package typings.emberRouting

import typings.emberRouting.anon.QueryParam
import typings.emberRouting.anon.QueryParams
import typings.emberRouting.emberRoutingStrings.routeDidChange
import typings.emberRouting.emberRoutingStrings.routeWillChange
import typings.emberRouting.routeInfoMod.RouteInfo
import typings.emberRouting.routeInfoWithAttributesMod.RouteInfoWithAttributes
import typings.emberRouting.transitionMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerServiceMod {
  
  @JSImport("@ember/routing/router-service", JSImport.Default)
  @js.native
  class default () extends RouterService
  
  // tslint:disable-next-line:strict-export-declare-modifiers
  type RouteModel = js.Object | String | Double
  
  @js.native
  trait RouterService
    extends typings.emberService.mod.default {
    
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
      options: QueryParams
    ): Boolean = js.native
    def isActive(
      routeName: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      options: QueryParams
    ): Boolean = js.native
    def isActive(routeName: String, modelsA: RouteModel, modelsB: RouteModel, options: QueryParams): Boolean = js.native
    def isActive(routeName: String, models: RouteModel): Boolean = js.native
    def isActive(routeName: String, models: RouteModel, options: QueryParams): Boolean = js.native
    def isActive(routeName: String, options: QueryParams): Boolean = js.native
    
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
    def on_routeDidChange(name: routeDidChange, callback: js.Function1[/* transition */ Transition[_], Unit]): RouterService = js.native
    @JSName("on")
    def on_routeWillChange(name: routeWillChange, callback: js.Function1[/* transition */ Transition[_], Unit]): RouterService = js.native
    
    /**
      * Takes a string URL and returns a `RouteInfo` for the leafmost route represented
      * by the URL. Returns `null` if the URL is not recognized. This method expects to
      * receive the actual URL as seen by the browser including the app's `rootURL`.
      * See [RouteInfo](/ember/release/classes/RouteInfo) for more info.
      * In the following example `recognize` is used to verify if a path belongs to our
      * application before transitioning to it.
      * ```
      * import Component from '@ember/component';
      * import { inject as service } from '@ember/service';
      * export default class extends Component {
      *   @service router;
      *   path = '/';
      *   click() {
      *     if (this.router.recognize(this.path)) {
      *       this.router.transitionTo(this.path);
      *     }
      *   }
      * }
      * ```
      */
    def recognize(url: String): RouteInfo = js.native
    
    /**
      * Takes a string URL and returns a promise that resolves to a
      * `RouteInfoWithAttributes` for the leafmost route represented by the URL.
      * The promise rejects if the URL is not recognized or an unhandled exception
      * is encountered. This method expects to receive the actual URL as seen by
      * the browser including the app's `rootURL`.
      */
    def recognizeAndLoad(url: String): RouteInfoWithAttributes = js.native
    
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
    def replaceWith(routeNameOrUrl: String): Transition[_] = js.native
    def replaceWith(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel): Transition[_] = js.native
    def replaceWith(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel, modelsC: RouteModel): Transition[_] = js.native
    def replaceWith(
      routeNameOrUrl: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      modelsD: RouteModel
    ): Transition[_] = js.native
    def replaceWith(
      routeNameOrUrl: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      modelsD: RouteModel,
      options: QueryParams
    ): Transition[_] = js.native
    def replaceWith(
      routeNameOrUrl: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      options: QueryParams
    ): Transition[_] = js.native
    def replaceWith(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel, options: QueryParams): Transition[_] = js.native
    def replaceWith(routeNameOrUrl: String, models: RouteModel): Transition[_] = js.native
    def replaceWith(routeNameOrUrl: String, models: RouteModel, options: QueryParams): Transition[_] = js.native
    def replaceWith(routeNameOrUrl: String, options: QueryParams): Transition[_] = js.native
    
    /**
      * The `rootURL` property represents the URL of the root of
      * the application, '/' by default.
      * This prefix is assumed on all routes defined on this app.
      * If you change the `rootURL` in your environment configuration
      * like so:
      * ```config/environment.js
      * 'use strict';
      * module.exports = function(environment) {
      *   let ENV = {
      *     modulePrefix: 'router-service',
      *     environment,
      *     rootURL: '/my-root',
      *   …
      *   }
      * ]
      * ```
      * This property will return `/my-root`.
      */
    val rootURL: String = js.native
    
    def transitionTo(options: QueryParams): Transition[_] = js.native
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
    def transitionTo(routeNameOrUrl: String): Transition[_] = js.native
    def transitionTo(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel): Transition[_] = js.native
    def transitionTo(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel, modelsC: RouteModel): Transition[_] = js.native
    def transitionTo(
      routeNameOrUrl: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      modelsD: RouteModel
    ): Transition[_] = js.native
    def transitionTo(
      routeNameOrUrl: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      modelsD: RouteModel,
      options: QueryParams
    ): Transition[_] = js.native
    def transitionTo(
      routeNameOrUrl: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      options: QueryParams
    ): Transition[_] = js.native
    def transitionTo(routeNameOrUrl: String, modelsA: RouteModel, modelsB: RouteModel, options: QueryParams): Transition[_] = js.native
    def transitionTo(routeNameOrUrl: String, models: RouteModel): Transition[_] = js.native
    def transitionTo(routeNameOrUrl: String, models: RouteModel, options: QueryParams): Transition[_] = js.native
    def transitionTo(routeNameOrUrl: String, options: QueryParam): Transition[_] = js.native
    
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
      options: QueryParams
    ): String = js.native
    def urlFor(
      routeName: String,
      modelsA: RouteModel,
      modelsB: RouteModel,
      modelsC: RouteModel,
      options: QueryParams
    ): String = js.native
    def urlFor(routeName: String, modelsA: RouteModel, modelsB: RouteModel, options: QueryParams): String = js.native
    def urlFor(routeName: String, models: RouteModel): String = js.native
    def urlFor(routeName: String, models: RouteModel, options: QueryParams): String = js.native
    def urlFor(routeName: String, options: QueryParams): String = js.native
  }
}
