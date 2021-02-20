package typings.emberComponent

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("@ember/component/helper", JSImport.Default)
  @js.native
  class default () extends Helper_
  /* static members */
  object default {
    
    /**
      * In many cases, the ceremony of a full `Ember.Helper` class is not required.
      * The `helper` method create pure-function helpers without instances. For
      * example:
      */
    @JSImport("@ember/component/helper", "default.helper")
    @js.native
    def helper(helper: js.Function2[/* params */ js.Array[_], /* hash */ js.UndefOr[js.Object], _]): Helper_ = js.native
  }
  
  @JSImport("@ember/component/helper", "helper")
  @js.native
  def helper(helperFn: js.Function2[/* params */ js.Array[_], /* hash */ js.UndefOr[js.Any], _]): js.Any = js.native
  
  @js.native
  trait Helper_
    extends typings.emberObject.mod.default {
    
    /**
      * Override this function when writing a class-based helper.
      */
    def compute(params: js.Array[_], hash: js.Object): js.Any = js.native
    
    /**
      * On a class-based helper, it may be useful to force a recomputation of that
      * helpers value. This is akin to `rerender` on a component.
      */
    def recompute(): js.Any = js.native
  }
}
