package typings.googleCloudFirestore.typesProtosFirestoreV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an Int64Value. */
trait IInt64Value extends StObject {
  
  /** Int64Value value */
  var value: js.UndefOr[Double | String | Null] = js.undefined
}
object IInt64Value {
  
  inline def apply(): IInt64Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IInt64Value]
  }
  
  extension [Self <: IInt64Value](x: Self) {
    
    inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
