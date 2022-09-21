package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExplainQueryStep extends StObject {
  
  /**
    * Machine-readable operation type.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable stage descriptions.
    */
  var substeps: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaExplainQueryStep {
  
  inline def apply(): SchemaExplainQueryStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExplainQueryStep]
  }
  
  extension [Self <: SchemaExplainQueryStep](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSubsteps(value: js.Array[String]): Self = StObject.set(x, "substeps", value.asInstanceOf[js.Any])
    
    inline def setSubstepsNull: Self = StObject.set(x, "substeps", null)
    
    inline def setSubstepsUndefined: Self = StObject.set(x, "substeps", js.undefined)
    
    inline def setSubstepsVarargs(value: String*): Self = StObject.set(x, "substeps", js.Array(value*))
  }
}
