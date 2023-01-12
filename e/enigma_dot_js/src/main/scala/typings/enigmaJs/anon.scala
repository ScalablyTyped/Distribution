package typings.enigmaJs

import typings.enigmaJs.enigmaJS.IGeneratedAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Api extends StObject {
    
    var api: IGeneratedAPI
    
    var config: Any
  }
  object Api {
    
    inline def apply(api: IGeneratedAPI, config: Any): Api = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      inline def setApi(value: IGeneratedAPI): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
