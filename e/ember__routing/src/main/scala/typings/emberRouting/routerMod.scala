package typings.emberRouting

import typings.emberRouting.transitionMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("@ember/routing/router", JSImport.Default)
  @js.native
  class default () extends Router
  /* static members */
  object default {
    
    /**
      * The `Router.map` function allows you to define mappings from URLs to routes
      * in your application. These mappings are defined within the
      * supplied callback function using `this.route`.
      */
    @JSImport("@ember/routing/router", "default.map")
    @js.native
    def map(callback: js.ThisFunction0[/* this */ this.type, Unit]): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: parser.TsParser#tsDeclClass functionCall class extends from : EmberObject.extend(Evented) * / any */ @js.native
  trait Router extends StObject {
    
    /**
      * Handles updating the paths and notifying any listeners of the URL
      * change.
      */
    def didTransition(): js.Any = js.native
    
    /**
      * The `location` property determines the type of URL's that your
      * application will use.
      */
    var location: String = js.native
    
    /**
      * Represents the URL of the root of the application, often '/'. This prefix is
      * assumed on all routes defined on this router.
      */
    var rootURL: String = js.native
    
    /**
      * Transition the application into another route. The route may
      * be either a single route or route path:
      */
    def transitionTo(name: String): Transition[_] = js.native
    def transitionTo(name: String, models: js.Any*): Transition[_] = js.native
    def transitionTo(name: String, options: js.Object): Transition[_] = js.native
    
    /**
      * Handles notifying any listeners of an impending URL
      * change.
      */
    def willTransition(): js.Any = js.native
  }
  
  object emberServiceAugmentingMod {
    
    @js.native
    trait Registry extends StObject {
      
      var router: typings.emberRouting.routerServiceMod.default = js.native
    }
    object Registry {
      
      @scala.inline
      def apply(router: typings.emberRouting.routerServiceMod.default): Registry = {
        val __obj = js.Dynamic.literal(router = router.asInstanceOf[js.Any])
        __obj.asInstanceOf[Registry]
      }
      
      @scala.inline
      implicit class RegistryMutableBuilder[Self <: Registry] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRouter(value: typings.emberRouting.routerServiceMod.default): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      }
    }
  }
}
