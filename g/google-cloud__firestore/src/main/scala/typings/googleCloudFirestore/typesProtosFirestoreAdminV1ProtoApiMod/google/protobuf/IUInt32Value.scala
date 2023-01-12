package typings.googleCloudFirestore.typesProtosFirestoreAdminV1ProtoApiMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a UInt32Value. */
trait IUInt32Value extends StObject {
  
  /** UInt32Value value */
  var value: js.UndefOr[Double | Null] = js.undefined
}
object IUInt32Value {
  
  inline def apply(): IUInt32Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IUInt32Value]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IUInt32Value] (val x: Self) extends AnyVal {
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
