package typings.easyRbac

import org.scalablytyped.runtime.StringDictionary
import typings.easyRbac.anon.Can
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-rbac", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with RBAC {
    def this(opts: Options) = this()
  }
  @JSImport("easy-rbac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def create(opts: Options): RBAC = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[RBAC]
  
  type Options = Roles | js.Function0[js.Promise[Roles]] | js.Promise[Roles]
  
  @js.native
  trait RBAC extends StObject {
    
    def can(role: String, operation: String): js.Promise[Boolean] = js.native
    def can(role: String, operation: String, params: js.Object): js.Promise[Boolean] = js.native
    def can(role: js.Array[Roles | String], operation: String): js.Promise[Boolean] = js.native
    def can(role: js.Array[Roles | String], operation: String, params: js.Object): js.Promise[Boolean] = js.native
  }
  
  trait RoleObject extends StObject {
    
    var name: String
    
    def when(params: js.Object): js.Promise[Boolean]
  }
  object RoleObject {
    
    inline def apply(name: String, when: js.Object => js.Promise[Boolean]): RoleObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], when = js.Any.fromFunction1(when))
      __obj.asInstanceOf[RoleObject]
    }
    
    extension [Self <: RoleObject](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWhen(value: js.Object => js.Promise[Boolean]): Self = StObject.set(x, "when", js.Any.fromFunction1(value))
    }
  }
  
  type Roles = StringDictionary[Can]
}
