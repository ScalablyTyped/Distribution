package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslPoliciesScopedList extends StObject {
  
  /**
    * A list of SslPolicies contained in this scope.
    */
  var sslPolicies: js.UndefOr[js.Array[SchemaSslPolicy]] = js.undefined
  
  /**
    * Informational warning which replaces the list of SSL policies when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaSslPoliciesScopedList {
  
  inline def apply(): SchemaSslPoliciesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslPoliciesScopedList]
  }
  
  extension [Self <: SchemaSslPoliciesScopedList](x: Self) {
    
    inline def setSslPolicies(value: js.Array[SchemaSslPolicy]): Self = StObject.set(x, "sslPolicies", value.asInstanceOf[js.Any])
    
    inline def setSslPoliciesUndefined: Self = StObject.set(x, "sslPolicies", js.undefined)
    
    inline def setSslPoliciesVarargs(value: SchemaSslPolicy*): Self = StObject.set(x, "sslPolicies", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
