package typings.facebookJsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
    
    var user_ids: js.Array[String]
  }
  object Name {
    
    inline def apply(name: String, user_ids: js.Array[String]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], user_ids = user_ids.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUser_ids(value: js.Array[String]): Self = StObject.set(x, "user_ids", value.asInstanceOf[js.Any])
      
      inline def setUser_idsVarargs(value: String*): Self = StObject.set(x, "user_ids", js.Array(value :_*))
    }
  }
}
