package typings.googleapis.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scopes extends StObject {
  
  var scopes: js.UndefOr[StringDictionary[`4`]] = js.undefined
}
object Scopes {
  
  inline def apply(): Scopes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Scopes]
  }
  
  extension [Self <: Scopes](x: Self) {
    
    inline def setScopes(value: StringDictionary[`4`]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
  }
}
