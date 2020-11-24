package typings.emberApplication

import typings.emberApplication.anon.Instantiate
import typings.emberApplication.typesMod.EventDispatcherEvents
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ember/application", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getOwner(`object`: js.Any): js.Any = js.native
  
  def onLoad(name: String, callback: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  
  def runLoadHooks(name: String): js.Any = js.native
  def runLoadHooks(name: String, `object`: js.Object): js.Any = js.native
  
  def setOwner(`object`: js.Any, owner: js.Any): Unit = js.native
  
  @js.native
  trait Application
    extends typings.emberEngine.mod.default {
    
    /**
      * Application's router.
      */
    var Router: typings.emberRouting.mod.Router = js.native
    
    /**
      * Call advanceReadiness after any asynchronous setup logic has completed.
      * Each call to deferReadiness must be matched by a call to advanceReadiness
      * or the application will never become ready and routing will not begin.
      */
    def advanceReadiness(): Unit = js.native
    
    /**
      *  Initialize the application and return a promise that resolves with the `Application`
      *  object when the boot process is complete.
      */
    def boot(): js.Promise[Application] = js.native
    
    /**
      * The DOM events for which the event dispatcher should listen.
      */
    var customEvents: EventDispatcherEvents = js.native
    
    /**
      * Use this to defer readiness until some condition is true.
      *
      * This allows you to perform asynchronous setup logic and defer
      * booting your application until the setup has finished.
      *
      * However, if the setup requires a loading UI, it might be better
      * to use the router for this purpose.
      */
    def deferReadiness(): Unit = js.native
    
    /**
      * The Ember.EventDispatcher responsible for delegating events to this application's views.
      */
    var eventDispatcher: typings.emberApplication.eventDispatcherMod.default = js.native
    
    /**
      * defines an injection or typeInjection
      */
    def inject(factoryNameOrType: String, property: String, injectionName: String): Unit = js.native
    
    /**
      * This injects the test helpers into the window's scope. If a function of the
      * same name has already been defined it will be cached (so that it can be reset
      * if the helper is removed with `unregisterHelper` or `removeTestHelpers`).
      * Any callbacks registered with `onInjectHelpers` will be called once the
      * helpers have been injected.
      */
    def injectTestHelpers(): Unit = js.native
    
    /**
      * Called when the Application has become ready.
      * The call will be delayed until the DOM has become ready.
      */
    def ready(args: js.Any*): js.Any = js.native
    
    /**
      * registers a factory for later injection
      * @param fullName type:name (e.g., 'model:user')
      * @param factory (e.g., App.Person)
      */
    def register(fullName: String, factory: js.Any): Unit = js.native
    def register(fullName: String, factory: js.Any, options: Instantiate): Unit = js.native
    
    var registry: typings.emberApplication.registryMod.default = js.native
    
    /**
      * This removes all helpers that have been registered, and resets and functions
      * that were overridden by the helpers.
      */
    def removeTestHelpers(): Unit = js.native
    
    /**
      * Reset the application. This is typically used only in tests.
      */
    def reset(): Unit = js.native
    
    /**
      * Set this to provide an alternate class to Ember.DefaultResolver
      */
    @JSName("resolver")
    var resolver_Application: typings.emberApplication.defaultResolverMod.default = js.native
    
    /**
      * The root DOM element of the Application. This can be specified as an
      * element or a jQuery-compatible selector string.
      *
      * This is the element that will be passed to the Application's, eventDispatcher,
      * which sets up the listeners for event delegation. Every view in your application
      * should be a child of the element you specify here.
      */
    var rootElement: HTMLElement | String = js.native
    
    /**
      * This hook defers the readiness of the application, so that you can start
      * the app when your tests are ready to run. It also sets the router's
      * location to 'none', so that the window's location will not be modified
      * (preventing both accidental leaking of state between tests and interference
      * with your testing framework).
      */
    def setupForTesting(): Unit = js.native
  }
  
  @js.native
  class default () extends Application
}
