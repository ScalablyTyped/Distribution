package typings.emberRouting

import typings.emberRouting.routeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/routing", "Route")
  @js.native
  class Route () extends default
  
  @JSImport("@ember/routing", "Router")
  @js.native
  class Router ()
    extends typings.emberRouting.routerMod.default
  /* static members */
  object Router {
    
    /**
      * The `Router.map` function allows you to define mappings from URLs to routes
      * in your application. These mappings are defined within the
      * supplied callback function using `this.route`.
      */
    @JSImport("@ember/routing", "Router.map")
    @js.native
    def map(callback: js.ThisFunction0[/* this */ typings.emberRouting.routerDslMod.default, Unit]): Unit = js.native
  }
  
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
