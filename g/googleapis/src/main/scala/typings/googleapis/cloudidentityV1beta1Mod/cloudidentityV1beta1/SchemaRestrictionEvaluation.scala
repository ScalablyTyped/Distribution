package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRestrictionEvaluation extends StObject {
  
  /**
    * Output only. The current state of the restriction
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaRestrictionEvaluation {
  
  inline def apply(): SchemaRestrictionEvaluation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRestrictionEvaluation]
  }
  
  extension [Self <: SchemaRestrictionEvaluation](x: Self) {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
