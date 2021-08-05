package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetHttpsProxiesScopedList extends StObject {
  
  /**
    * A list of TargetHttpsProxies contained in this scope.
    */
  var targetHttpsProxies: js.UndefOr[js.Array[SchemaTargetHttpsProxy]] = js.undefined
  
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaTargetHttpsProxiesScopedList {
  
  inline def apply(): SchemaTargetHttpsProxiesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpsProxiesScopedList]
  }
  
  extension [Self <: SchemaTargetHttpsProxiesScopedList](x: Self) {
    
    inline def setTargetHttpsProxies(value: js.Array[SchemaTargetHttpsProxy]): Self = StObject.set(x, "targetHttpsProxies", value.asInstanceOf[js.Any])
    
    inline def setTargetHttpsProxiesUndefined: Self = StObject.set(x, "targetHttpsProxies", js.undefined)
    
    inline def setTargetHttpsProxiesVarargs(value: SchemaTargetHttpsProxy*): Self = StObject.set(x, "targetHttpsProxies", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
