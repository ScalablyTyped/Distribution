package typings.gcsResumableUpload

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Scopes extends StObject {
    
    var scopes: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Scopes {
    
    inline def apply(): Scopes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scopes]
    }
    
    extension [Self <: Scopes](x: Self) {
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value :_*))
    }
  }
}
