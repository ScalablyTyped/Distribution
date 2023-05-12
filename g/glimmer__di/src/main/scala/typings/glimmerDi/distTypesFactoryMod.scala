package typings.glimmerDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFactoryMod {
  
  @js.native
  trait Factory[T] extends StObject {
    
    var `class`: FactoryDefinition[T] = js.native
    
    def create(): T = js.native
    def create(injections: js.Object): T = js.native
    
    def teardown(instance: Any): Unit = js.native
  }
  
  @js.native
  trait FactoryDefinition[T] extends StObject {
    
    def create(): T = js.native
    def create(injections: js.Object): T = js.native
    
    var teardown: js.UndefOr[js.Function1[/* instance */ js.Object, Unit]] = js.native
  }
}
