package typings.googleapis.cloudbuildV1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFailureInfo extends StObject {
  
  /**
    * Explains the failure issue in more detail using hard-coded text.
    */
  var detail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the failure.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaFailureInfo {
  
  inline def apply(): SchemaFailureInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFailureInfo]
  }
  
  extension [Self <: SchemaFailureInfo](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
