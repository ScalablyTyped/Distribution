package typings.atEmberRouting

import org.scalablytyped.runtime.StringDictionary
import typings.atEmberRouting.dashPrivateTransitionMod.Transition
import typings.atEmberRouting.typesMod.RenderOptions
import typings.atEmberRouting.typesMod.RouteQueryParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/routing/route", JSImport.Namespace)
@js.native
object routeMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(ActionHandler, Evented) * / any */ @js.native
  trait Route extends js.Object {
    // properties
    /**
      * The controller associated with this route.
      */
    var controller: typings.atEmberController.atEmberControllerMod.default = js.native
    /**
      * The name of the controller to associate with this route.
      * By default, Ember will lookup a route's controller that matches the name
      * of the route (i.e. `App.PostController` for `App.PostRoute`). However,
      * if you would like to define a specific controller to use, you can do so
      * using this property.
      * This is useful in many ways, as the controller specified will be:
      * * p assed to the `setupController` method.
      * * used as the controller for the view being rendered by the route.
      * * returned from a call to `controllerFor` for the route.
      */
    var controllerName: String = js.native
    /**
      * Configuration hash for this route's queryParams.
      */
    var queryParams: StringDictionary[RouteQueryParam] = js.native
    /**
      * The name of the route, dot-delimited
      */
    var routeName: String = js.native
    /**
      * The name of the template to use by default when rendering this routes
      * template.
      * This is similar with `viewName`, but is useful when you just want a custom
      * template without a view.
      */
    var templateName: String = js.native
    // events
    /**
      * This hook is executed when the router enters the route. It is not executed
      * when the model for the route changes.
      */
    def activate(): Unit = js.native
    // methods
    /**
      * This hook is called after this route's model has resolved.
      * It follows identical async/promise semantics to `beforeModel`
      * but is provided the route's resolved model in addition to
      * the `transition`, and is therefore suited to performing
      * logic that can only take place after the model has already
      * resolved.
      */
    def afterModel(resolvedModel: js.Any, transition: Transition): js.Any = js.native
    /**
      * This hook is the first of the route entry validation hooks
      * called when an attempt is made to transition into a route
      * or one of its children. It is called before `model` and
      * `afterModel`, and is appropriate for cases when:
      * 1) A decision can be made to redirect elsewhere without
      *     needing to resolve the model first.
      * 2) Any async operations need to occur first before the
      *     model is attempted to be resolved.
      * This hook is provided the current `transition` attempt
      * as a parameter, which can be used to `.abort()` the transition,
      * save it for a later `.retry()`, or retrieve values set
      * on it from a previous hook. You can also just call
      * `this.transitionTo` to another route to implicitly
      * abort the `transition`.
      * You can return a promise from this hook to pause the
      * transition until the promise resolves (or rejects). This could
      * be useful, for instance, for retrieving async code from
      * the server that is required to enter a route.
      */
    def beforeModel(transition: Transition): js.Any = js.native
    /**
      * Returns the controller of the current route, or a parent (or any
      * ancestor) route in a route hierarchy.
      *
      * The controller instance must already have been created, either through
      * entering the associated route or using `generateController`.
      *
      * @param name the name of the route or controller
      */
    def controllerFor(name: String): typings.atEmberController.atEmberControllerMod.default = js.native
    /**
      * This hook is executed when the router completely exits this route. It is
      * not executed when the model for the route changes.
      */
    def deactivate(): Unit = js.native
    /**
      * The didTransition action is fired after a transition has successfully been
      * completed. This occurs after the normal model hooks (beforeModel, model,
      * afterModel, setupController) have resolved. The didTransition action has
      * no arguments, however, it can be useful for tracking page views or resetting
      * state on the controller.
      */
    def didTransition(): Unit = js.native
    /**
      * Disconnects a view that has been rendered into an outlet.
      */
    def disconnectOutlet(options: String): Unit = js.native
    def disconnectOutlet(options: Anon_Outlet): Unit = js.native
    /**
      * When attempting to transition into a route, any of the hooks may return a promise
      * that rejects, at which point an error action will be fired on the partially-entered
      * routes, allowing for per-route error handling logic, or shared error handling logic
      * defined on a parent route.
      */
    def error(error: js.Any, transition: Transition): Unit = js.native
    // https://emberjs.com/api/ember/3.2/classes/Route/methods/intermediateTransitionTo?anchor=intermediateTransitionTo
    /**
      * Perform a synchronous transition into another route without attempting to resolve promises,
      * update the URL, or abort any currently active asynchronous transitions
      * (i.e. regular transitions caused by transitionTo or URL changes).
      *
      * @param name           the name of the route or a URL
      * @param object         the model(s) or identifier(s) to be used while
      *                       transitioning to the route.
      * @returns              the Transition object associated with this attempted transition
      */
    def intermediateTransitionTo(name: String, `object`: js.Any*): Transition = js.native
    /**
      * The loading action is fired on the route when a route's model hook returns a
      * promise that is not already resolved. The current Transition object is the first
      * parameter and the route that triggered the loading event is the second parameter.
      */
    def loading(transition: Transition, route: Route): Unit = js.native
    /**
      * A hook you can implement to convert the URL into the model for
      * this route.
      */
    def model(params: js.Object, transition: Transition): js.Any = js.native
    /**
      * Returns the model of a parent (or any ancestor) route
      * in a route hierarchy.  During a transition, all routes
      * must resolve a model object, and if a route
      * needs access to a parent route's model in order to
      * resolve a model (or just reuse the model from a parent),
      * it can call `this.modelFor(theNameOfParentRoute)` to
      * retrieve it.
      */
    def modelFor(name: String): js.Object = js.native
    /**
      * Retrieves parameters, for current route using the state.params
      * variable and getQueryParamsFor, using the supplied routeName.
      */
    def paramsFor(name: String): js.Object = js.native
    /**
      * A hook you can implement to optionally redirect to another route.
      *
      * If you call `this.transitionTo` from inside of this hook, this route
      * will not be entered in favor of the other hook.
      *
      * `redirect` and `afterModel` behave very similarly and are
      * called almost at the same time, but they have an important
      * distinction in the case that, from one of these hooks, a
      * redirect into a child route of this route occurs: redirects
      * from `afterModel` essentially invalidate the current attempt
      * to enter this route, and will result in this route's `beforeModel`,
      * `model`, and `afterModel` hooks being fired again within
      * the new, redirecting transition. Redirects that occur within
      * the `redirect` hook, on the other hand, will _not_ cause
      * these hooks to be fired again the second time around; in
      * other words, by the time the `redirect` hook has been called,
      * both the resolved model and attempted entry into this route
      * are considered to be fully validated.
      */
    def redirect(model: js.Object, transition: Transition): Unit = js.native
    /**
      * Refresh the model on this route and any child routes, firing the
      * `beforeModel`, `model`, and `afterModel` hooks in a similar fashion
      * to how routes are entered when transitioning in from other route.
      * The current route params (e.g. `article_id`) will be passed in
      * to the respective model hooks, and if a different model is returned,
      * `setupController` and associated route hooks will re-fire as well.
      * An example usage of this method is re-querying the server for the
      * latest information using the same parameters as when the route
      * was first entered.
      * Note that this will cause `model` hooks to fire even on routes
      * that were provided a model object when the route was initially
      * entered.
      */
    def refresh(): Transition = js.native
    /**
      * `render` is used to render a template into a region of another template
      * (indicated by an `{{outlet}}`). `render` is used both during the entry
      * phase of routing (via the `renderTemplate` hook) and later in response to
      * user interaction.
      * Not all options need to be passed to render. Default values will be used
      * based on the name of the route specified in the router or the Route's
      * controllerName and templateName properties.
      */
    def render(): Unit = js.native
    def render(name: String): Unit = js.native
    def render(name: String, options: RenderOptions): Unit = js.native
    /**
      * A hook you can use to render the template for the current route.
      * This method is called with the controller for the current route and the
      * model supplied by the `model` hook. By default, it renders the route's
      * template, configured with the controller for the route.
      * This method can be overridden to set up and render additional or
      * alternative templates.
      */
    def renderTemplate(controller: typings.atEmberController.atEmberControllerMod.default, model: js.Object): Unit = js.native
    /**
      * Transition into another route while replacing the current URL, if possible.
      * This will replace the current history entry instead of adding a new one.
      * Beside that, it is identical to `transitionTo` in all other respects. See
      * 'transitionTo' for additional information regarding multiple models.
      */
    def replaceWith(name: String, args: js.Any*): Transition = js.native
    /**
      * A hook you can use to reset controller values either when the model
      * changes or the route is exiting.
      */
    def resetController(
      controller: typings.atEmberController.atEmberControllerMod.default,
      isExiting: Boolean,
      transition: js.Any
    ): Unit = js.native
    /**
      * Sends an action to the router, which will delegate it to the currently active
      * route hierarchy per the bubbling rules explained under actions.
      */
    def send(name: String, args: js.Any*): Unit = js.native
    /**
      * A hook you can implement to convert the route's model into parameters
      * for the URL.
      *
      * The default `serialize` method will insert the model's `id` into the
      * route's dynamic segment (in this case, `:post_id`) if the segment contains '_id'.
      * If the route has multiple dynamic segments or does not contain '_id', `serialize`
      * will return `Ember.getProperties(model, params)`
      * This method is called when `transitionTo` is called with a context
      * in order to populate the URL.
      */
    def serialize(model: js.Object, params: js.Array[String]): String | js.Object = js.native
    /**
      * A hook you can use to setup the controller for the current route.
      * This method is called with the controller for the current route and the
      * model supplied by the `model` hook.
      * By default, the `setupController` hook sets the `model` property of
      * the controller to the `model`.
      * If you implement the `setupController` hook in your Route, it will
      * prevent this default behavior. If you want to preserve that behavior
      * when implementing your `setupController` function, make sure to call
      * `_super`
      */
    def setupController(controller: typings.atEmberController.atEmberControllerMod.default, model: js.Object): Unit = js.native
    /**
      * Transition the application into another route. The route may
      * be either a single route or route path
      */
    def transitionTo(name: String, `object`: js.Any*): Transition = js.native
    /**
      * The willTransition action is fired at the beginning of any attempted transition
      * with a Transition object as the sole argument. This action can be used for aborting,
      * redirecting, or decorating the transition from the currently active routes.
      */
    def willTransition(transition: Transition): Unit = js.native
  }
  
  @js.native
  class default () extends Route
  
}

