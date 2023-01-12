package typings.eggView

import typings.eggView.anon.Cache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object eggMod {
  
  trait Application extends StObject {
    
    var view: ViewManager
  }
  object Application {
    
    inline def apply(view: ViewManager): Application = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[Application]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Application] (val x: Self) extends AnyVal {
      
      inline def setView(value: ViewManager): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Context
    extends StObject
       with ViewBase {
    
    /**
      * View instance that is created every request
      */
    var view: ContextView = js.native
  }
  
  trait EggAppConfig extends StObject {
    
    var view: Cache
  }
  object EggAppConfig {
    
    inline def apply(view: Cache): EggAppConfig = {
      val __obj = js.Dynamic.literal(view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[EggAppConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EggAppConfig] (val x: Self) extends AnyVal {
      
      inline def setView(value: Cache): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
