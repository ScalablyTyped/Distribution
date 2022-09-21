package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMoveImpact extends StObject {
  
  /**
    * User friendly impact detail in a free form message.
    */
  var detail: js.UndefOr[String | Null] = js.undefined
}
object SchemaMoveImpact {
  
  inline def apply(): SchemaMoveImpact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMoveImpact]
  }
  
  extension [Self <: SchemaMoveImpact](x: Self) {
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailNull: Self = StObject.set(x, "detail", null)
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
  }
}
