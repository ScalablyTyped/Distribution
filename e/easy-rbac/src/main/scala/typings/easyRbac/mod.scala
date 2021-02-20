package typings.easyRbac

import org.scalablytyped.runtime.StringDictionary
import typings.easyRbac.anon.Can
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("easy-rbac", JSImport.Namespace)
  @js.native
  class ^ protected () extends RBAC {
    def this(opts: Options) = this()
  }
  
  /* static member */
  @JSImport("easy-rbac", "create")
  @js.native
  def create(opts: Options): RBAC = js.native
  
  type Options = Roles | js.Function0[js.Promise[Roles]] | js.Promise[Roles]
  
  @js.native
  trait RBAC extends StObject {
    
    def can(role: String, operation: String): js.Promise[Boolean] = js.native
    def can(role: String, operation: String, params: js.Object): js.Promise[Boolean] = js.native
    def can(role: js.Array[Roles | String], operation: String): js.Promise[Boolean] = js.native
    def can(role: js.Array[Roles | String], operation: String, params: js.Object): js.Promise[Boolean] = js.native
  }
  
  @js.native
  trait RoleObject extends StObject {
    
    var name: String = js.native
    
    def when(params: js.Object): js.Promise[Boolean] = js.native
  }
  object RoleObject {
    
    @scala.inline
    def apply(name: String, when: js.Object => js.Promise[Boolean]): RoleObject = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], when = js.Any.fromFunction1(when))
      __obj.asInstanceOf[RoleObject]
    }
    
    @scala.inline
    implicit class RoleObjectMutableBuilder[Self <: RoleObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWhen(value: js.Object => js.Promise[Boolean]): Self = StObject.set(x, "when", js.Any.fromFunction1(value))
    }
  }
  
  type Roles = StringDictionary[Can]
}
