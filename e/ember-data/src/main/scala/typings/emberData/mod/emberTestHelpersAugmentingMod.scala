package typings.emberData.mod

import typings.emberData.mod.DS.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emberTestHelpersAugmentingMod {
  
  @js.native
  trait TestContext extends StObject {
    
    var store: Store = js.native
  }
  object TestContext {
    
    @scala.inline
    def apply(store: Store): TestContext = {
      val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestContext]
    }
    
    @scala.inline
    implicit class TestContextMutableBuilder[Self <: TestContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    }
  }
}
