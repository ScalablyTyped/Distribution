package typings.enigmaJs

import typings.enigmaJs.enigmaJS.IGeneratedAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Api extends StObject {
    
    var api: IGeneratedAPI
    
    var config: js.Any
  }
  object Api {
    
    @scala.inline
    def apply(api: IGeneratedAPI, config: js.Any): Api = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi(value: IGeneratedAPI): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfig(value: js.Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    }
  }
}
