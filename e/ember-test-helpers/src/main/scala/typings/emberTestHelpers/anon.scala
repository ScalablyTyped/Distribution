package typings.emberTestHelpers

import typings.emberEngine.instanceMod.EngineInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined ember.ember.default.ApplicationInstance & {factoryFor (fullName : string, options : {} | undefined): any} */
  @js.native
  trait ApplicationInstancefactor extends StObject {
    
    /**
      *  Initialize the `EngineInstance` and return a promise that resolves
      *  with the instance itself when the boot process is complete.
      */
    def boot(): js.Promise[EngineInstance] = js.native
    
    def factoryFor(fullName: String): js.Any = js.native
    def factoryFor(fullName: String, options: js.Object): js.Any = js.native
    
    /**
      * Unregister a factory.
      */
    def unregister(fullName: String): js.Any = js.native
  }
  
  @js.native
  trait As extends StObject {
    
    var as: String = js.native
  }
  object As {
    
    @scala.inline
    def apply(as: String): As = {
      val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any])
      __obj.asInstanceOf[As]
    }
    
    @scala.inline
    implicit class AsMutableBuilder[Self <: As] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Controller extends StObject {
    
    def controller(name: String): js.Any = js.native
    def controller(name: String, options: As): js.Any = js.native
    
    def service(name: String): js.Any = js.native
    def service(name: String, options: As): js.Any = js.native
  }
}
