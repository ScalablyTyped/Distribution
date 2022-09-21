package typings.googleapis.betaMod.computeBeta

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetHttpProxiesScopedList extends StObject {
  
  /**
    * A list of TargetHttpProxies contained in this scope.
    */
  var targetHttpProxies: js.UndefOr[js.Array[SchemaTargetHttpProxy]] = js.undefined
  
  /**
    * Informational warning which replaces the list of backend services when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaTargetHttpProxiesScopedList {
  
  inline def apply(): SchemaTargetHttpProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpProxiesScopedList]
  }
  
  extension [Self <: SchemaTargetHttpProxiesScopedList](x: Self) {
    
    inline def setTargetHttpProxies(value: js.Array[SchemaTargetHttpProxy]): Self = StObject.set(x, "targetHttpProxies", value.asInstanceOf[js.Any])
    
    inline def setTargetHttpProxiesUndefined: Self = StObject.set(x, "targetHttpProxies", js.undefined)
    
    inline def setTargetHttpProxiesVarargs(value: SchemaTargetHttpProxy*): Self = StObject.set(x, "targetHttpProxies", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
