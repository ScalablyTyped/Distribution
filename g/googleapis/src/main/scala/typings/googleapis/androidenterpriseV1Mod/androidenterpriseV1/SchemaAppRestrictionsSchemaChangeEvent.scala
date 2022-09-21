package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppRestrictionsSchemaChangeEvent extends StObject {
  
  /**
    * The id of the product (e.g. "app:com.google.android.gm") for which the app restriction schema changed. This field will always be present.
    */
  var productId: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppRestrictionsSchemaChangeEvent {
  
  inline def apply(): SchemaAppRestrictionsSchemaChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppRestrictionsSchemaChangeEvent]
  }
  
  extension [Self <: SchemaAppRestrictionsSchemaChangeEvent](x: Self) {
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdNull: Self = StObject.set(x, "productId", null)
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
