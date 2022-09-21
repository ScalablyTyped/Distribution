package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConditionContext extends StObject {
  
  /**
    * The hypothetical access timestamp to evaluate IAM conditions. Note that this value must not be earlier than the current time; otherwise, an INVALID_ARGUMENT error will be returned.
    */
  var accessTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaConditionContext {
  
  inline def apply(): SchemaConditionContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConditionContext]
  }
  
  extension [Self <: SchemaConditionContext](x: Self) {
    
    inline def setAccessTime(value: String): Self = StObject.set(x, "accessTime", value.asInstanceOf[js.Any])
    
    inline def setAccessTimeNull: Self = StObject.set(x, "accessTime", null)
    
    inline def setAccessTimeUndefined: Self = StObject.set(x, "accessTime", js.undefined)
  }
}
