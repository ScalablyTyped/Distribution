package typings.eggView

import typings.eggView.anon.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait Application extends StObject {
    
    var view: ViewManager = js.native
  }
  object Application {
    
    @scala.inline
    def apply(view: ViewManager): Application = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[Application]
    }
    
    @scala.inline
    implicit class ApplicationMutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setView(value: ViewManager): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context extends ViewBase {
    
    /**
      * View instance that is created every request
      */
    var view: ContextView = js.native
  }
  
  @js.native
  trait EggAppConfig extends StObject {
    
    var view: Cache = js.native
  }
  object EggAppConfig {
    
    @scala.inline
    def apply(view: Cache): EggAppConfig = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[EggAppConfig]
    }
    
    @scala.inline
    implicit class EggAppConfigMutableBuilder[Self <: EggAppConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setView(value: Cache): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
